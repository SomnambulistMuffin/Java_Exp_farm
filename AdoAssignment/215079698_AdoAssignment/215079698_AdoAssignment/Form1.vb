Imports System.Data.SqlClient

Public Class Form1

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Dim myConn As New SqlConnection()



        Dim objLogon As New frmLogon
        objLogon.ShowDialog()

        If IsNothing(objLogon) Then
            Application.Exit()

        Else
            Me.Text = "Welcome" & objLogon.txtUser.Text
        End If
    End Sub

    Private Sub MyDetailsToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles MyDetailsToolStripMenuItem.Click

    End Sub


    Private Sub ManageUsersToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles ManageUsersToolStripMenuItem.Click

    End Sub

    Private Sub PrintCompleteUserListToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles PrintCompleteUserListToolStripMenuItem.Click

    End Sub
End Class
