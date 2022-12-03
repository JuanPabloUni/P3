// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/Lexer202220.gold"
import gold.*;
import gold.structures.*;
import gold.structures.automaton.*;
import gold.structures.bag.*;
import gold.structures.collection.*;
import gold.structures.deque.*;
import gold.structures.disjointset.*;
import gold.structures.graph.*;
import gold.structures.heap.*;
import gold.structures.list.*;
import gold.structures.map.*;
import gold.structures.multimap.*;
import gold.structures.point.*;
import gold.structures.queue.*;
import gold.structures.set.*;
import gold.structures.stack.*;
import gold.structures.tree.*;
import gold.structures.tree.binary.*;
import gold.structures.tree.nary.*;
import gold.structures.tuple.*;
import gold.structures.turingMachine.*;
import gold.swing.*;
import gold.swing.icon.*;
import gold.swing.icon.ajaxload.*;
import gold.swing.icon.famfamfam.*;
import gold.swing.icon.gold.*;
import gold.swing.icon.jlfgr.*;
import gold.swing.icon.wikimedia.*;
import gold.swing.icon.windows.*;
import gold.swing.look.*;
import gold.swing.util.*;
import gold.test.*;
import gold.test.automaton.*;
import gold.test.general.*;
import gold.test.graph.*;
import gold.util.*;
import gold.visualization.*;
import gold.visualization.automaton.*;
import gold.visualization.graph.*;
import gold.visualization.quadtree.*;
import gold.visualization.turingMachine.*;
import gold.visualization.util.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class Lexer202220 {
  public static String currentString=null;
  static {
    int $line=0;
    $line=5;
    $try:try {
      currentString=$defaultValue(String.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static GArrayList images=null;
  static {
    int $line=0;
    $line=6;
    $try:try {
      images=$invokeConstructor(GArrayList.class,new Object[]{});
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static ISet allSymbols=null;
  static {
    int $line=0;
    $line=8;
    $try:try {
      allSymbols=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static ISet keyWords=null;
  static {
    int $line=0;
    $line=9;
    $try:try {
      keyWords=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static ISet skipChars=null;
  static {
    int $line=0;
    $line=10;
    $try:try {
      skipChars=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static ISet preKW=null;
  static {
    int $line=0;
    $line=12;
    $try:try {
      preKW=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static ISet preOps=null;
  static {
    int $line=0;
    $line=13;
    $try:try {
      preOps=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static ISet StartOps=null;
  static {
    int $line=0;
    $line=15;
    $try:try {
      StartOps=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static ISet Symbols1=null;
  static {
    int $line=0;
    $line=16;
    $try:try {
      Symbols1=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static ISet CharsSymbols1=null;
  static {
    int $line=0;
    $line=18;
    $try:try {
      CharsSymbols1=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static ISet alphaUpper=null;
  static {
    int $line=0;
    $line=20;
    $try:try {
      alphaUpper=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static ISet alphaLower=null;
  static {
    int $line=0;
    $line=21;
    $try:try {
      alphaLower=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static ISet digits=null;
  static {
    int $line=0;
    $line=22;
    $try:try {
      digits=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static ISet alphaNum=null;
  static {
    int $line=0;
    $line=24;
    $try:try {
      alphaNum=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static ISet Out=null;
  static {
    int $line=0;
    $line=26;
    $try:try {
      Out=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static Boolean diffIdents=null;
  static {
    int $line=0;
    $line=27;
    $try:try {
      diffIdents=$defaultValue(Boolean.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static ISet Ids=null;
  static {
    int $line=0;
    $line=29;
    $try:try {
      Ids=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static GHashTableMap translation=null;
  static {
    int $line=0;
    $line=30;
    $try:try {
      translation=$invokeConstructor(GHashTableMap.class,new Object[]{});
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static Object chars(Object string) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v1=$newSet();
      int $v3=$int(0);
      int $v4=$int($invokeMethod("length",string,new Object[]{}))-1;
      $v2:for (int i=$v3; i<=$v4; i++) {
        $v1.add($invokeMethod("charAt",string,new Object[]{i}));
      }
      $result=$v1;
      if (true) break $try;
      $line=34;
      $rethrow(new RuntimeException("The function \"chars(string:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"chars",$line);
    }
    return $result;
  }
  public static Object charsStrings(Object strings) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v5=$newSet(GCollections.emptySet());
      $v6:for (Object s:GCollections.unmodifiableCollection(strings)) {
        $v5.union(GCollections.unmodifiableSet(((java.lang.Iterable)($invokeMethod(Lexer202220.class,"chars",true,null,new Object[]{s})))));
      }
      $result=$v5;
      if (true) break $try;
      $line=36;
      $rethrow(new RuntimeException("The function \"charsStrings(strings:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"charsStrings",$line);
    }
    return $result;
  }
  public static Object elements(Object array) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v7=$newSet();
      int $v9=$int(0);
      int $v10=$int($opAbsolY(array))-1;
      $v8:for (int i=$v9; i<=$v10; i++) {
        $v7.add($getArrayValue(array,new Object[]{i}));
      }
      $result=$v7;
      if (true) break $try;
      $line=38;
      $rethrow(new RuntimeException("The function \"elements(array:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"elements",$line);
    }
    return $result;
  }
  public static Object prefixes(Object string) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v11=$newSet();
      int $v13=$int(1);
      int $v14=$int($invokeMethod("length",string,new Object[]{}));
      $v12:for (int i=$v13; i<=$v14; i++) {
        $v11.add($invokeMethod("substring",string,new Object[]{0,i}));
      }
      $result=$v11;
      if (true) break $try;
      $line=40;
      $rethrow(new RuntimeException("The function \"prefixes(string:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"prefixes",$line);
    }
    return $result;
  }
  public static Object splits(Object string) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v15=$newSet();
      int $v17=$int(1);
      int $v18=$int($opSubtrY($invokeMethod("length",string,new Object[]{}),1));
      $v16:for (int i=$v17; i<=$v18; i++) {
        $v15.add(GCollections.asList($invokeMethod("substring",string,new Object[]{0,i}),$invokeMethod("substring",string,new Object[]{i,$invokeMethod("length",string,new Object[]{})})));
      }
      $result=$v15;
      if (true) break $try;
      $line=41;
      $rethrow(new RuntimeException("The function \"splits(string:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"splits",$line);
    }
    return $result;
  }
  public static Object allPrefixes(Object strings) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v19=$newSet(GCollections.emptySet());
      $v20:for (Object s:GCollections.unmodifiableCollection(strings)) {
        $v19.union(GCollections.unmodifiableSet(((java.lang.Iterable)($invokeMethod(Lexer202220.class,"prefixes",true,null,new Object[]{s})))));
      }
      $result=$v19;
      if (true) break $try;
      $line=43;
      $rethrow(new RuntimeException("The function \"allPrefixes(strings:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"allPrefixes",$line);
    }
    return $result;
  }
  public static Object translationGet(Object q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $result=(($bool((($opEqualY($opAbsolY(q),1)&&$opMembrY(q,Symbols1))&&!$opEqualY(q,'\n'))))?(q):($invokeMethod("get",translation,new Object[]{q})));
      if (true) break $try;
      $line=45;
      $rethrow(new RuntimeException("The function \"translationGet(q:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"translationGet",$line);
    }
    return $result;
  }
  public static Object runLexer(Object M, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=50;
      currentString=$cast(String.class,$fix(""));
      $line=51;
      images=$cast(GArrayList.class,$fix($invokeMethod(Lexer202220.class,"GArrayList",true,null,new Object[]{})));
      $line=52;
      Object result=$fix($invokeMethod("acceptsString",M,new Object[]{input}));
      $line=53;
      $result=GCollections.asList(result,images);
      if (true) break $try;
      $line=54;
      $rethrow(new RuntimeException("The function \"runLexer(M:Object,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"runLexer",$line);
    }
    return $result;
  }
  public static Object problems(String q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=60;
      if ($opMembrY(q,allSymbols)) {
        $line=60;
        $result=false;
        if (true) break $try;
      }
      else {
        $line=61;
        if ($opLessqY($opAbsolY(q),1)) {
          $line=61;
          $result=true;
          if (true) break $try;
        }
        else {
          $line=63;
          for (Object $v21:GCollections.unmodifiableCollection($invokeMethod(Lexer202220.class,"splits",true,null,new Object[]{q}))) {
            java.util.Iterator $v22=GCollections.unmodifiableCollection($v21).iterator();
            Object s=$v22.next();
            Object t=$v22.next();
            $line=64;
            if ((!$bool($invokeMethod(Lexer202220.class,"problems",true,null,new Object[]{s}))&&!$bool($invokeMethod(Lexer202220.class,"problems",true,null,new Object[]{t})))) {
              $line=64;
              $result=false;
              if (true) break $try;
            }
          }
          $line=66;
          $result=true;
          if (true) break $try;
        }
      }
      $line=69;
      $rethrow(new RuntimeException("The function \"problems(q:String)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"problems",$line);
    }
    return $result;
  }
  public static Object translationPreOps(Object state) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=74;
      Object x=null;
      Object y=null;
      $line=75;
      String q=null;
      q=$defaultValue(String.class);
      $line=76;
      q=$cast(String.class,$fix(state));
      $line=77;
      Object n=$fix($invokeMethod("length",q,new Object[]{}));
      $line=78;
      if ($opEqualY(n,0)) {
        $line=78;
        $result="";
        if (true) break $try;
      }
      else {
        $line=79;
        if ($opMembrY(q,allSymbols)) {
          $line=80;
          $invokeMethod("add",images,new Object[]{q});
          $line=81;
          $result=$invokeMethod(Lexer202220.class,"translationGet",true,null,new Object[]{q});
          if (true) break $try;
        }
        else {
          $line=82;
          if ($opEqualY(n,1)) {
            $line=82;
            $result="";
            if (true) break $try;
          }
          else {
            $line=84;
            for (Object $v23:GCollections.unmodifiableCollection($invokeMethod(Lexer202220.class,"splits",true,null,new Object[]{q}))) {
              java.util.Iterator $v24=GCollections.unmodifiableCollection($v23).iterator();
              Object s=$v24.next();
              Object t=$v24.next();
              $line=85;
              x=$fix($invokeMethod(Lexer202220.class,"translationPreOps",true,null,new Object[]{s}));
              $line=86;
              y=$fix($invokeMethod(Lexer202220.class,"translationPreOps",true,null,new Object[]{t}));
              $line=87;
              if ((!$opEqualY(x,"")&&!$opEqualY(y,""))) {
                $line=88;
                $result=$opAdditY(x,y);
                if (true) break $try;
              }
            }
            $line=91;
            $result="";
            if (true) break $try;
          }
        }
      }
      $line=95;
      $rethrow(new RuntimeException("The function \"translationPreOps(state:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"translationPreOps",$line);
    }
    return $result;
  }
  public static ITransducer createLexer() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=101;
      $invokeMethod(Lexer202220.class,"initialize",true,null,new Object[]{});
      $line=103;
      preOps=$cast(ISet.class,$fix($invokeMethod(Lexer202220.class,"allPrefixes",true,null,new Object[]{allSymbols})));
      $line=104;
      preKW=$cast(ISet.class,$fix($invokeMethod(Lexer202220.class,"allPrefixes",true,null,new Object[]{keyWords})));
      $line=105;
      gold.structures.set.ISet $v25=$newSet(GCollections.emptySet());
      $v26:for (Object x:GCollections.unmodifiableCollection(allSymbols)) {
        $v25.union(GCollections.unmodifiableSet(((java.lang.Iterable)(GCollections.asSet($invokeMethod("charAt",x,new Object[]{0}))))));
      }
      StartOps=$cast(ISet.class,$fix($v25));
      $line=106;
      gold.structures.set.ISet $v27=$newSet(GCollections.emptySet());
      $v28:for (Object x:GCollections.unmodifiableCollection(StartOps)) {
        $v27.union(GCollections.unmodifiableSet(((java.lang.Iterable)(GCollections.asSet($opAdditY("",x))))));
      }
      Symbols1=$cast(ISet.class,$fix($opInterY($v27,allSymbols)));
      $line=107;
      gold.structures.set.ISet $v29=$newSet(GCollections.emptySet());
      $v30:for (Object x:GCollections.unmodifiableCollection(Symbols1)) {
        $v29.union(GCollections.unmodifiableSet(((java.lang.Iterable)(GCollections.asSet($invokeMethod("charAt",x,new Object[]{0}))))));
      }
      CharsSymbols1=$cast(ISet.class,$fix($v29));
      $line=108;
      gold.structures.set.ISet $v31=$newSet(GCollections.emptySet());
      $v32:for (Object x:GCollections.unmodifiableCollection($invokeMethod("values",translation,new Object[]{}))) {
        $v31.union(GCollections.unmodifiableSet(((java.lang.Iterable)(GCollections.asSet(x)))));
      }
      Out=$cast(ISet.class,$fix($opUnionY(CharsSymbols1,$v31)));
      $line=110;
      System.out.println($message(new Object[]{Out}));
      $line=111;
      Ids=$cast(ISet.class,$fix(GCollections.asSet("IdU","IdL")));
      $line=113;
      Object Q=$fix($opUnionY($opUnionY(GCollections.asSet("INIT","IdU","Num","Err","IdL"),preKW),preOps));
      $line=115;
      System.out.println($message(new Object[]{Q}));
      $line=117;
      Object \u03A3=$fix($opUnionY($opUnionY($opUnionY(alphaNum,$invokeMethod(Lexer202220.class,"charsStrings",true,null,new Object[]{allSymbols})),skipChars),GCollections.asSet(':','-')));
      $line=120;
      Object q_0=$fix("INIT");
      $line=121;
      Object F=$fix(GCollections.asSet("INIT"));
      $line=122;
      $result=$invokeMethod(Lexer202220.class,"GDeterministicTransducer",true,null,new Object[]{Q,\u03A3,Out,q_0,F,new GMethod(Lexer202220.class,"\u03B4"),new GMethod(Lexer202220.class,"g"),new GMethod(Lexer202220.class,"h")});
      if (true) break $try;
      $line=123;
      $rethrow(new RuntimeException("The function \"createLexer()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"createLexer",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B4(Object state, Object \u03C3) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=130;
      String q=null;
      q=$defaultValue(String.class);
      $line=131;
      q=$cast(String.class,$fix(state));
      $line=133;
      if ($opEqualY(q,"Err")) {
        $line=133;
        $result="Err";
        if (true) break $try;
      }
      else {
        $line=134;
        if ($opMembrY(q,preOps)) {
          $line=135;
          if ($opMembrY($opAdditY(q,\u03C3),preOps)) {
            $line=135;
            $result=$opAdditY(q,\u03C3);
            if (true) break $try;
          }
          else {
            $line=136;
            if ($bool($invokeMethod(Lexer202220.class,"problems",true,null,new Object[]{q}))) {
              $line=136;
              $result="Err";
              if (true) break $try;
            }
            else {
              $line=137;
              if ($opMembrY(\u03C3,skipChars)) {
                $line=137;
                $result="INIT";
                if (true) break $try;
              }
              else {
                $line=138;
                if ($opMembrY(\u03C3,$opIntvlY('0','9'))) {
                  $line=138;
                  $result="Num";
                  if (true) break $try;
                }
                else {
                  $line=139;
                  if ($opMembrY($opAdditY("",\u03C3),preKW)) {
                    $line=139;
                    $result=$opAdditY("",\u03C3);
                    if (true) break $try;
                  }
                  else {
                    $line=140;
                    if ($opMembrY(\u03C3,alphaUpper)) {
                      $line=140;
                      $result="IdU";
                      if (true) break $try;
                    }
                    else {
                      $line=141;
                      if ($opMembrY(\u03C3,alphaLower)) {
                        $line=141;
                        $result="IdL";
                        if (true) break $try;
                      }
                      else {
                        $line=142;
                        if ($opMembrY($opAdditY("",\u03C3),preOps)) {
                          $line=142;
                          $result=$opAdditY("",\u03C3);
                          if (true) break $try;
                        }
                        else {
                          $line=143;
                          $result="Err";
                          if (true) break $try;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        else {
          $line=145;
          if (((($opMembrY(\u03C3,skipChars)&&$opMembrY(q,preKW))&&!$bool($opMembrY(q,keyWords)))&&$opEqualY($invokeMethod("charAt",q,new Object[]{0}),':'))) {
            $line=145;
            $result="Err";
            if (true) break $try;
          }
          else {
            $line=146;
            if ($opMembrY(\u03C3,skipChars)) {
              $line=146;
              $result="INIT";
              if (true) break $try;
            }
            else {
              $line=147;
              if (($opEqualY(q,"INIT")&&$opMembrY(\u03C3,$opIntvlY('0','9')))) {
                $line=147;
                $result="Num";
                if (true) break $try;
              }
              else {
                $line=148;
                if (($opEqualY(q,"INIT")&&$opMembrY($opAdditY("",\u03C3),preKW))) {
                  $line=148;
                  $result=$opAdditY("",\u03C3);
                  if (true) break $try;
                }
                else {
                  $line=149;
                  if (($opEqualY(q,"INIT")&&$opMembrY(\u03C3,alphaUpper))) {
                    $line=149;
                    $result="IdU";
                    if (true) break $try;
                  }
                  else {
                    $line=150;
                    if (($opEqualY(q,"INIT")&&$opMembrY(\u03C3,alphaLower))) {
                      $line=150;
                      $result="IdL";
                      if (true) break $try;
                    }
                    else {
                      $line=151;
                      if (($opEqualY(q,"INIT")&&$opMembrY($opAdditY("",\u03C3),preOps))) {
                        $line=151;
                        $result=$opAdditY("",\u03C3);
                        if (true) break $try;
                      }
                      else {
                        $line=152;
                        if (($opMembrY(q,preKW)&&$opMembrY($opAdditY(q,\u03C3),preKW))) {
                          $line=152;
                          $result=$opAdditY(q,\u03C3);
                          if (true) break $try;
                        }
                        else {
                          $line=153;
                          if ((($opMembrY(q,preKW)&&$opMembrY(\u03C3,alphaNum))&&$opMembrY($invokeMethod("charAt",q,new Object[]{0}),alphaUpper))) {
                            $line=153;
                            $result="IdU";
                            if (true) break $try;
                          }
                          else {
                            $line=154;
                            if ((($opMembrY(q,preKW)&&$opMembrY(\u03C3,alphaNum))&&$opMembrY($invokeMethod("charAt",q,new Object[]{0}),alphaLower))) {
                              $line=154;
                              $result="IdL";
                              if (true) break $try;
                            }
                            else {
                              $line=155;
                              if (($opMembrY(q,preKW)&&$opMembrY($opAdditY("",\u03C3),preOps))) {
                                $line=155;
                                $result=$opAdditY("",\u03C3);
                                if (true) break $try;
                              }
                              else {
                                $line=156;
                                if (($opEqualY(q,"Num")&&$opMembrY(\u03C3,$opIntvlY('0','9')))) {
                                  $line=156;
                                  $result="Num";
                                  if (true) break $try;
                                }
                                else {
                                  $line=157;
                                  if (($opEqualY(q,"Num")&&$opMembrY($opAdditY("",\u03C3),preOps))) {
                                    $line=157;
                                    $result=$opAdditY("",\u03C3);
                                    if (true) break $try;
                                  }
                                  else {
                                    $line=158;
                                    if (($opEqualY(q,"Num")&&$opMembrY(\u03C3,alphaNum))) {
                                      $line=158;
                                      $result="Err";
                                      if (true) break $try;
                                    }
                                    else {
                                      $line=159;
                                      if (($opMembrY(q,Ids)&&$opMembrY(\u03C3,alphaNum))) {
                                        $line=159;
                                        $result=q;
                                        if (true) break $try;
                                      }
                                      else {
                                        $line=160;
                                        if (($opMembrY(q,Ids)&&$opMembrY($opAdditY("",\u03C3),preOps))) {
                                          $line=160;
                                          $result=$opAdditY("",\u03C3);
                                          if (true) break $try;
                                        }
                                        else {
                                          $line=161;
                                          $result="Err";
                                          if (true) break $try;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      $line=163;
      $rethrow(new RuntimeException("The function \"\u03B4(state:Object,\u03C3:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object g(Object q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=168;
      $result="";
      if (true) break $try;
      $line=169;
      $rethrow(new RuntimeException("The function \"g(q:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"g",$line);
    }
    return $result;
  }
  public static Object h(Object q, Object \u03C3) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=172;
      String s=null;
      s=$defaultValue(String.class);
      $line=173;
      s=$cast(String.class,$fix((($bool($opEqualY(\u03C3,'\n')))?("\\n"):($opAdditY("",\u03C3)))));
      $line=175;
      if ($opMembrY(q,preOps)) {
        $line=176;
        if (($opMembrY(\u03C3,skipChars)&&$opMembrY(q,allSymbols))) {
          $line=177;
          $invokeMethod("add",images,new Object[]{currentString});
          $line=178;
          currentString=$cast(String.class,$fix(""));
          $line=179;
          $result=$invokeMethod(Lexer202220.class,"translationGet",true,null,new Object[]{q});
          if (true) break $try;
        }
        else {
          $line=180;
          if ($opMembrY($opAdditY(q,\u03C3),preOps)) {
            $line=181;
            currentString=$cast(String.class,$fix($opAdditY(currentString,s)));
            $line=182;
            $result="";
            if (true) break $try;
          }
          else {
            $line=183;
            if (($opMembrY(\u03C3,$opUnionY(StartOps,alphaNum))&&$opMembrY(q,allSymbols))) {
              $line=184;
              $invokeMethod("add",images,new Object[]{currentString});
              $line=185;
              currentString=$cast(String.class,$fix($opAdditY("",s)));
              $line=186;
              $result=$invokeMethod(Lexer202220.class,"translationGet",true,null,new Object[]{q});
              if (true) break $try;
            }
            else {
              $line=187;
              if ($opMembrY(\u03C3,$opUnionY($opUnionY($opUnionY(StartOps,alphaNum),skipChars),GCollections.asSet(':')))) {
                $line=188;
                currentString=$cast(String.class,$fix($opAdditY("",s)));
                $line=189;
                $result=$invokeMethod(Lexer202220.class,"translationPreOps",true,null,new Object[]{q});
                if (true) break $try;
              }
              else {
                $line=191;
                currentString=$cast(String.class,$fix($opAdditY(currentString,s)));
                $line=192;
                $result="";
                if (true) break $try;
              }
            }
          }
        }
      }
      else {
        $line=196;
        if ((!$opMembrY(q,GCollections.asSet("Err"))&&$opMembrY(\u03C3,$opUnionY(skipChars,StartOps)))) {
          $line=197;
          if ($opEqualY(q,"INIT")) {
            $line=198;
            currentString=$cast(String.class,$fix((($bool($opMembrY(\u03C3,StartOps)))?(s):(""))));
            $line=199;
            $result="";
            if (true) break $try;
          }
          else {
            $line=200;
            if ($opEqualY($invokeMethod(Lexer202220.class,"translationGet",true,null,new Object[]{q}),null)) {
              $line=202;
              $invokeMethod("add",images,new Object[]{currentString});
              $line=203;
              currentString=$cast(String.class,$fix((($bool($opMembrY(\u03C3,$opUnionY(skipChars,StartOps))))?(s):(""))));
              $line=204;
              Object f=$fix($invokeMethod("charAt",q,new Object[]{0}));
              $line=205;
              if ($opMembrY(f,alphaUpper)) {
                $line=205;
                $result=$invokeMethod(Lexer202220.class,"translationGet",true,null,new Object[]{"IdU"});
                if (true) break $try;
              }
              else {
                $line=206;
                if ($opMembrY(f,alphaLower)) {
                  $line=207;
                  $result=$invokeMethod(Lexer202220.class,"translationGet",true,null,new Object[]{"IdL"});
                  if (true) break $try;
                }
                else {
                  $line=208;
                  $result=null;
                  if (true) break $try;
                }
              }
            }
            else {
              $line=211;
              $invokeMethod("add",images,new Object[]{currentString});
              $line=212;
              currentString=$cast(String.class,$fix((($bool($opMembrY(\u03C3,$opUnionY(skipChars,StartOps))))?(s):(""))));
              $line=213;
              $result=$invokeMethod(Lexer202220.class,"translationGet",true,null,new Object[]{q});
              if (true) break $try;
            }
          }
        }
        else {
          $line=216;
          currentString=$cast(String.class,$fix($opAdditY(currentString,s)));
          $line=217;
          $result="";
          if (true) break $try;
        }
      }
      $line=220;
      $rethrow(new RuntimeException("The function \"h(q:Object,\u03C3:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"h",$line);
    }
    return $result;
  }
  public static Object initialize() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=228;
      skipChars=$cast(ISet.class,$fix(GCollections.asSet(' ','\t','\n')));
      $line=229;
      alphaUpper=$cast(ISet.class,$fix($opIntvlY('A','Z')));
      $line=230;
      alphaLower=$cast(ISet.class,$fix($opIntvlY('a','z')));
      $line=231;
      digits=$cast(ISet.class,$fix($opIntvlY('0','9')));
      $line=232;
      alphaNum=$cast(ISet.class,$fix($opUnionY($opUnionY($opUnionY(alphaUpper,alphaLower),digits),GCollections.asSet('-'))));
      $line=234;
      keyWords=$cast(ISet.class,$fix(GCollections.asSet("north","right","walk","look","jump","jumpTo","veer","drop","grab","get","free","pop","PROG","CORP","var")));
      $line=235;
      allSymbols=$cast(ISet.class,$fix(GCollections.asSet("(",")",",","=",";","{","}")));
      $line=246;
      $invokeMethod("put",translation,new Object[]{"north",'N'});
      $line=247;
      $invokeMethod("put",translation,new Object[]{"right",'r'});
      $line=248;
      $invokeMethod("put",translation,new Object[]{"walk",'w'});
      $line=249;
      $invokeMethod("put",translation,new Object[]{"look",'k'});
      $line=250;
      $invokeMethod("put",translation,new Object[]{"IdL",'v'});
      $line=251;
      $invokeMethod("put",translation,new Object[]{"IdU",'V'});
      $line=252;
      $invokeMethod("put",translation,new Object[]{"jump",'j'});
      $line=253;
      $invokeMethod("put",translation,new Object[]{"jumpTo",'J'});
      $line=254;
      $invokeMethod("put",translation,new Object[]{"veer",'B'});
      $line=255;
      $invokeMethod("put",translation,new Object[]{"drop",'d'});
      $line=256;
      $invokeMethod("put",translation,new Object[]{"grab",'g'});
      $line=257;
      $invokeMethod("put",translation,new Object[]{"get",'G'});
      $line=258;
      $invokeMethod("put",translation,new Object[]{"free",'f'});
      $line=259;
      $invokeMethod("put",translation,new Object[]{"pop",'P'});
      $line=260;
      $invokeMethod("put",translation,new Object[]{"PROG",'p'});
      $line=261;
      $invokeMethod("put",translation,new Object[]{"CORP",'C'});
      $line=262;
      $invokeMethod("put",translation,new Object[]{"var",'A'});
      $line=266;
      $invokeMethod("put",translation,new Object[]{"Num",'#'});
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"initialize",$line);
    }
    return $result;
  }
}
