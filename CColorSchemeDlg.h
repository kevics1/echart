#pragma once
#include "afxdialogex.h"


// CColorSchemeDlg 对话框

class CColorSchemeDlg : public CDialogEx
{
	DECLARE_DYNAMIC(CColorSchemeDlg)

public:
	CColorSchemeDlg(CWnd* pParent = nullptr);   // 标准构造函数
	virtual ~CColorSchemeDlg();

	// 对话框数据
#ifdef AFX_DESIGN_TIME
	enum { IDD = IDD_COLOR_SCHEME };
#endif

protected:
	virtual void DoDataExchange(CDataExchange* pDX);    // DDX/DDV 支持

	DECLARE_MESSAGE_MAP()
};