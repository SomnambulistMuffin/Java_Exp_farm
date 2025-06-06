Public Class frmManageUsers

    Private Sub TblDepartmentsBindingNavigatorSaveItem_Click(sender As Object, e As EventArgs)
        Me.Validate()
        Me.TblDepartmentsBindingSource.EndEdit()
        Me.TableAdapterManager.UpdateAll(Me.DepartmentDataSet)

    End Sub


    Private Sub TblDepartmentsBindingNavigatorSaveItem_Click_1(sender As Object, e As EventArgs)
        Me.Validate()
        Me.TblDepartmentsBindingSource.EndEdit()
        Me.TableAdapterManager.UpdateAll(Me.DepartmentDataSet)

    End Sub

    Private Sub frmManageUsers_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        'TODO: This line of code loads data into the 'TblDepartmentDataSet.tblUsers' table. You can move, or remove it, as needed.
        Me.TblUsersTableAdapter1.Fill(Me.TblDepartmentDataSet.tblUsers)
        'TODO: This line of code loads data into the 'TblDepartmentDataSet.tblDepartments' table. You can move, or remove it, as needed.
        Me.TblDepartmentsTableAdapter1.Fill(Me.TblDepartmentDataSet.tblDepartments)
        'TODO: This line of code loads data into the 'DepartmentDataSet.tblDepartments' table. You can move, or remove it, as needed.
        Me.TblDepartmentsTableAdapter.Fill(Me.DepartmentDataSet.tblDepartments)
        'TODO: This line of code loads data into the 'DepartmentDataSet.tblUsers' table. You can move, or remove it, as needed.
        Me.TblUsersTableAdapter.Fill(Me.DepartmentDataSet.tblUsers)
        'TODO: This line of code loads data into the 'DepartmentDataSet.tblDepartments' table. You can move, or remove it, as needed.
        Me.TblDepartmentsTableAdapter.Fill(Me.DepartmentDataSet.tblDepartments)

    End Sub

    Private Sub TblDepartmentsBindingNavigatorSaveItem_Click_2(sender As Object, e As EventArgs)
        Me.Validate()
        Me.TblDepartmentsBindingSource.EndEdit()
        Me.TableAdapterManager.UpdateAll(Me.DepartmentDataSet)

    End Sub
End Class