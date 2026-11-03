package com.aspose.slides.internal.l4;

import com.aspose.slides.internal.c3.h6;
import com.aspose.slides.internal.c3.n5$n5;
import com.aspose.slides.internal.c3.y8;
import com.aspose.slides.internal.f5.c8$l6;
import com.aspose.slides.internal.f5.d2;
import com.aspose.slides.ms.System.d1;

public class t2 extends j5 {
   @Override
   public boolean n5(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      if (var1.u9() == 5) {
         if (var2.c4().size() != 0) {
            var2.y2().n5(var1, var2);
         } else {
            var2.p8();
         }

         return false;
      } else {
         switch (var1.u9()) {
            case 0:
               h6 var15 = var1.e2();
               String var16 = var15.n5();
               if (d1.a6(var16, "html")) {
                  var2.l6(this);
                  if (var2.l6().n5(c8$l6.t2)) {
                     return false;
                  }

                  com.aspose.slides.internal.f5.z3 var17 = var2.l6().u3();

                  for (n5$n5 var8 : var15.k5()) {
                     if (!var17.t2(var8.n5())) {
                        var17.n5(var8.n5(), var8.l6());
                     }
                  }
               } else {
                  if (com.aspose.slides.internal.w3.u9.l6(var16, com.aspose.slides.internal.y8.n5$n5.u3)) {
                     return u3.n5(var1, var2);
                  }

                  if (d1.a6(var16, "body")) {
                     var2.l6(this);
                     com.aspose.slides.internal.c3.d1 var18 = var2.l6();
                     if (var18.k5() == 1 || var18.k5() > 2 && !d1.a6(var18.n5(1).u3().l6(), "body") || var2.l6().n5(c8$l6.t2)) {
                        return false;
                     }

                     var2.n5(false);
                     com.aspose.slides.internal.f5.z3 var31 = var18.n5(1);

                     for (n5$n5 var9 : var15.k5()) {
                        if (!var31.t2(var9.n5())) {
                           var31.n5(var9.n5(), var9.l6());
                        }
                     }
                  } else if (d1.a6(var16, "frameset")) {
                     var2.l6(this);
                     com.aspose.slides.internal.c3.d1 var19 = var2.l6();
                     if (var19.k5() == 1 || var19.k5() > 2 && !c8$l6.a6.n5(var19.n5(1))) {
                        return false;
                     }

                     if (!var2.s7()) {
                        return false;
                     }

                     com.aspose.slides.internal.f5.z3 var32 = var19.n5(1);
                     if (var32.a5() != null) {
                        var32.a5().l6(var32);
                     }

                     while (var19.k5() > 1) {
                        var19.n5();
                     }

                     var2.l6(var15);
                     var2.n5(m1);
                  } else if (com.aspose.slides.internal.w3.u9.l6(var16, com.aspose.slides.internal.y8.n5$n5.u9)) {
                     if (var2.u3("p")) {
                        var2.n5(new com.aspose.slides.internal.c3.s7("p"));
                     }

                     var2.l6(var15);
                  } else if (com.aspose.slides.internal.w3.u9.l6(var16, com.aspose.slides.internal.y8.n5$n5.h0)) {
                     if (var2.u3("p")) {
                        var2.q0();
                     }

                     if (com.aspose.slides.internal.w3.u9.l6(var2.u3().u3().l6(), com.aspose.slides.internal.y8.n5$n5.h0)) {
                        var2.l6(this);
                        var2.n5();
                     }

                     var2.l6(var15);
                  } else if (com.aspose.slides.internal.w3.u9.l6(var16, com.aspose.slides.internal.y8.n5$n5.t2)) {
                     if (var2.u3("p")) {
                        var2.q0();
                     }

                     var2.l6(var15);
                     var2.n5(false);
                  } else if (d1.a6(var16, "form")) {
                     if (var2.n3() != null && !var2.l6().n5(c8$l6.t2)) {
                        var2.l6(this);
                        return false;
                     }

                     if (var2.u3("p")) {
                        var2.q0();
                     }

                     com.aspose.slides.internal.f5.z3 var20 = var2.l6(var15);
                     if (!var2.l6().n5(c8$l6.t2)) {
                        var2.u3(var20);
                     }
                  } else if (d1.a6(var16, "li")) {
                     var2.n5(false);
                     com.aspose.slides.internal.c3.d1 var21 = var2.l6();

                     for (int var33 = var21.k5() - 1; var33 > 0; var33--) {
                        com.aspose.slides.internal.f5.z3 var37 = var21.n5(var33);
                        if (d1.a6(var37.u3().l6(), "li")) {
                           var2.t2(var16);
                           if (!d1.a6(var2.u3().u3().l6(), var16)) {
                              var2.l6(this);
                           }

                           var2.l6(var16);
                           break;
                        }

                        if (var2.a6(var37) && !com.aspose.slides.internal.w3.u9.l6(var37.u3().l6(), com.aspose.slides.internal.y8.n5$n5.x8)) {
                           break;
                        }
                     }

                     if (var2.u3("p")) {
                        var2.n5(new com.aspose.slides.internal.c3.s7("p"));
                     }

                     var2.l6(var15);
                  } else if (com.aspose.slides.internal.w3.u9.l6(var16, com.aspose.slides.internal.y8.n5$n5.n3)) {
                     var2.n5(false);
                     com.aspose.slides.internal.c3.d1 var22 = var2.l6();

                     for (int var34 = var22.k5() - 1; var34 > 0; var34--) {
                        com.aspose.slides.internal.f5.z3 var38 = var22.n5(var34);
                        if (com.aspose.slides.internal.w3.u9.l6(var38.u3().l6(), com.aspose.slides.internal.y8.n5$n5.n3)) {
                           var2.n5(new com.aspose.slides.internal.c3.s7(var38.u3().l6()));
                           break;
                        }

                        if (var2.a6(var38) && !com.aspose.slides.internal.w3.u9.l6(var38.u3().l6(), com.aspose.slides.internal.y8.n5$n5.x8)) {
                           break;
                        }
                     }

                     if (var2.u3("p")) {
                        var2.n5(new com.aspose.slides.internal.c3.s7("p"));
                     }

                     var2.l6(var15);
                  } else if (d1.a6(var16, "plaintext")) {
                     if (var2.u3("p")) {
                        var2.n5(new com.aspose.slides.internal.c3.s7("p"));
                     }

                     var2.l6(var15);
                     var2.h0().n5(com.aspose.slides.internal.i6.d1.f5);
                  } else if (d1.a6(var16, "button")) {
                     if (var2.k5("button")) {
                        var2.l6(this);
                        var2.z3();
                        var2.l6("button");
                     }

                     var2.t9();
                     var2.l6(var15);
                     var2.n5(false);
                  } else if (d1.a6(var16, "a")) {
                     com.aspose.slides.internal.f5.z3 var23 = var2.h0("a");
                     if (var23 != null) {
                        var2.l6(this);
                        var2.s7("a");
                        var2.h0(var23);
                     }

                     var2.t9();
                     var23 = var2.l6(var15);
                     var2.u9(var23);
                  } else if (com.aspose.slides.internal.w3.u9.l6(var16, com.aspose.slides.internal.y8.n5$n5.z1)) {
                     var2.t9();
                     com.aspose.slides.internal.f5.z3 var25 = var2.l6(var15);
                     var2.u9(var25);
                  } else if (d1.a6(var16, "nobr")) {
                     var2.t9();
                     if (var2.k5("nobr")) {
                        var2.l6(this);
                        var2.s7("nobr");
                        var2.t9();
                     }

                     com.aspose.slides.internal.f5.z3 var26 = var2.l6(var15);
                     var2.u9(var26);
                  } else if (com.aspose.slides.internal.w3.u9.l6(var16, com.aspose.slides.internal.y8.n5$n5.q0)) {
                     var2.t9();
                     var2.l6(var15);
                     var2.t4();
                     var2.n5(false);
                  } else if (d1.a6(var16, "table")) {
                     var2.l6(var15);
                     var2.n5(false);
                     var2.n5(t2);
                  } else if (com.aspose.slides.internal.w3.u9.l6(var16, com.aspose.slides.internal.y8.n5$n5.z3)) {
                     var2.t9();
                     com.aspose.slides.internal.f5.z3 var27 = var2.l6(var15);
                     var2.n5((com.aspose.slides.internal.j3.z3)var27);
                     var2.k7();
                     var2.n5(false);
                  } else if (d1.a6(var16, "input")) {
                     var2.t9();
                     com.aspose.slides.internal.f5.z3 var28 = var2.l6(var15);
                     var2.n5();
                     var2.k7();
                     if (!var28.t2("type") || !d1.u3("hidden", var28.u3("type"), (short)5)) {
                        var2.n5(false);
                     }
                  } else if (com.aspose.slides.internal.w3.u9.l6(var16, com.aspose.slides.internal.y8.n5$n5.m1)) {
                     var2.l6(var15);
                     var2.n5();
                     var2.k7();
                  } else if (d1.a6(var16, "hr")) {
                     if (var2.u3("p")) {
                        var2.q0();
                     }

                     var2.l6(var15);
                     var2.n5();
                     var2.k7();
                     var2.n5(false);
                  } else if (d1.a6(var16, "image")) {
                     if (!var2.c8("svg")) {
                        var15.n5("img");
                        return var2.n5((y8)var15);
                     }

                     var2.l6(var15);
                  } else if (d1.a6(var16, "isindex")) {
                     var2.l6(this);
                     if (!var2.k5("template") && var2.n3() != null) {
                        return false;
                     }

                     var2.k7();
                     var2.n5(false);
                     if (var2.u3("p")) {
                        var2.q0();
                     }

                     com.aspose.slides.internal.f5.z3 var29 = var2.n5("form");
                     var2.u3(var29);
                     if (var15.k5().n5("action")) {
                        var29.n5("action", var15.k5().l6("action"));
                     }

                     var2.n5("hr");
                     var2.n5();
                     var2.t9();
                     var2.n5("label");
                     String var35 = var15.k5().n5("prompt") ? var15.k5().l6("prompt") : "This is a searchable index. Enter search keywords: ";
                     var2.n5(new com.aspose.slides.internal.c3.u3(var35));
                     h6 var39 = new h6("input");

                     for (n5$n5 var10 : var15.k5()) {
                        if (!com.aspose.slides.internal.w3.u9.l6(var10.n5(), com.aspose.slides.internal.y8.n5$n5.k7)) {
                           var39.n5(var10.n5(), var10.l6());
                        }
                     }

                     var39.n5("name", "isindex");
                     var2.l6(var39);
                     var2.n5();
                     var2.n5();
                     var2.n5("hr");
                     var2.n5();
                     var2.n5();
                     var2.u3((com.aspose.slides.internal.f5.z3)null);
                  } else if (d1.a6(var16, "textarea")) {
                     var2.l6(var15);
                     var2.h0().n5(com.aspose.slides.internal.i6.d1.z7);
                     var2.c8();
                     var2.n5(false);
                     var2.n5(c8);
                  } else if (d1.a6(var16, "xmp")) {
                     if (var2.u3("p")) {
                        var2.q0();
                     }

                     var2.t9();
                     var2.n5(false);
                     var2.n5(com.aspose.slides.internal.i6.d1.i9);
                  } else if (d1.a6(var16, "iframe")) {
                     var2.n5(false);
                     var2.n5(com.aspose.slides.internal.i6.d1.i9);
                  } else if (!d1.a6(var16, "noembed") && (!d1.a6(var16, "noscript") || !var2.r4())) {
                     if (d1.a6(var16, "select")) {
                        var2.t9();
                        var2.l6(var15);
                        var2.n5(false);
                        j5 var30 = var2.y4();
                        if (!var30.equals(t2) && !var30.equals(x8) && !var30.equals(y4) && !var30.equals(e2) && !var30.equals(t9)) {
                           var2.n5(z1);
                        } else {
                           var2.n5(t4);
                        }
                     } else if (com.aspose.slides.internal.w3.u9.l6(var16, com.aspose.slides.internal.y8.n5$n5.m3)) {
                        if (d1.a6(var2.u3().u3().l6(), "option")) {
                           var2.n5();
                        }

                        var2.t9();
                        var2.l6(var15);
                     } else if (com.aspose.slides.internal.w3.u9.l6(var16, com.aspose.slides.internal.y8.n5$n5.z8)) {
                        if (var2.k5("ruby")) {
                           var2.z3();
                           if (!d1.a6(var2.u3().u3().l6(), "ruby")) {
                              var2.l6(this);
                           }

                           var2.l6(var15);
                        }
                     } else if (d1.a6(var16, "rt")) {
                        if (var2.k5("ruby")) {
                           var2.t2("tr");
                           if (!d1.a6(var2.u3().u3().l6(), "ruby") && !d1.a6(var2.u3().u3().l6(), "rtc")) {
                              var2.l6(this);
                           }

                           var2.l6(var15);
                        }
                     } else if (d1.a6(var16, "math")) {
                        var2.t9();
                        var1 = var2.l6(var1);
                        var1 = var2.a6(var1);
                        var2.l6(var1.e2(), "http://www.w3.org/1998/Math/MathML");
                        if (var15.l6()) {
                           var2.n5();
                           var2.k7();
                        }
                     } else {
                        if (!d1.a6(var16, "svg")) {
                           if (com.aspose.slides.internal.w3.u9.l6(var16, com.aspose.slides.internal.y8.n5$n5.j5)) {
                              var2.l6(this);
                              return false;
                           }

                           return this.k5(var1, var2);
                        }

                        var2.t9();
                        var1 = var2.l6(var1);
                        var1 = var2.a6(var1);
                        var2.l6(var1.e2(), "http://www.w3.org/2000/svg");
                        if (var15.l6()) {
                           var2.n5();
                           var2.k7();
                        }
                     }
                  } else {
                     var2.n5(com.aspose.slides.internal.i6.d1.i9);
                  }
               }
               break;
            case 1:
               com.aspose.slides.internal.c3.s7 var4 = var1.t9();
               String var5 = var4.n5();
               if (d1.a6(var5, "template")) {
                  return u3.n5(var1, var2);
               }

               if (d1.a6(var5, "body")) {
                  if (!var2.k5("body")) {
                     var2.l6(this);
                     return false;
                  }

                  var2.n5(z3);
               } else {
                  if (d1.a6(var5, "html")) {
                     if (!var2.k5("body")) {
                        var2.l6(this);
                        return false;
                     }

                     return z3.n5(var1, var2);
                  }

                  if (com.aspose.slides.internal.w3.u9.l6(var5, com.aspose.slides.internal.y8.n5$n5.y4)) {
                     if (!var2.k5(var5)) {
                        var2.l6(this);
                        return false;
                     }

                     var2.z3();
                     if (!d1.a6(var2.u3().u3().l6(), var5)) {
                        var2.l6(this);
                     }

                     var2.l6(var5);
                  } else if (d1.a6(var5, "form")) {
                     if (!var2.l6().n5(c8$l6.t2)) {
                        com.aspose.slides.internal.f5.z3 var6 = var2.n3();
                        var2.u3((com.aspose.slides.internal.f5.z3)null);
                        if (var6 == null || !var2.k5(var5)) {
                           var2.l6(this);
                           return false;
                        }

                        var2.z3();
                        if (!d1.a6(var2.u3().u3().l6(), var5)) {
                           var2.l6(this);
                        }

                        var2.l6().l6(var6);
                     } else {
                        if (!var2.k5("font")) {
                           var2.l6(this);
                           return false;
                        }

                        var2.z3();
                        if (!var2.u3().u3().n5(c8$l6.x8)) {
                           var2.l6(this);
                        }

                        var2.l6(c8$l6.x8.l6());
                     }
                  } else if (d1.a6(var5, "p")) {
                     if (!var2.u3(var5)) {
                        var2.l6(this);
                        var2.n5((y8)(new h6(var5)));
                     }

                     var2.q0();
                  } else if (d1.a6(var5, "li")) {
                     if (!var2.u9(var5)) {
                        var2.l6(this);
                        return false;
                     }

                     var2.t2(var5);
                     if (!d1.a6(var2.u3().u3().l6(), var5)) {
                        var2.l6(this);
                     }

                     var2.l6(var5);
                  } else if (com.aspose.slides.internal.w3.u9.l6(var5, com.aspose.slides.internal.y8.n5$n5.n3)) {
                     if (!var2.k5(var5)) {
                        var2.l6(this);
                        return false;
                     }

                     var2.t2(var5);
                     if (!d1.a6(var2.u3().u3().l6(), var5)) {
                        var2.l6(this);
                     }

                     var2.l6(var5);
                  } else if (com.aspose.slides.internal.w3.u9.l6(var5, com.aspose.slides.internal.y8.n5$n5.h0)) {
                     if (!var2.k5(com.aspose.slides.internal.y8.n5$n5.h0)) {
                        var2.l6(this);
                        return false;
                     }

                     var2.z3();
                     if (!d1.a6(var2.u3().u3().l6(), var5)) {
                        var2.l6(this);
                     }

                     var2.n5(com.aspose.slides.internal.y8.n5$n5.h0);
                  } else {
                     if (d1.a6(var5, "sarcasm")) {
                        return this.u3(var1, var2);
                     }

                     if (com.aspose.slides.internal.w3.u9.l6(var5, com.aspose.slides.internal.y8.n5$n5.t4)) {
                        return var2.s7(var5);
                     }

                     if (!com.aspose.slides.internal.w3.u9.l6(var5, com.aspose.slides.internal.y8.n5$n5.q0)) {
                        if (d1.a6(var5, "br")) {
                           var2.l6(this);
                           var2.n5((y8)(new h6(var5)));
                           return false;
                        }

                        return this.u3(var1, var2);
                     }

                     if (!var2.k5(var5)) {
                        var2.l6(this);
                        return false;
                     }

                     var2.z3();
                     if (!d1.a6(var2.u3().u3().l6(), var5)) {
                        var2.l6(this);
                     }

                     var2.l6(var5);
                     var2.z1();
                  }
               }
               break;
            case 2:
               com.aspose.slides.internal.c3.u3 var3 = var1.t4();
               if (var3.n5('\u0000')) {
                  var2.l6(this);
                  return false;
               }

               if (var3.l6()) {
                  var2.t9();
                  var2.n5(var3);
               } else {
                  var2.t9();
                  var2.n5(var3);
                  var2.n5(false);
               }
               break;
            case 3:
               var2.n5(var1.z1());
               break;
            case 4:
               var2.l6(this);
               return false;
         }

         return true;
      }
   }

   @Override
   public boolean u3(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      String var3 = var1.y4().n5();
      d2 var4 = d2.n5(var3);

      for (com.aspose.slides.internal.f5.z3 var6 : var2.l6()) {
         if (var6.u3().n5(var4)) {
            var2.t2(var3);
            if (!var6.equals(var2.u3())) {
               var2.l6(this);
            }

            var2.n5((com.aspose.slides.internal.j3.z3)var6);
            return true;
         }

         if (var2.a6(var6)) {
            var2.l6(this);
            return false;
         }
      }

      return true;
   }

   @Override
   public boolean k5(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      var2.t9();
      var2.l6(var1.e2());
      return true;
   }
}
