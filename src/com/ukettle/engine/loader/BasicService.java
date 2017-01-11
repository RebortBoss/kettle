package com.ukettle.engine.loader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ukettle.service.router.service.RouterService;
import com.ukettle.system.service.LocaleService;
import com.ukettle.system.service.MenuService;
import com.ukettle.system.service.RestService;
import com.ukettle.system.service.RoleService;
import com.ukettle.system.service.UserService;
import com.ukettle.widget.kettle.service.KettleJobService;
import com.ukettle.widget.kettle.service.KettleLogsService;
import com.ukettle.widget.kettle.service.KettleReposService;
import com.ukettle.widget.kettle.service.KettleResultService;
import com.ukettle.widget.kettle.service.KettleSpoonService;
import com.ukettle.widget.kettle.service.KettleTransService;
import com.ukettle.widget.quartz.service.QuartzGroupService;
import com.ukettle.widget.quartz.service.QuartzScheduleService;

@Service
public class BasicService {

	/** System Service info */
	@Autowired
	public LocaleService iLocaleService;
	@Autowired
	public UserService<Object> iUserService;
	@Autowired
	public RoleService<Object> iRoleService;
	@Autowired
	public MenuService<Object> iMenuService;
	@Autowired
	public RestService<Object> iRestService;

	/** Router Service info */
	@Autowired
	public RouterService<Object> iRouterService;

	/** Kettle Service info */
	@Autowired
	public KettleLogsService<Object> iKettleLogsService;
	@Autowired
	public KettleResultService<Object> iKettleResultService;
	@Autowired
	public KettleReposService<Object> iKettleReposService;
	@Autowired
	public KettleJobService<Object> iKettleJobService;
	@Autowired
	public KettleTransService<Object> iKettleTransService;
	@Autowired
	public KettleSpoonService<Object> iKettleSpoonService;
	
	/** Quartz Service info */
	@Autowired
	public QuartzGroupService<Object> iQuartzGroupService;
	@Autowired
	public QuartzScheduleService<Object> iQuartzScheduleService;
	
}