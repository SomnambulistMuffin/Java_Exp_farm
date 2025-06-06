Public Class frmLogon

    Private Sub btnOK_Click(sender As Object, e As EventArgs) Handles btnOK.Click
        Dim objUser As New classUser(txtUser.Text, txtPass.Text)
        Dim strUsername = objUser.IsValidLogon

        If strUsername = False Then
            MessageBox.Show("Invalid Username, or Password", "Invalid Logon", MessageBoxButtons.OK)
            txtUser.Clear()
            txtPass.Clear()
            txtUser.Focus()

        Else

            Me.Tag = strUsername

            Me.Close()
        End If
    End Sub

    Private Sub btnCancel_Click(sender As Object, e As EventArgs) Handles btnCancel.Click
        Me.Close()
    End Sub
End Class