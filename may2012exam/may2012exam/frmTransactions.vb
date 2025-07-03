

Public Class frmTransactions
    Private withdrawAmt As Double
    Private Min As Double = 50.0
    Private OpenBal, CurrAmount As Double

    Private Function ValidateAcc(ByVal accountNo As String) As Boolean


        accountNo = cmbAccountNo.SelectedItem
        If accountNo.Length < 4 And (accountNo.Contains("999") Or accountNo.Contains("1100")) Then
            Return False
        Else
            Return True
        End If
    End Function
    Private Function SearchAcc(ByVal accountNum As String) As Integer
        Dim pos As Integer
        If BankAccAr(arrCnt) <> accountNum Then
            pos = -1
            Return pos
        Else
            pos = BankAccAr(arrCnt)
            Return pos

        End If
    End Function
    Private Sub PrintAcc(ByVal AccPos As Integer)

        lsbDisplay.Items.Add(BankAccount.ToString(AccPos))

    End Sub
    Private Sub Deposit(ByVal accountnumb As String, ByVal deposit As Double, ByVal amount As Double, ByVal Accpos As Integer)
        Dim success As Boolean
        Dim NewBal As Double

        If Accpos <> -1 Then
            NewBal = amount + deposit
            success = True
        Else
            success = False
        End If



    End Sub
    Private Sub Withdraw(ByVal accNumb As String, ByVal Reqamount As Double, ByVal pos As Integer)

        'Dim valid As Boolean
        If Reqamount > CurrAmount And CurrAmount > Min Then
            Call SearchAcc(accNumb)
            If SearchAcc(accNumb) > -1 Then
                withdrawAmt = CurrAmount - Reqamount
                Call PrintAcc(pos)

            Else
                withdrawAmt = 0
            End If

        End If

    End Sub
    Private Sub btnSubmit_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnSubmit.Click

    End Sub

    Private Sub btnClose_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnClose.Click
        If MessageBox.Show("so you want to exit?", "exit", MessageBoxButtons.YesNo, MessageBoxIcon.Exclamation) = DialogResult.Yes Then
            Me.Close()

        End If
    End Sub

    Private Sub btnSummary_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnSummary.Click

    End Sub

    Private Sub frmTransactions_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        Dim ts As New IO.StreamReader("BankAccounts.txt")


        For i = 1000 To 1099 Step 1
            cmbAccountNo.Items.Add(CStr(i))
        Next
        If IO.File.Exists("BankAccount.txt") = True Then
            BankAccAr = IO.File.ReadAllLines("BankAccount.txt")

        End If

    End Sub
End Class