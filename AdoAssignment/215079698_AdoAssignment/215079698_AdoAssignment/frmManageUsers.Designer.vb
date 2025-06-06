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
        Me.TblUsersTableAdapter = New _215079698_AdoAssignment.DepartmentDataSetTableAdapters.tblUsersTableAdapter()
        Me.DepartmentDataSet = New _215079698_AdoAssignment.DepartmentDataSet()
        Me.TblDepartmentsBindingSource = New System.Windows.Forms.BindingSource(Me.components)
        Me.TblDepartmentsTableAdapter = New _215079698_AdoAssignment.DepartmentDataSetTableAdapters.tblDepartmentsTableAdapter()
        Me.TableAdapterManager = New _215079698_AdoAssignment.DepartmentDataSetTableAdapters.TableAdapterManager()
        Me.TblUsersBindingSource = New System.Windows.Forms.BindingSource(Me.components)
        Me.TblDepartmentDataSet = New _215079698_AdoAssignment.tblDepartmentDataSet()
        Me.TblDepartmentsBindingSource1 = New System.Windows.Forms.BindingSource(Me.components)
        Me.TblDepartmentsTableAdapter1 = New _215079698_AdoAssignment.tblDepartmentDataSetTableAdapters.tblDepartmentsTableAdapter()
        Me.TableAdapterManager1 = New _215079698_AdoAssignment.tblDepartmentDataSetTableAdapters.TableAdapterManager()
        Me.TblDepartmentsDataGridView = New System.Windows.Forms.DataGridView()
        Me.DataGridViewTextBoxColumn1 = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.DataGridViewTextBoxColumn2 = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.TblUsersBindingSource1 = New System.Windows.Forms.BindingSource(Me.components)
        Me.TblUsersTableAdapter1 = New _215079698_AdoAssignment.tblDepartmentDataSetTableAdapters.tblUsersTableAdapter()
        Me.TblUsersDataGridView = New System.Windows.Forms.DataGridView()
        Me.DataGridViewTextBoxColumn3 = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.DataGridViewTextBoxColumn4 = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.DataGridViewTextBoxColumn5 = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.DataGridViewTextBoxColumn6 = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.DataGridViewTextBoxColumn7 = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.BindingNavigator1 = New System.Windows.Forms.BindingNavigator(Me.components)
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
        CType(Me.DepartmentDataSet, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.TblDepartmentsBindingSource, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.TblUsersBindingSource, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.TblDepartmentDataSet, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.TblDepartmentsBindingSource1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.TblDepartmentsDataGridView, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.TblUsersBindingSource1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.TblUsersDataGridView, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.BindingNavigator1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.BindingNavigator1.SuspendLayout()
        Me.SuspendLayout()
        '
        'TblUsersTableAdapter
        '
        Me.TblUsersTableAdapter.ClearBeforeFill = True
        '
        'DepartmentDataSet
        '
        Me.DepartmentDataSet.DataSetName = "DepartmentDataSet"
        Me.DepartmentDataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'TblDepartmentsBindingSource
        '
        Me.TblDepartmentsBindingSource.DataMember = "tblDepartments"
        Me.TblDepartmentsBindingSource.DataSource = Me.DepartmentDataSet
        '
        'TblDepartmentsTableAdapter
        '
        Me.TblDepartmentsTableAdapter.ClearBeforeFill = True
        '
        'TableAdapterManager
        '
        Me.TableAdapterManager.BackupDataSetBeforeUpdate = False
        Me.TableAdapterManager.tblDepartmentsTableAdapter = Me.TblDepartmentsTableAdapter
        Me.TableAdapterManager.tblUsersTableAdapter = Me.TblUsersTableAdapter
        Me.TableAdapterManager.UpdateOrder = _215079698_AdoAssignment.DepartmentDataSetTableAdapters.TableAdapterManager.UpdateOrderOption.InsertUpdateDelete
        '
        'TblUsersBindingSource
        '
        Me.TblUsersBindingSource.DataMember = "FK_DepartmentCode"
        Me.TblUsersBindingSource.DataSource = Me.TblDepartmentsBindingSource
        '
        'TblDepartmentDataSet
        '
        Me.TblDepartmentDataSet.DataSetName = "tblDepartmentDataSet"
        Me.TblDepartmentDataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'TblDepartmentsBindingSource1
        '
        Me.TblDepartmentsBindingSource1.DataMember = "tblDepartments"
        Me.TblDepartmentsBindingSource1.DataSource = Me.TblDepartmentDataSet
        '
        'TblDepartmentsTableAdapter1
        '
        Me.TblDepartmentsTableAdapter1.ClearBeforeFill = True
        '
        'TableAdapterManager1
        '
        Me.TableAdapterManager1.BackupDataSetBeforeUpdate = False
        Me.TableAdapterManager1.tblDepartmentsTableAdapter = Me.TblDepartmentsTableAdapter1
        Me.TableAdapterManager1.tblUsersTableAdapter = Me.TblUsersTableAdapter1
        Me.TableAdapterManager1.UpdateOrder = _215079698_AdoAssignment.tblDepartmentDataSetTableAdapters.TableAdapterManager.UpdateOrderOption.InsertUpdateDelete
        '
        'TblDepartmentsDataGridView
        '
        Me.TblDepartmentsDataGridView.AutoGenerateColumns = False
        Me.TblDepartmentsDataGridView.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize
        Me.TblDepartmentsDataGridView.Columns.AddRange(New System.Windows.Forms.DataGridViewColumn() {Me.DataGridViewTextBoxColumn1, Me.DataGridViewTextBoxColumn2})
        Me.TblDepartmentsDataGridView.DataSource = Me.TblDepartmentsBindingSource1
        Me.TblDepartmentsDataGridView.Location = New System.Drawing.Point(12, 33)
        Me.TblDepartmentsDataGridView.Name = "TblDepartmentsDataGridView"
        Me.TblDepartmentsDataGridView.Size = New System.Drawing.Size(586, 220)
        Me.TblDepartmentsDataGridView.TabIndex = 0
        '
        'DataGridViewTextBoxColumn1
        '
        Me.DataGridViewTextBoxColumn1.DataPropertyName = "DepartmentCode"
        Me.DataGridViewTextBoxColumn1.HeaderText = "DepartmentCode"
        Me.DataGridViewTextBoxColumn1.Name = "DataGridViewTextBoxColumn1"
        Me.DataGridViewTextBoxColumn1.ReadOnly = True
        '
        'DataGridViewTextBoxColumn2
        '
        Me.DataGridViewTextBoxColumn2.DataPropertyName = "Description"
        Me.DataGridViewTextBoxColumn2.HeaderText = "Description"
        Me.DataGridViewTextBoxColumn2.Name = "DataGridViewTextBoxColumn2"
        '
        'TblUsersBindingSource1
        '
        Me.TblUsersBindingSource1.DataMember = "tblUsers"
        Me.TblUsersBindingSource1.DataSource = Me.TblDepartmentDataSet
        '
        'TblUsersTableAdapter1
        '
        Me.TblUsersTableAdapter1.ClearBeforeFill = True
        '
        'TblUsersDataGridView
        '
        Me.TblUsersDataGridView.AutoGenerateColumns = False
        Me.TblUsersDataGridView.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize
        Me.TblUsersDataGridView.Columns.AddRange(New System.Windows.Forms.DataGridViewColumn() {Me.DataGridViewTextBoxColumn3, Me.DataGridViewTextBoxColumn4, Me.DataGridViewTextBoxColumn5, Me.DataGridViewTextBoxColumn6, Me.DataGridViewTextBoxColumn7})
        Me.TblUsersDataGridView.DataSource = Me.TblUsersBindingSource1
        Me.TblUsersDataGridView.Location = New System.Drawing.Point(12, 271)
        Me.TblUsersDataGridView.Name = "TblUsersDataGridView"
        Me.TblUsersDataGridView.Size = New System.Drawing.Size(586, 220)
        Me.TblUsersDataGridView.TabIndex = 1
        '
        'DataGridViewTextBoxColumn3
        '
        Me.DataGridViewTextBoxColumn3.DataPropertyName = "Username"
        Me.DataGridViewTextBoxColumn3.HeaderText = "Username"
        Me.DataGridViewTextBoxColumn3.Name = "DataGridViewTextBoxColumn3"
        '
        'DataGridViewTextBoxColumn4
        '
        Me.DataGridViewTextBoxColumn4.DataPropertyName = "Password "
        Me.DataGridViewTextBoxColumn4.HeaderText = "Password "
        Me.DataGridViewTextBoxColumn4.Name = "DataGridViewTextBoxColumn4"
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
        Me.DataGridViewTextBoxColumn6.Name = "DataGridViewTextBoxColumn6"
        '
        'DataGridViewTextBoxColumn7
        '
        Me.DataGridViewTextBoxColumn7.DataPropertyName = "DepartmentCode"
        Me.DataGridViewTextBoxColumn7.HeaderText = "DepartmentCode"
        Me.DataGridViewTextBoxColumn7.Name = "DataGridViewTextBoxColumn7"
        '
        'BindingNavigator1
        '
        Me.BindingNavigator1.AddNewItem = Me.BindingNavigatorAddNewItem
        Me.BindingNavigator1.CountItem = Me.BindingNavigatorCountItem
        Me.BindingNavigator1.DataBindings.Add(New System.Windows.Forms.Binding("Tag", Me.TblDepartmentsBindingSource1, "DepartmentCode", True))
        Me.BindingNavigator1.DeleteItem = Me.BindingNavigatorDeleteItem
        Me.BindingNavigator1.Items.AddRange(New System.Windows.Forms.ToolStripItem() {Me.BindingNavigatorMoveFirstItem, Me.BindingNavigatorMovePreviousItem, Me.BindingNavigatorSeparator, Me.BindingNavigatorPositionItem, Me.BindingNavigatorCountItem, Me.BindingNavigatorSeparator1, Me.BindingNavigatorMoveNextItem, Me.BindingNavigatorMoveLastItem, Me.BindingNavigatorSeparator2, Me.BindingNavigatorAddNewItem, Me.BindingNavigatorDeleteItem})
        Me.BindingNavigator1.Location = New System.Drawing.Point(0, 0)
        Me.BindingNavigator1.MoveFirstItem = Me.BindingNavigatorMoveFirstItem
        Me.BindingNavigator1.MoveLastItem = Me.BindingNavigatorMoveLastItem
        Me.BindingNavigator1.MoveNextItem = Me.BindingNavigatorMoveNextItem
        Me.BindingNavigator1.MovePreviousItem = Me.BindingNavigatorMovePreviousItem
        Me.BindingNavigator1.Name = "BindingNavigator1"
        Me.BindingNavigator1.PositionItem = Me.BindingNavigatorPositionItem
        Me.BindingNavigator1.Size = New System.Drawing.Size(810, 25)
        Me.BindingNavigator1.TabIndex = 2
        Me.BindingNavigator1.Text = "BindingNavigator1"
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
        Me.BindingNavigatorCountItem.Size = New System.Drawing.Size(35, 22)
        Me.BindingNavigatorCountItem.Text = "of {0}"
        Me.BindingNavigatorCountItem.ToolTipText = "Total number of items"
        '
        'BindingNavigatorSeparator1
        '
        Me.BindingNavigatorSeparator1.Name = "BindingNavigatorSeparator"
        Me.BindingNavigatorSeparator1.Size = New System.Drawing.Size(6, 25)
        '
        'BindingNavigatorMoveNextItem
        '
        Me.BindingNavigatorMoveNextItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image
        Me.BindingNavigatorMoveNextItem.Image = CType(resources.GetObject("BindingNavigatorMoveNextItem.Image"), System.Drawing.Image)
        Me.BindingNavigatorMoveNextItem.Name = "BindingNavigatorMoveNextItem"
        Me.BindingNavigatorMoveNextItem.RightToLeftAutoMirrorImage = True
        Me.BindingNavigatorMoveNextItem.Size = New System.Drawing.Size(23, 22)
        Me.BindingNavigatorMoveNextItem.Text = "Move next"
        '
        'BindingNavigatorMoveLastItem
        '
        Me.BindingNavigatorMoveLastItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image
        Me.BindingNavigatorMoveLastItem.Image = CType(resources.GetObject("BindingNavigatorMoveLastItem.Image"), System.Drawing.Image)
        Me.BindingNavigatorMoveLastItem.Name = "BindingNavigatorMoveLastItem"
        Me.BindingNavigatorMoveLastItem.RightToLeftAutoMirrorImage = True
        Me.BindingNavigatorMoveLastItem.Size = New System.Drawing.Size(23, 22)
        Me.BindingNavigatorMoveLastItem.Text = "Move last"
        '
        'BindingNavigatorSeparator2
        '
        Me.BindingNavigatorSeparator2.Name = "BindingNavigatorSeparator"
        Me.BindingNavigatorSeparator2.Size = New System.Drawing.Size(6, 25)
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
        Me.BindingNavigatorDeleteItem.Size = New System.Drawing.Size(23, 22)
        Me.BindingNavigatorDeleteItem.Text = "Delete"
        '
        'frmManageUsers
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(810, 541)
        Me.Controls.Add(Me.BindingNavigator1)
        Me.Controls.Add(Me.TblUsersDataGridView)
        Me.Controls.Add(Me.TblDepartmentsDataGridView)
        Me.Name = "frmManageUsers"
        Me.Text = "frmManageUsers"
        CType(Me.DepartmentDataSet, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.TblDepartmentsBindingSource, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.TblUsersBindingSource, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.TblDepartmentDataSet, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.TblDepartmentsBindingSource1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.TblDepartmentsDataGridView, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.TblUsersBindingSource1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.TblUsersDataGridView, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.BindingNavigator1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.BindingNavigator1.ResumeLayout(False)
        Me.BindingNavigator1.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents TblUsersTableAdapter As _215079698_AdoAssignment.DepartmentDataSetTableAdapters.tblUsersTableAdapter
    Friend WithEvents DepartmentDataSet As _215079698_AdoAssignment.DepartmentDataSet
    Friend WithEvents TblDepartmentsBindingSource As System.Windows.Forms.BindingSource
    Friend WithEvents TblDepartmentsTableAdapter As _215079698_AdoAssignment.DepartmentDataSetTableAdapters.tblDepartmentsTableAdapter
    Friend WithEvents TableAdapterManager As _215079698_AdoAssignment.DepartmentDataSetTableAdapters.TableAdapterManager
    Friend WithEvents TblUsersBindingSource As System.Windows.Forms.BindingSource
    Friend WithEvents TblDepartmentDataSet As _215079698_AdoAssignment.tblDepartmentDataSet
    Friend WithEvents TblDepartmentsBindingSource1 As System.Windows.Forms.BindingSource
    Friend WithEvents TblDepartmentsTableAdapter1 As _215079698_AdoAssignment.tblDepartmentDataSetTableAdapters.tblDepartmentsTableAdapter
    Friend WithEvents TableAdapterManager1 As _215079698_AdoAssignment.tblDepartmentDataSetTableAdapters.TableAdapterManager
    Friend WithEvents TblUsersTableAdapter1 As _215079698_AdoAssignment.tblDepartmentDataSetTableAdapters.tblUsersTableAdapter
    Friend WithEvents TblDepartmentsDataGridView As System.Windows.Forms.DataGridView
    Friend WithEvents DataGridViewTextBoxColumn1 As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents DataGridViewTextBoxColumn2 As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents TblUsersBindingSource1 As System.Windows.Forms.BindingSource
    Friend WithEvents TblUsersDataGridView As System.Windows.Forms.DataGridView
    Friend WithEvents DataGridViewTextBoxColumn3 As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents DataGridViewTextBoxColumn4 As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents DataGridViewTextBoxColumn5 As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents DataGridViewTextBoxColumn6 As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents DataGridViewTextBoxColumn7 As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents BindingNavigator1 As System.Windows.Forms.BindingNavigator
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
End Class
