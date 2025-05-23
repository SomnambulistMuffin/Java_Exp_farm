Public Class frmLogon

    Private Sub btnOK_Click(sender As Object, e As EventArgs) Handles btnOK.Click
        Dim objUser As New classUser(txtUsername.Text, txtPass.Text)

        If objUser.IsValidLogon Then
            Me.Tag = objUser
            Me.Close()
        Else
            MessageBox.Show("Invalid Staff id, or Password", "Invalid Logon", MessageBoxButtons.OK)
            txtUsername.Clear()
            txtPass.Clear()
            txtUsername.Focus()
        End If
    End Sub

    
    Private Sub btnCancel_Click(sender As Object, e As EventArgs) Handles btnCancel.Click
        Dim objUser As New classUser

        Me.Tag = objUser
        Me.Close()
    End Sub
End Class