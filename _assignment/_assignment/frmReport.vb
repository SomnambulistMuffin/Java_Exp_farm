Public Class frmReport

    Private Sub frmReport_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        'TODO: This line of code loads data into the 'UserDBDataSet.tblUsers' table. You can move, or remove it, as needed.
        If IsNothing(Me.Tag) Then
            Me.tblUsersTableAdapter.Fill(Me.UserDBDataSet.tblUsers)
        Else
            Me.tblUsersTableAdapter.FillByDepartmentCode(Me.UserDBDataSet.tblUsers, CInt(Me.Tag))
        End If






        Me.ReportViewer1.RefreshReport()
    End Sub
End Class