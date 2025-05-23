<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class frmManageUsers
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.components = New System.ComponentModel.Container()
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(frmManageUsers))
        Me.UserDBDataSet = New _215079698_assignment.UserDBDataSet()
        Me.TblDepartmentBindingSource = New System.Windows.Forms.BindingSource(Me.components)
        Me.TblDepartmentTableAdapter = New _215079698_assignment.UserDBDataSetTableAdapters.tblDepartmentTableAdapter()
        Me.TableAdapterManager = New _215079698_assignment.UserDBDataSetTableAdapters.TableAdapterManager()
        Me.TblDepartmentBindingNavigator = New System.Windows.Forms.BindingNavigator(Me.components)
        Me.BindingNavigatorMoveFirstItem = New System.Windows.Forms.ToolStripButton()
        Me.BindingNavigatorMovePreviousItem = New System.Windows.Forms.ToolStripButton()
        Me.BindingNavigatorSeparator = New System.Windows.Forms.ToolStripSeparator()
        Me.BindingNavigatorPositionItem = New System.Windows.Forms.ToolStripTextBox()
        Me.BindingNavigatorCountItem = New System.Windows.Forms.ToolStripLabel()
        Me.BindingNavigatorSeparator1 = New System.Windows.Forms.ToolStripSeparator()
        Me.BindingNavigatorMoveNextItem = New System.Windows.Forms.ToolStripButton()
        Me.BindingNavigatorMoveLastItem = New System.Windows.Forms.ToolStripButton()
        Me.BindingNavigatorSeparator2 = New System.Windows.Forms.ToolStripSeparator()
        Me.BindingNavigatorAddNewItem = New System.Windows.Forms.ToolStripButton()
        Me.BindingNavigatorDeleteItem = New System.Windows.Forms.ToolStripButton()
        Me.TblDepartmentBindingNavigatorSaveItem = New System.Windows.Forms.ToolStripButton()
        Me.TblDepartmentDataGridView = New System.Windows.Forms.DataGridView()
        Me.DataGridViewTextBoxColumn2 = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.PrintUserList = New System.Windows.Forms.DataGridViewButtonColumn()
        Me.TblUsersBindingSource = New System.Windows.Forms.BindingSource(Me.components)
        Me.TblUsersTableAdapter = New _215079698_assignment.UserDBDataSetTableAdapters.tblUsersTableAdapter()
        Me.TblUsersDataGridView = New System.Windows.Forms.DataGridView()
        Me.DataGridViewTextBoxColumn1 = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.DataGridViewTextBoxColumn3 = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.DataGridViewTextBoxColumn5 = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.DataGridViewTextBoxColumn6 = New System.Windows.Forms.DataGridViewComboBoxColumn()
        CType(Me.UserDBDataSet, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.TblDepartmentBindingSource, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.TblDepartmentBindingNavigator, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.TblDepartmentBindingNavigator.SuspendLayout()
        CType(Me.TblDepartmentDataGridView, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.TblUsersBindingSource, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.TblUsersDataGridView, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'UserDBDataSet
        '
        Me.UserDBDataSet.DataSetName = "UserDBDataSet"
        Me.UserDBDataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'TblDepartmentBindingSource
        '
        Me.TblDepartmentBindingSource.DataMember = "tblDepartment"
        Me.TblDepartmentBindingSource.DataSource = Me.UserDBDataSet
        '
        'TblDepartmentTableAdapter
        '
        Me.TblDepartmentTableAdapter.ClearBeforeFill = True
        '
        'TableAdapterManager
        '
        Me.TableAdapterManager.BackupDataSetBeforeUpdate = False
        Me.TableAdapterManager.tblDepartmentTableAdapter = Me.TblDepartmentTableAdapter
        Me.TableAdapterManager.tblUsersTableAdapter = Me.TblUsersTableAdapter
        Me.TableAdapterManager.UpdateOrder = _215079698_assignment.UserDBDataSetTableAdapters.TableAdapterManager.UpdateOrderOption.InsertUpdateDelete
        '
        'TblDepartmentBindingNavigator
        '
        Me.TblDepartmentBindingNavigator.AddNewItem = Me.BindingNavigatorAddNewItem
        Me.TblDepartmentBindingNavigator.BindingSource = Me.TblDepartmentBindingSource
        Me.TblDepartmentBindingNavigator.CountItem = Me.BindingNavigatorCountItem
        Me.TblDepartmentBindingNavigator.DeleteItem = Me.BindingNavigatorDeleteItem
        Me.TblDepartmentBindingNavigator.Items.AddRange(New System.Windows.Forms.ToolStripItem() {Me.BindingNavigatorMoveFirstItem, Me.BindingNavigatorMovePreviousItem, Me.BindingNavigatorSeparator, Me.BindingNavigatorPositionItem, Me.BindingNavigatorCountItem, Me.BindingNavigatorSeparator1, Me.BindingNavigatorMoveNextItem, Me.BindingNavigatorMoveLastItem, Me.BindingNavigatorSeparator2, Me.BindingNavigatorAddNewItem, Me.BindingNavigatorDeleteItem, Me.TblDepartmentBindingNavigatorSaveItem})
        Me.TblDepartmentBindingNavigator.Location = New System.Drawing.Point(0, 0)
        Me.TblDepartmentBindingNavigator.MoveFirstItem = Me.BindingNavigatorMoveFirstItem
        Me.TblDepartmentBindingNavigator.MoveLastItem = Me.BindingNavigatorMoveLastItem
        Me.TblDepartmentBindingNavigator.MoveNextItem = Me.BindingNavigatorMoveNextItem
        Me.TblDepartmentBindingNavigator.MovePreviousItem = Me.BindingNavigatorMovePreviousItem
        Me.TblDepartmentBindingNavigator.Name = "TblDepartmentBindingNavigator"
        Me.TblDepartmentBindingNavigator.PositionItem = Me.BindingNavigatorPositionItem
        Me.TblDepartmentBindingNavigator.Size = New System.Drawing.Size(595, 25)
        Me.TblDepartmentBindingNavigator.TabIndex = 0
        Me.TblDepartmentBindingNavigator.Text = "BindingNavigator1"
        '
        'BindingNavigatorMoveFirstItem
        '
        Me.BindingNavigatorMoveFirstItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image
        Me.BindingNavigatorMoveFirstItem.Image = CType(resources.GetObject("BindingNavigatorMoveFirstItem.Image"), System.Drawing.Image)
        Me.BindingNavigatorMoveFirstItem.Name = "BindingNavigatorMoveFirstItem"
        Me.BindingNavigatorMoveFirstItem.RightToLeftAutoMirrorImage = True
        Me.BindingNavigatorMoveFirstItem.Size = New System.Drawing.Size(23, 22)
        Me.BindingNavigatorMoveFirstItem.Text = "Move first"
        '
        'BindingNavigatorMovePreviousItem
        '
        Me.BindingNavigatorMovePreviousItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image
        Me.BindingNavigatorMovePreviousItem.Image = CType(resources.GetObject("BindingNavigatorMovePreviousItem.Image"), System.Drawing.Image)
        Me.BindingNavigatorMovePreviousItem.Name = "BindingNavigatorMovePreviousItem"
        Me.BindingNavigatorMovePreviousItem.RightToLeftAutoMirrorImage = True
        Me.BindingNavigatorMovePreviousItem.Size = New System.Drawing.Size(23, 22)
        Me.BindingNavigatorMovePreviousItem.Text = "Move previous"
        '
        'BindingNavigatorSeparator
        '
        Me.BindingNavigatorSeparator.Name = "BindingNavigatorSeparator"
        Me.BindingNavigatorSeparator.Size = New System.Drawing.Size(6, 25)
        '
        'BindingNavigatorPositionItem
        '
        Me.BindingNavigatorPositionItem.AccessibleName = "Position"
        Me.BindingNavigatorPositionItem.AutoSize = False
        Me.BindingNavigatorPositionItem.Name = "BindingNavigatorPositionItem"
        Me.BindingNavigatorPositionItem.Size = New System.Drawing.Size(50, 23)
        Me.BindingNavigatorPositionItem.Text = "0"
        Me.BindingNavigatorPositionItem.ToolTipText = "Current position"
        '
        'BindingNavigatorCountItem
        '
        Me.BindingNavigatorCountItem.Name = "BindingNavigatorCountItem"
        Me.BindingNavigatorCountItem.Size = New System.Drawing.Size(35, 15)
        Me.BindingNavigatorCountItem.Text = "of {0}"
        Me.BindingNavigatorCountItem.ToolTipText = "Total number of items"
        '
        'BindingNavigatorSeparator1
        '
        Me.BindingNavigatorSeparator1.Name = "BindingNavigatorSeparator"
        Me.BindingNavigatorSeparator1.Size = New System.Drawing.Size(6, 6)
        '
        'BindingNavigatorMoveNextItem
        '
        Me.BindingNavigatorMoveNextItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image
        Me.BindingNavigatorMoveNextItem.Image = CType(resources.GetObject("BindingNavigatorMoveNextItem.Image"), System.Drawing.Image)
        Me.BindingNavigatorMoveNextItem.Name = "BindingNavigatorMoveNextItem"
        Me.BindingNavigatorMoveNextItem.RightToLeftAutoMirrorImage = True
        Me.BindingNavigatorMoveNextItem.Size = New System.Drawing.Size(23, 20)
        Me.BindingNavigatorMoveNextItem.Text = "Move next"
        '
        'BindingNavigatorMoveLastItem
        '
        Me.BindingNavigatorMoveLastItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image
        Me.BindingNavigatorMoveLastItem.Image = CType(resources.GetObject("BindingNavigatorMoveLastItem.Image"), System.Drawing.Image)
        Me.BindingNavigatorMoveLastItem.Name = "BindingNavigatorMoveLastItem"
        Me.BindingNavigatorMoveLastItem.RightToLeftAutoMirrorImage = True
        Me.BindingNavigatorMoveLastItem.Size = New System.Drawing.Size(23, 20)
        Me.BindingNavigatorMoveLastItem.Text = "Move last"
        '
        'BindingNavigatorSeparator2
        '
        Me.BindingNavigatorSeparator2.Name = "BindingNavigatorSeparator"
        Me.BindingNavigatorSeparator2.Size = New System.Drawing.Size(6, 6)
        '
        'BindingNavigatorAddNewItem
        '
        Me.BindingNavigatorAddNewItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image
        Me.BindingNavigatorAddNewItem.Image = CType(resources.GetObject("BindingNavigatorAddNewItem.Image"), System.Drawing.Image)
        Me.BindingNavigatorAddNewItem.Name = "BindingNavigatorAddNewItem"
        Me.BindingNavigatorAddNewItem.RightToLeftAutoMirrorImage = True
        Me.BindingNavigatorAddNewItem.Size = New System.Drawing.Size(23, 22)
        Me.BindingNavigatorAddNewItem.Text = "Add new"
        '
        'BindingNavigatorDeleteItem
        '
        Me.BindingNavigatorDeleteItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image
        Me.BindingNavigatorDeleteItem.Image = CType(resources.GetObject("BindingNavigatorDeleteItem.Image"), System.Drawing.Image)
        Me.BindingNavigatorDeleteItem.Name = "BindingNavigatorDeleteItem"
        Me.BindingNavigatorDeleteItem.RightToLeftAutoMirrorImage = True
        Me.BindingNavigatorDeleteItem.Size = New System.Drawing.Size(23, 20)
        Me.BindingNavigatorDeleteItem.Text = "Delete"
        '
        'TblDepartmentBindingNavigatorSaveItem
        '
        Me.TblDepartmentBindingNavigatorSaveItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image
        Me.TblDepartmentBindingNavigatorSaveItem.Image = CType(resources.GetObject("TblDepartmentBindingNavigatorSaveItem.Image"), System.Drawing.Image)
        Me.TblDepartmentBindingNavigatorSaveItem.Name = "TblDepartmentBindingNavigatorSaveItem"
        Me.TblDepartmentBindingNavigatorSaveItem.Size = New System.Drawing.Size(23, 23)
        Me.TblDepartmentBindingNavigatorSaveItem.Text = "Save Data"
        '
        'TblDepartmentDataGridView
        '
        Me.TblDepartmentDataGridView.AutoGenerateColumns = False
        Me.TblDepartmentDataGridView.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize
        Me.TblDepartmentDataGridView.Columns.AddRange(New System.Windows.Forms.DataGridViewColumn() {Me.DataGridViewTextBoxColumn2, Me.PrintUserList})
        Me.TblDepartmentDataGridView.DataSource = Me.TblDepartmentBindingSource
        Me.TblDepartmentDataGridView.Location = New System.Drawing.Point(12, 40)
        Me.TblDepartmentDataGridView.Name = "TblDepartmentDataGridView"
        Me.TblDepartmentDataGridView.Size = New System.Drawing.Size(552, 125)
        Me.TblDepartmentDataGridView.TabIndex = 1
        '
        'DataGridViewTextBoxColumn2
        '
        Me.DataGridViewTextBoxColumn2.DataPropertyName = "Description"
        Me.DataGridViewTextBoxColumn2.HeaderText = "Description"
        Me.DataGridViewTextBoxColumn2.Name = "DataGridViewTextBoxColumn2"
        '
        'PrintUserList
        '
        Me.PrintUserList.HeaderText = "Print"
        Me.PrintUserList.Name = "PrintUserList"
        '
        'TblUsersBindingSource
        '
        Me.TblUsersBindingSource.DataMember = "tblUsers"
        Me.TblUsersBindingSource.DataSource = Me.UserDBDataSet
        '
        'TblUsersTableAdapter
        '
        Me.TblUsersTableAdapter.ClearBeforeFill = True
        '
        'TblUsersDataGridView
        '
        Me.TblUsersDataGridView.AutoGenerateColumns = False
        Me.TblUsersDataGridView.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize
        Me.TblUsersDataGridView.Columns.AddRange(New System.Windows.Forms.DataGridViewColumn() {Me.DataGridViewTextBoxColumn1, Me.DataGridViewTextBoxColumn3, Me.DataGridViewTextBoxColumn5, Me.DataGridViewTextBoxColumn6})
        Me.TblUsersDataGridView.DataSource = Me.TblUsersBindingSource
        Me.TblUsersDataGridView.Location = New System.Drawing.Point(12, 233)
        Me.TblUsersDataGridView.Name = "TblUsersDataGridView"
        Me.TblUsersDataGridView.Size = New System.Drawing.Size(552, 220)
        Me.TblUsersDataGridView.TabIndex = 2
        '
        'DataGridViewTextBoxColumn1
        '
        Me.DataGridViewTextBoxColumn1.DataPropertyName = "Username"
        Me.DataGridViewTextBoxColumn1.HeaderText = "Username"
        Me.DataGridViewTextBoxColumn1.Name = "DataGridViewTextBoxColumn1"
        '
        'DataGridViewTextBoxColumn3
        '
        Me.DataGridViewTextBoxColumn3.DataPropertyName = "Password"
        Me.DataGridViewTextBoxColumn3.HeaderText = "Password"
        Me.DataGridViewTextBoxColumn3.Name = "DataGridViewTextBoxColumn3"
        '
        'DataGridViewTextBoxColumn5
        '
        Me.DataGridViewTextBoxColumn5.DataPropertyName = "Fullname"
        Me.DataGridViewTextBoxColumn5.HeaderText = "Fullname"
        Me.DataGridViewTextBoxColumn5.Name = "DataGridViewTextBoxColumn5"
        '
        'DataGridViewTextBoxColumn6
        '
        Me.DataGridViewTextBoxColumn6.DataPropertyName = "Usertype"
        Me.DataGridViewTextBoxColumn6.HeaderText = "Usertype"
        Me.DataGridViewTextBoxColumn6.Items.AddRange(New Object() {"User", "Admin"})
        Me.DataGridViewTextBoxColumn6.Name = "DataGridViewTextBoxColumn6"
        Me.DataGridViewTextBoxColumn6.Resizable = System.Windows.Forms.DataGridViewTriState.[True]
        Me.DataGridViewTextBoxColumn6.SortMode = System.Windows.Forms.DataGridViewColumnSortMode.Automatic
        '
        'frmManageUsers
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(595, 473)
        Me.Controls.Add(Me.TblUsersDataGridView)
        Me.Controls.Add(Me.TblDepartmentDataGridView)
        Me.Controls.Add(Me.TblDepartmentBindingNavigator)
        Me.Name = "frmManageUsers"
        Me.Text = "frmManageUsers"
        CType(Me.UserDBDataSet, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.TblDepartmentBindingSource, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.TblDepartmentBindingNavigator, System.ComponentModel.ISupportInitialize).EndInit()
        Me.TblDepartmentBindingNavigator.ResumeLayout(False)
        Me.TblDepartmentBindingNavigator.PerformLayout()
        CType(Me.TblDepartmentDataGridView, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.TblUsersBindingSource, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.TblUsersDataGridView, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents UserDBDataSet As _215079698_assignment.UserDBDataSet
    Friend WithEvents TblDepartmentBindingSource As System.Windows.Forms.BindingSource
    Friend WithEvents TblDepartmentTableAdapter As _215079698_assignment.UserDBDataSetTableAdapters.tblDepartmentTableAdapter
    Friend WithEvents TableAdapterManager As _215079698_assignment.UserDBDataSetTableAdapters.TableAdapterManager
    Friend WithEvents TblDepartmentBindingNavigator As System.Windows.Forms.BindingNavigator
    Friend WithEvents BindingNavigatorAddNewItem As System.Windows.Forms.ToolStripButton
    Friend WithEvents BindingNavigatorCountItem As System.Windows.Forms.ToolStripLabel
    Friend WithEvents BindingNavigatorDeleteItem As System.Windows.Forms.ToolStripButton
    Friend WithEvents BindingNavigatorMoveFirstItem As System.Windows.Forms.ToolStripButton
    Friend WithEvents BindingNavigatorMovePreviousItem As System.Windows.Forms.ToolStripButton
    Friend WithEvents BindingNavigatorSeparator As System.Windows.Forms.ToolStripSeparator
    Friend WithEvents BindingNavigatorPositionItem As System.Windows.Forms.ToolStripTextBox
    Friend WithEvents BindingNavigatorSeparator1 As System.Windows.Forms.ToolStripSeparator
    Friend WithEvents BindingNavigatorMoveNextItem As System.Windows.Forms.ToolStripButton
    Friend WithEvents BindingNavigatorMoveLastItem As System.Windows.Forms.ToolStripButton
    Friend WithEvents BindingNavigatorSeparator2 As System.Windows.Forms.ToolStripSeparator
    Friend WithEvents TblDepartmentBindingNavigatorSaveItem As System.Windows.Forms.ToolStripButton
    Friend WithEvents TblDepartmentDataGridView As System.Windows.Forms.DataGridView
    Friend WithEvents TblUsersTableAdapter As _215079698_assignment.UserDBDataSetTableAdapters.tblUsersTableAdapter
    Friend WithEvents DataGridViewTextBoxColumn2 As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents PrintUserList As System.Windows.Forms.DataGridViewButtonColumn
    Friend WithEvents TblUsersBindingSource As System.Windows.Forms.BindingSource
    Friend WithEvents TblUsersDataGridView As System.Windows.Forms.DataGridView
    Friend WithEvents DataGridViewTextBoxColumn1 As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents DataGridViewTextBoxColumn3 As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents DataGridViewTextBoxColumn5 As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents DataGridViewTextBoxColumn6 As System.Windows.Forms.DataGridViewComboBoxColumn
End Class
