package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_BOOLEAN", "RULE_NETWORK", "RULE_OCTET", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BDIModel {'", "'}'", "'Agent'", "'{'", "'Imports {'", "'Import {'", "'Events {'", "'Parameters {'", "'='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'.'", "'Plans {'", "'Plan'", "'Trigger {'", "'BeliefSet'", "'Belief'", "'Fact {'", "'Achieve'", "'Query'", "'Maintain'", "'Perform'", "'=='", "'>'", "'<'", "'>='", "'<='", "'!='", "'and'", "'or'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_OCTET=9;
    public static final int RULE_NETWORK=8;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleBDI"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleBDI : ruleBDI EOF ;
    public final void entryRuleBDI() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleBDI EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleBDI EOF
            {
             before(grammarAccess.getBDIRule()); 
            pushFollow(FOLLOW_ruleBDI_in_entryRuleBDI61);
            ruleBDI();

            state._fsp--;

             after(grammarAccess.getBDIRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBDI68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBDI"


    // $ANTLR start "ruleBDI"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleBDI : ( ( rule__BDI__Group__0 ) ) ;
    public final void ruleBDI() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__BDI__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__BDI__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__BDI__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__BDI__Group__0 )
            {
             before(grammarAccess.getBDIAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__BDI__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__BDI__Group__0
            {
            pushFollow(FOLLOW_rule__BDI__Group__0_in_ruleBDI94);
            rule__BDI__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBDIAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBDI"


    // $ANTLR start "entryRuleAgent"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleAgent : ruleAgent EOF ;
    public final void entryRuleAgent() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleAgent EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleAgent EOF
            {
             before(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_ruleAgent_in_entryRuleAgent121);
            ruleAgent();

            state._fsp--;

             after(grammarAccess.getAgentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAgent128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAgent"


    // $ANTLR start "ruleAgent"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleAgent : ( ( rule__Agent__Group__0 ) ) ;
    public final void ruleAgent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__Agent__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Agent__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Agent__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__Agent__Group__0 )
            {
             before(grammarAccess.getAgentAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__Agent__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__Agent__Group__0
            {
            pushFollow(FOLLOW_rule__Agent__Group__0_in_ruleAgent154);
            rule__Agent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAgentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAgent"


    // $ANTLR start "entryRuleImports"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleImports : ruleImports EOF ;
    public final void entryRuleImports() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleImports EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleImports EOF
            {
             before(grammarAccess.getImportsRule()); 
            pushFollow(FOLLOW_ruleImports_in_entryRuleImports181);
            ruleImports();

            state._fsp--;

             after(grammarAccess.getImportsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImports188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImports"


    // $ANTLR start "ruleImports"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleImports : ( ( rule__Imports__Group__0 ) ) ;
    public final void ruleImports() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__Imports__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Imports__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Imports__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__Imports__Group__0 )
            {
             before(grammarAccess.getImportsAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__Imports__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__Imports__Group__0
            {
            pushFollow(FOLLOW_rule__Imports__Group__0_in_ruleImports214);
            rule__Imports__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImports"


    // $ANTLR start "entryRuleImport"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleImport EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport241);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Import__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__Import__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport274);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleFilename"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleFilename : ruleFilename EOF ;
    public final void entryRuleFilename() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleFilename EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleFilename EOF
            {
             before(grammarAccess.getFilenameRule()); 
            pushFollow(FOLLOW_ruleFilename_in_entryRuleFilename301);
            ruleFilename();

            state._fsp--;

             after(grammarAccess.getFilenameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilename308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilename"


    // $ANTLR start "ruleFilename"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleFilename : ( RULE_STRING ) ;
    public final void ruleFilename() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: RULE_STRING
            {
             before(grammarAccess.getFilenameAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFilename334); 
             after(grammarAccess.getFilenameAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilename"


    // $ANTLR start "entryRuleEvents"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: entryRuleEvents : ruleEvents EOF ;
    public final void entryRuleEvents() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: ( ruleEvents EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: ruleEvents EOF
            {
             before(grammarAccess.getEventsRule()); 
            pushFollow(FOLLOW_ruleEvents_in_entryRuleEvents360);
            ruleEvents();

            state._fsp--;

             after(grammarAccess.getEventsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvents367); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvents"


    // $ANTLR start "ruleEvents"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: ruleEvents : ( ( rule__Events__Group__0 ) ) ;
    public final void ruleEvents() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:213:2: ( ( ( rule__Events__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__Events__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__Events__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: ( rule__Events__Group__0 )
            {
             before(grammarAccess.getEventsAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( rule__Events__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:2: rule__Events__Group__0
            {
            pushFollow(FOLLOW_rule__Events__Group__0_in_ruleEvents393);
            rule__Events__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvents"


    // $ANTLR start "entryRuleEvent"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:228:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:229:1: ( ruleEvent EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent420);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent427); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:237:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:241:2: ( ( ( rule__Event__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__Event__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__Event__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( rule__Event__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:2: rule__Event__Group__0
            {
            pushFollow(FOLLOW_rule__Event__Group__0_in_ruleEvent453);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleParameters"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:256:1: entryRuleParameters : ruleParameters EOF ;
    public final void entryRuleParameters() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:257:1: ( ruleParameters EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:258:1: ruleParameters EOF
            {
             before(grammarAccess.getParametersRule()); 
            pushFollow(FOLLOW_ruleParameters_in_entryRuleParameters480);
            ruleParameters();

            state._fsp--;

             after(grammarAccess.getParametersRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameters487); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:265:1: ruleParameters : ( ( rule__Parameters__Group__0 ) ) ;
    public final void ruleParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:269:2: ( ( ( rule__Parameters__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__Parameters__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__Parameters__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:271:1: ( rule__Parameters__Group__0 )
            {
             before(grammarAccess.getParametersAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: ( rule__Parameters__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:2: rule__Parameters__Group__0
            {
            pushFollow(FOLLOW_rule__Parameters__Group__0_in_ruleParameters513);
            rule__Parameters__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParametersAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleParameter"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:284:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:285:1: ( ruleParameter EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:286:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter540);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter547); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:293:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:297:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__Parameter__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: ( rule__Parameter__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter573);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleValue"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:312:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:313:1: ( ruleValue EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:314:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue600);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue607); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:321:1: ruleValue : ( ruleCode ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:325:2: ( ( ruleCode ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ruleCode )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ruleCode )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:327:1: ruleCode
            {
             before(grammarAccess.getValueAccess().getCodeParserRuleCall()); 
            pushFollow(FOLLOW_ruleCode_in_ruleValue633);
            ruleCode();

            state._fsp--;

             after(grammarAccess.getValueAccess().getCodeParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleCode"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:340:1: entryRuleCode : ruleCode EOF ;
    public final void entryRuleCode() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:341:1: ( ruleCode EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: ruleCode EOF
            {
             before(grammarAccess.getCodeRule()); 
            pushFollow(FOLLOW_ruleCode_in_entryRuleCode659);
            ruleCode();

            state._fsp--;

             after(grammarAccess.getCodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCode666); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCode"


    // $ANTLR start "ruleCode"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:349:1: ruleCode : ( ( rule__Code__Alternatives ) ) ;
    public final void ruleCode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:353:2: ( ( ( rule__Code__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( rule__Code__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( rule__Code__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:355:1: ( rule__Code__Alternatives )
            {
             before(grammarAccess.getCodeAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:356:1: ( rule__Code__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:356:2: rule__Code__Alternatives
            {
            pushFollow(FOLLOW_rule__Code__Alternatives_in_ruleCode692);
            rule__Code__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCodeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCode"


    // $ANTLR start "entryRuleOperator"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:368:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:369:1: ( ruleOperator EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:370:1: ruleOperator EOF
            {
             before(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator719);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperator726); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:377:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:381:2: ( ( ( rule__Operator__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:382:1: ( ( rule__Operator__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:382:1: ( ( rule__Operator__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:383:1: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:384:1: ( rule__Operator__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:384:2: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_rule__Operator__Alternatives_in_ruleOperator752);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleCondition"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:396:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:397:1: ( ruleCondition EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:398:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition779);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition786); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:405:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:409:2: ( ( ( rule__Condition__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( ( rule__Condition__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( ( rule__Condition__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:411:1: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:412:1: ( rule__Condition__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:412:2: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_rule__Condition__Group__0_in_ruleCondition812);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:424:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:425:1: ( ruleExpression EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression839);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression846); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:433:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:437:2: ( ( ( rule__Expression__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( ( rule__Expression__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( ( rule__Expression__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:439:1: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:440:1: ( rule__Expression__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:440:2: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_rule__Expression__Group__0_in_ruleExpression872);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleTerm"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:452:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:453:1: ( ruleTerm EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:454:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm899);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm906); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:461:1: ruleTerm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:465:2: ( ( ( rule__Term__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:466:1: ( ( rule__Term__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:466:1: ( ( rule__Term__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:467:1: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:468:1: ( rule__Term__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:468:2: rule__Term__Group__0
            {
            pushFollow(FOLLOW_rule__Term__Group__0_in_ruleTerm932);
            rule__Term__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleFactor"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:480:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:481:1: ( ruleFactor EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:482:1: ruleFactor EOF
            {
             before(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_ruleFactor_in_entryRuleFactor959);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getFactorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactor966); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:489:1: ruleFactor : ( ( rule__Factor__Alternatives ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:493:2: ( ( ( rule__Factor__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:494:1: ( ( rule__Factor__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:494:1: ( ( rule__Factor__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:495:1: ( rule__Factor__Alternatives )
            {
             before(grammarAccess.getFactorAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:496:1: ( rule__Factor__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:496:2: rule__Factor__Alternatives
            {
            pushFollow(FOLLOW_rule__Factor__Alternatives_in_ruleFactor992);
            rule__Factor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleNUMBER"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:508:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:509:1: ( ruleNUMBER EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:510:1: ruleNUMBER EOF
            {
             before(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER1019);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getNUMBERRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER1026); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:517:1: ruleNUMBER : ( RULE_INT ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:521:2: ( ( RULE_INT ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:522:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:522:1: ( RULE_INT )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:523:1: RULE_INT
            {
             before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER1052); 
             after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:536:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:537:1: ( ruleQualifiedName EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:538:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1078);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1085); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:545:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:549:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:550:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:550:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: ( rule__QualifiedName__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:552:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1111);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRulePlans"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:564:1: entryRulePlans : rulePlans EOF ;
    public final void entryRulePlans() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:565:1: ( rulePlans EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:566:1: rulePlans EOF
            {
             before(grammarAccess.getPlansRule()); 
            pushFollow(FOLLOW_rulePlans_in_entryRulePlans1138);
            rulePlans();

            state._fsp--;

             after(grammarAccess.getPlansRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlans1145); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlans"


    // $ANTLR start "rulePlans"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:573:1: rulePlans : ( ( rule__Plans__Group__0 ) ) ;
    public final void rulePlans() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:577:2: ( ( ( rule__Plans__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:578:1: ( ( rule__Plans__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:578:1: ( ( rule__Plans__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:579:1: ( rule__Plans__Group__0 )
            {
             before(grammarAccess.getPlansAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:580:1: ( rule__Plans__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:580:2: rule__Plans__Group__0
            {
            pushFollow(FOLLOW_rule__Plans__Group__0_in_rulePlans1171);
            rule__Plans__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlansAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlans"


    // $ANTLR start "entryRulePlan"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:592:1: entryRulePlan : rulePlan EOF ;
    public final void entryRulePlan() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:593:1: ( rulePlan EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:594:1: rulePlan EOF
            {
             before(grammarAccess.getPlanRule()); 
            pushFollow(FOLLOW_rulePlan_in_entryRulePlan1198);
            rulePlan();

            state._fsp--;

             after(grammarAccess.getPlanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlan1205); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlan"


    // $ANTLR start "rulePlan"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:601:1: rulePlan : ( ( rule__Plan__Group__0 ) ) ;
    public final void rulePlan() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:605:2: ( ( ( rule__Plan__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:606:1: ( ( rule__Plan__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:606:1: ( ( rule__Plan__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:607:1: ( rule__Plan__Group__0 )
            {
             before(grammarAccess.getPlanAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:608:1: ( rule__Plan__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:608:2: rule__Plan__Group__0
            {
            pushFollow(FOLLOW_rule__Plan__Group__0_in_rulePlan1231);
            rule__Plan__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlanAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlan"


    // $ANTLR start "entryRuleBody"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:620:1: entryRuleBody : ruleBody EOF ;
    public final void entryRuleBody() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:621:1: ( ruleBody EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:622:1: ruleBody EOF
            {
             before(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody1258);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getBodyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody1265); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:629:1: ruleBody : ( RULE_STRING ) ;
    public final void ruleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:633:2: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:634:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:634:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:635:1: RULE_STRING
            {
             before(grammarAccess.getBodyAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBody1291); 
             after(grammarAccess.getBodyAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleTrigger"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:648:1: entryRuleTrigger : ruleTrigger EOF ;
    public final void entryRuleTrigger() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:649:1: ( ruleTrigger EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:650:1: ruleTrigger EOF
            {
             before(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_ruleTrigger_in_entryRuleTrigger1317);
            ruleTrigger();

            state._fsp--;

             after(grammarAccess.getTriggerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrigger1324); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:657:1: ruleTrigger : ( ( rule__Trigger__Alternatives ) ) ;
    public final void ruleTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:661:2: ( ( ( rule__Trigger__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:662:1: ( ( rule__Trigger__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:662:1: ( ( rule__Trigger__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:663:1: ( rule__Trigger__Alternatives )
            {
             before(grammarAccess.getTriggerAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: ( rule__Trigger__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:664:2: rule__Trigger__Alternatives
            {
            pushFollow(FOLLOW_rule__Trigger__Alternatives_in_ruleTrigger1350);
            rule__Trigger__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTriggerAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleBeliefSet"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:676:1: entryRuleBeliefSet : ruleBeliefSet EOF ;
    public final void entryRuleBeliefSet() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:677:1: ( ruleBeliefSet EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:678:1: ruleBeliefSet EOF
            {
             before(grammarAccess.getBeliefSetRule()); 
            pushFollow(FOLLOW_ruleBeliefSet_in_entryRuleBeliefSet1377);
            ruleBeliefSet();

            state._fsp--;

             after(grammarAccess.getBeliefSetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBeliefSet1384); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBeliefSet"


    // $ANTLR start "ruleBeliefSet"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:685:1: ruleBeliefSet : ( ( rule__BeliefSet__Group__0 ) ) ;
    public final void ruleBeliefSet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:689:2: ( ( ( rule__BeliefSet__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:690:1: ( ( rule__BeliefSet__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:690:1: ( ( rule__BeliefSet__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:691:1: ( rule__BeliefSet__Group__0 )
            {
             before(grammarAccess.getBeliefSetAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:692:1: ( rule__BeliefSet__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:692:2: rule__BeliefSet__Group__0
            {
            pushFollow(FOLLOW_rule__BeliefSet__Group__0_in_ruleBeliefSet1410);
            rule__BeliefSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBeliefSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBeliefSet"


    // $ANTLR start "entryRuleBelief"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:704:1: entryRuleBelief : ruleBelief EOF ;
    public final void entryRuleBelief() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:705:1: ( ruleBelief EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:706:1: ruleBelief EOF
            {
             before(grammarAccess.getBeliefRule()); 
            pushFollow(FOLLOW_ruleBelief_in_entryRuleBelief1437);
            ruleBelief();

            state._fsp--;

             after(grammarAccess.getBeliefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBelief1444); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBelief"


    // $ANTLR start "ruleBelief"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:713:1: ruleBelief : ( ( rule__Belief__Group__0 ) ) ;
    public final void ruleBelief() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:717:2: ( ( ( rule__Belief__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:718:1: ( ( rule__Belief__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:718:1: ( ( rule__Belief__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:719:1: ( rule__Belief__Group__0 )
            {
             before(grammarAccess.getBeliefAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:720:1: ( rule__Belief__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:720:2: rule__Belief__Group__0
            {
            pushFollow(FOLLOW_rule__Belief__Group__0_in_ruleBelief1470);
            rule__Belief__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBeliefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBelief"


    // $ANTLR start "entryRuleFact"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:732:1: entryRuleFact : ruleFact EOF ;
    public final void entryRuleFact() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:733:1: ( ruleFact EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:734:1: ruleFact EOF
            {
             before(grammarAccess.getFactRule()); 
            pushFollow(FOLLOW_ruleFact_in_entryRuleFact1497);
            ruleFact();

            state._fsp--;

             after(grammarAccess.getFactRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFact1504); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFact"


    // $ANTLR start "ruleFact"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:741:1: ruleFact : ( ( rule__Fact__Group__0 ) ) ;
    public final void ruleFact() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:745:2: ( ( ( rule__Fact__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:746:1: ( ( rule__Fact__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:746:1: ( ( rule__Fact__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:747:1: ( rule__Fact__Group__0 )
            {
             before(grammarAccess.getFactAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:748:1: ( rule__Fact__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:748:2: rule__Fact__Group__0
            {
            pushFollow(FOLLOW_rule__Fact__Group__0_in_ruleFact1530);
            rule__Fact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFact"


    // $ANTLR start "entryRuleStatements"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:760:1: entryRuleStatements : ruleStatements EOF ;
    public final void entryRuleStatements() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:761:1: ( ruleStatements EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:762:1: ruleStatements EOF
            {
             before(grammarAccess.getStatementsRule()); 
            pushFollow(FOLLOW_ruleStatements_in_entryRuleStatements1557);
            ruleStatements();

            state._fsp--;

             after(grammarAccess.getStatementsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatements1564); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatements"


    // $ANTLR start "ruleStatements"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:769:1: ruleStatements : ( ( ( rule__Statements__StatementsAssignment ) ) ( ( rule__Statements__StatementsAssignment )* ) ) ;
    public final void ruleStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:773:2: ( ( ( ( rule__Statements__StatementsAssignment ) ) ( ( rule__Statements__StatementsAssignment )* ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:774:1: ( ( ( rule__Statements__StatementsAssignment ) ) ( ( rule__Statements__StatementsAssignment )* ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:774:1: ( ( ( rule__Statements__StatementsAssignment ) ) ( ( rule__Statements__StatementsAssignment )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:775:1: ( ( rule__Statements__StatementsAssignment ) ) ( ( rule__Statements__StatementsAssignment )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:775:1: ( ( rule__Statements__StatementsAssignment ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:776:1: ( rule__Statements__StatementsAssignment )
            {
             before(grammarAccess.getStatementsAccess().getStatementsAssignment()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:777:1: ( rule__Statements__StatementsAssignment )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:777:2: rule__Statements__StatementsAssignment
            {
            pushFollow(FOLLOW_rule__Statements__StatementsAssignment_in_ruleStatements1592);
            rule__Statements__StatementsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStatementsAccess().getStatementsAssignment()); 

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:780:1: ( ( rule__Statements__StatementsAssignment )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:781:1: ( rule__Statements__StatementsAssignment )*
            {
             before(grammarAccess.getStatementsAccess().getStatementsAssignment()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:782:1: ( rule__Statements__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_STRING) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==EOF||(LA1_2>=RULE_STRING && LA1_2<=RULE_NETWORK)) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>=RULE_INT && LA1_0<=RULE_NETWORK)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:782:2: rule__Statements__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Statements__StatementsAssignment_in_ruleStatements1604);
            	    rule__Statements__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getStatementsAccess().getStatementsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatements"


    // $ANTLR start "entryRuleStatement"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:795:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:796:1: ( ruleStatement EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:797:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement1634);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement1641); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:804:1: ruleStatement : ( ruleCode ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:808:2: ( ( ruleCode ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:809:1: ( ruleCode )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:809:1: ( ruleCode )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:810:1: ruleCode
            {
             before(grammarAccess.getStatementAccess().getCodeParserRuleCall()); 
            pushFollow(FOLLOW_ruleCode_in_ruleStatement1667);
            ruleCode();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getCodeParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleGoal"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:825:1: entryRuleGoal : ruleGoal EOF ;
    public final void entryRuleGoal() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:826:1: ( ruleGoal EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:827:1: ruleGoal EOF
            {
             before(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal1695);
            ruleGoal();

            state._fsp--;

             after(grammarAccess.getGoalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal1702); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGoal"


    // $ANTLR start "ruleGoal"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:834:1: ruleGoal : ( ( rule__Goal__Alternatives ) ) ;
    public final void ruleGoal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:838:2: ( ( ( rule__Goal__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:839:1: ( ( rule__Goal__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:839:1: ( ( rule__Goal__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:840:1: ( rule__Goal__Alternatives )
            {
             before(grammarAccess.getGoalAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:841:1: ( rule__Goal__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:841:2: rule__Goal__Alternatives
            {
            pushFollow(FOLLOW_rule__Goal__Alternatives_in_ruleGoal1728);
            rule__Goal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGoal"


    // $ANTLR start "entryRuleAchieve"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:853:1: entryRuleAchieve : ruleAchieve EOF ;
    public final void entryRuleAchieve() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:854:1: ( ruleAchieve EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:855:1: ruleAchieve EOF
            {
             before(grammarAccess.getAchieveRule()); 
            pushFollow(FOLLOW_ruleAchieve_in_entryRuleAchieve1755);
            ruleAchieve();

            state._fsp--;

             after(grammarAccess.getAchieveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAchieve1762); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAchieve"


    // $ANTLR start "ruleAchieve"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:862:1: ruleAchieve : ( ( rule__Achieve__Group__0 ) ) ;
    public final void ruleAchieve() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:866:2: ( ( ( rule__Achieve__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:867:1: ( ( rule__Achieve__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:867:1: ( ( rule__Achieve__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:868:1: ( rule__Achieve__Group__0 )
            {
             before(grammarAccess.getAchieveAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:869:1: ( rule__Achieve__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:869:2: rule__Achieve__Group__0
            {
            pushFollow(FOLLOW_rule__Achieve__Group__0_in_ruleAchieve1788);
            rule__Achieve__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAchieveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAchieve"


    // $ANTLR start "entryRuleQuery"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:881:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:882:1: ( ruleQuery EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:883:1: ruleQuery EOF
            {
             before(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_ruleQuery_in_entryRuleQuery1815);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getQueryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery1822); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:890:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:894:2: ( ( ( rule__Query__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:895:1: ( ( rule__Query__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:895:1: ( ( rule__Query__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:896:1: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:897:1: ( rule__Query__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:897:2: rule__Query__Group__0
            {
            pushFollow(FOLLOW_rule__Query__Group__0_in_ruleQuery1848);
            rule__Query__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleMaintain"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:909:1: entryRuleMaintain : ruleMaintain EOF ;
    public final void entryRuleMaintain() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:910:1: ( ruleMaintain EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:911:1: ruleMaintain EOF
            {
             before(grammarAccess.getMaintainRule()); 
            pushFollow(FOLLOW_ruleMaintain_in_entryRuleMaintain1875);
            ruleMaintain();

            state._fsp--;

             after(grammarAccess.getMaintainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaintain1882); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMaintain"


    // $ANTLR start "ruleMaintain"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:918:1: ruleMaintain : ( ( rule__Maintain__Group__0 ) ) ;
    public final void ruleMaintain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:922:2: ( ( ( rule__Maintain__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:923:1: ( ( rule__Maintain__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:923:1: ( ( rule__Maintain__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:924:1: ( rule__Maintain__Group__0 )
            {
             before(grammarAccess.getMaintainAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:925:1: ( rule__Maintain__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:925:2: rule__Maintain__Group__0
            {
            pushFollow(FOLLOW_rule__Maintain__Group__0_in_ruleMaintain1908);
            rule__Maintain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaintainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaintain"


    // $ANTLR start "entryRulePerform"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:937:1: entryRulePerform : rulePerform EOF ;
    public final void entryRulePerform() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:938:1: ( rulePerform EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:939:1: rulePerform EOF
            {
             before(grammarAccess.getPerformRule()); 
            pushFollow(FOLLOW_rulePerform_in_entryRulePerform1935);
            rulePerform();

            state._fsp--;

             after(grammarAccess.getPerformRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePerform1942); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePerform"


    // $ANTLR start "rulePerform"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:946:1: rulePerform : ( ( rule__Perform__Group__0 ) ) ;
    public final void rulePerform() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:950:2: ( ( ( rule__Perform__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:951:1: ( ( rule__Perform__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:951:1: ( ( rule__Perform__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:952:1: ( rule__Perform__Group__0 )
            {
             before(grammarAccess.getPerformAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:953:1: ( rule__Perform__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:953:2: rule__Perform__Group__0
            {
            pushFollow(FOLLOW_rule__Perform__Group__0_in_rulePerform1968);
            rule__Perform__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPerformAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerform"


    // $ANTLR start "entryRuleResult"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:965:1: entryRuleResult : ruleResult EOF ;
    public final void entryRuleResult() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:966:1: ( ruleResult EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:967:1: ruleResult EOF
            {
             before(grammarAccess.getResultRule()); 
            pushFollow(FOLLOW_ruleResult_in_entryRuleResult1995);
            ruleResult();

            state._fsp--;

             after(grammarAccess.getResultRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResult2002); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResult"


    // $ANTLR start "ruleResult"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:974:1: ruleResult : ( RULE_STRING ) ;
    public final void ruleResult() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:978:2: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:979:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:979:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:980:1: RULE_STRING
            {
             before(grammarAccess.getResultAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResult2028); 
             after(grammarAccess.getResultAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResult"


    // $ANTLR start "rule__Code__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:993:1: rule__Code__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) | ( RULE_BOOLEAN ) | ( ruleNUMBER ) | ( RULE_NETWORK ) );
    public final void rule__Code__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:997:1: ( ( RULE_STRING ) | ( RULE_ID ) | ( RULE_BOOLEAN ) | ( ruleNUMBER ) | ( RULE_NETWORK ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                alt2=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt2=3;
                }
                break;
            case RULE_INT:
                {
                alt2=4;
                }
                break;
            case RULE_NETWORK:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:998:1: ( RULE_STRING )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:998:1: ( RULE_STRING )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:999:1: RULE_STRING
                    {
                     before(grammarAccess.getCodeAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Code__Alternatives2063); 
                     after(grammarAccess.getCodeAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1004:6: ( RULE_ID )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1004:6: ( RULE_ID )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1005:1: RULE_ID
                    {
                     before(grammarAccess.getCodeAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Code__Alternatives2080); 
                     after(grammarAccess.getCodeAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1010:6: ( RULE_BOOLEAN )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1010:6: ( RULE_BOOLEAN )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1011:1: RULE_BOOLEAN
                    {
                     before(grammarAccess.getCodeAccess().getBOOLEANTerminalRuleCall_2()); 
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__Code__Alternatives2097); 
                     after(grammarAccess.getCodeAccess().getBOOLEANTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1016:6: ( ruleNUMBER )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1016:6: ( ruleNUMBER )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1017:1: ruleNUMBER
                    {
                     before(grammarAccess.getCodeAccess().getNUMBERParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleNUMBER_in_rule__Code__Alternatives2114);
                    ruleNUMBER();

                    state._fsp--;

                     after(grammarAccess.getCodeAccess().getNUMBERParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1022:6: ( RULE_NETWORK )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1022:6: ( RULE_NETWORK )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1023:1: RULE_NETWORK
                    {
                     before(grammarAccess.getCodeAccess().getNETWORKTerminalRuleCall_4()); 
                    match(input,RULE_NETWORK,FOLLOW_RULE_NETWORK_in_rule__Code__Alternatives2131); 
                     after(grammarAccess.getCodeAccess().getNETWORKTerminalRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1033:1: rule__Operator__Alternatives : ( ( ( rule__Operator__EqualToAssignment_0 ) ) | ( ( rule__Operator__LargerThanAssignment_1 ) ) | ( ( rule__Operator__SmallerThanAssignment_2 ) ) | ( ( rule__Operator__LargerOrEqualToAssignment_3 ) ) | ( ( rule__Operator__SmallerOrEqualToAssignment_4 ) ) | ( ( rule__Operator__NotEqualToAssignment_5 ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1037:1: ( ( ( rule__Operator__EqualToAssignment_0 ) ) | ( ( rule__Operator__LargerThanAssignment_1 ) ) | ( ( rule__Operator__SmallerThanAssignment_2 ) ) | ( ( rule__Operator__LargerOrEqualToAssignment_3 ) ) | ( ( rule__Operator__SmallerOrEqualToAssignment_4 ) ) | ( ( rule__Operator__NotEqualToAssignment_5 ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt3=1;
                }
                break;
            case 41:
                {
                alt3=2;
                }
                break;
            case 42:
                {
                alt3=3;
                }
                break;
            case 43:
                {
                alt3=4;
                }
                break;
            case 44:
                {
                alt3=5;
                }
                break;
            case 45:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1038:1: ( ( rule__Operator__EqualToAssignment_0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1038:1: ( ( rule__Operator__EqualToAssignment_0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1039:1: ( rule__Operator__EqualToAssignment_0 )
                    {
                     before(grammarAccess.getOperatorAccess().getEqualToAssignment_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1040:1: ( rule__Operator__EqualToAssignment_0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1040:2: rule__Operator__EqualToAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Operator__EqualToAssignment_0_in_rule__Operator__Alternatives2163);
                    rule__Operator__EqualToAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatorAccess().getEqualToAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1044:6: ( ( rule__Operator__LargerThanAssignment_1 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1044:6: ( ( rule__Operator__LargerThanAssignment_1 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1045:1: ( rule__Operator__LargerThanAssignment_1 )
                    {
                     before(grammarAccess.getOperatorAccess().getLargerThanAssignment_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1046:1: ( rule__Operator__LargerThanAssignment_1 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1046:2: rule__Operator__LargerThanAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Operator__LargerThanAssignment_1_in_rule__Operator__Alternatives2181);
                    rule__Operator__LargerThanAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatorAccess().getLargerThanAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1050:6: ( ( rule__Operator__SmallerThanAssignment_2 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1050:6: ( ( rule__Operator__SmallerThanAssignment_2 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1051:1: ( rule__Operator__SmallerThanAssignment_2 )
                    {
                     before(grammarAccess.getOperatorAccess().getSmallerThanAssignment_2()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1052:1: ( rule__Operator__SmallerThanAssignment_2 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1052:2: rule__Operator__SmallerThanAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Operator__SmallerThanAssignment_2_in_rule__Operator__Alternatives2199);
                    rule__Operator__SmallerThanAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatorAccess().getSmallerThanAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1056:6: ( ( rule__Operator__LargerOrEqualToAssignment_3 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1056:6: ( ( rule__Operator__LargerOrEqualToAssignment_3 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1057:1: ( rule__Operator__LargerOrEqualToAssignment_3 )
                    {
                     before(grammarAccess.getOperatorAccess().getLargerOrEqualToAssignment_3()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1058:1: ( rule__Operator__LargerOrEqualToAssignment_3 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1058:2: rule__Operator__LargerOrEqualToAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Operator__LargerOrEqualToAssignment_3_in_rule__Operator__Alternatives2217);
                    rule__Operator__LargerOrEqualToAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatorAccess().getLargerOrEqualToAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1062:6: ( ( rule__Operator__SmallerOrEqualToAssignment_4 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1062:6: ( ( rule__Operator__SmallerOrEqualToAssignment_4 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1063:1: ( rule__Operator__SmallerOrEqualToAssignment_4 )
                    {
                     before(grammarAccess.getOperatorAccess().getSmallerOrEqualToAssignment_4()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1064:1: ( rule__Operator__SmallerOrEqualToAssignment_4 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1064:2: rule__Operator__SmallerOrEqualToAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Operator__SmallerOrEqualToAssignment_4_in_rule__Operator__Alternatives2235);
                    rule__Operator__SmallerOrEqualToAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatorAccess().getSmallerOrEqualToAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:6: ( ( rule__Operator__NotEqualToAssignment_5 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:6: ( ( rule__Operator__NotEqualToAssignment_5 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1069:1: ( rule__Operator__NotEqualToAssignment_5 )
                    {
                     before(grammarAccess.getOperatorAccess().getNotEqualToAssignment_5()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1070:1: ( rule__Operator__NotEqualToAssignment_5 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1070:2: rule__Operator__NotEqualToAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Operator__NotEqualToAssignment_5_in_rule__Operator__Alternatives2253);
                    rule__Operator__NotEqualToAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatorAccess().getNotEqualToAssignment_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__Condition__Alternatives_1_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1079:1: rule__Condition__Alternatives_1_0 : ( ( ( rule__Condition__AndAssignment_1_0_0 ) ) | ( ( rule__Condition__OrAssignment_1_0_1 ) ) );
    public final void rule__Condition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1083:1: ( ( ( rule__Condition__AndAssignment_1_0_0 ) ) | ( ( rule__Condition__OrAssignment_1_0_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==46) ) {
                alt4=1;
            }
            else if ( (LA4_0==47) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1084:1: ( ( rule__Condition__AndAssignment_1_0_0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1084:1: ( ( rule__Condition__AndAssignment_1_0_0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1085:1: ( rule__Condition__AndAssignment_1_0_0 )
                    {
                     before(grammarAccess.getConditionAccess().getAndAssignment_1_0_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1086:1: ( rule__Condition__AndAssignment_1_0_0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1086:2: rule__Condition__AndAssignment_1_0_0
                    {
                    pushFollow(FOLLOW_rule__Condition__AndAssignment_1_0_0_in_rule__Condition__Alternatives_1_02286);
                    rule__Condition__AndAssignment_1_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionAccess().getAndAssignment_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1090:6: ( ( rule__Condition__OrAssignment_1_0_1 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1090:6: ( ( rule__Condition__OrAssignment_1_0_1 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1091:1: ( rule__Condition__OrAssignment_1_0_1 )
                    {
                     before(grammarAccess.getConditionAccess().getOrAssignment_1_0_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1092:1: ( rule__Condition__OrAssignment_1_0_1 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1092:2: rule__Condition__OrAssignment_1_0_1
                    {
                    pushFollow(FOLLOW_rule__Condition__OrAssignment_1_0_1_in_rule__Condition__Alternatives_1_02304);
                    rule__Condition__OrAssignment_1_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionAccess().getOrAssignment_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Alternatives_1_0"


    // $ANTLR start "rule__Expression__Alternatives_1_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1101:1: rule__Expression__Alternatives_1_0 : ( ( ( rule__Expression__Group_1_0_0__0 ) ) | ( ( rule__Expression__Group_1_0_1__0 ) ) );
    public final void rule__Expression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1105:1: ( ( ( rule__Expression__Group_1_0_0__0 ) ) | ( ( rule__Expression__Group_1_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            else if ( (LA5_0==24) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1106:1: ( ( rule__Expression__Group_1_0_0__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1106:1: ( ( rule__Expression__Group_1_0_0__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1107:1: ( rule__Expression__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1_0_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1108:1: ( rule__Expression__Group_1_0_0__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1108:2: rule__Expression__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_1_0_0__0_in_rule__Expression__Alternatives_1_02337);
                    rule__Expression__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:6: ( ( rule__Expression__Group_1_0_1__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:6: ( ( rule__Expression__Group_1_0_1__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1113:1: ( rule__Expression__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1_0_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1114:1: ( rule__Expression__Group_1_0_1__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1114:2: rule__Expression__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_1_0_1__0_in_rule__Expression__Alternatives_1_02355);
                    rule__Expression__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives_1_0"


    // $ANTLR start "rule__Term__Alternatives_1_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1123:1: rule__Term__Alternatives_1_0 : ( ( ( rule__Term__Group_1_0_0__0 ) ) | ( ( rule__Term__Group_1_0_1__0 ) ) );
    public final void rule__Term__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1127:1: ( ( ( rule__Term__Group_1_0_0__0 ) ) | ( ( rule__Term__Group_1_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            else if ( (LA6_0==26) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1128:1: ( ( rule__Term__Group_1_0_0__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1128:1: ( ( rule__Term__Group_1_0_0__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1129:1: ( rule__Term__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getTermAccess().getGroup_1_0_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1130:1: ( rule__Term__Group_1_0_0__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1130:2: rule__Term__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Term__Group_1_0_0__0_in_rule__Term__Alternatives_1_02388);
                    rule__Term__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1134:6: ( ( rule__Term__Group_1_0_1__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1134:6: ( ( rule__Term__Group_1_0_1__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1135:1: ( rule__Term__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getTermAccess().getGroup_1_0_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1136:1: ( rule__Term__Group_1_0_1__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1136:2: rule__Term__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Term__Group_1_0_1__0_in_rule__Term__Alternatives_1_02406);
                    rule__Term__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Alternatives_1_0"


    // $ANTLR start "rule__Factor__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1145:1: rule__Factor__Alternatives : ( ( ( rule__Factor__NumberAssignment_0 ) ) | ( ( rule__Factor__VariableAssignment_1 ) ) | ( ( rule__Factor__StringAssignment_2 ) ) | ( ( rule__Factor__BooleanAssignment_3 ) ) | ( ( rule__Factor__Group_4__0 ) ) );
    public final void rule__Factor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1149:1: ( ( ( rule__Factor__NumberAssignment_0 ) ) | ( ( rule__Factor__VariableAssignment_1 ) ) | ( ( rule__Factor__StringAssignment_2 ) ) | ( ( rule__Factor__BooleanAssignment_3 ) ) | ( ( rule__Factor__Group_4__0 ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
                {
                alt7=2;
                }
                break;
            case RULE_STRING:
                {
                alt7=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt7=4;
                }
                break;
            case 27:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1150:1: ( ( rule__Factor__NumberAssignment_0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1150:1: ( ( rule__Factor__NumberAssignment_0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1151:1: ( rule__Factor__NumberAssignment_0 )
                    {
                     before(grammarAccess.getFactorAccess().getNumberAssignment_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1152:1: ( rule__Factor__NumberAssignment_0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1152:2: rule__Factor__NumberAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Factor__NumberAssignment_0_in_rule__Factor__Alternatives2439);
                    rule__Factor__NumberAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getNumberAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1156:6: ( ( rule__Factor__VariableAssignment_1 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1156:6: ( ( rule__Factor__VariableAssignment_1 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1157:1: ( rule__Factor__VariableAssignment_1 )
                    {
                     before(grammarAccess.getFactorAccess().getVariableAssignment_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1158:1: ( rule__Factor__VariableAssignment_1 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1158:2: rule__Factor__VariableAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Factor__VariableAssignment_1_in_rule__Factor__Alternatives2457);
                    rule__Factor__VariableAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getVariableAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1162:6: ( ( rule__Factor__StringAssignment_2 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1162:6: ( ( rule__Factor__StringAssignment_2 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1163:1: ( rule__Factor__StringAssignment_2 )
                    {
                     before(grammarAccess.getFactorAccess().getStringAssignment_2()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1164:1: ( rule__Factor__StringAssignment_2 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1164:2: rule__Factor__StringAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Factor__StringAssignment_2_in_rule__Factor__Alternatives2475);
                    rule__Factor__StringAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getStringAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1168:6: ( ( rule__Factor__BooleanAssignment_3 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1168:6: ( ( rule__Factor__BooleanAssignment_3 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1169:1: ( rule__Factor__BooleanAssignment_3 )
                    {
                     before(grammarAccess.getFactorAccess().getBooleanAssignment_3()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1170:1: ( rule__Factor__BooleanAssignment_3 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1170:2: rule__Factor__BooleanAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Factor__BooleanAssignment_3_in_rule__Factor__Alternatives2493);
                    rule__Factor__BooleanAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getBooleanAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1174:6: ( ( rule__Factor__Group_4__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1174:6: ( ( rule__Factor__Group_4__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1175:1: ( rule__Factor__Group_4__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_4()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1176:1: ( rule__Factor__Group_4__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1176:2: rule__Factor__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Factor__Group_4__0_in_rule__Factor__Alternatives2511);
                    rule__Factor__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Alternatives"


    // $ANTLR start "rule__Trigger__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1185:1: rule__Trigger__Alternatives : ( ( ( rule__Trigger__Group_0__0 ) ) | ( ( rule__Trigger__Group_1__0 ) ) );
    public final void rule__Trigger__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1189:1: ( ( ( rule__Trigger__Group_0__0 ) ) | ( ( rule__Trigger__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==32) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1190:1: ( ( rule__Trigger__Group_0__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1190:1: ( ( rule__Trigger__Group_0__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1191:1: ( rule__Trigger__Group_0__0 )
                    {
                     before(grammarAccess.getTriggerAccess().getGroup_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1192:1: ( rule__Trigger__Group_0__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1192:2: rule__Trigger__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Trigger__Group_0__0_in_rule__Trigger__Alternatives2544);
                    rule__Trigger__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTriggerAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1196:6: ( ( rule__Trigger__Group_1__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1196:6: ( ( rule__Trigger__Group_1__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1197:1: ( rule__Trigger__Group_1__0 )
                    {
                     before(grammarAccess.getTriggerAccess().getGroup_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1198:1: ( rule__Trigger__Group_1__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1198:2: rule__Trigger__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Trigger__Group_1__0_in_rule__Trigger__Alternatives2562);
                    rule__Trigger__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTriggerAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Alternatives"


    // $ANTLR start "rule__Goal__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1207:1: rule__Goal__Alternatives : ( ( ruleAchieve ) | ( ruleQuery ) | ( ruleMaintain ) | ( rulePerform ) );
    public final void rule__Goal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1211:1: ( ( ruleAchieve ) | ( ruleQuery ) | ( ruleMaintain ) | ( rulePerform ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt9=1;
                }
                break;
            case 37:
                {
                alt9=2;
                }
                break;
            case 38:
                {
                alt9=3;
                }
                break;
            case 39:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1212:1: ( ruleAchieve )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1212:1: ( ruleAchieve )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1213:1: ruleAchieve
                    {
                     before(grammarAccess.getGoalAccess().getAchieveParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAchieve_in_rule__Goal__Alternatives2595);
                    ruleAchieve();

                    state._fsp--;

                     after(grammarAccess.getGoalAccess().getAchieveParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1218:6: ( ruleQuery )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1218:6: ( ruleQuery )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1219:1: ruleQuery
                    {
                     before(grammarAccess.getGoalAccess().getQueryParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleQuery_in_rule__Goal__Alternatives2612);
                    ruleQuery();

                    state._fsp--;

                     after(grammarAccess.getGoalAccess().getQueryParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1224:6: ( ruleMaintain )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1224:6: ( ruleMaintain )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1225:1: ruleMaintain
                    {
                     before(grammarAccess.getGoalAccess().getMaintainParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleMaintain_in_rule__Goal__Alternatives2629);
                    ruleMaintain();

                    state._fsp--;

                     after(grammarAccess.getGoalAccess().getMaintainParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1230:6: ( rulePerform )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1230:6: ( rulePerform )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1231:1: rulePerform
                    {
                     before(grammarAccess.getGoalAccess().getPerformParserRuleCall_3()); 
                    pushFollow(FOLLOW_rulePerform_in_rule__Goal__Alternatives2646);
                    rulePerform();

                    state._fsp--;

                     after(grammarAccess.getGoalAccess().getPerformParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Alternatives"


    // $ANTLR start "rule__BDI__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1243:1: rule__BDI__Group__0 : rule__BDI__Group__0__Impl rule__BDI__Group__1 ;
    public final void rule__BDI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1247:1: ( rule__BDI__Group__0__Impl rule__BDI__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1248:2: rule__BDI__Group__0__Impl rule__BDI__Group__1
            {
            pushFollow(FOLLOW_rule__BDI__Group__0__Impl_in_rule__BDI__Group__02676);
            rule__BDI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BDI__Group__1_in_rule__BDI__Group__02679);
            rule__BDI__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BDI__Group__0"


    // $ANTLR start "rule__BDI__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1255:1: rule__BDI__Group__0__Impl : ( 'BDIModel {' ) ;
    public final void rule__BDI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:1: ( ( 'BDIModel {' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1260:1: ( 'BDIModel {' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1260:1: ( 'BDIModel {' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1261:1: 'BDIModel {'
            {
             before(grammarAccess.getBDIAccess().getBDIModelKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__BDI__Group__0__Impl2707); 
             after(grammarAccess.getBDIAccess().getBDIModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BDI__Group__0__Impl"


    // $ANTLR start "rule__BDI__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1274:1: rule__BDI__Group__1 : rule__BDI__Group__1__Impl rule__BDI__Group__2 ;
    public final void rule__BDI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1278:1: ( rule__BDI__Group__1__Impl rule__BDI__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1279:2: rule__BDI__Group__1__Impl rule__BDI__Group__2
            {
            pushFollow(FOLLOW_rule__BDI__Group__1__Impl_in_rule__BDI__Group__12738);
            rule__BDI__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BDI__Group__2_in_rule__BDI__Group__12741);
            rule__BDI__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BDI__Group__1"


    // $ANTLR start "rule__BDI__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1286:1: rule__BDI__Group__1__Impl : ( ( ( rule__BDI__AgentsAssignment_1 ) ) ( ( rule__BDI__AgentsAssignment_1 )* ) ) ;
    public final void rule__BDI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1290:1: ( ( ( ( rule__BDI__AgentsAssignment_1 ) ) ( ( rule__BDI__AgentsAssignment_1 )* ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1291:1: ( ( ( rule__BDI__AgentsAssignment_1 ) ) ( ( rule__BDI__AgentsAssignment_1 )* ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1291:1: ( ( ( rule__BDI__AgentsAssignment_1 ) ) ( ( rule__BDI__AgentsAssignment_1 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1292:1: ( ( rule__BDI__AgentsAssignment_1 ) ) ( ( rule__BDI__AgentsAssignment_1 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1292:1: ( ( rule__BDI__AgentsAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1293:1: ( rule__BDI__AgentsAssignment_1 )
            {
             before(grammarAccess.getBDIAccess().getAgentsAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1294:1: ( rule__BDI__AgentsAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1294:2: rule__BDI__AgentsAssignment_1
            {
            pushFollow(FOLLOW_rule__BDI__AgentsAssignment_1_in_rule__BDI__Group__1__Impl2770);
            rule__BDI__AgentsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBDIAccess().getAgentsAssignment_1()); 

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1297:1: ( ( rule__BDI__AgentsAssignment_1 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1298:1: ( rule__BDI__AgentsAssignment_1 )*
            {
             before(grammarAccess.getBDIAccess().getAgentsAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1299:1: ( rule__BDI__AgentsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1299:2: rule__BDI__AgentsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__BDI__AgentsAssignment_1_in_rule__BDI__Group__1__Impl2782);
            	    rule__BDI__AgentsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getBDIAccess().getAgentsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BDI__Group__1__Impl"


    // $ANTLR start "rule__BDI__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1310:1: rule__BDI__Group__2 : rule__BDI__Group__2__Impl ;
    public final void rule__BDI__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1314:1: ( rule__BDI__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1315:2: rule__BDI__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BDI__Group__2__Impl_in_rule__BDI__Group__22815);
            rule__BDI__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BDI__Group__2"


    // $ANTLR start "rule__BDI__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1321:1: rule__BDI__Group__2__Impl : ( '}' ) ;
    public final void rule__BDI__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1325:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1326:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1326:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1327:1: '}'
            {
             before(grammarAccess.getBDIAccess().getRightCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__BDI__Group__2__Impl2843); 
             after(grammarAccess.getBDIAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BDI__Group__2__Impl"


    // $ANTLR start "rule__Agent__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1346:1: rule__Agent__Group__0 : rule__Agent__Group__0__Impl rule__Agent__Group__1 ;
    public final void rule__Agent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1350:1: ( rule__Agent__Group__0__Impl rule__Agent__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1351:2: rule__Agent__Group__0__Impl rule__Agent__Group__1
            {
            pushFollow(FOLLOW_rule__Agent__Group__0__Impl_in_rule__Agent__Group__02880);
            rule__Agent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Agent__Group__1_in_rule__Agent__Group__02883);
            rule__Agent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__0"


    // $ANTLR start "rule__Agent__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1358:1: rule__Agent__Group__0__Impl : ( 'Agent' ) ;
    public final void rule__Agent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1362:1: ( ( 'Agent' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1363:1: ( 'Agent' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1363:1: ( 'Agent' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1364:1: 'Agent'
            {
             before(grammarAccess.getAgentAccess().getAgentKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Agent__Group__0__Impl2911); 
             after(grammarAccess.getAgentAccess().getAgentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__0__Impl"


    // $ANTLR start "rule__Agent__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1377:1: rule__Agent__Group__1 : rule__Agent__Group__1__Impl rule__Agent__Group__2 ;
    public final void rule__Agent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1381:1: ( rule__Agent__Group__1__Impl rule__Agent__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1382:2: rule__Agent__Group__1__Impl rule__Agent__Group__2
            {
            pushFollow(FOLLOW_rule__Agent__Group__1__Impl_in_rule__Agent__Group__12942);
            rule__Agent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Agent__Group__2_in_rule__Agent__Group__12945);
            rule__Agent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__1"


    // $ANTLR start "rule__Agent__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1389:1: rule__Agent__Group__1__Impl : ( ( rule__Agent__NameAssignment_1 ) ) ;
    public final void rule__Agent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1393:1: ( ( ( rule__Agent__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1394:1: ( ( rule__Agent__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1394:1: ( ( rule__Agent__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1395:1: ( rule__Agent__NameAssignment_1 )
            {
             before(grammarAccess.getAgentAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1396:1: ( rule__Agent__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1396:2: rule__Agent__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Agent__NameAssignment_1_in_rule__Agent__Group__1__Impl2972);
            rule__Agent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAgentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__1__Impl"


    // $ANTLR start "rule__Agent__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1406:1: rule__Agent__Group__2 : rule__Agent__Group__2__Impl rule__Agent__Group__3 ;
    public final void rule__Agent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1410:1: ( rule__Agent__Group__2__Impl rule__Agent__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1411:2: rule__Agent__Group__2__Impl rule__Agent__Group__3
            {
            pushFollow(FOLLOW_rule__Agent__Group__2__Impl_in_rule__Agent__Group__23002);
            rule__Agent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Agent__Group__3_in_rule__Agent__Group__23005);
            rule__Agent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__2"


    // $ANTLR start "rule__Agent__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1418:1: rule__Agent__Group__2__Impl : ( '{' ) ;
    public final void rule__Agent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1422:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1423:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1423:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1424:1: '{'
            {
             before(grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Agent__Group__2__Impl3033); 
             after(grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__2__Impl"


    // $ANTLR start "rule__Agent__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1437:1: rule__Agent__Group__3 : rule__Agent__Group__3__Impl rule__Agent__Group__4 ;
    public final void rule__Agent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1441:1: ( rule__Agent__Group__3__Impl rule__Agent__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1442:2: rule__Agent__Group__3__Impl rule__Agent__Group__4
            {
            pushFollow(FOLLOW_rule__Agent__Group__3__Impl_in_rule__Agent__Group__33064);
            rule__Agent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Agent__Group__4_in_rule__Agent__Group__33067);
            rule__Agent__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__3"


    // $ANTLR start "rule__Agent__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1449:1: rule__Agent__Group__3__Impl : ( ( rule__Agent__ImportAssignment_3 )* ) ;
    public final void rule__Agent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1453:1: ( ( ( rule__Agent__ImportAssignment_3 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1454:1: ( ( rule__Agent__ImportAssignment_3 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1454:1: ( ( rule__Agent__ImportAssignment_3 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1455:1: ( rule__Agent__ImportAssignment_3 )*
            {
             before(grammarAccess.getAgentAccess().getImportAssignment_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1456:1: ( rule__Agent__ImportAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1456:2: rule__Agent__ImportAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Agent__ImportAssignment_3_in_rule__Agent__Group__3__Impl3094);
            	    rule__Agent__ImportAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAgentAccess().getImportAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__3__Impl"


    // $ANTLR start "rule__Agent__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1466:1: rule__Agent__Group__4 : rule__Agent__Group__4__Impl rule__Agent__Group__5 ;
    public final void rule__Agent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1470:1: ( rule__Agent__Group__4__Impl rule__Agent__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1471:2: rule__Agent__Group__4__Impl rule__Agent__Group__5
            {
            pushFollow(FOLLOW_rule__Agent__Group__4__Impl_in_rule__Agent__Group__43125);
            rule__Agent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Agent__Group__5_in_rule__Agent__Group__43128);
            rule__Agent__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__4"


    // $ANTLR start "rule__Agent__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1478:1: rule__Agent__Group__4__Impl : ( ( rule__Agent__EventsAssignment_4 )* ) ;
    public final void rule__Agent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1482:1: ( ( ( rule__Agent__EventsAssignment_4 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1483:1: ( ( rule__Agent__EventsAssignment_4 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1483:1: ( ( rule__Agent__EventsAssignment_4 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1484:1: ( rule__Agent__EventsAssignment_4 )*
            {
             before(grammarAccess.getAgentAccess().getEventsAssignment_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1485:1: ( rule__Agent__EventsAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1485:2: rule__Agent__EventsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Agent__EventsAssignment_4_in_rule__Agent__Group__4__Impl3155);
            	    rule__Agent__EventsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getAgentAccess().getEventsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__4__Impl"


    // $ANTLR start "rule__Agent__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1495:1: rule__Agent__Group__5 : rule__Agent__Group__5__Impl rule__Agent__Group__6 ;
    public final void rule__Agent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1499:1: ( rule__Agent__Group__5__Impl rule__Agent__Group__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1500:2: rule__Agent__Group__5__Impl rule__Agent__Group__6
            {
            pushFollow(FOLLOW_rule__Agent__Group__5__Impl_in_rule__Agent__Group__53186);
            rule__Agent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Agent__Group__6_in_rule__Agent__Group__53189);
            rule__Agent__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__5"


    // $ANTLR start "rule__Agent__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1507:1: rule__Agent__Group__5__Impl : ( ( rule__Agent__ParametersAssignment_5 )* ) ;
    public final void rule__Agent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1511:1: ( ( ( rule__Agent__ParametersAssignment_5 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1512:1: ( ( rule__Agent__ParametersAssignment_5 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1512:1: ( ( rule__Agent__ParametersAssignment_5 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1513:1: ( rule__Agent__ParametersAssignment_5 )*
            {
             before(grammarAccess.getAgentAccess().getParametersAssignment_5()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1514:1: ( rule__Agent__ParametersAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1514:2: rule__Agent__ParametersAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Agent__ParametersAssignment_5_in_rule__Agent__Group__5__Impl3216);
            	    rule__Agent__ParametersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getAgentAccess().getParametersAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__5__Impl"


    // $ANTLR start "rule__Agent__Group__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1524:1: rule__Agent__Group__6 : rule__Agent__Group__6__Impl rule__Agent__Group__7 ;
    public final void rule__Agent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1528:1: ( rule__Agent__Group__6__Impl rule__Agent__Group__7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1529:2: rule__Agent__Group__6__Impl rule__Agent__Group__7
            {
            pushFollow(FOLLOW_rule__Agent__Group__6__Impl_in_rule__Agent__Group__63247);
            rule__Agent__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Agent__Group__7_in_rule__Agent__Group__63250);
            rule__Agent__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__6"


    // $ANTLR start "rule__Agent__Group__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1536:1: rule__Agent__Group__6__Impl : ( ( rule__Agent__BeliefsAssignment_6 )* ) ;
    public final void rule__Agent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1540:1: ( ( ( rule__Agent__BeliefsAssignment_6 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1541:1: ( ( rule__Agent__BeliefsAssignment_6 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1541:1: ( ( rule__Agent__BeliefsAssignment_6 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1542:1: ( rule__Agent__BeliefsAssignment_6 )*
            {
             before(grammarAccess.getAgentAccess().getBeliefsAssignment_6()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1543:1: ( rule__Agent__BeliefsAssignment_6 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1543:2: rule__Agent__BeliefsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Agent__BeliefsAssignment_6_in_rule__Agent__Group__6__Impl3277);
            	    rule__Agent__BeliefsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getAgentAccess().getBeliefsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__6__Impl"


    // $ANTLR start "rule__Agent__Group__7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1553:1: rule__Agent__Group__7 : rule__Agent__Group__7__Impl rule__Agent__Group__8 ;
    public final void rule__Agent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1557:1: ( rule__Agent__Group__7__Impl rule__Agent__Group__8 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1558:2: rule__Agent__Group__7__Impl rule__Agent__Group__8
            {
            pushFollow(FOLLOW_rule__Agent__Group__7__Impl_in_rule__Agent__Group__73308);
            rule__Agent__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Agent__Group__8_in_rule__Agent__Group__73311);
            rule__Agent__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__7"


    // $ANTLR start "rule__Agent__Group__7__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1565:1: rule__Agent__Group__7__Impl : ( ( rule__Agent__PlansAssignment_7 )* ) ;
    public final void rule__Agent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1569:1: ( ( ( rule__Agent__PlansAssignment_7 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1570:1: ( ( rule__Agent__PlansAssignment_7 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1570:1: ( ( rule__Agent__PlansAssignment_7 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1571:1: ( rule__Agent__PlansAssignment_7 )*
            {
             before(grammarAccess.getAgentAccess().getPlansAssignment_7()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1572:1: ( rule__Agent__PlansAssignment_7 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1572:2: rule__Agent__PlansAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Agent__PlansAssignment_7_in_rule__Agent__Group__7__Impl3338);
            	    rule__Agent__PlansAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getAgentAccess().getPlansAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__7__Impl"


    // $ANTLR start "rule__Agent__Group__8"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1582:1: rule__Agent__Group__8 : rule__Agent__Group__8__Impl ;
    public final void rule__Agent__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1586:1: ( rule__Agent__Group__8__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1587:2: rule__Agent__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Agent__Group__8__Impl_in_rule__Agent__Group__83369);
            rule__Agent__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__8"


    // $ANTLR start "rule__Agent__Group__8__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1593:1: rule__Agent__Group__8__Impl : ( '}' ) ;
    public final void rule__Agent__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1597:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1598:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1598:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1599:1: '}'
            {
             before(grammarAccess.getAgentAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FOLLOW_15_in_rule__Agent__Group__8__Impl3397); 
             after(grammarAccess.getAgentAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__8__Impl"


    // $ANTLR start "rule__Imports__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1630:1: rule__Imports__Group__0 : rule__Imports__Group__0__Impl rule__Imports__Group__1 ;
    public final void rule__Imports__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1634:1: ( rule__Imports__Group__0__Impl rule__Imports__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1635:2: rule__Imports__Group__0__Impl rule__Imports__Group__1
            {
            pushFollow(FOLLOW_rule__Imports__Group__0__Impl_in_rule__Imports__Group__03446);
            rule__Imports__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Imports__Group__1_in_rule__Imports__Group__03449);
            rule__Imports__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group__0"


    // $ANTLR start "rule__Imports__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1642:1: rule__Imports__Group__0__Impl : ( 'Imports {' ) ;
    public final void rule__Imports__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1646:1: ( ( 'Imports {' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1647:1: ( 'Imports {' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1647:1: ( 'Imports {' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1648:1: 'Imports {'
            {
             before(grammarAccess.getImportsAccess().getImportsKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Imports__Group__0__Impl3477); 
             after(grammarAccess.getImportsAccess().getImportsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group__0__Impl"


    // $ANTLR start "rule__Imports__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1661:1: rule__Imports__Group__1 : rule__Imports__Group__1__Impl rule__Imports__Group__2 ;
    public final void rule__Imports__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1665:1: ( rule__Imports__Group__1__Impl rule__Imports__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1666:2: rule__Imports__Group__1__Impl rule__Imports__Group__2
            {
            pushFollow(FOLLOW_rule__Imports__Group__1__Impl_in_rule__Imports__Group__13508);
            rule__Imports__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Imports__Group__2_in_rule__Imports__Group__13511);
            rule__Imports__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group__1"


    // $ANTLR start "rule__Imports__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1673:1: rule__Imports__Group__1__Impl : ( ( ( rule__Imports__ImportsAssignment_1 ) ) ( ( rule__Imports__ImportsAssignment_1 )* ) ) ;
    public final void rule__Imports__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1677:1: ( ( ( ( rule__Imports__ImportsAssignment_1 ) ) ( ( rule__Imports__ImportsAssignment_1 )* ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1678:1: ( ( ( rule__Imports__ImportsAssignment_1 ) ) ( ( rule__Imports__ImportsAssignment_1 )* ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1678:1: ( ( ( rule__Imports__ImportsAssignment_1 ) ) ( ( rule__Imports__ImportsAssignment_1 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1679:1: ( ( rule__Imports__ImportsAssignment_1 ) ) ( ( rule__Imports__ImportsAssignment_1 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1679:1: ( ( rule__Imports__ImportsAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1680:1: ( rule__Imports__ImportsAssignment_1 )
            {
             before(grammarAccess.getImportsAccess().getImportsAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1681:1: ( rule__Imports__ImportsAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1681:2: rule__Imports__ImportsAssignment_1
            {
            pushFollow(FOLLOW_rule__Imports__ImportsAssignment_1_in_rule__Imports__Group__1__Impl3540);
            rule__Imports__ImportsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportsAccess().getImportsAssignment_1()); 

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1684:1: ( ( rule__Imports__ImportsAssignment_1 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1685:1: ( rule__Imports__ImportsAssignment_1 )*
            {
             before(grammarAccess.getImportsAccess().getImportsAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1686:1: ( rule__Imports__ImportsAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==19) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1686:2: rule__Imports__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Imports__ImportsAssignment_1_in_rule__Imports__Group__1__Impl3552);
            	    rule__Imports__ImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getImportsAccess().getImportsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group__1__Impl"


    // $ANTLR start "rule__Imports__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1697:1: rule__Imports__Group__2 : rule__Imports__Group__2__Impl ;
    public final void rule__Imports__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1701:1: ( rule__Imports__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1702:2: rule__Imports__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Imports__Group__2__Impl_in_rule__Imports__Group__23585);
            rule__Imports__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group__2"


    // $ANTLR start "rule__Imports__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1708:1: rule__Imports__Group__2__Impl : ( '}' ) ;
    public final void rule__Imports__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1712:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1713:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1713:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1714:1: '}'
            {
             before(grammarAccess.getImportsAccess().getRightCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Imports__Group__2__Impl3613); 
             after(grammarAccess.getImportsAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1733:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1737:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1738:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03650);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03653);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1745:1: rule__Import__Group__0__Impl : ( 'Import {' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1749:1: ( ( 'Import {' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1750:1: ( 'Import {' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1750:1: ( 'Import {' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1751:1: 'Import {'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Import__Group__0__Impl3681); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1764:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1768:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1769:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13712);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__2_in_rule__Import__Group__13715);
            rule__Import__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1776:1: rule__Import__Group__1__Impl : ( ruleFilename ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1780:1: ( ( ruleFilename ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1781:1: ( ruleFilename )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1781:1: ( ruleFilename )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1782:1: ruleFilename
            {
             before(grammarAccess.getImportAccess().getFilenameParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleFilename_in_rule__Import__Group__1__Impl3742);
            ruleFilename();

            state._fsp--;

             after(grammarAccess.getImportAccess().getFilenameParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1793:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1797:1: ( rule__Import__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1798:2: rule__Import__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__23771);
            rule__Import__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1804:1: rule__Import__Group__2__Impl : ( '}' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1808:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1809:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1809:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1810:1: '}'
            {
             before(grammarAccess.getImportAccess().getRightCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Import__Group__2__Impl3799); 
             after(grammarAccess.getImportAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__Events__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1829:1: rule__Events__Group__0 : rule__Events__Group__0__Impl rule__Events__Group__1 ;
    public final void rule__Events__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1833:1: ( rule__Events__Group__0__Impl rule__Events__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1834:2: rule__Events__Group__0__Impl rule__Events__Group__1
            {
            pushFollow(FOLLOW_rule__Events__Group__0__Impl_in_rule__Events__Group__03836);
            rule__Events__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Events__Group__1_in_rule__Events__Group__03839);
            rule__Events__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Events__Group__0"


    // $ANTLR start "rule__Events__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1841:1: rule__Events__Group__0__Impl : ( 'Events {' ) ;
    public final void rule__Events__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1845:1: ( ( 'Events {' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1846:1: ( 'Events {' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1846:1: ( 'Events {' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1847:1: 'Events {'
            {
             before(grammarAccess.getEventsAccess().getEventsKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Events__Group__0__Impl3867); 
             after(grammarAccess.getEventsAccess().getEventsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Events__Group__0__Impl"


    // $ANTLR start "rule__Events__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1860:1: rule__Events__Group__1 : rule__Events__Group__1__Impl rule__Events__Group__2 ;
    public final void rule__Events__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1864:1: ( rule__Events__Group__1__Impl rule__Events__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1865:2: rule__Events__Group__1__Impl rule__Events__Group__2
            {
            pushFollow(FOLLOW_rule__Events__Group__1__Impl_in_rule__Events__Group__13898);
            rule__Events__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Events__Group__2_in_rule__Events__Group__13901);
            rule__Events__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Events__Group__1"


    // $ANTLR start "rule__Events__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1872:1: rule__Events__Group__1__Impl : ( ( ( rule__Events__EventsAssignment_1 ) ) ( ( rule__Events__EventsAssignment_1 )* ) ) ;
    public final void rule__Events__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1876:1: ( ( ( ( rule__Events__EventsAssignment_1 ) ) ( ( rule__Events__EventsAssignment_1 )* ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1877:1: ( ( ( rule__Events__EventsAssignment_1 ) ) ( ( rule__Events__EventsAssignment_1 )* ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1877:1: ( ( ( rule__Events__EventsAssignment_1 ) ) ( ( rule__Events__EventsAssignment_1 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1878:1: ( ( rule__Events__EventsAssignment_1 ) ) ( ( rule__Events__EventsAssignment_1 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1878:1: ( ( rule__Events__EventsAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1879:1: ( rule__Events__EventsAssignment_1 )
            {
             before(grammarAccess.getEventsAccess().getEventsAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1880:1: ( rule__Events__EventsAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1880:2: rule__Events__EventsAssignment_1
            {
            pushFollow(FOLLOW_rule__Events__EventsAssignment_1_in_rule__Events__Group__1__Impl3930);
            rule__Events__EventsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEventsAccess().getEventsAssignment_1()); 

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1883:1: ( ( rule__Events__EventsAssignment_1 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1884:1: ( rule__Events__EventsAssignment_1 )*
            {
             before(grammarAccess.getEventsAccess().getEventsAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1885:1: ( rule__Events__EventsAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1885:2: rule__Events__EventsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Events__EventsAssignment_1_in_rule__Events__Group__1__Impl3942);
            	    rule__Events__EventsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getEventsAccess().getEventsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Events__Group__1__Impl"


    // $ANTLR start "rule__Events__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1896:1: rule__Events__Group__2 : rule__Events__Group__2__Impl ;
    public final void rule__Events__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1900:1: ( rule__Events__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1901:2: rule__Events__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Events__Group__2__Impl_in_rule__Events__Group__23975);
            rule__Events__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Events__Group__2"


    // $ANTLR start "rule__Events__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1907:1: rule__Events__Group__2__Impl : ( '}' ) ;
    public final void rule__Events__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1911:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1912:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1912:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1913:1: '}'
            {
             before(grammarAccess.getEventsAccess().getRightCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Events__Group__2__Impl4003); 
             after(grammarAccess.getEventsAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Events__Group__2__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1932:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1936:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1937:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__04040);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__04043);
            rule__Event__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1944:1: rule__Event__Group__0__Impl : ( ( rule__Event__NameAssignment_0 ) ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1948:1: ( ( ( rule__Event__NameAssignment_0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1949:1: ( ( rule__Event__NameAssignment_0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1949:1: ( ( rule__Event__NameAssignment_0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1950:1: ( rule__Event__NameAssignment_0 )
            {
             before(grammarAccess.getEventAccess().getNameAssignment_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1951:1: ( rule__Event__NameAssignment_0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1951:2: rule__Event__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Event__NameAssignment_0_in_rule__Event__Group__0__Impl4070);
            rule__Event__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1961:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1965:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1966:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__14100);
            rule__Event__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__2_in_rule__Event__Group__14103);
            rule__Event__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1973:1: rule__Event__Group__1__Impl : ( '{' ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1977:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1978:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1978:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1979:1: '{'
            {
             before(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Event__Group__1__Impl4131); 
             after(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1992:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1996:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1997:2: rule__Event__Group__2__Impl rule__Event__Group__3
            {
            pushFollow(FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__24162);
            rule__Event__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__3_in_rule__Event__Group__24165);
            rule__Event__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2"


    // $ANTLR start "rule__Event__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2004:1: rule__Event__Group__2__Impl : ( ( rule__Event__EventTypeAssignment_2 ) ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2008:1: ( ( ( rule__Event__EventTypeAssignment_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2009:1: ( ( rule__Event__EventTypeAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2009:1: ( ( rule__Event__EventTypeAssignment_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2010:1: ( rule__Event__EventTypeAssignment_2 )
            {
             before(grammarAccess.getEventAccess().getEventTypeAssignment_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2011:1: ( rule__Event__EventTypeAssignment_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2011:2: rule__Event__EventTypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Event__EventTypeAssignment_2_in_rule__Event__Group__2__Impl4192);
            rule__Event__EventTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getEventTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2__Impl"


    // $ANTLR start "rule__Event__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2021:1: rule__Event__Group__3 : rule__Event__Group__3__Impl rule__Event__Group__4 ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2025:1: ( rule__Event__Group__3__Impl rule__Event__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2026:2: rule__Event__Group__3__Impl rule__Event__Group__4
            {
            pushFollow(FOLLOW_rule__Event__Group__3__Impl_in_rule__Event__Group__34222);
            rule__Event__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__4_in_rule__Event__Group__34225);
            rule__Event__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3"


    // $ANTLR start "rule__Event__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2033:1: rule__Event__Group__3__Impl : ( ( rule__Event__ParameterAssignment_3 )* ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2037:1: ( ( ( rule__Event__ParameterAssignment_3 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2038:1: ( ( rule__Event__ParameterAssignment_3 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2038:1: ( ( rule__Event__ParameterAssignment_3 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2039:1: ( rule__Event__ParameterAssignment_3 )*
            {
             before(grammarAccess.getEventAccess().getParameterAssignment_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2040:1: ( rule__Event__ParameterAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2040:2: rule__Event__ParameterAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Event__ParameterAssignment_3_in_rule__Event__Group__3__Impl4252);
            	    rule__Event__ParameterAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getParameterAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3__Impl"


    // $ANTLR start "rule__Event__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2050:1: rule__Event__Group__4 : rule__Event__Group__4__Impl ;
    public final void rule__Event__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2054:1: ( rule__Event__Group__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2055:2: rule__Event__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__4__Impl_in_rule__Event__Group__44283);
            rule__Event__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__4"


    // $ANTLR start "rule__Event__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2061:1: rule__Event__Group__4__Impl : ( '}' ) ;
    public final void rule__Event__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2065:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2066:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2066:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2067:1: '}'
            {
             before(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Event__Group__4__Impl4311); 
             after(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__4__Impl"


    // $ANTLR start "rule__Parameters__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2090:1: rule__Parameters__Group__0 : rule__Parameters__Group__0__Impl rule__Parameters__Group__1 ;
    public final void rule__Parameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2094:1: ( rule__Parameters__Group__0__Impl rule__Parameters__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2095:2: rule__Parameters__Group__0__Impl rule__Parameters__Group__1
            {
            pushFollow(FOLLOW_rule__Parameters__Group__0__Impl_in_rule__Parameters__Group__04352);
            rule__Parameters__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameters__Group__1_in_rule__Parameters__Group__04355);
            rule__Parameters__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group__0"


    // $ANTLR start "rule__Parameters__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2102:1: rule__Parameters__Group__0__Impl : ( 'Parameters {' ) ;
    public final void rule__Parameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2106:1: ( ( 'Parameters {' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2107:1: ( 'Parameters {' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2107:1: ( 'Parameters {' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2108:1: 'Parameters {'
            {
             before(grammarAccess.getParametersAccess().getParametersKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Parameters__Group__0__Impl4383); 
             after(grammarAccess.getParametersAccess().getParametersKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group__0__Impl"


    // $ANTLR start "rule__Parameters__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2121:1: rule__Parameters__Group__1 : rule__Parameters__Group__1__Impl rule__Parameters__Group__2 ;
    public final void rule__Parameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2125:1: ( rule__Parameters__Group__1__Impl rule__Parameters__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2126:2: rule__Parameters__Group__1__Impl rule__Parameters__Group__2
            {
            pushFollow(FOLLOW_rule__Parameters__Group__1__Impl_in_rule__Parameters__Group__14414);
            rule__Parameters__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameters__Group__2_in_rule__Parameters__Group__14417);
            rule__Parameters__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group__1"


    // $ANTLR start "rule__Parameters__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2133:1: rule__Parameters__Group__1__Impl : ( ( ( rule__Parameters__ParametersAssignment_1 ) ) ( ( rule__Parameters__ParametersAssignment_1 )* ) ) ;
    public final void rule__Parameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2137:1: ( ( ( ( rule__Parameters__ParametersAssignment_1 ) ) ( ( rule__Parameters__ParametersAssignment_1 )* ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2138:1: ( ( ( rule__Parameters__ParametersAssignment_1 ) ) ( ( rule__Parameters__ParametersAssignment_1 )* ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2138:1: ( ( ( rule__Parameters__ParametersAssignment_1 ) ) ( ( rule__Parameters__ParametersAssignment_1 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2139:1: ( ( rule__Parameters__ParametersAssignment_1 ) ) ( ( rule__Parameters__ParametersAssignment_1 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2139:1: ( ( rule__Parameters__ParametersAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2140:1: ( rule__Parameters__ParametersAssignment_1 )
            {
             before(grammarAccess.getParametersAccess().getParametersAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2141:1: ( rule__Parameters__ParametersAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2141:2: rule__Parameters__ParametersAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameters__ParametersAssignment_1_in_rule__Parameters__Group__1__Impl4446);
            rule__Parameters__ParametersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParametersAccess().getParametersAssignment_1()); 

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2144:1: ( ( rule__Parameters__ParametersAssignment_1 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2145:1: ( rule__Parameters__ParametersAssignment_1 )*
            {
             before(grammarAccess.getParametersAccess().getParametersAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2146:1: ( rule__Parameters__ParametersAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2146:2: rule__Parameters__ParametersAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Parameters__ParametersAssignment_1_in_rule__Parameters__Group__1__Impl4458);
            	    rule__Parameters__ParametersAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getParametersAccess().getParametersAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group__1__Impl"


    // $ANTLR start "rule__Parameters__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2157:1: rule__Parameters__Group__2 : rule__Parameters__Group__2__Impl ;
    public final void rule__Parameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2161:1: ( rule__Parameters__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2162:2: rule__Parameters__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Parameters__Group__2__Impl_in_rule__Parameters__Group__24491);
            rule__Parameters__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group__2"


    // $ANTLR start "rule__Parameters__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2168:1: rule__Parameters__Group__2__Impl : ( '}' ) ;
    public final void rule__Parameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2172:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2173:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2173:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2174:1: '}'
            {
             before(grammarAccess.getParametersAccess().getRightCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Parameters__Group__2__Impl4519); 
             after(grammarAccess.getParametersAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2193:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2197:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2198:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__04556);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__04559);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2205:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2209:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2210:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2210:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2211:1: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2212:1: ( rule__Parameter__NameAssignment_0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2212:2: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_0_in_rule__Parameter__Group__0__Impl4586);
            rule__Parameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2222:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2226:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2227:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__14616);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__14619);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2234:1: rule__Parameter__Group__1__Impl : ( '=' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2238:1: ( ( '=' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2239:1: ( '=' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2239:1: ( '=' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2240:1: '='
            {
             before(grammarAccess.getParameterAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Parameter__Group__1__Impl4647); 
             after(grammarAccess.getParameterAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2253:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2257:1: ( rule__Parameter__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2258:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__24678);
            rule__Parameter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2264:1: rule__Parameter__Group__2__Impl : ( ruleValue ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2268:1: ( ( ruleValue ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2269:1: ( ruleValue )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2269:1: ( ruleValue )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2270:1: ruleValue
            {
             before(grammarAccess.getParameterAccess().getValueParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Parameter__Group__2__Impl4705);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getValueParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2287:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2291:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2292:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__04740);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__04743);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2299:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__Group_0__0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2303:1: ( ( ( rule__Condition__Group_0__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2304:1: ( ( rule__Condition__Group_0__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2304:1: ( ( rule__Condition__Group_0__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2305:1: ( rule__Condition__Group_0__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2306:1: ( rule__Condition__Group_0__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2306:2: rule__Condition__Group_0__0
            {
            pushFollow(FOLLOW_rule__Condition__Group_0__0_in_rule__Condition__Group__0__Impl4770);
            rule__Condition__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2316:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2320:1: ( rule__Condition__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2321:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__14800);
            rule__Condition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2327:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__Group_1__0 )? ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2331:1: ( ( ( rule__Condition__Group_1__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2332:1: ( ( rule__Condition__Group_1__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2332:1: ( ( rule__Condition__Group_1__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2333:1: ( rule__Condition__Group_1__0 )?
            {
             before(grammarAccess.getConditionAccess().getGroup_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2334:1: ( rule__Condition__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=46 && LA20_0<=47)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2334:2: rule__Condition__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Condition__Group_1__0_in_rule__Condition__Group__1__Impl4827);
                    rule__Condition__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group_0__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2348:1: rule__Condition__Group_0__0 : rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1 ;
    public final void rule__Condition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2352:1: ( rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2353:2: rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1
            {
            pushFollow(FOLLOW_rule__Condition__Group_0__0__Impl_in_rule__Condition__Group_0__04862);
            rule__Condition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group_0__1_in_rule__Condition__Group_0__04865);
            rule__Condition__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__0"


    // $ANTLR start "rule__Condition__Group_0__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2360:1: rule__Condition__Group_0__0__Impl : ( ( rule__Condition__SubjectiveAssignment_0_0 ) ) ;
    public final void rule__Condition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2364:1: ( ( ( rule__Condition__SubjectiveAssignment_0_0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2365:1: ( ( rule__Condition__SubjectiveAssignment_0_0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2365:1: ( ( rule__Condition__SubjectiveAssignment_0_0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2366:1: ( rule__Condition__SubjectiveAssignment_0_0 )
            {
             before(grammarAccess.getConditionAccess().getSubjectiveAssignment_0_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2367:1: ( rule__Condition__SubjectiveAssignment_0_0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2367:2: rule__Condition__SubjectiveAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Condition__SubjectiveAssignment_0_0_in_rule__Condition__Group_0__0__Impl4892);
            rule__Condition__SubjectiveAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getSubjectiveAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__0__Impl"


    // $ANTLR start "rule__Condition__Group_0__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2377:1: rule__Condition__Group_0__1 : rule__Condition__Group_0__1__Impl rule__Condition__Group_0__2 ;
    public final void rule__Condition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2381:1: ( rule__Condition__Group_0__1__Impl rule__Condition__Group_0__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2382:2: rule__Condition__Group_0__1__Impl rule__Condition__Group_0__2
            {
            pushFollow(FOLLOW_rule__Condition__Group_0__1__Impl_in_rule__Condition__Group_0__14922);
            rule__Condition__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group_0__2_in_rule__Condition__Group_0__14925);
            rule__Condition__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__1"


    // $ANTLR start "rule__Condition__Group_0__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2389:1: rule__Condition__Group_0__1__Impl : ( ( rule__Condition__OperatorAssignment_0_1 ) ) ;
    public final void rule__Condition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2393:1: ( ( ( rule__Condition__OperatorAssignment_0_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2394:1: ( ( rule__Condition__OperatorAssignment_0_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2394:1: ( ( rule__Condition__OperatorAssignment_0_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2395:1: ( rule__Condition__OperatorAssignment_0_1 )
            {
             before(grammarAccess.getConditionAccess().getOperatorAssignment_0_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2396:1: ( rule__Condition__OperatorAssignment_0_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2396:2: rule__Condition__OperatorAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Condition__OperatorAssignment_0_1_in_rule__Condition__Group_0__1__Impl4952);
            rule__Condition__OperatorAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getOperatorAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__1__Impl"


    // $ANTLR start "rule__Condition__Group_0__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2406:1: rule__Condition__Group_0__2 : rule__Condition__Group_0__2__Impl ;
    public final void rule__Condition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2410:1: ( rule__Condition__Group_0__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2411:2: rule__Condition__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Condition__Group_0__2__Impl_in_rule__Condition__Group_0__24982);
            rule__Condition__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__2"


    // $ANTLR start "rule__Condition__Group_0__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2417:1: rule__Condition__Group_0__2__Impl : ( ( rule__Condition__ObjectiveAssignment_0_2 ) ) ;
    public final void rule__Condition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2421:1: ( ( ( rule__Condition__ObjectiveAssignment_0_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2422:1: ( ( rule__Condition__ObjectiveAssignment_0_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2422:1: ( ( rule__Condition__ObjectiveAssignment_0_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2423:1: ( rule__Condition__ObjectiveAssignment_0_2 )
            {
             before(grammarAccess.getConditionAccess().getObjectiveAssignment_0_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2424:1: ( rule__Condition__ObjectiveAssignment_0_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2424:2: rule__Condition__ObjectiveAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Condition__ObjectiveAssignment_0_2_in_rule__Condition__Group_0__2__Impl5009);
            rule__Condition__ObjectiveAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getObjectiveAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__2__Impl"


    // $ANTLR start "rule__Condition__Group_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2440:1: rule__Condition__Group_1__0 : rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1 ;
    public final void rule__Condition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2444:1: ( rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2445:2: rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Condition__Group_1__0__Impl_in_rule__Condition__Group_1__05045);
            rule__Condition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group_1__1_in_rule__Condition__Group_1__05048);
            rule__Condition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__0"


    // $ANTLR start "rule__Condition__Group_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2452:1: rule__Condition__Group_1__0__Impl : ( ( rule__Condition__Alternatives_1_0 ) ) ;
    public final void rule__Condition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2456:1: ( ( ( rule__Condition__Alternatives_1_0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2457:1: ( ( rule__Condition__Alternatives_1_0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2457:1: ( ( rule__Condition__Alternatives_1_0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2458:1: ( rule__Condition__Alternatives_1_0 )
            {
             before(grammarAccess.getConditionAccess().getAlternatives_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2459:1: ( rule__Condition__Alternatives_1_0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2459:2: rule__Condition__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Condition__Alternatives_1_0_in_rule__Condition__Group_1__0__Impl5075);
            rule__Condition__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__0__Impl"


    // $ANTLR start "rule__Condition__Group_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2469:1: rule__Condition__Group_1__1 : rule__Condition__Group_1__1__Impl ;
    public final void rule__Condition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2473:1: ( rule__Condition__Group_1__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2474:2: rule__Condition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Condition__Group_1__1__Impl_in_rule__Condition__Group_1__15105);
            rule__Condition__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__1"


    // $ANTLR start "rule__Condition__Group_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2480:1: rule__Condition__Group_1__1__Impl : ( ( rule__Condition__CompareConditionAssignment_1_1 ) ) ;
    public final void rule__Condition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2484:1: ( ( ( rule__Condition__CompareConditionAssignment_1_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:1: ( ( rule__Condition__CompareConditionAssignment_1_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:1: ( ( rule__Condition__CompareConditionAssignment_1_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2486:1: ( rule__Condition__CompareConditionAssignment_1_1 )
            {
             before(grammarAccess.getConditionAccess().getCompareConditionAssignment_1_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2487:1: ( rule__Condition__CompareConditionAssignment_1_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2487:2: rule__Condition__CompareConditionAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Condition__CompareConditionAssignment_1_1_in_rule__Condition__Group_1__1__Impl5132);
            rule__Condition__CompareConditionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getCompareConditionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2501:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2505:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2506:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__05166);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__05169);
            rule__Expression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2513:1: rule__Expression__Group__0__Impl : ( ruleTerm ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2517:1: ( ( ruleTerm ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2518:1: ( ruleTerm )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2518:1: ( ruleTerm )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2519:1: ruleTerm
            {
             before(grammarAccess.getExpressionAccess().getTermParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__Expression__Group__0__Impl5196);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getTermParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2530:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2534:1: ( rule__Expression__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2535:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__15225);
            rule__Expression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2541:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2545:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2546:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2546:1: ( ( rule__Expression__Group_1__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2547:1: ( rule__Expression__Group_1__0 )*
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2548:1: ( rule__Expression__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=23 && LA21_0<=24)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2548:2: rule__Expression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl5252);
            	    rule__Expression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2562:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2566:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2567:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__05287);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__05290);
            rule__Expression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2574:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__Alternatives_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2578:1: ( ( ( rule__Expression__Alternatives_1_0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2579:1: ( ( rule__Expression__Alternatives_1_0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2579:1: ( ( rule__Expression__Alternatives_1_0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2580:1: ( rule__Expression__Alternatives_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2581:1: ( rule__Expression__Alternatives_1_0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2581:2: rule__Expression__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_1_0_in_rule__Expression__Group_1__0__Impl5317);
            rule__Expression__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2591:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2595:1: ( rule__Expression__Group_1__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2596:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__15347);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2602:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__RightAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2606:1: ( ( ( rule__Expression__RightAssignment_1_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2607:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2607:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2608:1: ( rule__Expression__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2609:1: ( rule__Expression__RightAssignment_1_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2609:2: rule__Expression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression__RightAssignment_1_1_in_rule__Expression__Group_1__1__Impl5374);
            rule__Expression__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_1_0_0__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2623:1: rule__Expression__Group_1_0_0__0 : rule__Expression__Group_1_0_0__0__Impl rule__Expression__Group_1_0_0__1 ;
    public final void rule__Expression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2627:1: ( rule__Expression__Group_1_0_0__0__Impl rule__Expression__Group_1_0_0__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2628:2: rule__Expression__Group_1_0_0__0__Impl rule__Expression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1_0_0__0__Impl_in_rule__Expression__Group_1_0_0__05408);
            rule__Expression__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1_0_0__1_in_rule__Expression__Group_1_0_0__05411);
            rule__Expression__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_0__0"


    // $ANTLR start "rule__Expression__Group_1_0_0__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2635:1: rule__Expression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2639:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2640:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2640:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2641:1: ()
            {
             before(grammarAccess.getExpressionAccess().getPlusLeftAction_1_0_0_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2642:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2644:1: 
            {
            }

             after(grammarAccess.getExpressionAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Expression__Group_1_0_0__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2654:1: rule__Expression__Group_1_0_0__1 : rule__Expression__Group_1_0_0__1__Impl ;
    public final void rule__Expression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2658:1: ( rule__Expression__Group_1_0_0__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2659:2: rule__Expression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1_0_0__1__Impl_in_rule__Expression__Group_1_0_0__15469);
            rule__Expression__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_0__1"


    // $ANTLR start "rule__Expression__Group_1_0_0__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2665:1: rule__Expression__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Expression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2669:1: ( ( '+' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2670:1: ( '+' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2670:1: ( '+' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2671:1: '+'
            {
             before(grammarAccess.getExpressionAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,23,FOLLOW_23_in_rule__Expression__Group_1_0_0__1__Impl5497); 
             after(grammarAccess.getExpressionAccess().getPlusSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Expression__Group_1_0_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2688:1: rule__Expression__Group_1_0_1__0 : rule__Expression__Group_1_0_1__0__Impl rule__Expression__Group_1_0_1__1 ;
    public final void rule__Expression__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2692:1: ( rule__Expression__Group_1_0_1__0__Impl rule__Expression__Group_1_0_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2693:2: rule__Expression__Group_1_0_1__0__Impl rule__Expression__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1_0_1__0__Impl_in_rule__Expression__Group_1_0_1__05532);
            rule__Expression__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1_0_1__1_in_rule__Expression__Group_1_0_1__05535);
            rule__Expression__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_1__0"


    // $ANTLR start "rule__Expression__Group_1_0_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2700:1: rule__Expression__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2704:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2705:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2705:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2706:1: ()
            {
             before(grammarAccess.getExpressionAccess().getMinusLeftAction_1_0_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2707:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2709:1: 
            {
            }

             after(grammarAccess.getExpressionAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1_0_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2719:1: rule__Expression__Group_1_0_1__1 : rule__Expression__Group_1_0_1__1__Impl ;
    public final void rule__Expression__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2723:1: ( rule__Expression__Group_1_0_1__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2724:2: rule__Expression__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1_0_1__1__Impl_in_rule__Expression__Group_1_0_1__15593);
            rule__Expression__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_1__1"


    // $ANTLR start "rule__Expression__Group_1_0_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2730:1: rule__Expression__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Expression__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2734:1: ( ( '-' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2735:1: ( '-' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2735:1: ( '-' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2736:1: '-'
            {
             before(grammarAccess.getExpressionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,24,FOLLOW_24_in_rule__Expression__Group_1_0_1__1__Impl5621); 
             after(grammarAccess.getExpressionAccess().getHyphenMinusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Term__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2753:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2757:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2758:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__05656);
            rule__Term__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group__1_in_rule__Term__Group__05659);
            rule__Term__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__0"


    // $ANTLR start "rule__Term__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2765:1: rule__Term__Group__0__Impl : ( ruleFactor ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2769:1: ( ( ruleFactor ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2770:1: ( ruleFactor )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2770:1: ( ruleFactor )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2771:1: ruleFactor
            {
             before(grammarAccess.getTermAccess().getFactorParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleFactor_in_rule__Term__Group__0__Impl5686);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getTermAccess().getFactorParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__0__Impl"


    // $ANTLR start "rule__Term__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2782:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2786:1: ( rule__Term__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2787:2: rule__Term__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__15715);
            rule__Term__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__1"


    // $ANTLR start "rule__Term__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2793:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2797:1: ( ( ( rule__Term__Group_1__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2798:1: ( ( rule__Term__Group_1__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2798:1: ( ( rule__Term__Group_1__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2799:1: ( rule__Term__Group_1__0 )*
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2800:1: ( rule__Term__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=25 && LA22_0<=26)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2800:2: rule__Term__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Term__Group_1__0_in_rule__Term__Group__1__Impl5742);
            	    rule__Term__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getTermAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__1__Impl"


    // $ANTLR start "rule__Term__Group_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2814:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2818:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2819:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__05777);
            rule__Term__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__05780);
            rule__Term__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__0"


    // $ANTLR start "rule__Term__Group_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2826:1: rule__Term__Group_1__0__Impl : ( ( rule__Term__Alternatives_1_0 ) ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2830:1: ( ( ( rule__Term__Alternatives_1_0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2831:1: ( ( rule__Term__Alternatives_1_0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2831:1: ( ( rule__Term__Alternatives_1_0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2832:1: ( rule__Term__Alternatives_1_0 )
            {
             before(grammarAccess.getTermAccess().getAlternatives_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2833:1: ( rule__Term__Alternatives_1_0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2833:2: rule__Term__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Term__Alternatives_1_0_in_rule__Term__Group_1__0__Impl5807);
            rule__Term__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__0__Impl"


    // $ANTLR start "rule__Term__Group_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2843:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2847:1: ( rule__Term__Group_1__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2848:2: rule__Term__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__15837);
            rule__Term__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__1"


    // $ANTLR start "rule__Term__Group_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2854:1: rule__Term__Group_1__1__Impl : ( ( rule__Term__RightAssignment_1_1 ) ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2858:1: ( ( ( rule__Term__RightAssignment_1_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2859:1: ( ( rule__Term__RightAssignment_1_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2859:1: ( ( rule__Term__RightAssignment_1_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2860:1: ( rule__Term__RightAssignment_1_1 )
            {
             before(grammarAccess.getTermAccess().getRightAssignment_1_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2861:1: ( rule__Term__RightAssignment_1_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2861:2: rule__Term__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Term__RightAssignment_1_1_in_rule__Term__Group_1__1__Impl5864);
            rule__Term__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__1__Impl"


    // $ANTLR start "rule__Term__Group_1_0_0__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2875:1: rule__Term__Group_1_0_0__0 : rule__Term__Group_1_0_0__0__Impl rule__Term__Group_1_0_0__1 ;
    public final void rule__Term__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2879:1: ( rule__Term__Group_1_0_0__0__Impl rule__Term__Group_1_0_0__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2880:2: rule__Term__Group_1_0_0__0__Impl rule__Term__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Term__Group_1_0_0__0__Impl_in_rule__Term__Group_1_0_0__05898);
            rule__Term__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group_1_0_0__1_in_rule__Term__Group_1_0_0__05901);
            rule__Term__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0_0__0"


    // $ANTLR start "rule__Term__Group_1_0_0__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2887:1: rule__Term__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Term__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2891:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2892:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2892:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2893:1: ()
            {
             before(grammarAccess.getTermAccess().getMultiplyLeftAction_1_0_0_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2894:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2896:1: 
            {
            }

             after(grammarAccess.getTermAccess().getMultiplyLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Term__Group_1_0_0__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2906:1: rule__Term__Group_1_0_0__1 : rule__Term__Group_1_0_0__1__Impl ;
    public final void rule__Term__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2910:1: ( rule__Term__Group_1_0_0__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2911:2: rule__Term__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_1_0_0__1__Impl_in_rule__Term__Group_1_0_0__15959);
            rule__Term__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0_0__1"


    // $ANTLR start "rule__Term__Group_1_0_0__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2917:1: rule__Term__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Term__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2921:1: ( ( '*' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2922:1: ( '*' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2922:1: ( '*' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2923:1: '*'
            {
             before(grammarAccess.getTermAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,25,FOLLOW_25_in_rule__Term__Group_1_0_0__1__Impl5987); 
             after(grammarAccess.getTermAccess().getAsteriskKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Term__Group_1_0_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2940:1: rule__Term__Group_1_0_1__0 : rule__Term__Group_1_0_1__0__Impl rule__Term__Group_1_0_1__1 ;
    public final void rule__Term__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2944:1: ( rule__Term__Group_1_0_1__0__Impl rule__Term__Group_1_0_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2945:2: rule__Term__Group_1_0_1__0__Impl rule__Term__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Term__Group_1_0_1__0__Impl_in_rule__Term__Group_1_0_1__06022);
            rule__Term__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group_1_0_1__1_in_rule__Term__Group_1_0_1__06025);
            rule__Term__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0_1__0"


    // $ANTLR start "rule__Term__Group_1_0_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2952:1: rule__Term__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Term__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2956:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2957:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2957:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2958:1: ()
            {
             before(grammarAccess.getTermAccess().getDivisionLeftAction_1_0_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2959:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2961:1: 
            {
            }

             after(grammarAccess.getTermAccess().getDivisionLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Term__Group_1_0_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2971:1: rule__Term__Group_1_0_1__1 : rule__Term__Group_1_0_1__1__Impl ;
    public final void rule__Term__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2975:1: ( rule__Term__Group_1_0_1__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2976:2: rule__Term__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_1_0_1__1__Impl_in_rule__Term__Group_1_0_1__16083);
            rule__Term__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0_1__1"


    // $ANTLR start "rule__Term__Group_1_0_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2982:1: rule__Term__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Term__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2986:1: ( ( '/' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2987:1: ( '/' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2987:1: ( '/' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2988:1: '/'
            {
             before(grammarAccess.getTermAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,26,FOLLOW_26_in_rule__Term__Group_1_0_1__1__Impl6111); 
             after(grammarAccess.getTermAccess().getSolidusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Factor__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3005:1: rule__Factor__Group_4__0 : rule__Factor__Group_4__0__Impl rule__Factor__Group_4__1 ;
    public final void rule__Factor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3009:1: ( rule__Factor__Group_4__0__Impl rule__Factor__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3010:2: rule__Factor__Group_4__0__Impl rule__Factor__Group_4__1
            {
            pushFollow(FOLLOW_rule__Factor__Group_4__0__Impl_in_rule__Factor__Group_4__06146);
            rule__Factor__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Factor__Group_4__1_in_rule__Factor__Group_4__06149);
            rule__Factor__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_4__0"


    // $ANTLR start "rule__Factor__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3017:1: rule__Factor__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Factor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3021:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3022:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3022:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3023:1: '('
            {
             before(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,27,FOLLOW_27_in_rule__Factor__Group_4__0__Impl6177); 
             after(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_4__0__Impl"


    // $ANTLR start "rule__Factor__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3036:1: rule__Factor__Group_4__1 : rule__Factor__Group_4__1__Impl rule__Factor__Group_4__2 ;
    public final void rule__Factor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3040:1: ( rule__Factor__Group_4__1__Impl rule__Factor__Group_4__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3041:2: rule__Factor__Group_4__1__Impl rule__Factor__Group_4__2
            {
            pushFollow(FOLLOW_rule__Factor__Group_4__1__Impl_in_rule__Factor__Group_4__16208);
            rule__Factor__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Factor__Group_4__2_in_rule__Factor__Group_4__16211);
            rule__Factor__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_4__1"


    // $ANTLR start "rule__Factor__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3048:1: rule__Factor__Group_4__1__Impl : ( ( rule__Factor__ExpressionAssignment_4_1 ) ) ;
    public final void rule__Factor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3052:1: ( ( ( rule__Factor__ExpressionAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3053:1: ( ( rule__Factor__ExpressionAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3053:1: ( ( rule__Factor__ExpressionAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3054:1: ( rule__Factor__ExpressionAssignment_4_1 )
            {
             before(grammarAccess.getFactorAccess().getExpressionAssignment_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3055:1: ( rule__Factor__ExpressionAssignment_4_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3055:2: rule__Factor__ExpressionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Factor__ExpressionAssignment_4_1_in_rule__Factor__Group_4__1__Impl6238);
            rule__Factor__ExpressionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getExpressionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_4__1__Impl"


    // $ANTLR start "rule__Factor__Group_4__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3065:1: rule__Factor__Group_4__2 : rule__Factor__Group_4__2__Impl ;
    public final void rule__Factor__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3069:1: ( rule__Factor__Group_4__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3070:2: rule__Factor__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Factor__Group_4__2__Impl_in_rule__Factor__Group_4__26268);
            rule__Factor__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_4__2"


    // $ANTLR start "rule__Factor__Group_4__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3076:1: rule__Factor__Group_4__2__Impl : ( ')' ) ;
    public final void rule__Factor__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3080:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3081:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3081:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3082:1: ')'
            {
             before(grammarAccess.getFactorAccess().getRightParenthesisKeyword_4_2()); 
            match(input,28,FOLLOW_28_in_rule__Factor__Group_4__2__Impl6296); 
             after(grammarAccess.getFactorAccess().getRightParenthesisKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_4__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3101:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3105:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3106:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__06333);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__06336);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3113:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3117:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3118:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3118:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3119:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl6363); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3130:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl rule__QualifiedName__Group__2 ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3134:1: ( rule__QualifiedName__Group__1__Impl rule__QualifiedName__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3135:2: rule__QualifiedName__Group__1__Impl rule__QualifiedName__Group__2
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__16392);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__2_in_rule__QualifiedName__Group__16395);
            rule__QualifiedName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3142:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3146:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3147:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3147:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3148:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3149:1: ( rule__QualifiedName__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==29) ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==RULE_ID) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3149:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl6422);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3159:1: rule__QualifiedName__Group__2 : rule__QualifiedName__Group__2__Impl ;
    public final void rule__QualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3163:1: ( rule__QualifiedName__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3164:2: rule__QualifiedName__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__2__Impl_in_rule__QualifiedName__Group__26453);
            rule__QualifiedName__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__2"


    // $ANTLR start "rule__QualifiedName__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3170:1: rule__QualifiedName__Group__2__Impl : ( ( rule__QualifiedName__Group_2__0 )* ) ;
    public final void rule__QualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3174:1: ( ( ( rule__QualifiedName__Group_2__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3175:1: ( ( rule__QualifiedName__Group_2__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3175:1: ( ( rule__QualifiedName__Group_2__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3176:1: ( rule__QualifiedName__Group_2__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3177:1: ( rule__QualifiedName__Group_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==29) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3177:2: rule__QualifiedName__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_2__0_in_rule__QualifiedName__Group__2__Impl6480);
            	    rule__QualifiedName__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3193:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3197:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3198:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__06517);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__06520);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3205:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3209:1: ( ( '.' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3210:1: ( '.' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3210:1: ( '.' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3211:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__QualifiedName__Group_1__0__Impl6548); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3224:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3228:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3229:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__16579);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3235:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3239:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3240:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3240:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3241:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl6606); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_2__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3256:1: rule__QualifiedName__Group_2__0 : rule__QualifiedName__Group_2__0__Impl rule__QualifiedName__Group_2__1 ;
    public final void rule__QualifiedName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3260:1: ( rule__QualifiedName__Group_2__0__Impl rule__QualifiedName__Group_2__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3261:2: rule__QualifiedName__Group_2__0__Impl rule__QualifiedName__Group_2__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_2__0__Impl_in_rule__QualifiedName__Group_2__06639);
            rule__QualifiedName__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_2__1_in_rule__QualifiedName__Group_2__06642);
            rule__QualifiedName__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_2__0"


    // $ANTLR start "rule__QualifiedName__Group_2__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3268:1: rule__QualifiedName__Group_2__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3272:1: ( ( '.' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3273:1: ( '.' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3273:1: ( '.' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3274:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_2_0()); 
            match(input,29,FOLLOW_29_in_rule__QualifiedName__Group_2__0__Impl6670); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_2__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_2__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3287:1: rule__QualifiedName__Group_2__1 : rule__QualifiedName__Group_2__1__Impl ;
    public final void rule__QualifiedName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3291:1: ( rule__QualifiedName__Group_2__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3292:2: rule__QualifiedName__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_2__1__Impl_in_rule__QualifiedName__Group_2__16701);
            rule__QualifiedName__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_2__1"


    // $ANTLR start "rule__QualifiedName__Group_2__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3298:1: rule__QualifiedName__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__QualifiedName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3302:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3303:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3303:1: ( RULE_INT )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3304:1: RULE_INT
            {
             before(grammarAccess.getQualifiedNameAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__QualifiedName__Group_2__1__Impl6728); 
             after(grammarAccess.getQualifiedNameAccess().getINTTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_2__1__Impl"


    // $ANTLR start "rule__Plans__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3319:1: rule__Plans__Group__0 : rule__Plans__Group__0__Impl rule__Plans__Group__1 ;
    public final void rule__Plans__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3323:1: ( rule__Plans__Group__0__Impl rule__Plans__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3324:2: rule__Plans__Group__0__Impl rule__Plans__Group__1
            {
            pushFollow(FOLLOW_rule__Plans__Group__0__Impl_in_rule__Plans__Group__06761);
            rule__Plans__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plans__Group__1_in_rule__Plans__Group__06764);
            rule__Plans__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plans__Group__0"


    // $ANTLR start "rule__Plans__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3331:1: rule__Plans__Group__0__Impl : ( 'Plans {' ) ;
    public final void rule__Plans__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3335:1: ( ( 'Plans {' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3336:1: ( 'Plans {' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3336:1: ( 'Plans {' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3337:1: 'Plans {'
            {
             before(grammarAccess.getPlansAccess().getPlansKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Plans__Group__0__Impl6792); 
             after(grammarAccess.getPlansAccess().getPlansKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plans__Group__0__Impl"


    // $ANTLR start "rule__Plans__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3350:1: rule__Plans__Group__1 : rule__Plans__Group__1__Impl rule__Plans__Group__2 ;
    public final void rule__Plans__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3354:1: ( rule__Plans__Group__1__Impl rule__Plans__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3355:2: rule__Plans__Group__1__Impl rule__Plans__Group__2
            {
            pushFollow(FOLLOW_rule__Plans__Group__1__Impl_in_rule__Plans__Group__16823);
            rule__Plans__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plans__Group__2_in_rule__Plans__Group__16826);
            rule__Plans__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plans__Group__1"


    // $ANTLR start "rule__Plans__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3362:1: rule__Plans__Group__1__Impl : ( ( ( rule__Plans__PlansAssignment_1 ) ) ( ( rule__Plans__PlansAssignment_1 )* ) ) ;
    public final void rule__Plans__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3366:1: ( ( ( ( rule__Plans__PlansAssignment_1 ) ) ( ( rule__Plans__PlansAssignment_1 )* ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3367:1: ( ( ( rule__Plans__PlansAssignment_1 ) ) ( ( rule__Plans__PlansAssignment_1 )* ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3367:1: ( ( ( rule__Plans__PlansAssignment_1 ) ) ( ( rule__Plans__PlansAssignment_1 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3368:1: ( ( rule__Plans__PlansAssignment_1 ) ) ( ( rule__Plans__PlansAssignment_1 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3368:1: ( ( rule__Plans__PlansAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3369:1: ( rule__Plans__PlansAssignment_1 )
            {
             before(grammarAccess.getPlansAccess().getPlansAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3370:1: ( rule__Plans__PlansAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3370:2: rule__Plans__PlansAssignment_1
            {
            pushFollow(FOLLOW_rule__Plans__PlansAssignment_1_in_rule__Plans__Group__1__Impl6855);
            rule__Plans__PlansAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlansAccess().getPlansAssignment_1()); 

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3373:1: ( ( rule__Plans__PlansAssignment_1 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3374:1: ( rule__Plans__PlansAssignment_1 )*
            {
             before(grammarAccess.getPlansAccess().getPlansAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3375:1: ( rule__Plans__PlansAssignment_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==31) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3375:2: rule__Plans__PlansAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Plans__PlansAssignment_1_in_rule__Plans__Group__1__Impl6867);
            	    rule__Plans__PlansAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getPlansAccess().getPlansAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plans__Group__1__Impl"


    // $ANTLR start "rule__Plans__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3386:1: rule__Plans__Group__2 : rule__Plans__Group__2__Impl ;
    public final void rule__Plans__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3390:1: ( rule__Plans__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3391:2: rule__Plans__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Plans__Group__2__Impl_in_rule__Plans__Group__26900);
            rule__Plans__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plans__Group__2"


    // $ANTLR start "rule__Plans__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3397:1: rule__Plans__Group__2__Impl : ( '}' ) ;
    public final void rule__Plans__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3401:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3402:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3402:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3403:1: '}'
            {
             before(grammarAccess.getPlansAccess().getRightCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Plans__Group__2__Impl6928); 
             after(grammarAccess.getPlansAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plans__Group__2__Impl"


    // $ANTLR start "rule__Plan__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3422:1: rule__Plan__Group__0 : rule__Plan__Group__0__Impl rule__Plan__Group__1 ;
    public final void rule__Plan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3426:1: ( rule__Plan__Group__0__Impl rule__Plan__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3427:2: rule__Plan__Group__0__Impl rule__Plan__Group__1
            {
            pushFollow(FOLLOW_rule__Plan__Group__0__Impl_in_rule__Plan__Group__06965);
            rule__Plan__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__1_in_rule__Plan__Group__06968);
            rule__Plan__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__Group__0"


    // $ANTLR start "rule__Plan__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3434:1: rule__Plan__Group__0__Impl : ( 'Plan' ) ;
    public final void rule__Plan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3438:1: ( ( 'Plan' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3439:1: ( 'Plan' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3439:1: ( 'Plan' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3440:1: 'Plan'
            {
             before(grammarAccess.getPlanAccess().getPlanKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Plan__Group__0__Impl6996); 
             after(grammarAccess.getPlanAccess().getPlanKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__Group__0__Impl"


    // $ANTLR start "rule__Plan__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3453:1: rule__Plan__Group__1 : rule__Plan__Group__1__Impl rule__Plan__Group__2 ;
    public final void rule__Plan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3457:1: ( rule__Plan__Group__1__Impl rule__Plan__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3458:2: rule__Plan__Group__1__Impl rule__Plan__Group__2
            {
            pushFollow(FOLLOW_rule__Plan__Group__1__Impl_in_rule__Plan__Group__17027);
            rule__Plan__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__2_in_rule__Plan__Group__17030);
            rule__Plan__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__Group__1"


    // $ANTLR start "rule__Plan__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3465:1: rule__Plan__Group__1__Impl : ( ( rule__Plan__NameAssignment_1 ) ) ;
    public final void rule__Plan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3469:1: ( ( ( rule__Plan__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3470:1: ( ( rule__Plan__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3470:1: ( ( rule__Plan__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3471:1: ( rule__Plan__NameAssignment_1 )
            {
             before(grammarAccess.getPlanAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3472:1: ( rule__Plan__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3472:2: rule__Plan__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Plan__NameAssignment_1_in_rule__Plan__Group__1__Impl7057);
            rule__Plan__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlanAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__Group__1__Impl"


    // $ANTLR start "rule__Plan__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3482:1: rule__Plan__Group__2 : rule__Plan__Group__2__Impl rule__Plan__Group__3 ;
    public final void rule__Plan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3486:1: ( rule__Plan__Group__2__Impl rule__Plan__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3487:2: rule__Plan__Group__2__Impl rule__Plan__Group__3
            {
            pushFollow(FOLLOW_rule__Plan__Group__2__Impl_in_rule__Plan__Group__27087);
            rule__Plan__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__3_in_rule__Plan__Group__27090);
            rule__Plan__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__Group__2"


    // $ANTLR start "rule__Plan__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3494:1: rule__Plan__Group__2__Impl : ( '{' ) ;
    public final void rule__Plan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3498:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3499:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3499:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3500:1: '{'
            {
             before(grammarAccess.getPlanAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Plan__Group__2__Impl7118); 
             after(grammarAccess.getPlanAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__Group__2__Impl"


    // $ANTLR start "rule__Plan__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3513:1: rule__Plan__Group__3 : rule__Plan__Group__3__Impl rule__Plan__Group__4 ;
    public final void rule__Plan__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3517:1: ( rule__Plan__Group__3__Impl rule__Plan__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3518:2: rule__Plan__Group__3__Impl rule__Plan__Group__4
            {
            pushFollow(FOLLOW_rule__Plan__Group__3__Impl_in_rule__Plan__Group__37149);
            rule__Plan__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__4_in_rule__Plan__Group__37152);
            rule__Plan__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__Group__3"


    // $ANTLR start "rule__Plan__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3525:1: rule__Plan__Group__3__Impl : ( ( rule__Plan__BodyAssignment_3 ) ) ;
    public final void rule__Plan__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3529:1: ( ( ( rule__Plan__BodyAssignment_3 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3530:1: ( ( rule__Plan__BodyAssignment_3 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3530:1: ( ( rule__Plan__BodyAssignment_3 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3531:1: ( rule__Plan__BodyAssignment_3 )
            {
             before(grammarAccess.getPlanAccess().getBodyAssignment_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3532:1: ( rule__Plan__BodyAssignment_3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3532:2: rule__Plan__BodyAssignment_3
            {
            pushFollow(FOLLOW_rule__Plan__BodyAssignment_3_in_rule__Plan__Group__3__Impl7179);
            rule__Plan__BodyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPlanAccess().getBodyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__Group__3__Impl"


    // $ANTLR start "rule__Plan__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3542:1: rule__Plan__Group__4 : rule__Plan__Group__4__Impl rule__Plan__Group__5 ;
    public final void rule__Plan__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3546:1: ( rule__Plan__Group__4__Impl rule__Plan__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3547:2: rule__Plan__Group__4__Impl rule__Plan__Group__5
            {
            pushFollow(FOLLOW_rule__Plan__Group__4__Impl_in_rule__Plan__Group__47209);
            rule__Plan__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Plan__Group__5_in_rule__Plan__Group__47212);
            rule__Plan__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__Group__4"


    // $ANTLR start "rule__Plan__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3554:1: rule__Plan__Group__4__Impl : ( ( rule__Plan__TriggerAssignment_4 ) ) ;
    public final void rule__Plan__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3558:1: ( ( ( rule__Plan__TriggerAssignment_4 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3559:1: ( ( rule__Plan__TriggerAssignment_4 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3559:1: ( ( rule__Plan__TriggerAssignment_4 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3560:1: ( rule__Plan__TriggerAssignment_4 )
            {
             before(grammarAccess.getPlanAccess().getTriggerAssignment_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3561:1: ( rule__Plan__TriggerAssignment_4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3561:2: rule__Plan__TriggerAssignment_4
            {
            pushFollow(FOLLOW_rule__Plan__TriggerAssignment_4_in_rule__Plan__Group__4__Impl7239);
            rule__Plan__TriggerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPlanAccess().getTriggerAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__Group__4__Impl"


    // $ANTLR start "rule__Plan__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3571:1: rule__Plan__Group__5 : rule__Plan__Group__5__Impl ;
    public final void rule__Plan__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3575:1: ( rule__Plan__Group__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3576:2: rule__Plan__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Plan__Group__5__Impl_in_rule__Plan__Group__57269);
            rule__Plan__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__Group__5"


    // $ANTLR start "rule__Plan__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3582:1: rule__Plan__Group__5__Impl : ( '}' ) ;
    public final void rule__Plan__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3586:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3587:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3587:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3588:1: '}'
            {
             before(grammarAccess.getPlanAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__Plan__Group__5__Impl7297); 
             after(grammarAccess.getPlanAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__Group__5__Impl"


    // $ANTLR start "rule__Trigger__Group_0__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3613:1: rule__Trigger__Group_0__0 : rule__Trigger__Group_0__0__Impl rule__Trigger__Group_0__1 ;
    public final void rule__Trigger__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3617:1: ( rule__Trigger__Group_0__0__Impl rule__Trigger__Group_0__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3618:2: rule__Trigger__Group_0__0__Impl rule__Trigger__Group_0__1
            {
            pushFollow(FOLLOW_rule__Trigger__Group_0__0__Impl_in_rule__Trigger__Group_0__07340);
            rule__Trigger__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trigger__Group_0__1_in_rule__Trigger__Group_0__07343);
            rule__Trigger__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group_0__0"


    // $ANTLR start "rule__Trigger__Group_0__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3625:1: rule__Trigger__Group_0__0__Impl : ( 'Trigger {' ) ;
    public final void rule__Trigger__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3629:1: ( ( 'Trigger {' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3630:1: ( 'Trigger {' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3630:1: ( 'Trigger {' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3631:1: 'Trigger {'
            {
             before(grammarAccess.getTriggerAccess().getTriggerKeyword_0_0()); 
            match(input,32,FOLLOW_32_in_rule__Trigger__Group_0__0__Impl7371); 
             after(grammarAccess.getTriggerAccess().getTriggerKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group_0__0__Impl"


    // $ANTLR start "rule__Trigger__Group_0__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3644:1: rule__Trigger__Group_0__1 : rule__Trigger__Group_0__1__Impl ;
    public final void rule__Trigger__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3648:1: ( rule__Trigger__Group_0__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3649:2: rule__Trigger__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Trigger__Group_0__1__Impl_in_rule__Trigger__Group_0__17402);
            rule__Trigger__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group_0__1"


    // $ANTLR start "rule__Trigger__Group_0__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3655:1: rule__Trigger__Group_0__1__Impl : ( ( rule__Trigger__EventAssignment_0_1 ) ) ;
    public final void rule__Trigger__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3659:1: ( ( ( rule__Trigger__EventAssignment_0_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3660:1: ( ( rule__Trigger__EventAssignment_0_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3660:1: ( ( rule__Trigger__EventAssignment_0_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3661:1: ( rule__Trigger__EventAssignment_0_1 )
            {
             before(grammarAccess.getTriggerAccess().getEventAssignment_0_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3662:1: ( rule__Trigger__EventAssignment_0_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3662:2: rule__Trigger__EventAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Trigger__EventAssignment_0_1_in_rule__Trigger__Group_0__1__Impl7429);
            rule__Trigger__EventAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTriggerAccess().getEventAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group_0__1__Impl"


    // $ANTLR start "rule__Trigger__Group_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3676:1: rule__Trigger__Group_1__0 : rule__Trigger__Group_1__0__Impl rule__Trigger__Group_1__1 ;
    public final void rule__Trigger__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3680:1: ( rule__Trigger__Group_1__0__Impl rule__Trigger__Group_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3681:2: rule__Trigger__Group_1__0__Impl rule__Trigger__Group_1__1
            {
            pushFollow(FOLLOW_rule__Trigger__Group_1__0__Impl_in_rule__Trigger__Group_1__07463);
            rule__Trigger__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trigger__Group_1__1_in_rule__Trigger__Group_1__07466);
            rule__Trigger__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group_1__0"


    // $ANTLR start "rule__Trigger__Group_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3688:1: rule__Trigger__Group_1__0__Impl : ( ( rule__Trigger__GoalAssignment_1_0 ) ) ;
    public final void rule__Trigger__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3692:1: ( ( ( rule__Trigger__GoalAssignment_1_0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3693:1: ( ( rule__Trigger__GoalAssignment_1_0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3693:1: ( ( rule__Trigger__GoalAssignment_1_0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3694:1: ( rule__Trigger__GoalAssignment_1_0 )
            {
             before(grammarAccess.getTriggerAccess().getGoalAssignment_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3695:1: ( rule__Trigger__GoalAssignment_1_0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3695:2: rule__Trigger__GoalAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Trigger__GoalAssignment_1_0_in_rule__Trigger__Group_1__0__Impl7493);
            rule__Trigger__GoalAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTriggerAccess().getGoalAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group_1__0__Impl"


    // $ANTLR start "rule__Trigger__Group_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3705:1: rule__Trigger__Group_1__1 : rule__Trigger__Group_1__1__Impl ;
    public final void rule__Trigger__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3709:1: ( rule__Trigger__Group_1__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3710:2: rule__Trigger__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Trigger__Group_1__1__Impl_in_rule__Trigger__Group_1__17523);
            rule__Trigger__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group_1__1"


    // $ANTLR start "rule__Trigger__Group_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3716:1: rule__Trigger__Group_1__1__Impl : ( '}' ) ;
    public final void rule__Trigger__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3720:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3721:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3721:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3722:1: '}'
            {
             before(grammarAccess.getTriggerAccess().getRightCurlyBracketKeyword_1_1()); 
            match(input,15,FOLLOW_15_in_rule__Trigger__Group_1__1__Impl7551); 
             after(grammarAccess.getTriggerAccess().getRightCurlyBracketKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group_1__1__Impl"


    // $ANTLR start "rule__BeliefSet__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3739:1: rule__BeliefSet__Group__0 : rule__BeliefSet__Group__0__Impl rule__BeliefSet__Group__1 ;
    public final void rule__BeliefSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3743:1: ( rule__BeliefSet__Group__0__Impl rule__BeliefSet__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3744:2: rule__BeliefSet__Group__0__Impl rule__BeliefSet__Group__1
            {
            pushFollow(FOLLOW_rule__BeliefSet__Group__0__Impl_in_rule__BeliefSet__Group__07586);
            rule__BeliefSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BeliefSet__Group__1_in_rule__BeliefSet__Group__07589);
            rule__BeliefSet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeliefSet__Group__0"


    // $ANTLR start "rule__BeliefSet__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3751:1: rule__BeliefSet__Group__0__Impl : ( 'BeliefSet' ) ;
    public final void rule__BeliefSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3755:1: ( ( 'BeliefSet' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3756:1: ( 'BeliefSet' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3756:1: ( 'BeliefSet' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3757:1: 'BeliefSet'
            {
             before(grammarAccess.getBeliefSetAccess().getBeliefSetKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__BeliefSet__Group__0__Impl7617); 
             after(grammarAccess.getBeliefSetAccess().getBeliefSetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeliefSet__Group__0__Impl"


    // $ANTLR start "rule__BeliefSet__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3770:1: rule__BeliefSet__Group__1 : rule__BeliefSet__Group__1__Impl rule__BeliefSet__Group__2 ;
    public final void rule__BeliefSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3774:1: ( rule__BeliefSet__Group__1__Impl rule__BeliefSet__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3775:2: rule__BeliefSet__Group__1__Impl rule__BeliefSet__Group__2
            {
            pushFollow(FOLLOW_rule__BeliefSet__Group__1__Impl_in_rule__BeliefSet__Group__17648);
            rule__BeliefSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BeliefSet__Group__2_in_rule__BeliefSet__Group__17651);
            rule__BeliefSet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeliefSet__Group__1"


    // $ANTLR start "rule__BeliefSet__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3782:1: rule__BeliefSet__Group__1__Impl : ( ( rule__BeliefSet__NameAssignment_1 ) ) ;
    public final void rule__BeliefSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3786:1: ( ( ( rule__BeliefSet__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3787:1: ( ( rule__BeliefSet__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3787:1: ( ( rule__BeliefSet__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3788:1: ( rule__BeliefSet__NameAssignment_1 )
            {
             before(grammarAccess.getBeliefSetAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3789:1: ( rule__BeliefSet__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3789:2: rule__BeliefSet__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__BeliefSet__NameAssignment_1_in_rule__BeliefSet__Group__1__Impl7678);
            rule__BeliefSet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBeliefSetAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeliefSet__Group__1__Impl"


    // $ANTLR start "rule__BeliefSet__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3799:1: rule__BeliefSet__Group__2 : rule__BeliefSet__Group__2__Impl rule__BeliefSet__Group__3 ;
    public final void rule__BeliefSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3803:1: ( rule__BeliefSet__Group__2__Impl rule__BeliefSet__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3804:2: rule__BeliefSet__Group__2__Impl rule__BeliefSet__Group__3
            {
            pushFollow(FOLLOW_rule__BeliefSet__Group__2__Impl_in_rule__BeliefSet__Group__27708);
            rule__BeliefSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BeliefSet__Group__3_in_rule__BeliefSet__Group__27711);
            rule__BeliefSet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeliefSet__Group__2"


    // $ANTLR start "rule__BeliefSet__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3811:1: rule__BeliefSet__Group__2__Impl : ( '{' ) ;
    public final void rule__BeliefSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3815:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3816:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3816:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3817:1: '{'
            {
             before(grammarAccess.getBeliefSetAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__BeliefSet__Group__2__Impl7739); 
             after(grammarAccess.getBeliefSetAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeliefSet__Group__2__Impl"


    // $ANTLR start "rule__BeliefSet__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3830:1: rule__BeliefSet__Group__3 : rule__BeliefSet__Group__3__Impl rule__BeliefSet__Group__4 ;
    public final void rule__BeliefSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3834:1: ( rule__BeliefSet__Group__3__Impl rule__BeliefSet__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3835:2: rule__BeliefSet__Group__3__Impl rule__BeliefSet__Group__4
            {
            pushFollow(FOLLOW_rule__BeliefSet__Group__3__Impl_in_rule__BeliefSet__Group__37770);
            rule__BeliefSet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BeliefSet__Group__4_in_rule__BeliefSet__Group__37773);
            rule__BeliefSet__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeliefSet__Group__3"


    // $ANTLR start "rule__BeliefSet__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3842:1: rule__BeliefSet__Group__3__Impl : ( ( ( rule__BeliefSet__BeliefSetAssignment_3 ) ) ( ( rule__BeliefSet__BeliefSetAssignment_3 )* ) ) ;
    public final void rule__BeliefSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3846:1: ( ( ( ( rule__BeliefSet__BeliefSetAssignment_3 ) ) ( ( rule__BeliefSet__BeliefSetAssignment_3 )* ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3847:1: ( ( ( rule__BeliefSet__BeliefSetAssignment_3 ) ) ( ( rule__BeliefSet__BeliefSetAssignment_3 )* ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3847:1: ( ( ( rule__BeliefSet__BeliefSetAssignment_3 ) ) ( ( rule__BeliefSet__BeliefSetAssignment_3 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3848:1: ( ( rule__BeliefSet__BeliefSetAssignment_3 ) ) ( ( rule__BeliefSet__BeliefSetAssignment_3 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3848:1: ( ( rule__BeliefSet__BeliefSetAssignment_3 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3849:1: ( rule__BeliefSet__BeliefSetAssignment_3 )
            {
             before(grammarAccess.getBeliefSetAccess().getBeliefSetAssignment_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3850:1: ( rule__BeliefSet__BeliefSetAssignment_3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3850:2: rule__BeliefSet__BeliefSetAssignment_3
            {
            pushFollow(FOLLOW_rule__BeliefSet__BeliefSetAssignment_3_in_rule__BeliefSet__Group__3__Impl7802);
            rule__BeliefSet__BeliefSetAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBeliefSetAccess().getBeliefSetAssignment_3()); 

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3853:1: ( ( rule__BeliefSet__BeliefSetAssignment_3 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3854:1: ( rule__BeliefSet__BeliefSetAssignment_3 )*
            {
             before(grammarAccess.getBeliefSetAccess().getBeliefSetAssignment_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3855:1: ( rule__BeliefSet__BeliefSetAssignment_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==34) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3855:2: rule__BeliefSet__BeliefSetAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__BeliefSet__BeliefSetAssignment_3_in_rule__BeliefSet__Group__3__Impl7814);
            	    rule__BeliefSet__BeliefSetAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getBeliefSetAccess().getBeliefSetAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeliefSet__Group__3__Impl"


    // $ANTLR start "rule__BeliefSet__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3866:1: rule__BeliefSet__Group__4 : rule__BeliefSet__Group__4__Impl ;
    public final void rule__BeliefSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3870:1: ( rule__BeliefSet__Group__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3871:2: rule__BeliefSet__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__BeliefSet__Group__4__Impl_in_rule__BeliefSet__Group__47847);
            rule__BeliefSet__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeliefSet__Group__4"


    // $ANTLR start "rule__BeliefSet__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3877:1: rule__BeliefSet__Group__4__Impl : ( '}' ) ;
    public final void rule__BeliefSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3881:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3882:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3882:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3883:1: '}'
            {
             before(grammarAccess.getBeliefSetAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__BeliefSet__Group__4__Impl7875); 
             after(grammarAccess.getBeliefSetAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeliefSet__Group__4__Impl"


    // $ANTLR start "rule__Belief__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3906:1: rule__Belief__Group__0 : rule__Belief__Group__0__Impl rule__Belief__Group__1 ;
    public final void rule__Belief__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3910:1: ( rule__Belief__Group__0__Impl rule__Belief__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3911:2: rule__Belief__Group__0__Impl rule__Belief__Group__1
            {
            pushFollow(FOLLOW_rule__Belief__Group__0__Impl_in_rule__Belief__Group__07916);
            rule__Belief__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Belief__Group__1_in_rule__Belief__Group__07919);
            rule__Belief__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Belief__Group__0"


    // $ANTLR start "rule__Belief__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3918:1: rule__Belief__Group__0__Impl : ( 'Belief' ) ;
    public final void rule__Belief__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3922:1: ( ( 'Belief' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3923:1: ( 'Belief' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3923:1: ( 'Belief' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3924:1: 'Belief'
            {
             before(grammarAccess.getBeliefAccess().getBeliefKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Belief__Group__0__Impl7947); 
             after(grammarAccess.getBeliefAccess().getBeliefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Belief__Group__0__Impl"


    // $ANTLR start "rule__Belief__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3937:1: rule__Belief__Group__1 : rule__Belief__Group__1__Impl rule__Belief__Group__2 ;
    public final void rule__Belief__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3941:1: ( rule__Belief__Group__1__Impl rule__Belief__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3942:2: rule__Belief__Group__1__Impl rule__Belief__Group__2
            {
            pushFollow(FOLLOW_rule__Belief__Group__1__Impl_in_rule__Belief__Group__17978);
            rule__Belief__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Belief__Group__2_in_rule__Belief__Group__17981);
            rule__Belief__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Belief__Group__1"


    // $ANTLR start "rule__Belief__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3949:1: rule__Belief__Group__1__Impl : ( ( rule__Belief__NameAssignment_1 ) ) ;
    public final void rule__Belief__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3953:1: ( ( ( rule__Belief__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3954:1: ( ( rule__Belief__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3954:1: ( ( rule__Belief__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3955:1: ( rule__Belief__NameAssignment_1 )
            {
             before(grammarAccess.getBeliefAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3956:1: ( rule__Belief__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3956:2: rule__Belief__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Belief__NameAssignment_1_in_rule__Belief__Group__1__Impl8008);
            rule__Belief__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBeliefAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Belief__Group__1__Impl"


    // $ANTLR start "rule__Belief__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3966:1: rule__Belief__Group__2 : rule__Belief__Group__2__Impl rule__Belief__Group__3 ;
    public final void rule__Belief__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3970:1: ( rule__Belief__Group__2__Impl rule__Belief__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3971:2: rule__Belief__Group__2__Impl rule__Belief__Group__3
            {
            pushFollow(FOLLOW_rule__Belief__Group__2__Impl_in_rule__Belief__Group__28038);
            rule__Belief__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Belief__Group__3_in_rule__Belief__Group__28041);
            rule__Belief__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Belief__Group__2"


    // $ANTLR start "rule__Belief__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3978:1: rule__Belief__Group__2__Impl : ( '{' ) ;
    public final void rule__Belief__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3982:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3983:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3983:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3984:1: '{'
            {
             before(grammarAccess.getBeliefAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Belief__Group__2__Impl8069); 
             after(grammarAccess.getBeliefAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Belief__Group__2__Impl"


    // $ANTLR start "rule__Belief__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3997:1: rule__Belief__Group__3 : rule__Belief__Group__3__Impl rule__Belief__Group__4 ;
    public final void rule__Belief__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4001:1: ( rule__Belief__Group__3__Impl rule__Belief__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4002:2: rule__Belief__Group__3__Impl rule__Belief__Group__4
            {
            pushFollow(FOLLOW_rule__Belief__Group__3__Impl_in_rule__Belief__Group__38100);
            rule__Belief__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Belief__Group__4_in_rule__Belief__Group__38103);
            rule__Belief__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Belief__Group__3"


    // $ANTLR start "rule__Belief__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4009:1: rule__Belief__Group__3__Impl : ( ( rule__Belief__FactAssignment_3 )* ) ;
    public final void rule__Belief__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4013:1: ( ( ( rule__Belief__FactAssignment_3 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4014:1: ( ( rule__Belief__FactAssignment_3 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4014:1: ( ( rule__Belief__FactAssignment_3 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4015:1: ( rule__Belief__FactAssignment_3 )*
            {
             before(grammarAccess.getBeliefAccess().getFactAssignment_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4016:1: ( rule__Belief__FactAssignment_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==35) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4016:2: rule__Belief__FactAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Belief__FactAssignment_3_in_rule__Belief__Group__3__Impl8130);
            	    rule__Belief__FactAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getBeliefAccess().getFactAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Belief__Group__3__Impl"


    // $ANTLR start "rule__Belief__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4026:1: rule__Belief__Group__4 : rule__Belief__Group__4__Impl ;
    public final void rule__Belief__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4030:1: ( rule__Belief__Group__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4031:2: rule__Belief__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Belief__Group__4__Impl_in_rule__Belief__Group__48161);
            rule__Belief__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Belief__Group__4"


    // $ANTLR start "rule__Belief__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4037:1: rule__Belief__Group__4__Impl : ( '}' ) ;
    public final void rule__Belief__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4041:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4042:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4042:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4043:1: '}'
            {
             before(grammarAccess.getBeliefAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Belief__Group__4__Impl8189); 
             after(grammarAccess.getBeliefAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Belief__Group__4__Impl"


    // $ANTLR start "rule__Fact__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4066:1: rule__Fact__Group__0 : rule__Fact__Group__0__Impl rule__Fact__Group__1 ;
    public final void rule__Fact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4070:1: ( rule__Fact__Group__0__Impl rule__Fact__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4071:2: rule__Fact__Group__0__Impl rule__Fact__Group__1
            {
            pushFollow(FOLLOW_rule__Fact__Group__0__Impl_in_rule__Fact__Group__08230);
            rule__Fact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fact__Group__1_in_rule__Fact__Group__08233);
            rule__Fact__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__0"


    // $ANTLR start "rule__Fact__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4078:1: rule__Fact__Group__0__Impl : ( 'Fact {' ) ;
    public final void rule__Fact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4082:1: ( ( 'Fact {' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4083:1: ( 'Fact {' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4083:1: ( 'Fact {' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4084:1: 'Fact {'
            {
             before(grammarAccess.getFactAccess().getFactKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Fact__Group__0__Impl8261); 
             after(grammarAccess.getFactAccess().getFactKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__0__Impl"


    // $ANTLR start "rule__Fact__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4097:1: rule__Fact__Group__1 : rule__Fact__Group__1__Impl rule__Fact__Group__2 ;
    public final void rule__Fact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4101:1: ( rule__Fact__Group__1__Impl rule__Fact__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4102:2: rule__Fact__Group__1__Impl rule__Fact__Group__2
            {
            pushFollow(FOLLOW_rule__Fact__Group__1__Impl_in_rule__Fact__Group__18292);
            rule__Fact__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fact__Group__2_in_rule__Fact__Group__18295);
            rule__Fact__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__1"


    // $ANTLR start "rule__Fact__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4109:1: rule__Fact__Group__1__Impl : ( ( rule__Fact__StatementsAssignment_1 ) ) ;
    public final void rule__Fact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4113:1: ( ( ( rule__Fact__StatementsAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4114:1: ( ( rule__Fact__StatementsAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4114:1: ( ( rule__Fact__StatementsAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4115:1: ( rule__Fact__StatementsAssignment_1 )
            {
             before(grammarAccess.getFactAccess().getStatementsAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4116:1: ( rule__Fact__StatementsAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4116:2: rule__Fact__StatementsAssignment_1
            {
            pushFollow(FOLLOW_rule__Fact__StatementsAssignment_1_in_rule__Fact__Group__1__Impl8322);
            rule__Fact__StatementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFactAccess().getStatementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__1__Impl"


    // $ANTLR start "rule__Fact__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4126:1: rule__Fact__Group__2 : rule__Fact__Group__2__Impl rule__Fact__Group__3 ;
    public final void rule__Fact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4130:1: ( rule__Fact__Group__2__Impl rule__Fact__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4131:2: rule__Fact__Group__2__Impl rule__Fact__Group__3
            {
            pushFollow(FOLLOW_rule__Fact__Group__2__Impl_in_rule__Fact__Group__28352);
            rule__Fact__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fact__Group__3_in_rule__Fact__Group__28355);
            rule__Fact__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__2"


    // $ANTLR start "rule__Fact__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4138:1: rule__Fact__Group__2__Impl : ( RULE_STRING ) ;
    public final void rule__Fact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4142:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4143:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4143:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4144:1: RULE_STRING
            {
             before(grammarAccess.getFactAccess().getSTRINGTerminalRuleCall_2()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Fact__Group__2__Impl8382); 
             after(grammarAccess.getFactAccess().getSTRINGTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__2__Impl"


    // $ANTLR start "rule__Fact__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4155:1: rule__Fact__Group__3 : rule__Fact__Group__3__Impl ;
    public final void rule__Fact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4159:1: ( rule__Fact__Group__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4160:2: rule__Fact__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Fact__Group__3__Impl_in_rule__Fact__Group__38411);
            rule__Fact__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__3"


    // $ANTLR start "rule__Fact__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4166:1: rule__Fact__Group__3__Impl : ( '}' ) ;
    public final void rule__Fact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4170:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4171:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4171:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4172:1: '}'
            {
             before(grammarAccess.getFactAccess().getRightCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__Fact__Group__3__Impl8439); 
             after(grammarAccess.getFactAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__3__Impl"


    // $ANTLR start "rule__Achieve__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4194:1: rule__Achieve__Group__0 : rule__Achieve__Group__0__Impl rule__Achieve__Group__1 ;
    public final void rule__Achieve__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4198:1: ( rule__Achieve__Group__0__Impl rule__Achieve__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4199:2: rule__Achieve__Group__0__Impl rule__Achieve__Group__1
            {
            pushFollow(FOLLOW_rule__Achieve__Group__0__Impl_in_rule__Achieve__Group__08479);
            rule__Achieve__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Achieve__Group__1_in_rule__Achieve__Group__08482);
            rule__Achieve__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Achieve__Group__0"


    // $ANTLR start "rule__Achieve__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4206:1: rule__Achieve__Group__0__Impl : ( 'Achieve' ) ;
    public final void rule__Achieve__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4210:1: ( ( 'Achieve' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4211:1: ( 'Achieve' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4211:1: ( 'Achieve' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4212:1: 'Achieve'
            {
             before(grammarAccess.getAchieveAccess().getAchieveKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Achieve__Group__0__Impl8510); 
             after(grammarAccess.getAchieveAccess().getAchieveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Achieve__Group__0__Impl"


    // $ANTLR start "rule__Achieve__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4225:1: rule__Achieve__Group__1 : rule__Achieve__Group__1__Impl rule__Achieve__Group__2 ;
    public final void rule__Achieve__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4229:1: ( rule__Achieve__Group__1__Impl rule__Achieve__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4230:2: rule__Achieve__Group__1__Impl rule__Achieve__Group__2
            {
            pushFollow(FOLLOW_rule__Achieve__Group__1__Impl_in_rule__Achieve__Group__18541);
            rule__Achieve__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Achieve__Group__2_in_rule__Achieve__Group__18544);
            rule__Achieve__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Achieve__Group__1"


    // $ANTLR start "rule__Achieve__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4237:1: rule__Achieve__Group__1__Impl : ( ( rule__Achieve__NameAssignment_1 ) ) ;
    public final void rule__Achieve__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4241:1: ( ( ( rule__Achieve__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4242:1: ( ( rule__Achieve__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4242:1: ( ( rule__Achieve__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4243:1: ( rule__Achieve__NameAssignment_1 )
            {
             before(grammarAccess.getAchieveAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4244:1: ( rule__Achieve__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4244:2: rule__Achieve__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Achieve__NameAssignment_1_in_rule__Achieve__Group__1__Impl8571);
            rule__Achieve__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAchieveAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Achieve__Group__1__Impl"


    // $ANTLR start "rule__Achieve__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4254:1: rule__Achieve__Group__2 : rule__Achieve__Group__2__Impl rule__Achieve__Group__3 ;
    public final void rule__Achieve__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4258:1: ( rule__Achieve__Group__2__Impl rule__Achieve__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4259:2: rule__Achieve__Group__2__Impl rule__Achieve__Group__3
            {
            pushFollow(FOLLOW_rule__Achieve__Group__2__Impl_in_rule__Achieve__Group__28601);
            rule__Achieve__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Achieve__Group__3_in_rule__Achieve__Group__28604);
            rule__Achieve__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Achieve__Group__2"


    // $ANTLR start "rule__Achieve__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4266:1: rule__Achieve__Group__2__Impl : ( '{' ) ;
    public final void rule__Achieve__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4270:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4271:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4271:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4272:1: '{'
            {
             before(grammarAccess.getAchieveAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Achieve__Group__2__Impl8632); 
             after(grammarAccess.getAchieveAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Achieve__Group__2__Impl"


    // $ANTLR start "rule__Achieve__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4285:1: rule__Achieve__Group__3 : rule__Achieve__Group__3__Impl rule__Achieve__Group__4 ;
    public final void rule__Achieve__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4289:1: ( rule__Achieve__Group__3__Impl rule__Achieve__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4290:2: rule__Achieve__Group__3__Impl rule__Achieve__Group__4
            {
            pushFollow(FOLLOW_rule__Achieve__Group__3__Impl_in_rule__Achieve__Group__38663);
            rule__Achieve__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Achieve__Group__4_in_rule__Achieve__Group__38666);
            rule__Achieve__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Achieve__Group__3"


    // $ANTLR start "rule__Achieve__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4297:1: rule__Achieve__Group__3__Impl : ( ( rule__Achieve__ConditionAssignment_3 ) ) ;
    public final void rule__Achieve__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4301:1: ( ( ( rule__Achieve__ConditionAssignment_3 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4302:1: ( ( rule__Achieve__ConditionAssignment_3 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4302:1: ( ( rule__Achieve__ConditionAssignment_3 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4303:1: ( rule__Achieve__ConditionAssignment_3 )
            {
             before(grammarAccess.getAchieveAccess().getConditionAssignment_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4304:1: ( rule__Achieve__ConditionAssignment_3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4304:2: rule__Achieve__ConditionAssignment_3
            {
            pushFollow(FOLLOW_rule__Achieve__ConditionAssignment_3_in_rule__Achieve__Group__3__Impl8693);
            rule__Achieve__ConditionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAchieveAccess().getConditionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Achieve__Group__3__Impl"


    // $ANTLR start "rule__Achieve__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4314:1: rule__Achieve__Group__4 : rule__Achieve__Group__4__Impl ;
    public final void rule__Achieve__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4318:1: ( rule__Achieve__Group__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4319:2: rule__Achieve__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Achieve__Group__4__Impl_in_rule__Achieve__Group__48723);
            rule__Achieve__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Achieve__Group__4"


    // $ANTLR start "rule__Achieve__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4325:1: rule__Achieve__Group__4__Impl : ( '}' ) ;
    public final void rule__Achieve__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4329:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4330:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4330:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4331:1: '}'
            {
             before(grammarAccess.getAchieveAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Achieve__Group__4__Impl8751); 
             after(grammarAccess.getAchieveAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Achieve__Group__4__Impl"


    // $ANTLR start "rule__Query__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4354:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4358:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4359:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_rule__Query__Group__0__Impl_in_rule__Query__Group__08792);
            rule__Query__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Query__Group__1_in_rule__Query__Group__08795);
            rule__Query__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0"


    // $ANTLR start "rule__Query__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4366:1: rule__Query__Group__0__Impl : ( 'Query' ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4370:1: ( ( 'Query' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4371:1: ( 'Query' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4371:1: ( 'Query' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4372:1: 'Query'
            {
             before(grammarAccess.getQueryAccess().getQueryKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Query__Group__0__Impl8823); 
             after(grammarAccess.getQueryAccess().getQueryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0__Impl"


    // $ANTLR start "rule__Query__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4385:1: rule__Query__Group__1 : rule__Query__Group__1__Impl rule__Query__Group__2 ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4389:1: ( rule__Query__Group__1__Impl rule__Query__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4390:2: rule__Query__Group__1__Impl rule__Query__Group__2
            {
            pushFollow(FOLLOW_rule__Query__Group__1__Impl_in_rule__Query__Group__18854);
            rule__Query__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Query__Group__2_in_rule__Query__Group__18857);
            rule__Query__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__1"


    // $ANTLR start "rule__Query__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4397:1: rule__Query__Group__1__Impl : ( ( rule__Query__NameAssignment_1 ) ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4401:1: ( ( ( rule__Query__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4402:1: ( ( rule__Query__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4402:1: ( ( rule__Query__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4403:1: ( rule__Query__NameAssignment_1 )
            {
             before(grammarAccess.getQueryAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4404:1: ( rule__Query__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4404:2: rule__Query__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Query__NameAssignment_1_in_rule__Query__Group__1__Impl8884);
            rule__Query__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__1__Impl"


    // $ANTLR start "rule__Query__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4414:1: rule__Query__Group__2 : rule__Query__Group__2__Impl rule__Query__Group__3 ;
    public final void rule__Query__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4418:1: ( rule__Query__Group__2__Impl rule__Query__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4419:2: rule__Query__Group__2__Impl rule__Query__Group__3
            {
            pushFollow(FOLLOW_rule__Query__Group__2__Impl_in_rule__Query__Group__28914);
            rule__Query__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Query__Group__3_in_rule__Query__Group__28917);
            rule__Query__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__2"


    // $ANTLR start "rule__Query__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4426:1: rule__Query__Group__2__Impl : ( '{' ) ;
    public final void rule__Query__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4430:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4431:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4431:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4432:1: '{'
            {
             before(grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Query__Group__2__Impl8945); 
             after(grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__2__Impl"


    // $ANTLR start "rule__Query__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4445:1: rule__Query__Group__3 : rule__Query__Group__3__Impl rule__Query__Group__4 ;
    public final void rule__Query__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4449:1: ( rule__Query__Group__3__Impl rule__Query__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4450:2: rule__Query__Group__3__Impl rule__Query__Group__4
            {
            pushFollow(FOLLOW_rule__Query__Group__3__Impl_in_rule__Query__Group__38976);
            rule__Query__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Query__Group__4_in_rule__Query__Group__38979);
            rule__Query__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__3"


    // $ANTLR start "rule__Query__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4457:1: rule__Query__Group__3__Impl : ( ( rule__Query__ConditionAssignment_3 ) ) ;
    public final void rule__Query__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4461:1: ( ( ( rule__Query__ConditionAssignment_3 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4462:1: ( ( rule__Query__ConditionAssignment_3 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4462:1: ( ( rule__Query__ConditionAssignment_3 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4463:1: ( rule__Query__ConditionAssignment_3 )
            {
             before(grammarAccess.getQueryAccess().getConditionAssignment_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4464:1: ( rule__Query__ConditionAssignment_3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4464:2: rule__Query__ConditionAssignment_3
            {
            pushFollow(FOLLOW_rule__Query__ConditionAssignment_3_in_rule__Query__Group__3__Impl9006);
            rule__Query__ConditionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getConditionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__3__Impl"


    // $ANTLR start "rule__Query__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4474:1: rule__Query__Group__4 : rule__Query__Group__4__Impl rule__Query__Group__5 ;
    public final void rule__Query__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4478:1: ( rule__Query__Group__4__Impl rule__Query__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4479:2: rule__Query__Group__4__Impl rule__Query__Group__5
            {
            pushFollow(FOLLOW_rule__Query__Group__4__Impl_in_rule__Query__Group__49036);
            rule__Query__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Query__Group__5_in_rule__Query__Group__49039);
            rule__Query__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__4"


    // $ANTLR start "rule__Query__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4486:1: rule__Query__Group__4__Impl : ( ( rule__Query__ResultAssignment_4 ) ) ;
    public final void rule__Query__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4490:1: ( ( ( rule__Query__ResultAssignment_4 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4491:1: ( ( rule__Query__ResultAssignment_4 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4491:1: ( ( rule__Query__ResultAssignment_4 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4492:1: ( rule__Query__ResultAssignment_4 )
            {
             before(grammarAccess.getQueryAccess().getResultAssignment_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4493:1: ( rule__Query__ResultAssignment_4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4493:2: rule__Query__ResultAssignment_4
            {
            pushFollow(FOLLOW_rule__Query__ResultAssignment_4_in_rule__Query__Group__4__Impl9066);
            rule__Query__ResultAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getResultAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__4__Impl"


    // $ANTLR start "rule__Query__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4503:1: rule__Query__Group__5 : rule__Query__Group__5__Impl ;
    public final void rule__Query__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4507:1: ( rule__Query__Group__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4508:2: rule__Query__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Query__Group__5__Impl_in_rule__Query__Group__59096);
            rule__Query__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__5"


    // $ANTLR start "rule__Query__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4514:1: rule__Query__Group__5__Impl : ( '}' ) ;
    public final void rule__Query__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4518:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4519:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4519:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4520:1: '}'
            {
             before(grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__Query__Group__5__Impl9124); 
             after(grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__5__Impl"


    // $ANTLR start "rule__Maintain__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4545:1: rule__Maintain__Group__0 : rule__Maintain__Group__0__Impl rule__Maintain__Group__1 ;
    public final void rule__Maintain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4549:1: ( rule__Maintain__Group__0__Impl rule__Maintain__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4550:2: rule__Maintain__Group__0__Impl rule__Maintain__Group__1
            {
            pushFollow(FOLLOW_rule__Maintain__Group__0__Impl_in_rule__Maintain__Group__09167);
            rule__Maintain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Maintain__Group__1_in_rule__Maintain__Group__09170);
            rule__Maintain__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Maintain__Group__0"


    // $ANTLR start "rule__Maintain__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4557:1: rule__Maintain__Group__0__Impl : ( 'Maintain' ) ;
    public final void rule__Maintain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4561:1: ( ( 'Maintain' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4562:1: ( 'Maintain' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4562:1: ( 'Maintain' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4563:1: 'Maintain'
            {
             before(grammarAccess.getMaintainAccess().getMaintainKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Maintain__Group__0__Impl9198); 
             after(grammarAccess.getMaintainAccess().getMaintainKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Maintain__Group__0__Impl"


    // $ANTLR start "rule__Maintain__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4576:1: rule__Maintain__Group__1 : rule__Maintain__Group__1__Impl rule__Maintain__Group__2 ;
    public final void rule__Maintain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4580:1: ( rule__Maintain__Group__1__Impl rule__Maintain__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4581:2: rule__Maintain__Group__1__Impl rule__Maintain__Group__2
            {
            pushFollow(FOLLOW_rule__Maintain__Group__1__Impl_in_rule__Maintain__Group__19229);
            rule__Maintain__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Maintain__Group__2_in_rule__Maintain__Group__19232);
            rule__Maintain__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Maintain__Group__1"


    // $ANTLR start "rule__Maintain__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4588:1: rule__Maintain__Group__1__Impl : ( ( rule__Maintain__NameAssignment_1 ) ) ;
    public final void rule__Maintain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4592:1: ( ( ( rule__Maintain__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4593:1: ( ( rule__Maintain__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4593:1: ( ( rule__Maintain__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4594:1: ( rule__Maintain__NameAssignment_1 )
            {
             before(grammarAccess.getMaintainAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4595:1: ( rule__Maintain__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4595:2: rule__Maintain__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Maintain__NameAssignment_1_in_rule__Maintain__Group__1__Impl9259);
            rule__Maintain__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMaintainAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Maintain__Group__1__Impl"


    // $ANTLR start "rule__Maintain__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4605:1: rule__Maintain__Group__2 : rule__Maintain__Group__2__Impl rule__Maintain__Group__3 ;
    public final void rule__Maintain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4609:1: ( rule__Maintain__Group__2__Impl rule__Maintain__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4610:2: rule__Maintain__Group__2__Impl rule__Maintain__Group__3
            {
            pushFollow(FOLLOW_rule__Maintain__Group__2__Impl_in_rule__Maintain__Group__29289);
            rule__Maintain__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Maintain__Group__3_in_rule__Maintain__Group__29292);
            rule__Maintain__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Maintain__Group__2"


    // $ANTLR start "rule__Maintain__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4617:1: rule__Maintain__Group__2__Impl : ( '{' ) ;
    public final void rule__Maintain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4621:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4622:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4622:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4623:1: '{'
            {
             before(grammarAccess.getMaintainAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Maintain__Group__2__Impl9320); 
             after(grammarAccess.getMaintainAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Maintain__Group__2__Impl"


    // $ANTLR start "rule__Maintain__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4636:1: rule__Maintain__Group__3 : rule__Maintain__Group__3__Impl rule__Maintain__Group__4 ;
    public final void rule__Maintain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4640:1: ( rule__Maintain__Group__3__Impl rule__Maintain__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4641:2: rule__Maintain__Group__3__Impl rule__Maintain__Group__4
            {
            pushFollow(FOLLOW_rule__Maintain__Group__3__Impl_in_rule__Maintain__Group__39351);
            rule__Maintain__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Maintain__Group__4_in_rule__Maintain__Group__39354);
            rule__Maintain__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Maintain__Group__3"


    // $ANTLR start "rule__Maintain__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4648:1: rule__Maintain__Group__3__Impl : ( ( rule__Maintain__ConditionAssignment_3 ) ) ;
    public final void rule__Maintain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4652:1: ( ( ( rule__Maintain__ConditionAssignment_3 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4653:1: ( ( rule__Maintain__ConditionAssignment_3 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4653:1: ( ( rule__Maintain__ConditionAssignment_3 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4654:1: ( rule__Maintain__ConditionAssignment_3 )
            {
             before(grammarAccess.getMaintainAccess().getConditionAssignment_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4655:1: ( rule__Maintain__ConditionAssignment_3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4655:2: rule__Maintain__ConditionAssignment_3
            {
            pushFollow(FOLLOW_rule__Maintain__ConditionAssignment_3_in_rule__Maintain__Group__3__Impl9381);
            rule__Maintain__ConditionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMaintainAccess().getConditionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Maintain__Group__3__Impl"


    // $ANTLR start "rule__Maintain__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4665:1: rule__Maintain__Group__4 : rule__Maintain__Group__4__Impl ;
    public final void rule__Maintain__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4669:1: ( rule__Maintain__Group__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4670:2: rule__Maintain__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Maintain__Group__4__Impl_in_rule__Maintain__Group__49411);
            rule__Maintain__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Maintain__Group__4"


    // $ANTLR start "rule__Maintain__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4676:1: rule__Maintain__Group__4__Impl : ( '}' ) ;
    public final void rule__Maintain__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4680:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4681:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4681:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4682:1: '}'
            {
             before(grammarAccess.getMaintainAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Maintain__Group__4__Impl9439); 
             after(grammarAccess.getMaintainAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Maintain__Group__4__Impl"


    // $ANTLR start "rule__Perform__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4705:1: rule__Perform__Group__0 : rule__Perform__Group__0__Impl rule__Perform__Group__1 ;
    public final void rule__Perform__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4709:1: ( rule__Perform__Group__0__Impl rule__Perform__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4710:2: rule__Perform__Group__0__Impl rule__Perform__Group__1
            {
            pushFollow(FOLLOW_rule__Perform__Group__0__Impl_in_rule__Perform__Group__09480);
            rule__Perform__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Perform__Group__1_in_rule__Perform__Group__09483);
            rule__Perform__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perform__Group__0"


    // $ANTLR start "rule__Perform__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4717:1: rule__Perform__Group__0__Impl : ( 'Perform' ) ;
    public final void rule__Perform__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4721:1: ( ( 'Perform' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4722:1: ( 'Perform' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4722:1: ( 'Perform' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4723:1: 'Perform'
            {
             before(grammarAccess.getPerformAccess().getPerformKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Perform__Group__0__Impl9511); 
             after(grammarAccess.getPerformAccess().getPerformKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perform__Group__0__Impl"


    // $ANTLR start "rule__Perform__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4736:1: rule__Perform__Group__1 : rule__Perform__Group__1__Impl rule__Perform__Group__2 ;
    public final void rule__Perform__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4740:1: ( rule__Perform__Group__1__Impl rule__Perform__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4741:2: rule__Perform__Group__1__Impl rule__Perform__Group__2
            {
            pushFollow(FOLLOW_rule__Perform__Group__1__Impl_in_rule__Perform__Group__19542);
            rule__Perform__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Perform__Group__2_in_rule__Perform__Group__19545);
            rule__Perform__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perform__Group__1"


    // $ANTLR start "rule__Perform__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4748:1: rule__Perform__Group__1__Impl : ( ( rule__Perform__NameAssignment_1 ) ) ;
    public final void rule__Perform__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4752:1: ( ( ( rule__Perform__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4753:1: ( ( rule__Perform__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4753:1: ( ( rule__Perform__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4754:1: ( rule__Perform__NameAssignment_1 )
            {
             before(grammarAccess.getPerformAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4755:1: ( rule__Perform__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4755:2: rule__Perform__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Perform__NameAssignment_1_in_rule__Perform__Group__1__Impl9572);
            rule__Perform__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPerformAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perform__Group__1__Impl"


    // $ANTLR start "rule__Perform__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4765:1: rule__Perform__Group__2 : rule__Perform__Group__2__Impl rule__Perform__Group__3 ;
    public final void rule__Perform__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4769:1: ( rule__Perform__Group__2__Impl rule__Perform__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4770:2: rule__Perform__Group__2__Impl rule__Perform__Group__3
            {
            pushFollow(FOLLOW_rule__Perform__Group__2__Impl_in_rule__Perform__Group__29602);
            rule__Perform__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Perform__Group__3_in_rule__Perform__Group__29605);
            rule__Perform__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perform__Group__2"


    // $ANTLR start "rule__Perform__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4777:1: rule__Perform__Group__2__Impl : ( '{' ) ;
    public final void rule__Perform__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4781:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4782:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4782:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4783:1: '{'
            {
             before(grammarAccess.getPerformAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Perform__Group__2__Impl9633); 
             after(grammarAccess.getPerformAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perform__Group__2__Impl"


    // $ANTLR start "rule__Perform__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4796:1: rule__Perform__Group__3 : rule__Perform__Group__3__Impl rule__Perform__Group__4 ;
    public final void rule__Perform__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4800:1: ( rule__Perform__Group__3__Impl rule__Perform__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4801:2: rule__Perform__Group__3__Impl rule__Perform__Group__4
            {
            pushFollow(FOLLOW_rule__Perform__Group__3__Impl_in_rule__Perform__Group__39664);
            rule__Perform__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Perform__Group__4_in_rule__Perform__Group__39667);
            rule__Perform__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perform__Group__3"


    // $ANTLR start "rule__Perform__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4808:1: rule__Perform__Group__3__Impl : ( ( rule__Perform__ConditionAssignment_3 ) ) ;
    public final void rule__Perform__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4812:1: ( ( ( rule__Perform__ConditionAssignment_3 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4813:1: ( ( rule__Perform__ConditionAssignment_3 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4813:1: ( ( rule__Perform__ConditionAssignment_3 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4814:1: ( rule__Perform__ConditionAssignment_3 )
            {
             before(grammarAccess.getPerformAccess().getConditionAssignment_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4815:1: ( rule__Perform__ConditionAssignment_3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4815:2: rule__Perform__ConditionAssignment_3
            {
            pushFollow(FOLLOW_rule__Perform__ConditionAssignment_3_in_rule__Perform__Group__3__Impl9694);
            rule__Perform__ConditionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPerformAccess().getConditionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perform__Group__3__Impl"


    // $ANTLR start "rule__Perform__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4825:1: rule__Perform__Group__4 : rule__Perform__Group__4__Impl ;
    public final void rule__Perform__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4829:1: ( rule__Perform__Group__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4830:2: rule__Perform__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Perform__Group__4__Impl_in_rule__Perform__Group__49724);
            rule__Perform__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perform__Group__4"


    // $ANTLR start "rule__Perform__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4836:1: rule__Perform__Group__4__Impl : ( '}' ) ;
    public final void rule__Perform__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4840:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4841:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4841:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4842:1: '}'
            {
             before(grammarAccess.getPerformAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Perform__Group__4__Impl9752); 
             after(grammarAccess.getPerformAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perform__Group__4__Impl"


    // $ANTLR start "rule__BDI__AgentsAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4866:1: rule__BDI__AgentsAssignment_1 : ( ruleAgent ) ;
    public final void rule__BDI__AgentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4870:1: ( ( ruleAgent ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4871:1: ( ruleAgent )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4871:1: ( ruleAgent )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4872:1: ruleAgent
            {
             before(grammarAccess.getBDIAccess().getAgentsAgentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAgent_in_rule__BDI__AgentsAssignment_19798);
            ruleAgent();

            state._fsp--;

             after(grammarAccess.getBDIAccess().getAgentsAgentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BDI__AgentsAssignment_1"


    // $ANTLR start "rule__Agent__NameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4881:1: rule__Agent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Agent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4885:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4886:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4886:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4887:1: RULE_ID
            {
             before(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Agent__NameAssignment_19829); 
             after(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__NameAssignment_1"


    // $ANTLR start "rule__Agent__ImportAssignment_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4896:1: rule__Agent__ImportAssignment_3 : ( ruleImports ) ;
    public final void rule__Agent__ImportAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4900:1: ( ( ruleImports ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4901:1: ( ruleImports )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4901:1: ( ruleImports )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4902:1: ruleImports
            {
             before(grammarAccess.getAgentAccess().getImportImportsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleImports_in_rule__Agent__ImportAssignment_39860);
            ruleImports();

            state._fsp--;

             after(grammarAccess.getAgentAccess().getImportImportsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__ImportAssignment_3"


    // $ANTLR start "rule__Agent__EventsAssignment_4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4911:1: rule__Agent__EventsAssignment_4 : ( ruleEvents ) ;
    public final void rule__Agent__EventsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4915:1: ( ( ruleEvents ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4916:1: ( ruleEvents )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4916:1: ( ruleEvents )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4917:1: ruleEvents
            {
             before(grammarAccess.getAgentAccess().getEventsEventsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleEvents_in_rule__Agent__EventsAssignment_49891);
            ruleEvents();

            state._fsp--;

             after(grammarAccess.getAgentAccess().getEventsEventsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__EventsAssignment_4"


    // $ANTLR start "rule__Agent__ParametersAssignment_5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4926:1: rule__Agent__ParametersAssignment_5 : ( ruleParameters ) ;
    public final void rule__Agent__ParametersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4930:1: ( ( ruleParameters ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4931:1: ( ruleParameters )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4931:1: ( ruleParameters )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4932:1: ruleParameters
            {
             before(grammarAccess.getAgentAccess().getParametersParametersParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleParameters_in_rule__Agent__ParametersAssignment_59922);
            ruleParameters();

            state._fsp--;

             after(grammarAccess.getAgentAccess().getParametersParametersParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__ParametersAssignment_5"


    // $ANTLR start "rule__Agent__BeliefsAssignment_6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4941:1: rule__Agent__BeliefsAssignment_6 : ( ruleBeliefSet ) ;
    public final void rule__Agent__BeliefsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4945:1: ( ( ruleBeliefSet ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4946:1: ( ruleBeliefSet )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4946:1: ( ruleBeliefSet )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4947:1: ruleBeliefSet
            {
             before(grammarAccess.getAgentAccess().getBeliefsBeliefSetParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleBeliefSet_in_rule__Agent__BeliefsAssignment_69953);
            ruleBeliefSet();

            state._fsp--;

             after(grammarAccess.getAgentAccess().getBeliefsBeliefSetParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__BeliefsAssignment_6"


    // $ANTLR start "rule__Agent__PlansAssignment_7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4956:1: rule__Agent__PlansAssignment_7 : ( rulePlans ) ;
    public final void rule__Agent__PlansAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4960:1: ( ( rulePlans ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4961:1: ( rulePlans )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4961:1: ( rulePlans )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4962:1: rulePlans
            {
             before(grammarAccess.getAgentAccess().getPlansPlansParserRuleCall_7_0()); 
            pushFollow(FOLLOW_rulePlans_in_rule__Agent__PlansAssignment_79984);
            rulePlans();

            state._fsp--;

             after(grammarAccess.getAgentAccess().getPlansPlansParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__PlansAssignment_7"


    // $ANTLR start "rule__Imports__ImportsAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4971:1: rule__Imports__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__Imports__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4975:1: ( ( ruleImport ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4976:1: ( ruleImport )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4976:1: ( ruleImport )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4977:1: ruleImport
            {
             before(grammarAccess.getImportsAccess().getImportsImportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Imports__ImportsAssignment_110015);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportsAccess().getImportsImportParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__ImportsAssignment_1"


    // $ANTLR start "rule__Events__EventsAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4986:1: rule__Events__EventsAssignment_1 : ( ruleEvent ) ;
    public final void rule__Events__EventsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4990:1: ( ( ruleEvent ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4991:1: ( ruleEvent )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4991:1: ( ruleEvent )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4992:1: ruleEvent
            {
             before(grammarAccess.getEventsAccess().getEventsEventParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Events__EventsAssignment_110046);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventsAccess().getEventsEventParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Events__EventsAssignment_1"


    // $ANTLR start "rule__Event__NameAssignment_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5001:1: rule__Event__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5005:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5006:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5006:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5007:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__NameAssignment_010077); 
             after(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__NameAssignment_0"


    // $ANTLR start "rule__Event__EventTypeAssignment_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5016:1: rule__Event__EventTypeAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Event__EventTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5020:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5021:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5021:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5022:1: RULE_STRING
            {
             before(grammarAccess.getEventAccess().getEventTypeSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Event__EventTypeAssignment_210108); 
             after(grammarAccess.getEventAccess().getEventTypeSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__EventTypeAssignment_2"


    // $ANTLR start "rule__Event__ParameterAssignment_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5031:1: rule__Event__ParameterAssignment_3 : ( ruleParameter ) ;
    public final void rule__Event__ParameterAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5035:1: ( ( ruleParameter ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5036:1: ( ruleParameter )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5036:1: ( ruleParameter )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5037:1: ruleParameter
            {
             before(grammarAccess.getEventAccess().getParameterParameterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Event__ParameterAssignment_310139);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getEventAccess().getParameterParameterParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ParameterAssignment_3"


    // $ANTLR start "rule__Parameters__ParametersAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5046:1: rule__Parameters__ParametersAssignment_1 : ( ruleParameter ) ;
    public final void rule__Parameters__ParametersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5050:1: ( ( ruleParameter ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5051:1: ( ruleParameter )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5051:1: ( ruleParameter )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5052:1: ruleParameter
            {
             before(grammarAccess.getParametersAccess().getParametersParameterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Parameters__ParametersAssignment_110170);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParametersAccess().getParametersParameterParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__ParametersAssignment_1"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5061:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5065:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5066:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5066:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5067:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_010201); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_0"


    // $ANTLR start "rule__Operator__EqualToAssignment_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5076:1: rule__Operator__EqualToAssignment_0 : ( ( '==' ) ) ;
    public final void rule__Operator__EqualToAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5080:1: ( ( ( '==' ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5081:1: ( ( '==' ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5081:1: ( ( '==' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5082:1: ( '==' )
            {
             before(grammarAccess.getOperatorAccess().getEqualToEqualsSignEqualsSignKeyword_0_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5083:1: ( '==' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5084:1: '=='
            {
             before(grammarAccess.getOperatorAccess().getEqualToEqualsSignEqualsSignKeyword_0_0()); 
            match(input,40,FOLLOW_40_in_rule__Operator__EqualToAssignment_010237); 
             after(grammarAccess.getOperatorAccess().getEqualToEqualsSignEqualsSignKeyword_0_0()); 

            }

             after(grammarAccess.getOperatorAccess().getEqualToEqualsSignEqualsSignKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__EqualToAssignment_0"


    // $ANTLR start "rule__Operator__LargerThanAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5099:1: rule__Operator__LargerThanAssignment_1 : ( ( '>' ) ) ;
    public final void rule__Operator__LargerThanAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5103:1: ( ( ( '>' ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5104:1: ( ( '>' ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5104:1: ( ( '>' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5105:1: ( '>' )
            {
             before(grammarAccess.getOperatorAccess().getLargerThanGreaterThanSignKeyword_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5106:1: ( '>' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5107:1: '>'
            {
             before(grammarAccess.getOperatorAccess().getLargerThanGreaterThanSignKeyword_1_0()); 
            match(input,41,FOLLOW_41_in_rule__Operator__LargerThanAssignment_110281); 
             after(grammarAccess.getOperatorAccess().getLargerThanGreaterThanSignKeyword_1_0()); 

            }

             after(grammarAccess.getOperatorAccess().getLargerThanGreaterThanSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__LargerThanAssignment_1"


    // $ANTLR start "rule__Operator__SmallerThanAssignment_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5122:1: rule__Operator__SmallerThanAssignment_2 : ( ( '<' ) ) ;
    public final void rule__Operator__SmallerThanAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5126:1: ( ( ( '<' ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5127:1: ( ( '<' ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5127:1: ( ( '<' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5128:1: ( '<' )
            {
             before(grammarAccess.getOperatorAccess().getSmallerThanLessThanSignKeyword_2_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5129:1: ( '<' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5130:1: '<'
            {
             before(grammarAccess.getOperatorAccess().getSmallerThanLessThanSignKeyword_2_0()); 
            match(input,42,FOLLOW_42_in_rule__Operator__SmallerThanAssignment_210325); 
             after(grammarAccess.getOperatorAccess().getSmallerThanLessThanSignKeyword_2_0()); 

            }

             after(grammarAccess.getOperatorAccess().getSmallerThanLessThanSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__SmallerThanAssignment_2"


    // $ANTLR start "rule__Operator__LargerOrEqualToAssignment_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5145:1: rule__Operator__LargerOrEqualToAssignment_3 : ( ( '>=' ) ) ;
    public final void rule__Operator__LargerOrEqualToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5149:1: ( ( ( '>=' ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5150:1: ( ( '>=' ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5150:1: ( ( '>=' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5151:1: ( '>=' )
            {
             before(grammarAccess.getOperatorAccess().getLargerOrEqualToGreaterThanSignEqualsSignKeyword_3_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5152:1: ( '>=' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5153:1: '>='
            {
             before(grammarAccess.getOperatorAccess().getLargerOrEqualToGreaterThanSignEqualsSignKeyword_3_0()); 
            match(input,43,FOLLOW_43_in_rule__Operator__LargerOrEqualToAssignment_310369); 
             after(grammarAccess.getOperatorAccess().getLargerOrEqualToGreaterThanSignEqualsSignKeyword_3_0()); 

            }

             after(grammarAccess.getOperatorAccess().getLargerOrEqualToGreaterThanSignEqualsSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__LargerOrEqualToAssignment_3"


    // $ANTLR start "rule__Operator__SmallerOrEqualToAssignment_4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5168:1: rule__Operator__SmallerOrEqualToAssignment_4 : ( ( '<=' ) ) ;
    public final void rule__Operator__SmallerOrEqualToAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5172:1: ( ( ( '<=' ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5173:1: ( ( '<=' ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5173:1: ( ( '<=' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5174:1: ( '<=' )
            {
             before(grammarAccess.getOperatorAccess().getSmallerOrEqualToLessThanSignEqualsSignKeyword_4_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5175:1: ( '<=' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5176:1: '<='
            {
             before(grammarAccess.getOperatorAccess().getSmallerOrEqualToLessThanSignEqualsSignKeyword_4_0()); 
            match(input,44,FOLLOW_44_in_rule__Operator__SmallerOrEqualToAssignment_410413); 
             after(grammarAccess.getOperatorAccess().getSmallerOrEqualToLessThanSignEqualsSignKeyword_4_0()); 

            }

             after(grammarAccess.getOperatorAccess().getSmallerOrEqualToLessThanSignEqualsSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__SmallerOrEqualToAssignment_4"


    // $ANTLR start "rule__Operator__NotEqualToAssignment_5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5191:1: rule__Operator__NotEqualToAssignment_5 : ( ( '!=' ) ) ;
    public final void rule__Operator__NotEqualToAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5195:1: ( ( ( '!=' ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5196:1: ( ( '!=' ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5196:1: ( ( '!=' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5197:1: ( '!=' )
            {
             before(grammarAccess.getOperatorAccess().getNotEqualToExclamationMarkEqualsSignKeyword_5_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5198:1: ( '!=' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5199:1: '!='
            {
             before(grammarAccess.getOperatorAccess().getNotEqualToExclamationMarkEqualsSignKeyword_5_0()); 
            match(input,45,FOLLOW_45_in_rule__Operator__NotEqualToAssignment_510457); 
             after(grammarAccess.getOperatorAccess().getNotEqualToExclamationMarkEqualsSignKeyword_5_0()); 

            }

             after(grammarAccess.getOperatorAccess().getNotEqualToExclamationMarkEqualsSignKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__NotEqualToAssignment_5"


    // $ANTLR start "rule__Condition__SubjectiveAssignment_0_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5214:1: rule__Condition__SubjectiveAssignment_0_0 : ( ruleQualifiedName ) ;
    public final void rule__Condition__SubjectiveAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5218:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5219:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5219:1: ( ruleQualifiedName )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5220:1: ruleQualifiedName
            {
             before(grammarAccess.getConditionAccess().getSubjectiveQualifiedNameParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Condition__SubjectiveAssignment_0_010496);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getSubjectiveQualifiedNameParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__SubjectiveAssignment_0_0"


    // $ANTLR start "rule__Condition__OperatorAssignment_0_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5229:1: rule__Condition__OperatorAssignment_0_1 : ( ruleOperator ) ;
    public final void rule__Condition__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5233:1: ( ( ruleOperator ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5234:1: ( ruleOperator )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5234:1: ( ruleOperator )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5235:1: ruleOperator
            {
             before(grammarAccess.getConditionAccess().getOperatorOperatorParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleOperator_in_rule__Condition__OperatorAssignment_0_110527);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getOperatorOperatorParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__OperatorAssignment_0_1"


    // $ANTLR start "rule__Condition__ObjectiveAssignment_0_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5244:1: rule__Condition__ObjectiveAssignment_0_2 : ( ruleExpression ) ;
    public final void rule__Condition__ObjectiveAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5248:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5249:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5249:1: ( ruleExpression )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5250:1: ruleExpression
            {
             before(grammarAccess.getConditionAccess().getObjectiveExpressionParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Condition__ObjectiveAssignment_0_210558);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getObjectiveExpressionParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ObjectiveAssignment_0_2"


    // $ANTLR start "rule__Condition__AndAssignment_1_0_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5259:1: rule__Condition__AndAssignment_1_0_0 : ( ( 'and' ) ) ;
    public final void rule__Condition__AndAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5263:1: ( ( ( 'and' ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5264:1: ( ( 'and' ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5264:1: ( ( 'and' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5265:1: ( 'and' )
            {
             before(grammarAccess.getConditionAccess().getAndAndKeyword_1_0_0_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5266:1: ( 'and' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5267:1: 'and'
            {
             before(grammarAccess.getConditionAccess().getAndAndKeyword_1_0_0_0()); 
            match(input,46,FOLLOW_46_in_rule__Condition__AndAssignment_1_0_010594); 
             after(grammarAccess.getConditionAccess().getAndAndKeyword_1_0_0_0()); 

            }

             after(grammarAccess.getConditionAccess().getAndAndKeyword_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__AndAssignment_1_0_0"


    // $ANTLR start "rule__Condition__OrAssignment_1_0_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5282:1: rule__Condition__OrAssignment_1_0_1 : ( ( 'or' ) ) ;
    public final void rule__Condition__OrAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5286:1: ( ( ( 'or' ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5287:1: ( ( 'or' ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5287:1: ( ( 'or' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5288:1: ( 'or' )
            {
             before(grammarAccess.getConditionAccess().getOrOrKeyword_1_0_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5289:1: ( 'or' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5290:1: 'or'
            {
             before(grammarAccess.getConditionAccess().getOrOrKeyword_1_0_1_0()); 
            match(input,47,FOLLOW_47_in_rule__Condition__OrAssignment_1_0_110638); 
             after(grammarAccess.getConditionAccess().getOrOrKeyword_1_0_1_0()); 

            }

             after(grammarAccess.getConditionAccess().getOrOrKeyword_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__OrAssignment_1_0_1"


    // $ANTLR start "rule__Condition__CompareConditionAssignment_1_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5305:1: rule__Condition__CompareConditionAssignment_1_1 : ( ruleCondition ) ;
    public final void rule__Condition__CompareConditionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5309:1: ( ( ruleCondition ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5310:1: ( ruleCondition )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5310:1: ( ruleCondition )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5311:1: ruleCondition
            {
             before(grammarAccess.getConditionAccess().getCompareConditionConditionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__Condition__CompareConditionAssignment_1_110677);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getCompareConditionConditionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__CompareConditionAssignment_1_1"


    // $ANTLR start "rule__Expression__RightAssignment_1_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5320:1: rule__Expression__RightAssignment_1_1 : ( ruleTerm ) ;
    public final void rule__Expression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5324:1: ( ( ruleTerm ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5325:1: ( ruleTerm )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5325:1: ( ruleTerm )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5326:1: ruleTerm
            {
             before(grammarAccess.getExpressionAccess().getRightTermParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__Expression__RightAssignment_1_110708);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightTermParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__RightAssignment_1_1"


    // $ANTLR start "rule__Term__RightAssignment_1_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5335:1: rule__Term__RightAssignment_1_1 : ( ruleFactor ) ;
    public final void rule__Term__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5339:1: ( ( ruleFactor ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5340:1: ( ruleFactor )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5340:1: ( ruleFactor )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5341:1: ruleFactor
            {
             before(grammarAccess.getTermAccess().getRightFactorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleFactor_in_rule__Term__RightAssignment_1_110739);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getTermAccess().getRightFactorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__RightAssignment_1_1"


    // $ANTLR start "rule__Factor__NumberAssignment_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5350:1: rule__Factor__NumberAssignment_0 : ( ruleNUMBER ) ;
    public final void rule__Factor__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5354:1: ( ( ruleNUMBER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5355:1: ( ruleNUMBER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5355:1: ( ruleNUMBER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5356:1: ruleNUMBER
            {
             before(grammarAccess.getFactorAccess().getNumberNUMBERParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNUMBER_in_rule__Factor__NumberAssignment_010770);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getNumberNUMBERParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__NumberAssignment_0"


    // $ANTLR start "rule__Factor__VariableAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5365:1: rule__Factor__VariableAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Factor__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5369:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5370:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5370:1: ( ruleQualifiedName )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5371:1: ruleQualifiedName
            {
             before(grammarAccess.getFactorAccess().getVariableQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Factor__VariableAssignment_110801);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getVariableQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__VariableAssignment_1"


    // $ANTLR start "rule__Factor__StringAssignment_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5380:1: rule__Factor__StringAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Factor__StringAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5384:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5385:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5385:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5386:1: RULE_STRING
            {
             before(grammarAccess.getFactorAccess().getStringSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Factor__StringAssignment_210832); 
             after(grammarAccess.getFactorAccess().getStringSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__StringAssignment_2"


    // $ANTLR start "rule__Factor__BooleanAssignment_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5395:1: rule__Factor__BooleanAssignment_3 : ( RULE_BOOLEAN ) ;
    public final void rule__Factor__BooleanAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5399:1: ( ( RULE_BOOLEAN ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5400:1: ( RULE_BOOLEAN )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5400:1: ( RULE_BOOLEAN )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5401:1: RULE_BOOLEAN
            {
             before(grammarAccess.getFactorAccess().getBooleanBOOLEANTerminalRuleCall_3_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__Factor__BooleanAssignment_310863); 
             after(grammarAccess.getFactorAccess().getBooleanBOOLEANTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__BooleanAssignment_3"


    // $ANTLR start "rule__Factor__ExpressionAssignment_4_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5410:1: rule__Factor__ExpressionAssignment_4_1 : ( ruleExpression ) ;
    public final void rule__Factor__ExpressionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5414:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5415:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5415:1: ( ruleExpression )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5416:1: ruleExpression
            {
             before(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Factor__ExpressionAssignment_4_110894);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__ExpressionAssignment_4_1"


    // $ANTLR start "rule__Plans__PlansAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5425:1: rule__Plans__PlansAssignment_1 : ( rulePlan ) ;
    public final void rule__Plans__PlansAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5429:1: ( ( rulePlan ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5430:1: ( rulePlan )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5430:1: ( rulePlan )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5431:1: rulePlan
            {
             before(grammarAccess.getPlansAccess().getPlansPlanParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePlan_in_rule__Plans__PlansAssignment_110925);
            rulePlan();

            state._fsp--;

             after(grammarAccess.getPlansAccess().getPlansPlanParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plans__PlansAssignment_1"


    // $ANTLR start "rule__Plan__NameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5440:1: rule__Plan__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Plan__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5444:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5445:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5445:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5446:1: RULE_ID
            {
             before(grammarAccess.getPlanAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Plan__NameAssignment_110956); 
             after(grammarAccess.getPlanAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__NameAssignment_1"


    // $ANTLR start "rule__Plan__BodyAssignment_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5455:1: rule__Plan__BodyAssignment_3 : ( ruleBody ) ;
    public final void rule__Plan__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5459:1: ( ( ruleBody ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5460:1: ( ruleBody )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5460:1: ( ruleBody )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5461:1: ruleBody
            {
             before(grammarAccess.getPlanAccess().getBodyBodyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBody_in_rule__Plan__BodyAssignment_310987);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getPlanAccess().getBodyBodyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__BodyAssignment_3"


    // $ANTLR start "rule__Plan__TriggerAssignment_4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5470:1: rule__Plan__TriggerAssignment_4 : ( ruleTrigger ) ;
    public final void rule__Plan__TriggerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5474:1: ( ( ruleTrigger ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5475:1: ( ruleTrigger )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5475:1: ( ruleTrigger )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5476:1: ruleTrigger
            {
             before(grammarAccess.getPlanAccess().getTriggerTriggerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTrigger_in_rule__Plan__TriggerAssignment_411018);
            ruleTrigger();

            state._fsp--;

             after(grammarAccess.getPlanAccess().getTriggerTriggerParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plan__TriggerAssignment_4"


    // $ANTLR start "rule__Trigger__EventAssignment_0_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5485:1: rule__Trigger__EventAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Trigger__EventAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5489:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5490:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5490:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5491:1: ( RULE_ID )
            {
             before(grammarAccess.getTriggerAccess().getEventEventCrossReference_0_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5492:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5493:1: RULE_ID
            {
             before(grammarAccess.getTriggerAccess().getEventEventIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Trigger__EventAssignment_0_111053); 
             after(grammarAccess.getTriggerAccess().getEventEventIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getTriggerAccess().getEventEventCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__EventAssignment_0_1"


    // $ANTLR start "rule__Trigger__GoalAssignment_1_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5504:1: rule__Trigger__GoalAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Trigger__GoalAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5508:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5509:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5509:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5510:1: ( RULE_ID )
            {
             before(grammarAccess.getTriggerAccess().getGoalGoalCrossReference_1_0_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5511:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5512:1: RULE_ID
            {
             before(grammarAccess.getTriggerAccess().getGoalGoalIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Trigger__GoalAssignment_1_011092); 
             after(grammarAccess.getTriggerAccess().getGoalGoalIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getTriggerAccess().getGoalGoalCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__GoalAssignment_1_0"


    // $ANTLR start "rule__BeliefSet__NameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5523:1: rule__BeliefSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BeliefSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5527:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5528:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5528:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5529:1: RULE_ID
            {
             before(grammarAccess.getBeliefSetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BeliefSet__NameAssignment_111127); 
             after(grammarAccess.getBeliefSetAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeliefSet__NameAssignment_1"


    // $ANTLR start "rule__BeliefSet__BeliefSetAssignment_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5538:1: rule__BeliefSet__BeliefSetAssignment_3 : ( ruleBelief ) ;
    public final void rule__BeliefSet__BeliefSetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5542:1: ( ( ruleBelief ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5543:1: ( ruleBelief )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5543:1: ( ruleBelief )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5544:1: ruleBelief
            {
             before(grammarAccess.getBeliefSetAccess().getBeliefSetBeliefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBelief_in_rule__BeliefSet__BeliefSetAssignment_311158);
            ruleBelief();

            state._fsp--;

             after(grammarAccess.getBeliefSetAccess().getBeliefSetBeliefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeliefSet__BeliefSetAssignment_3"


    // $ANTLR start "rule__Belief__NameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5553:1: rule__Belief__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Belief__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5557:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5558:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5558:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5559:1: RULE_ID
            {
             before(grammarAccess.getBeliefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Belief__NameAssignment_111189); 
             after(grammarAccess.getBeliefAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Belief__NameAssignment_1"


    // $ANTLR start "rule__Belief__FactAssignment_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5568:1: rule__Belief__FactAssignment_3 : ( ruleFact ) ;
    public final void rule__Belief__FactAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5572:1: ( ( ruleFact ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5573:1: ( ruleFact )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5573:1: ( ruleFact )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5574:1: ruleFact
            {
             before(grammarAccess.getBeliefAccess().getFactFactParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFact_in_rule__Belief__FactAssignment_311220);
            ruleFact();

            state._fsp--;

             after(grammarAccess.getBeliefAccess().getFactFactParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Belief__FactAssignment_3"


    // $ANTLR start "rule__Fact__StatementsAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5583:1: rule__Fact__StatementsAssignment_1 : ( ruleStatements ) ;
    public final void rule__Fact__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5587:1: ( ( ruleStatements ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5588:1: ( ruleStatements )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5588:1: ( ruleStatements )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5589:1: ruleStatements
            {
             before(grammarAccess.getFactAccess().getStatementsStatementsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleStatements_in_rule__Fact__StatementsAssignment_111251);
            ruleStatements();

            state._fsp--;

             after(grammarAccess.getFactAccess().getStatementsStatementsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__StatementsAssignment_1"


    // $ANTLR start "rule__Statements__StatementsAssignment"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5598:1: rule__Statements__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Statements__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5602:1: ( ( ruleStatement ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5603:1: ( ruleStatement )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5603:1: ( ruleStatement )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5604:1: ruleStatement
            {
             before(grammarAccess.getStatementsAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Statements__StatementsAssignment11282);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementsAccess().getStatementsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__StatementsAssignment"


    // $ANTLR start "rule__Achieve__NameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5614:1: rule__Achieve__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Achieve__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5618:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5619:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5619:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5620:1: RULE_ID
            {
             before(grammarAccess.getAchieveAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Achieve__NameAssignment_111314); 
             after(grammarAccess.getAchieveAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Achieve__NameAssignment_1"


    // $ANTLR start "rule__Achieve__ConditionAssignment_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5629:1: rule__Achieve__ConditionAssignment_3 : ( ruleCondition ) ;
    public final void rule__Achieve__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5633:1: ( ( ruleCondition ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5634:1: ( ruleCondition )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5634:1: ( ruleCondition )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5635:1: ruleCondition
            {
             before(grammarAccess.getAchieveAccess().getConditionConditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__Achieve__ConditionAssignment_311345);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getAchieveAccess().getConditionConditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Achieve__ConditionAssignment_3"


    // $ANTLR start "rule__Query__NameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5644:1: rule__Query__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Query__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5648:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5649:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5649:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5650:1: RULE_ID
            {
             before(grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Query__NameAssignment_111376); 
             after(grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__NameAssignment_1"


    // $ANTLR start "rule__Query__ConditionAssignment_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5659:1: rule__Query__ConditionAssignment_3 : ( ruleCondition ) ;
    public final void rule__Query__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5663:1: ( ( ruleCondition ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5664:1: ( ruleCondition )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5664:1: ( ruleCondition )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5665:1: ruleCondition
            {
             before(grammarAccess.getQueryAccess().getConditionConditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__Query__ConditionAssignment_311407);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getConditionConditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__ConditionAssignment_3"


    // $ANTLR start "rule__Query__ResultAssignment_4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5674:1: rule__Query__ResultAssignment_4 : ( ruleResult ) ;
    public final void rule__Query__ResultAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5678:1: ( ( ruleResult ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5679:1: ( ruleResult )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5679:1: ( ruleResult )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5680:1: ruleResult
            {
             before(grammarAccess.getQueryAccess().getResultResultParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleResult_in_rule__Query__ResultAssignment_411438);
            ruleResult();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getResultResultParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__ResultAssignment_4"


    // $ANTLR start "rule__Maintain__NameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5689:1: rule__Maintain__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Maintain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5693:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5694:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5694:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5695:1: RULE_ID
            {
             before(grammarAccess.getMaintainAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Maintain__NameAssignment_111469); 
             after(grammarAccess.getMaintainAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Maintain__NameAssignment_1"


    // $ANTLR start "rule__Maintain__ConditionAssignment_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5704:1: rule__Maintain__ConditionAssignment_3 : ( ruleCondition ) ;
    public final void rule__Maintain__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5708:1: ( ( ruleCondition ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5709:1: ( ruleCondition )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5709:1: ( ruleCondition )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5710:1: ruleCondition
            {
             before(grammarAccess.getMaintainAccess().getConditionConditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__Maintain__ConditionAssignment_311500);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getMaintainAccess().getConditionConditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Maintain__ConditionAssignment_3"


    // $ANTLR start "rule__Perform__NameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5719:1: rule__Perform__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Perform__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5723:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5724:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5724:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5725:1: RULE_ID
            {
             before(grammarAccess.getPerformAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Perform__NameAssignment_111531); 
             after(grammarAccess.getPerformAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perform__NameAssignment_1"


    // $ANTLR start "rule__Perform__ConditionAssignment_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5734:1: rule__Perform__ConditionAssignment_3 : ( ruleCondition ) ;
    public final void rule__Perform__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5738:1: ( ( ruleCondition ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5739:1: ( ruleCondition )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5739:1: ( ruleCondition )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5740:1: ruleCondition
            {
             before(grammarAccess.getPerformAccess().getConditionConditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__Perform__ConditionAssignment_311562);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getPerformAccess().getConditionConditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perform__ConditionAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleBDI_in_entryRuleBDI61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBDI68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BDI__Group__0_in_ruleBDI94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAgent_in_entryRuleAgent121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAgent128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__Group__0_in_ruleAgent154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImports_in_entryRuleImports181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImports188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Imports__Group__0_in_ruleImports214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilename_in_entryRuleFilename301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilename308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFilename334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvents_in_entryRuleEvents360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvents367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Events__Group__0_in_ruleEvents393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0_in_ruleEvent453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameters_in_entryRuleParameters480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameters487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameters__Group__0_in_ruleParameters513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_ruleValue633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_entryRuleCode659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCode666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Code__Alternatives_in_ruleCode692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperator726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Alternatives_in_ruleOperator752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0_in_ruleCondition812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0_in_ruleExpression872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0_in_ruleTerm932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactor966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Alternatives_in_ruleFactor992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER1019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlans_in_entryRulePlans1138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlans1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plans__Group__0_in_rulePlans1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_in_entryRulePlan1198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlan1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__0_in_rulePlan1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody1258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBody1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrigger_in_entryRuleTrigger1317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrigger1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__Alternatives_in_ruleTrigger1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeliefSet_in_entryRuleBeliefSet1377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBeliefSet1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BeliefSet__Group__0_in_ruleBeliefSet1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_entryRuleBelief1437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBelief1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Belief__Group__0_in_ruleBelief1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFact_in_entryRuleFact1497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFact1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group__0_in_ruleFact1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatements_in_entryRuleStatements1557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatements1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statements__StatementsAssignment_in_ruleStatements1592 = new BitSet(new long[]{0x00000000000001F2L});
    public static final BitSet FOLLOW_rule__Statements__StatementsAssignment_in_ruleStatements1604 = new BitSet(new long[]{0x00000000000001F2L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement1634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_ruleStatement1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal1695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Alternatives_in_ruleGoal1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAchieve_in_entryRuleAchieve1755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAchieve1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Achieve__Group__0_in_ruleAchieve1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery1815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__0_in_ruleQuery1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaintain_in_entryRuleMaintain1875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaintain1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Maintain__Group__0_in_ruleMaintain1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePerform_in_entryRulePerform1935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePerform1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Perform__Group__0_in_rulePerform1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResult_in_entryRuleResult1995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResult2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResult2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Code__Alternatives2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Code__Alternatives2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__Code__Alternatives2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_rule__Code__Alternatives2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NETWORK_in_rule__Code__Alternatives2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__EqualToAssignment_0_in_rule__Operator__Alternatives2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__LargerThanAssignment_1_in_rule__Operator__Alternatives2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__SmallerThanAssignment_2_in_rule__Operator__Alternatives2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__LargerOrEqualToAssignment_3_in_rule__Operator__Alternatives2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__SmallerOrEqualToAssignment_4_in_rule__Operator__Alternatives2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__NotEqualToAssignment_5_in_rule__Operator__Alternatives2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__AndAssignment_1_0_0_in_rule__Condition__Alternatives_1_02286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__OrAssignment_1_0_1_in_rule__Condition__Alternatives_1_02304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1_0_0__0_in_rule__Expression__Alternatives_1_02337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1_0_1__0_in_rule__Expression__Alternatives_1_02355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1_0_0__0_in_rule__Term__Alternatives_1_02388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1_0_1__0_in_rule__Term__Alternatives_1_02406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__NumberAssignment_0_in_rule__Factor__Alternatives2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__VariableAssignment_1_in_rule__Factor__Alternatives2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__StringAssignment_2_in_rule__Factor__Alternatives2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__BooleanAssignment_3_in_rule__Factor__Alternatives2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_4__0_in_rule__Factor__Alternatives2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__Group_0__0_in_rule__Trigger__Alternatives2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__Group_1__0_in_rule__Trigger__Alternatives2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAchieve_in_rule__Goal__Alternatives2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_rule__Goal__Alternatives2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaintain_in_rule__Goal__Alternatives2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePerform_in_rule__Goal__Alternatives2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BDI__Group__0__Impl_in_rule__BDI__Group__02676 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__BDI__Group__1_in_rule__BDI__Group__02679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BDI__Group__0__Impl2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BDI__Group__1__Impl_in_rule__BDI__Group__12738 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__BDI__Group__2_in_rule__BDI__Group__12741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BDI__AgentsAssignment_1_in_rule__BDI__Group__1__Impl2770 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__BDI__AgentsAssignment_1_in_rule__BDI__Group__1__Impl2782 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__BDI__Group__2__Impl_in_rule__BDI__Group__22815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BDI__Group__2__Impl2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__Group__0__Impl_in_rule__Agent__Group__02880 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Agent__Group__1_in_rule__Agent__Group__02883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Agent__Group__0__Impl2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__Group__1__Impl_in_rule__Agent__Group__12942 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Agent__Group__2_in_rule__Agent__Group__12945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__NameAssignment_1_in_rule__Agent__Group__1__Impl2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__Group__2__Impl_in_rule__Agent__Group__23002 = new BitSet(new long[]{0x0000000240348000L});
    public static final BitSet FOLLOW_rule__Agent__Group__3_in_rule__Agent__Group__23005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Agent__Group__2__Impl3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__Group__3__Impl_in_rule__Agent__Group__33064 = new BitSet(new long[]{0x0000000240348000L});
    public static final BitSet FOLLOW_rule__Agent__Group__4_in_rule__Agent__Group__33067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__ImportAssignment_3_in_rule__Agent__Group__3__Impl3094 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Agent__Group__4__Impl_in_rule__Agent__Group__43125 = new BitSet(new long[]{0x0000000240348000L});
    public static final BitSet FOLLOW_rule__Agent__Group__5_in_rule__Agent__Group__43128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__EventsAssignment_4_in_rule__Agent__Group__4__Impl3155 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Agent__Group__5__Impl_in_rule__Agent__Group__53186 = new BitSet(new long[]{0x0000000240348000L});
    public static final BitSet FOLLOW_rule__Agent__Group__6_in_rule__Agent__Group__53189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__ParametersAssignment_5_in_rule__Agent__Group__5__Impl3216 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Agent__Group__6__Impl_in_rule__Agent__Group__63247 = new BitSet(new long[]{0x0000000240348000L});
    public static final BitSet FOLLOW_rule__Agent__Group__7_in_rule__Agent__Group__63250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__BeliefsAssignment_6_in_rule__Agent__Group__6__Impl3277 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Agent__Group__7__Impl_in_rule__Agent__Group__73308 = new BitSet(new long[]{0x0000000240348000L});
    public static final BitSet FOLLOW_rule__Agent__Group__8_in_rule__Agent__Group__73311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__PlansAssignment_7_in_rule__Agent__Group__7__Impl3338 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Agent__Group__8__Impl_in_rule__Agent__Group__83369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Agent__Group__8__Impl3397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Imports__Group__0__Impl_in_rule__Imports__Group__03446 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Imports__Group__1_in_rule__Imports__Group__03449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Imports__Group__0__Impl3477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Imports__Group__1__Impl_in_rule__Imports__Group__13508 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Imports__Group__2_in_rule__Imports__Group__13511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Imports__ImportsAssignment_1_in_rule__Imports__Group__1__Impl3540 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Imports__ImportsAssignment_1_in_rule__Imports__Group__1__Impl3552 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Imports__Group__2__Impl_in_rule__Imports__Group__23585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Imports__Group__2__Impl3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Import__Group__0__Impl3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13712 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Import__Group__2_in_rule__Import__Group__13715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilename_in_rule__Import__Group__1__Impl3742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__23771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Import__Group__2__Impl3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Events__Group__0__Impl_in_rule__Events__Group__03836 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Events__Group__1_in_rule__Events__Group__03839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Events__Group__0__Impl3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Events__Group__1__Impl_in_rule__Events__Group__13898 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Events__Group__2_in_rule__Events__Group__13901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Events__EventsAssignment_1_in_rule__Events__Group__1__Impl3930 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Events__EventsAssignment_1_in_rule__Events__Group__1__Impl3942 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Events__Group__2__Impl_in_rule__Events__Group__23975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Events__Group__2__Impl4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__04040 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__04043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__NameAssignment_0_in_rule__Event__Group__0__Impl4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__14100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group__2_in_rule__Event__Group__14103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Event__Group__1__Impl4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__24162 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_rule__Event__Group__3_in_rule__Event__Group__24165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__EventTypeAssignment_2_in_rule__Event__Group__2__Impl4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__3__Impl_in_rule__Event__Group__34222 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_rule__Event__Group__4_in_rule__Event__Group__34225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__ParameterAssignment_3_in_rule__Event__Group__3__Impl4252 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Event__Group__4__Impl_in_rule__Event__Group__44283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Event__Group__4__Impl4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameters__Group__0__Impl_in_rule__Parameters__Group__04352 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Parameters__Group__1_in_rule__Parameters__Group__04355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Parameters__Group__0__Impl4383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameters__Group__1__Impl_in_rule__Parameters__Group__14414 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Parameters__Group__2_in_rule__Parameters__Group__14417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameters__ParametersAssignment_1_in_rule__Parameters__Group__1__Impl4446 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Parameters__ParametersAssignment_1_in_rule__Parameters__Group__1__Impl4458 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Parameters__Group__2__Impl_in_rule__Parameters__Group__24491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Parameters__Group__2__Impl4519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__04556 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__04559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_0_in_rule__Parameter__Group__0__Impl4586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__14616 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__14619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Parameter__Group__1__Impl4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__24678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Parameter__Group__2__Impl4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__04740 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__04743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group_0__0_in_rule__Condition__Group__0__Impl4770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__14800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group_1__0_in_rule__Condition__Group__1__Impl4827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group_0__0__Impl_in_rule__Condition__Group_0__04862 = new BitSet(new long[]{0x00003F0000000000L});
    public static final BitSet FOLLOW_rule__Condition__Group_0__1_in_rule__Condition__Group_0__04865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__SubjectiveAssignment_0_0_in_rule__Condition__Group_0__0__Impl4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group_0__1__Impl_in_rule__Condition__Group_0__14922 = new BitSet(new long[]{0x00000000080000F0L});
    public static final BitSet FOLLOW_rule__Condition__Group_0__2_in_rule__Condition__Group_0__14925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__OperatorAssignment_0_1_in_rule__Condition__Group_0__1__Impl4952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group_0__2__Impl_in_rule__Condition__Group_0__24982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__ObjectiveAssignment_0_2_in_rule__Condition__Group_0__2__Impl5009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group_1__0__Impl_in_rule__Condition__Group_1__05045 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Condition__Group_1__1_in_rule__Condition__Group_1__05048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Alternatives_1_0_in_rule__Condition__Group_1__0__Impl5075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group_1__1__Impl_in_rule__Condition__Group_1__15105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__CompareConditionAssignment_1_1_in_rule__Condition__Group_1__1__Impl5132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__05166 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__05169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Expression__Group__0__Impl5196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__15225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl5252 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__05287 = new BitSet(new long[]{0x00000000080000F0L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__05290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_1_0_in_rule__Expression__Group_1__0__Impl5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__15347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__RightAssignment_1_1_in_rule__Expression__Group_1__1__Impl5374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1_0_0__0__Impl_in_rule__Expression__Group_1_0_0__05408 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Expression__Group_1_0_0__1_in_rule__Expression__Group_1_0_0__05411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1_0_0__1__Impl_in_rule__Expression__Group_1_0_0__15469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Expression__Group_1_0_0__1__Impl5497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1_0_1__0__Impl_in_rule__Expression__Group_1_0_1__05532 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Expression__Group_1_0_1__1_in_rule__Expression__Group_1_0_1__05535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1_0_1__1__Impl_in_rule__Expression__Group_1_0_1__15593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Expression__Group_1_0_1__1__Impl5621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__05656 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__Term__Group__1_in_rule__Term__Group__05659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_rule__Term__Group__0__Impl5686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__15715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0_in_rule__Term__Group__1__Impl5742 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__05777 = new BitSet(new long[]{0x00000000080000F0L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__05780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Alternatives_1_0_in_rule__Term__Group_1__0__Impl5807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__15837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__RightAssignment_1_1_in_rule__Term__Group_1__1__Impl5864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1_0_0__0__Impl_in_rule__Term__Group_1_0_0__05898 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Term__Group_1_0_0__1_in_rule__Term__Group_1_0_0__05901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1_0_0__1__Impl_in_rule__Term__Group_1_0_0__15959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Term__Group_1_0_0__1__Impl5987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1_0_1__0__Impl_in_rule__Term__Group_1_0_1__06022 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__Term__Group_1_0_1__1_in_rule__Term__Group_1_0_1__06025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1_0_1__1__Impl_in_rule__Term__Group_1_0_1__16083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Term__Group_1_0_1__1__Impl6111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_4__0__Impl_in_rule__Factor__Group_4__06146 = new BitSet(new long[]{0x00000000080000F0L});
    public static final BitSet FOLLOW_rule__Factor__Group_4__1_in_rule__Factor__Group_4__06149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Factor__Group_4__0__Impl6177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_4__1__Impl_in_rule__Factor__Group_4__16208 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Factor__Group_4__2_in_rule__Factor__Group_4__16211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__ExpressionAssignment_4_1_in_rule__Factor__Group_4__1__Impl6238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_4__2__Impl_in_rule__Factor__Group_4__26268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Factor__Group_4__2__Impl6296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__06333 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__06336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl6363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__16392 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__2_in_rule__QualifiedName__Group__16395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl6422 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__2__Impl_in_rule__QualifiedName__Group__26453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_2__0_in_rule__QualifiedName__Group__2__Impl6480 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__06517 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__06520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__QualifiedName__Group_1__0__Impl6548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__16579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl6606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_2__0__Impl_in_rule__QualifiedName__Group_2__06639 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_2__1_in_rule__QualifiedName__Group_2__06642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__QualifiedName__Group_2__0__Impl6670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_2__1__Impl_in_rule__QualifiedName__Group_2__16701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__QualifiedName__Group_2__1__Impl6728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plans__Group__0__Impl_in_rule__Plans__Group__06761 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Plans__Group__1_in_rule__Plans__Group__06764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Plans__Group__0__Impl6792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plans__Group__1__Impl_in_rule__Plans__Group__16823 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Plans__Group__2_in_rule__Plans__Group__16826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plans__PlansAssignment_1_in_rule__Plans__Group__1__Impl6855 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Plans__PlansAssignment_1_in_rule__Plans__Group__1__Impl6867 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Plans__Group__2__Impl_in_rule__Plans__Group__26900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Plans__Group__2__Impl6928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__0__Impl_in_rule__Plan__Group__06965 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Plan__Group__1_in_rule__Plan__Group__06968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Plan__Group__0__Impl6996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__1__Impl_in_rule__Plan__Group__17027 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Plan__Group__2_in_rule__Plan__Group__17030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__NameAssignment_1_in_rule__Plan__Group__1__Impl7057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__2__Impl_in_rule__Plan__Group__27087 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Plan__Group__3_in_rule__Plan__Group__27090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Plan__Group__2__Impl7118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__3__Impl_in_rule__Plan__Group__37149 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_rule__Plan__Group__4_in_rule__Plan__Group__37152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__BodyAssignment_3_in_rule__Plan__Group__3__Impl7179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__4__Impl_in_rule__Plan__Group__47209 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Plan__Group__5_in_rule__Plan__Group__47212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__TriggerAssignment_4_in_rule__Plan__Group__4__Impl7239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plan__Group__5__Impl_in_rule__Plan__Group__57269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Plan__Group__5__Impl7297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__Group_0__0__Impl_in_rule__Trigger__Group_0__07340 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Trigger__Group_0__1_in_rule__Trigger__Group_0__07343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Trigger__Group_0__0__Impl7371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__Group_0__1__Impl_in_rule__Trigger__Group_0__17402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__EventAssignment_0_1_in_rule__Trigger__Group_0__1__Impl7429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__Group_1__0__Impl_in_rule__Trigger__Group_1__07463 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Trigger__Group_1__1_in_rule__Trigger__Group_1__07466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__GoalAssignment_1_0_in_rule__Trigger__Group_1__0__Impl7493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__Group_1__1__Impl_in_rule__Trigger__Group_1__17523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Trigger__Group_1__1__Impl7551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BeliefSet__Group__0__Impl_in_rule__BeliefSet__Group__07586 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BeliefSet__Group__1_in_rule__BeliefSet__Group__07589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__BeliefSet__Group__0__Impl7617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BeliefSet__Group__1__Impl_in_rule__BeliefSet__Group__17648 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__BeliefSet__Group__2_in_rule__BeliefSet__Group__17651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BeliefSet__NameAssignment_1_in_rule__BeliefSet__Group__1__Impl7678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BeliefSet__Group__2__Impl_in_rule__BeliefSet__Group__27708 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__BeliefSet__Group__3_in_rule__BeliefSet__Group__27711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BeliefSet__Group__2__Impl7739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BeliefSet__Group__3__Impl_in_rule__BeliefSet__Group__37770 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__BeliefSet__Group__4_in_rule__BeliefSet__Group__37773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BeliefSet__BeliefSetAssignment_3_in_rule__BeliefSet__Group__3__Impl7802 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__BeliefSet__BeliefSetAssignment_3_in_rule__BeliefSet__Group__3__Impl7814 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__BeliefSet__Group__4__Impl_in_rule__BeliefSet__Group__47847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BeliefSet__Group__4__Impl7875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Belief__Group__0__Impl_in_rule__Belief__Group__07916 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Belief__Group__1_in_rule__Belief__Group__07919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Belief__Group__0__Impl7947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Belief__Group__1__Impl_in_rule__Belief__Group__17978 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Belief__Group__2_in_rule__Belief__Group__17981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Belief__NameAssignment_1_in_rule__Belief__Group__1__Impl8008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Belief__Group__2__Impl_in_rule__Belief__Group__28038 = new BitSet(new long[]{0x0000000800008000L});
    public static final BitSet FOLLOW_rule__Belief__Group__3_in_rule__Belief__Group__28041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Belief__Group__2__Impl8069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Belief__Group__3__Impl_in_rule__Belief__Group__38100 = new BitSet(new long[]{0x0000000800008000L});
    public static final BitSet FOLLOW_rule__Belief__Group__4_in_rule__Belief__Group__38103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Belief__FactAssignment_3_in_rule__Belief__Group__3__Impl8130 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__Belief__Group__4__Impl_in_rule__Belief__Group__48161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Belief__Group__4__Impl8189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group__0__Impl_in_rule__Fact__Group__08230 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_rule__Fact__Group__1_in_rule__Fact__Group__08233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Fact__Group__0__Impl8261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group__1__Impl_in_rule__Fact__Group__18292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fact__Group__2_in_rule__Fact__Group__18295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__StatementsAssignment_1_in_rule__Fact__Group__1__Impl8322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group__2__Impl_in_rule__Fact__Group__28352 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Fact__Group__3_in_rule__Fact__Group__28355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Fact__Group__2__Impl8382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group__3__Impl_in_rule__Fact__Group__38411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Fact__Group__3__Impl8439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Achieve__Group__0__Impl_in_rule__Achieve__Group__08479 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Achieve__Group__1_in_rule__Achieve__Group__08482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Achieve__Group__0__Impl8510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Achieve__Group__1__Impl_in_rule__Achieve__Group__18541 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Achieve__Group__2_in_rule__Achieve__Group__18544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Achieve__NameAssignment_1_in_rule__Achieve__Group__1__Impl8571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Achieve__Group__2__Impl_in_rule__Achieve__Group__28601 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Achieve__Group__3_in_rule__Achieve__Group__28604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Achieve__Group__2__Impl8632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Achieve__Group__3__Impl_in_rule__Achieve__Group__38663 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Achieve__Group__4_in_rule__Achieve__Group__38666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Achieve__ConditionAssignment_3_in_rule__Achieve__Group__3__Impl8693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Achieve__Group__4__Impl_in_rule__Achieve__Group__48723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Achieve__Group__4__Impl8751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__0__Impl_in_rule__Query__Group__08792 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Query__Group__1_in_rule__Query__Group__08795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Query__Group__0__Impl8823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__1__Impl_in_rule__Query__Group__18854 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Query__Group__2_in_rule__Query__Group__18857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__NameAssignment_1_in_rule__Query__Group__1__Impl8884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__2__Impl_in_rule__Query__Group__28914 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Query__Group__3_in_rule__Query__Group__28917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Query__Group__2__Impl8945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__3__Impl_in_rule__Query__Group__38976 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Query__Group__4_in_rule__Query__Group__38979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ConditionAssignment_3_in_rule__Query__Group__3__Impl9006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__4__Impl_in_rule__Query__Group__49036 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Query__Group__5_in_rule__Query__Group__49039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ResultAssignment_4_in_rule__Query__Group__4__Impl9066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__5__Impl_in_rule__Query__Group__59096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Query__Group__5__Impl9124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Maintain__Group__0__Impl_in_rule__Maintain__Group__09167 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Maintain__Group__1_in_rule__Maintain__Group__09170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Maintain__Group__0__Impl9198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Maintain__Group__1__Impl_in_rule__Maintain__Group__19229 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Maintain__Group__2_in_rule__Maintain__Group__19232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Maintain__NameAssignment_1_in_rule__Maintain__Group__1__Impl9259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Maintain__Group__2__Impl_in_rule__Maintain__Group__29289 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Maintain__Group__3_in_rule__Maintain__Group__29292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Maintain__Group__2__Impl9320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Maintain__Group__3__Impl_in_rule__Maintain__Group__39351 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Maintain__Group__4_in_rule__Maintain__Group__39354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Maintain__ConditionAssignment_3_in_rule__Maintain__Group__3__Impl9381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Maintain__Group__4__Impl_in_rule__Maintain__Group__49411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Maintain__Group__4__Impl9439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Perform__Group__0__Impl_in_rule__Perform__Group__09480 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Perform__Group__1_in_rule__Perform__Group__09483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Perform__Group__0__Impl9511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Perform__Group__1__Impl_in_rule__Perform__Group__19542 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Perform__Group__2_in_rule__Perform__Group__19545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Perform__NameAssignment_1_in_rule__Perform__Group__1__Impl9572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Perform__Group__2__Impl_in_rule__Perform__Group__29602 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Perform__Group__3_in_rule__Perform__Group__29605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Perform__Group__2__Impl9633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Perform__Group__3__Impl_in_rule__Perform__Group__39664 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Perform__Group__4_in_rule__Perform__Group__39667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Perform__ConditionAssignment_3_in_rule__Perform__Group__3__Impl9694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Perform__Group__4__Impl_in_rule__Perform__Group__49724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Perform__Group__4__Impl9752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAgent_in_rule__BDI__AgentsAssignment_19798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Agent__NameAssignment_19829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImports_in_rule__Agent__ImportAssignment_39860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvents_in_rule__Agent__EventsAssignment_49891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameters_in_rule__Agent__ParametersAssignment_59922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeliefSet_in_rule__Agent__BeliefsAssignment_69953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlans_in_rule__Agent__PlansAssignment_79984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Imports__ImportsAssignment_110015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Events__EventsAssignment_110046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__NameAssignment_010077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Event__EventTypeAssignment_210108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Event__ParameterAssignment_310139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Parameters__ParametersAssignment_110170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_010201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Operator__EqualToAssignment_010237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Operator__LargerThanAssignment_110281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Operator__SmallerThanAssignment_210325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Operator__LargerOrEqualToAssignment_310369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Operator__SmallerOrEqualToAssignment_410413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Operator__NotEqualToAssignment_510457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Condition__SubjectiveAssignment_0_010496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__Condition__OperatorAssignment_0_110527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Condition__ObjectiveAssignment_0_210558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Condition__AndAssignment_1_0_010594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Condition__OrAssignment_1_0_110638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__Condition__CompareConditionAssignment_1_110677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Expression__RightAssignment_1_110708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_rule__Term__RightAssignment_1_110739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_rule__Factor__NumberAssignment_010770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Factor__VariableAssignment_110801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Factor__StringAssignment_210832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__Factor__BooleanAssignment_310863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Factor__ExpressionAssignment_4_110894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_in_rule__Plans__PlansAssignment_110925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Plan__NameAssignment_110956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_rule__Plan__BodyAssignment_310987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrigger_in_rule__Plan__TriggerAssignment_411018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Trigger__EventAssignment_0_111053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Trigger__GoalAssignment_1_011092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BeliefSet__NameAssignment_111127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_rule__BeliefSet__BeliefSetAssignment_311158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Belief__NameAssignment_111189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFact_in_rule__Belief__FactAssignment_311220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatements_in_rule__Fact__StatementsAssignment_111251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Statements__StatementsAssignment11282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Achieve__NameAssignment_111314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__Achieve__ConditionAssignment_311345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Query__NameAssignment_111376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__Query__ConditionAssignment_311407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResult_in_rule__Query__ResultAssignment_411438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Maintain__NameAssignment_111469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__Maintain__ConditionAssignment_311500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Perform__NameAssignment_111531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__Perform__ConditionAssignment_311562 = new BitSet(new long[]{0x0000000000000002L});

}