Imports System.Data.SqlClient


Public Class Form1
    Private objUser As New classUser
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

        'Dim full As String
        Dim objLogon As New frmLogon
        objLogon.ShowDialog()

        If objLogon.Tag = False Then
            Application.Exit()

        Else
            Me.Text = "Welcome" & objUser.Fullname
            Select Case objUser.Usertype
                Case ""
                    Application.Exit()
                Case "User"
                    AdminToolStripMenuItem.Enabled = True

            End Select

        End If
    End Sub

    Private Sub MyDetailsToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles MyDetailsToolStripMenuItem.Click
        Dim objDetails As New frmMyDetails

        objDetails.MdiParent = Me
        objDetails.Tag = objUser
        objDetails.Show()
    End Sub

    Private Sub ManageUsersToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles ManageUsersToolStripMenuItem.Click
        Dim objManage As New frmManageUsers

        objManage.MdiParent = Me
        objManage.Show()
    End Sub

    Private Sub PrintCompleteUserListToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles PrintCompleteUserListToolStripMenuItem.Click
        Dim objreport As New frmReport

        objreport.MdiParent = Me
        objreport.Show()
    End Sub

End Class
