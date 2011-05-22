// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2010-07-31 18:57:15 +1000
package jnr.constants.platform.fake;
public enum Sysconf implements jnr.constants.Constant {
_SC_ARG_MAX(1),
_SC_CHILD_MAX(2),
_SC_CLK_TCK(3),
_SC_NGROUPS_MAX(4),
_SC_OPEN_MAX(5),
_SC_JOB_CONTROL(6),
_SC_SAVED_IDS(7),
_SC_VERSION(8),
_SC_BC_BASE_MAX(9),
_SC_BC_DIM_MAX(10),
_SC_BC_SCALE_MAX(11),
_SC_BC_STRING_MAX(12),
_SC_COLL_WEIGHTS_MAX(13),
_SC_EXPR_NEST_MAX(14),
_SC_LINE_MAX(15),
_SC_RE_DUP_MAX(16),
_SC_2_VERSION(17),
_SC_2_C_BIND(18),
_SC_2_C_DEV(19),
_SC_2_CHAR_TERM(20),
_SC_2_FORT_DEV(21),
_SC_2_FORT_RUN(22),
_SC_2_LOCALEDEF(23),
_SC_2_SW_DEV(24),
_SC_2_UPE(25),
_SC_STREAM_MAX(26),
_SC_TZNAME_MAX(27),
_SC_ASYNCHRONOUS_IO(28),
_SC_PAGESIZE(29),
_SC_MEMLOCK(30),
_SC_MEMLOCK_RANGE(31),
_SC_MEMORY_PROTECTION(32),
_SC_MESSAGE_PASSING(33),
_SC_PRIORITIZED_IO(34),
_SC_PRIORITY_SCHEDULING(35),
_SC_REALTIME_SIGNALS(36),
_SC_SEMAPHORES(37),
_SC_FSYNC(38),
_SC_SHARED_MEMORY_OBJECTS(39),
_SC_SYNCHRONIZED_IO(40),
_SC_TIMERS(41),
_SC_AIO_LISTIO_MAX(42),
_SC_AIO_MAX(43),
_SC_AIO_PRIO_DELTA_MAX(44),
_SC_DELAYTIMER_MAX(45),
_SC_MQ_OPEN_MAX(46),
_SC_MAPPED_FILES(47),
_SC_RTSIG_MAX(48),
_SC_SEM_NSEMS_MAX(49),
_SC_SEM_VALUE_MAX(50),
_SC_SIGQUEUE_MAX(51),
_SC_TIMER_MAX(52),
_SC_NPROCESSORS_CONF(53),
_SC_NPROCESSORS_ONLN(54),
_SC_2_PBS(55),
_SC_2_PBS_ACCOUNTING(56),
_SC_2_PBS_CHECKPOINT(57),
_SC_2_PBS_LOCATE(58),
_SC_2_PBS_MESSAGE(59),
_SC_2_PBS_TRACK(60),
_SC_ADVISORY_INFO(61),
_SC_BARRIERS(62),
_SC_CLOCK_SELECTION(63),
_SC_CPUTIME(64),
_SC_FILE_LOCKING(65),
_SC_GETGR_R_SIZE_MAX(66),
_SC_GETPW_R_SIZE_MAX(67),
_SC_HOST_NAME_MAX(68),
_SC_LOGIN_NAME_MAX(69),
_SC_MONOTONIC_CLOCK(70),
_SC_MQ_PRIO_MAX(71),
_SC_READER_WRITER_LOCKS(72),
_SC_REGEXP(73),
_SC_SHELL(74),
_SC_SPAWN(75),
_SC_SPIN_LOCKS(76),
_SC_SPORADIC_SERVER(77),
_SC_THREAD_ATTR_STACKADDR(78),
_SC_THREAD_ATTR_STACKSIZE(79),
_SC_THREAD_CPUTIME(80),
_SC_THREAD_DESTRUCTOR_ITERATIONS(81),
_SC_THREAD_KEYS_MAX(82),
_SC_THREAD_PRIO_INHERIT(83),
_SC_THREAD_PRIO_PROTECT(84),
_SC_THREAD_PRIORITY_SCHEDULING(85),
_SC_THREAD_PROCESS_SHARED(86),
_SC_THREAD_SAFE_FUNCTIONS(87),
_SC_THREAD_SPORADIC_SERVER(88),
_SC_THREAD_STACK_MIN(89),
_SC_THREAD_THREADS_MAX(90),
_SC_TIMEOUTS(91),
_SC_THREADS(92),
_SC_TRACE(93),
_SC_TRACE_EVENT_FILTER(94),
_SC_TRACE_INHERIT(95),
_SC_TRACE_LOG(96),
_SC_TTY_NAME_MAX(97),
_SC_TYPED_MEMORY_OBJECTS(98),
_SC_V6_ILP32_OFF32(99),
_SC_V6_ILP32_OFFBIG(100),
_SC_V6_LP64_OFF64(101),
_SC_V6_LPBIG_OFFBIG(102),
_SC_IPV6(103),
_SC_RAW_SOCKETS(104),
_SC_SYMLOOP_MAX(105),
_SC_ATEXIT_MAX(106),
_SC_IOV_MAX(107),
_SC_PAGE_SIZE(108),
_SC_XOPEN_CRYPT(109),
_SC_XOPEN_ENH_I18N(110),
_SC_XOPEN_LEGACY(111),
_SC_XOPEN_REALTIME(112),
_SC_XOPEN_REALTIME_THREADS(113),
_SC_XOPEN_SHM(114),
_SC_XOPEN_STREAMS(115),
_SC_XOPEN_UNIX(116),
_SC_XOPEN_VERSION(117),
_SC_XOPEN_XCU_VERSION(118),
_SC_XBS5_ILP32_OFF32(119),
_SC_XBS5_ILP32_OFFBIG(120),
_SC_XBS5_LP64_OFF64(121),
_SC_XBS5_LPBIG_OFFBIG(122),
_SC_SS_REPL_MAX(123),
_SC_TRACE_EVENT_NAME_MAX(124),
_SC_TRACE_NAME_MAX(125),
_SC_TRACE_SYS_MAX(126),
_SC_TRACE_USER_EVENT_MAX(127),
_SC_PASS_MAX(128);
private final long value;
private Sysconf(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 128L;
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
}