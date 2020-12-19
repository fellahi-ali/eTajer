package etajer.fake.cart

import etajer.fake.FakeSKUs
import java.awt.Dimension
import javax.swing.*

fun main() {

    JFrame("test create CartItem").apply {
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        contentPane = JPanel().apply {
            layout = BoxLayout(this, BoxLayout.Y_AXIS)
            add(JButton("Create Cart Item (Result)").apply {
                addActionListener {
                    println("Creating CartItems...")
                    listOf(FakeSKUs.FACTO, "INVALID", FakeSKUs.IFRI6B, FakeSKUs.MLK500)
                        .map { sku -> fakeCartItemBySkuFn(sku, 1) }
                        .map { it.fold(::println, ::showError) }
                }
            })
            add(JButton("Create Cart Item (Exception)").apply {
                addActionListener {
                    println("Creating CartItems...")
                    try {
                        listOf(FakeSKUs.FACTO, "INVALID", FakeSKUs.IFRI6B, FakeSKUs.MLK500)
                            .forEach { sku ->
                                println(fakeCartItemBySkuFn(sku, 1).getOrThrow())
                            }
                    } catch (ex: Throwable) {
                        showError(ex)
                    }
                }
            })
        }
        size = Dimension(250, 100)
        setLocationRelativeTo(null)
        isVisible = true
    }

}

fun showError(err: Throwable) {
    JOptionPane.showMessageDialog(null, err.message)
}