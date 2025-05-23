Public Class frmManageUsers

    Private Sub TblDepartmentBindingNavigatorSaveItem_Click(sender As Object, e As EventArgs) Handles TblDepartmentBindingNavigatorSaveItem.Click
        Me.Validate()
        Me.TblDepartmentBindingSource.EndEdit()
        Me.TableAdapterManager.UpdateAll(Me.UserDBDataSet)

    End Sub

    Private Sub frmManageUsers_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        'TODO: This line of code loads data into the 'UserDBDataSet.tblUsers' table. You can move, or remove it, as needed.
        Me.TblUsersTableAdapter.Fill(Me.UserDBDataSet.tblUsers)
        'TODO: This line of code loads data into the 'UserDBDataSet.tblDepartment' table. You can move, or remove it, as needed.
        Me.TblDepartmentTableAdapter.Fill(Me.UserDBDataSet.tblDepartment)

    End Sub

    Private Sub TblDepartmentDataGridView_CellContentClick(sender As Object, e As DataGridViewCellEventArgs) Handles TblDepartmentDataGridView.CellContentClick
        Dim DeptCode As String
        Dim objReprt As New frmReport

        If e.ColumnIndex = 2 Then
            DeptCode = TblDepartmentDataGridView.Rows(e.RowIndex).Cells(0).Value
            objReprt.Tag = DeptCode
            objReprt.MdiParent = Form1
            objReprt.Show()
        End If
    End Sub
End Class