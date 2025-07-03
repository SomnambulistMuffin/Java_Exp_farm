Public Class Form1


    Private Sub NewAccToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles NewAccToolStripMenuItem.Click
        Dim NewAcc As New frmTransactions

        NewAcc.MdiParent = Me

        NewAcc.Text = "New Account window"
        NewAcc.Show()
        NewAcc.gbDeposit.Hide()
        NewAcc.gbAmount.Hide()

    End Sub

    Private Sub DepositToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles DepositToolStripMenuItem.Click
        Dim depositAcc As New frmTransactions

        depositAcc.MdiParent = Me

        depositAcc.Text = "New deposit window"
        depositAcc.Show()
        depositAcc.gbNewAcc.Hide()
        depositAcc.gbAmount.Hide()
    End Sub

    Private Sub WithdrawToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles WithdrawToolStripMenuItem.Click
        Dim WithdrawAcc As New frmTransactions

        WithdrawAcc.MdiParent = Me

        WithdrawAcc.Text = "New deposit window"
        WithdrawAcc.Show()
        WithdrawAcc.gbNewAcc.Hide()
        WithdrawAcc.gbDeposit.Hide()
    End Sub

    Private Sub MonthEndBalanceToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MonthEndBalanceToolStripMenuItem.Click
        Dim Monthend As New frmTransactions

        Monthend.MdiParent = Me
        Monthend.gbTransactions.Hide()
        Monthend.gbAccDeets.Hide()
        Monthend.Text = "Month end window"
        Monthend.Show()
    End Sub

    Private Sub ExitToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ExitToolStripMenuItem.Click
        If MessageBox.Show("so you want to exit?", "exit", MessageBoxButtons.YesNo, MessageBoxIcon.Exclamation) = DialogResult.Yes Then
            IO.File.WriteAllLines("BankAccount.txt", BankAccAr)

            Application.Exit()

        End If
    End Sub


End Class
