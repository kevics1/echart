// CColorSchemeDlg.cpp: 实现文件
//

#include "pch.h"
#include "Terrain.h"
#include "afxdialogex.h"
#include "CColorSchemeDlg.h"


// CColorSchemeDlg 对话框

IMPLEMENT_DYNAMIC(CColorSchemeDlg, CDialogEx)

CColorSchemeDlg::CColorSchemeDlg(CWnd* pParent /*=nullptr*/)
	: CDialogEx(IDD_COLOR_SCHEME, pParent)
{

}

CColorSchemeDlg::~CColorSchemeDlg()
{
}

void CColorSchemeDlg::DoDataExchange(CDataExchange* pDX)
{
	CDialogEx::DoDataExchange(pDX);
}


BEGIN_MESSAGE_MAP(CColorSchemeDlg, CDialogEx)
END_MESSAGE_MAP()


// CColorSchemeDlg 消息处理程序