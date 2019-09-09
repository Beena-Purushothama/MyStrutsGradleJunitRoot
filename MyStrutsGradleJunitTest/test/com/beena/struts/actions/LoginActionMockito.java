package com.beena.struts.actions;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.beena.struts.forms.LoginForm;

@RunWith(MockitoJUnitRunner.class)
public class LoginActionMockito {

	@Mock
	private ActionMapping mapping;

	@Mock
	private LoginForm form;

	@Mock
	private HttpServletRequest request;

	@Mock
	private HttpServletResponse response;

	private LoginAction loginAction;

	@Before
	public void setUp() {
		loginAction = new LoginAction();
	}

	@Test
	public void whenGetSuccessParameterShouldForwardSuccessPage() throws Exception {

		when(form.getUserName()).thenReturn("user");
		when(form.getPassWord()).thenReturn("user");

		loginAction.execute(mapping, (ActionForm) form, request, response);

		verify(mapping).findForward("success");
	}

}
