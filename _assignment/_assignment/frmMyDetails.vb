Public Class frmMyDetails
    Dim myUser As New classUser
    Private Sub btnUp_Click(sender As Object, e As EventArgs) Handles btnUp.Click
        myUser.Fullname = txtFull.Text
        myUser.Password = txtPass.Text

        myUser.UpdateDetails(txtUsername.Text)

        MessageBox.Show("Details Updated", "Update", MessageBoxButtons.OK, MessageBoxIcon.Information)

        Me.Close()
    End Sub

    Private Sub frmMyDetails_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        myUser = Me.Tag
        txtfull.Text = myUser.Fullname
        txtPass.Text = myUser.Password
        txtUsername.Text = myUser.Username
    End Sub
End Class