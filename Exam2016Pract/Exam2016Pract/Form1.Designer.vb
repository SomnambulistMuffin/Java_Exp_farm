<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
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
        Me.MenuStrip1 = New System.Windows.Forms.MenuStrip()
        Me.FileToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.OrdersToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.ChangeDetailsToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.ExitToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.AdminToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.ManageUserTypesToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.ManageUsersToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.ManageItemsToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.MenuStrip1.SuspendLayout()
        Me.SuspendLayout()
        '
        'MenuStrip1
        '
        Me.MenuStrip1.Items.AddRange(New System.Windows.Forms.ToolStripItem() {Me.FileToolStripMenuItem, Me.OrdersToolStripMenuItem, Me.AdminToolStripMenuItem})
        Me.MenuStrip1.Location = New System.Drawing.Point(0, 0)
        Me.MenuStrip1.Name = "MenuStrip1"
        Me.MenuStrip1.Size = New System.Drawing.Size(525, 24)
        Me.MenuStrip1.TabIndex = 0
        Me.MenuStrip1.Text = "MenuStrip1"
        '
        'FileToolStripMenuItem
        '
        Me.FileToolStripMenuItem.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.ChangeDetailsToolStripMenuItem, Me.ExitToolStripMenuItem})
        Me.FileToolStripMenuItem.Name = "FileToolStripMenuItem"
        Me.FileToolStripMenuItem.Size = New System.Drawing.Size(40, 20)
        Me.FileToolStripMenuItem.Text = "File "
        '
        'OrdersToolStripMenuItem
        '
        Me.OrdersToolStripMenuItem.Name = "OrdersToolStripMenuItem"
        Me.OrdersToolStripMenuItem.Size = New System.Drawing.Size(54, 20)
        Me.OrdersToolStripMenuItem.Text = "Orders"
        '
        'ChangeDetailsToolStripMenuItem
        '
        Me.ChangeDetailsToolStripMenuItem.Name = "ChangeDetailsToolStripMenuItem"
        Me.ChangeDetailsToolStripMenuItem.Size = New System.Drawing.Size(152, 22)
        Me.ChangeDetailsToolStripMenuItem.Text = "Change details"
        '
        'ExitToolStripMenuItem
        '
        Me.ExitToolStripMenuItem.Name = "ExitToolStripMenuItem"
        Me.ExitToolStripMenuItem.Size = New System.Drawing.Size(152, 22)
        Me.ExitToolStripMenuItem.Text = "exit"
        '
        'AdminToolStripMenuItem
        '
        Me.AdminToolStripMenuItem.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.ManageUserTypesToolStripMenuItem, Me.ManageUsersToolStripMenuItem, Me.ManageItemsToolStripMenuItem})
        Me.AdminToolStripMenuItem.Name = "AdminToolStripMenuItem"
        Me.AdminToolStripMenuItem.Size = New System.Drawing.Size(55, 20)
        Me.AdminToolStripMenuItem.Text = "Admin"
        '
        'ManageUserTypesToolStripMenuItem
        '
        Me.ManageUserTypesToolStripMenuItem.Name = "ManageUserTypesToolStripMenuItem"
        Me.ManageUserTypesToolStripMenuItem.Size = New System.Drawing.Size(176, 22)
        Me.ManageUserTypesToolStripMenuItem.Text = "Manage User Types"
        '
        'ManageUsersToolStripMenuItem
        '
        Me.ManageUsersToolStripMenuItem.Name = "ManageUsersToolStripMenuItem"
        Me.ManageUsersToolStripMenuItem.Size = New System.Drawing.Size(176, 22)
        Me.ManageUsersToolStripMenuItem.Text = "Manage Users"
        '
        'ManageItemsToolStripMenuItem
        '
        Me.ManageItemsToolStripMenuItem.Name = "ManageItemsToolStripMenuItem"
        Me.ManageItemsToolStripMenuItem.Size = New System.Drawing.Size(176, 22)
        Me.ManageItemsToolStripMenuItem.Text = "Manage Items"
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(525, 363)
        Me.Controls.Add(Me.MenuStrip1)
        Me.IsMdiContainer = True
        Me.MainMenuStrip = Me.MenuStrip1
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.MenuStrip1.ResumeLayout(False)
        Me.MenuStrip1.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents MenuStrip1 As System.Windows.Forms.MenuStrip
    Friend WithEvents FileToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents ChangeDetailsToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents ExitToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents OrdersToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents AdminToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents ManageUserTypesToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents ManageUsersToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents ManageItemsToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem

End Class
