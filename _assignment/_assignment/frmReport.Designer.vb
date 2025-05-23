<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class frmReport
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
        Dim ReportDataSource1 As Microsoft.Reporting.WinForms.ReportDataSource = New Microsoft.Reporting.WinForms.ReportDataSource()
        Me.ReportViewer1 = New Microsoft.Reporting.WinForms.ReportViewer()
        Me.UserDBDataSet = New _215079698_assignment.UserDBDataSet()
        Me.tblUsersBindingSource = New System.Windows.Forms.BindingSource(Me.components)
        Me.tblUsersTableAdapter = New _215079698_assignment.UserDBDataSetTableAdapters.tblUsersTableAdapter()
        CType(Me.UserDBDataSet, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.tblUsersBindingSource, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'ReportViewer1
        '
        ReportDataSource1.Name = "RptUsers"
        ReportDataSource1.Value = Me.tblUsersBindingSource
        Me.ReportViewer1.LocalReport.DataSources.Add(ReportDataSource1)
        Me.ReportViewer1.LocalReport.ReportEmbeddedResource = "_215079698_assignment.UserReprt.rdlc"
        Me.ReportViewer1.Location = New System.Drawing.Point(0, 0)
        Me.ReportViewer1.Name = "ReportViewer1"
        Me.ReportViewer1.Size = New System.Drawing.Size(519, 246)
        Me.ReportViewer1.TabIndex = 0
        '
        'UserDBDataSet
        '
        Me.UserDBDataSet.DataSetName = "UserDBDataSet"
        Me.UserDBDataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'tblUsersBindingSource
        '
        Me.tblUsersBindingSource.DataMember = "tblUsers"
        Me.tblUsersBindingSource.DataSource = Me.UserDBDataSet
        '
        'tblUsersTableAdapter
        '
        Me.tblUsersTableAdapter.ClearBeforeFill = True
        '
        'frmReport
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(559, 323)
        Me.Controls.Add(Me.ReportViewer1)
        Me.Name = "frmReport"
        Me.Text = "frmReport"
        CType(Me.UserDBDataSet, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.tblUsersBindingSource, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)

    End Sub
    Friend WithEvents ReportViewer1 As Microsoft.Reporting.WinForms.ReportViewer
    Friend WithEvents tblUsersBindingSource As System.Windows.Forms.BindingSource
    Friend WithEvents UserDBDataSet As _215079698_assignment.UserDBDataSet
    Friend WithEvents tblUsersTableAdapter As _215079698_assignment.UserDBDataSetTableAdapters.tblUsersTableAdapter
End Class
