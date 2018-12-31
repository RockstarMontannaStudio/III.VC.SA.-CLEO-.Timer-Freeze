SCRIPT_START
{
NOP
LVAR_INT timer_play timer_stop timer_status

timerFreeze:
WAIT 0

 IF TEST_CHEAT "timer"
   IF timer_status = 0
     PRINT_HELP_STRING "Cronometro parado"
     GOSUB timer_play
   ELSE
     PRINT_HELP_STRING "Cronometro activo"
     GOSUB timer_stop
   ENDIF
ENDIF

GOTO timerFreeze

timer_stop:
timer_status = 0
FREEZE_ONSCREEN_TIMER 0
RETURN

timer_play:
timer_status = 1
FREEZE_ONSCREEN_TIMER 1
RETURN

}
SCRIPT_END