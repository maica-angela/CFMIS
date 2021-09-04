package CFMIS_Inventory;

import org.testng.annotations.Test;

public class CreatePR extends CreatePRbaseTest {

	@Test (priority = 1)
	public void LoginRequestor() throws Exception {	
	browserUsed();
	CredentialsLogin();
	ClickLogin();	
	}
	
	@Test (priority = 2)
	public void ClickSubModuleUser () throws Exception{	
		ClickPR();
		ClickRequestor();
	}
	
	@Test (priority = 3)
	public void RequestItemBtn () throws Exception {	
		CreatePRBtn();
		Purpose();
		AddItem();
		EquipmentinListofItem();
		RequestSelectedItemBtn();
		CostFields();
		SubmitRIS();
		Xbutton();
		
		CreatePRBtn();
		Purpose();
		AddItem();
		EquipmentinListofItem();
		RequestSelectedItemBtn();
		CostFields();
		SubmitRIS();
		
		CreatePRBtn();
		Purpose();
		AddItem();
		EquipmentinListofItem();
		RequestSelectedItemBtn();
		CostFields();
		SubmitRIS();
	}
	
	
	@Test (priority = 5)
	public void SubmittedRIS() throws Exception {
		
		CreatePRBtn();
		Purpose();
		AddItem();
		SupplyinListofItem();
		RequestSelectedItemBtn();
		CostFields();
		SubmitRIS();
		
		
		CreatePRBtn();
		Purpose();
		AddItem();
		SupplyinListofItem();
		RequestSelectedItemBtn();
		CostFields();
		SubmitRIS();
		
		
		CreatePRBtn();
		Purpose();
		AddItem();
		SupplyinListofItem();
		RequestSelectedItemBtn();
		CostFields();
		SubmitRIS();
	}
	

}
