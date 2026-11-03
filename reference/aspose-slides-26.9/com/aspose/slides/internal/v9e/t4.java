package com.aspose.slides.internal.v9e;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.XsltCompileException;
import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.r8;
import com.aspose.slides.ms.System.Xml.f4;
import com.aspose.slides.ms.System.Xml.k6;

public class t4 extends t9 {
   public ArrayList l6;
   public m1 k5;
   private int n5 = 0;

   public void l6(z1 var1) {
      throw new NotImplementedException();
   }

   public final void u9(z1 var1) {
      z7 var2 = var1.u3();
      String var3 = var2.e2();
      String var4 = null;
      String var5 = null;
      if (var2.m1()) {
         do {
            String var6 = var2.t9();
            String var7 = var2.e2();
            if (var6.length() == 0) {
               if (com.aspose.slides.ms.System.Xml.v8.n5(var7, var2.k5().m8)) {
                  var5 = var2.t4();
                  if (1.0 <= f4.n5((Object)var5)) {
                     var1.n5(!"1.0".equals(var5));
                  } else if (!var1.n3()) {
                     throw XsltException.create("'{1}' is an invalid value for the '{0}' attribute.", "version", var5);
                  }
               } else if (com.aspose.slides.ms.System.Xml.v8.n5(var7, var2.k5().d5)) {
                  var1.n5(var2.t4());
               } else if (com.aspose.slides.ms.System.Xml.v8.n5(var7, var2.k5().d2)) {
                  var1.l6(var2.t4());
               } else if (!com.aspose.slides.ms.System.Xml.v8.n5(var7, var2.k5().u6)) {
                  var4 = var7;
               }
            }
         } while (var2.k7());

         var2.c8();
      }

      if (var5 == null) {
         throw XsltException.create("Missing mandatory attribute '{0}'.", "version");
      }

      if (var4 != null && !var1.n3()) {
         throw XsltException.create("'{0}' is an invalid attribute for the '{1}' element.", var4, var3);
      }
   }

   public final void h0(z1 var1) {
      z7 var2 = var1.u3();
      String var3 = null;
      if (var2.m1()) {
         do {
            String var4 = var2.t9();
            String var5 = var2.e2();
            if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().y6) && com.aspose.slides.ms.System.Xml.v8.n5(var5, var2.k5().m8)) {
               var3 = var2.t4();
            }
         } while (var2.k7());

         var2.c8();
      }

      if (var3 == null) {
         if (com.aspose.slides.ms.System.Xml.v8.n5(var2.e2(), var2.k5().f4) && "http://www.w3.org/TR/WD-Xsl".equals(var2.t9())) {
            throw XsltException.create("The 'http://www.w3.org/TR/WD-Xsl' namespace is no longer supported.");
         } else {
            throw XsltException.create(
               "Stylesheet must start either with an 'Xsl:stylesheet' or an 'Xsl:transform' element, or with a literal result element that has an 'Xsl:version' attribute, where prefix 'Xsl' denotes the 'http://www.w3.org/1999/XSL/Transform' namespace."
            );
         }
      } else {
         var1.n5(var1.t1());
      }
   }

   protected final void n5(z1 var1, boolean var2) {
      z7 var3 = var1.u3();

      while (var3.n3() != 1) {
         if (!var1.a6()) {
            throw XsltException.create(
               "Stylesheet must start either with an 'Xsl:stylesheet' or an 'Xsl:transform' element, or with a literal result element that has an 'Xsl:version' attribute, where prefix 'Xsl' denotes the 'http://www.w3.org/1999/XSL/Transform' namespace."
            );
         }
      }

      if (com.aspose.slides.ms.System.Xml.v8.n5(var3.t9(), var3.k5().y6)) {
         if (!com.aspose.slides.ms.System.Xml.v8.n5(var3.e2(), var3.k5().f4) && !com.aspose.slides.ms.System.Xml.v8.n5(var3.e2(), var3.k5().q2)) {
            throw XsltException.create(
               "Stylesheet must start either with an 'Xsl:stylesheet' or an 'Xsl:transform' element, or with a literal result element that has an 'Xsl:version' attribute, where prefix 'Xsl' denotes the 'http://www.w3.org/1999/XSL/Transform' namespace."
            );
         }

         var1.t4();
         this.u9(var1);
         this.x8(var1);
         if (!var2) {
            this.e2(var1);
         }
      } else {
         var1.z1();
         this.h0(var1);
      }

      var1.q0();
   }

   public final j8 n5(z1 var1, r8 var2, int var3) {
      z7 var4 = var1.n5(var2);
      var1.n5(var4);

      try {
         var1.n5(new j8());
         var1.n5(var3);
         this.n5(var1, false);
      } catch (XsltCompileException var10) {
         throw var10;
      } catch (RuntimeException var11) {
         throw new XsltCompileException(var11, var4.z3(), var4.s7(), var4.x8());
      } finally {
         var1.k7();
      }

      return var1.m3();
   }

   private void e2(z1 var1) {
      ArrayList var2 = var1.c8().l6();
      int var3 = var1.l6();

      for (int var4 = var2.size() - 1; 0 <= var4; var4--) {
         r8 var5 = com.aspose.slides.internal.v6g.k5.n5(var2.get_Item(var4), r8.class);
         var2.set_Item(var4, this.n5(var1, var5, ++this.n5));
      }

      var1.n5(var3);
   }

   private void t9(z1 var1) {
      r8 var2 = var1.y4(var1.t2(var1.u3().k5().v4));
      String var3 = var2.toString();
      if (var1.n3(var3)) {
         throw XsltException.create("Stylesheet '{0}' cannot directly or indirectly include or import itself.", var3);
      }

      z7 var4 = var1.n5(var2);
      var1.n5(var4);

      try {
         this.n5(var1, true);
      } catch (XsltCompileException var10) {
         throw var10;
      } catch (RuntimeException var11) {
         throw new XsltCompileException(var11, var4.z3(), var4.s7(), var4.x8());
      } finally {
         var1.k7();
      }

      this.a6(var1);
   }

   public final void c8(z1 var1) {
      z7 var2 = var1.u3();
      String var3 = var2.e2();
      String var4 = null;
      String var5 = null;
      String var6 = null;
      String var7 = null;
      if (var2.m1()) {
         do {
            String var8 = var2.t9();
            String var9 = var2.e2();
            if (var8.length() == 0) {
               if (com.aspose.slides.ms.System.Xml.v8.n5(var9, var2.k5().y9)) {
                  var6 = var2.t4();
                  String[] var10 = new String[]{var6};
                  var4 = var1.n5(var10);
                  var6 = var10[0];
               } else if (com.aspose.slides.ms.System.Xml.v8.n5(var9, var2.k5().w8)) {
                  var7 = var2.t4();
                  String[] var14 = new String[]{var7};
                  var5 = var1.n5(var14);
                  var7 = var14[0];
               } else if (!var1.n3()) {
                  throw XsltException.create("'{0}' is an invalid attribute for the '{1}' element.", var9, var3);
               }
            }
         } while (var2.k7());

         var2.c8();
      }

      this.n5(var1, var4, "stylesheet-prefix");
      this.n5(var1, var5, "result-prefix");
      this.a6(var1);
      var1.n5(var4, new o0(var7, var5, var1.l6()));
   }

   public final void t2(z1 var1) {
      z7 var2 = var1.u3();
      String var3 = var2.e2();
      int var4 = -1;
      int var5 = -1;
      k6 var6 = null;
      if (var2.m1()) {
         do {
            String var7 = var2.t9();
            String var8 = var2.e2();
            String var9 = var2.t4();
            if (var7.length() == 0) {
               if (com.aspose.slides.ms.System.Xml.v8.n5(var8, var2.k5().j4)) {
                  var6 = var1.s7(var9);
               } else if (com.aspose.slides.ms.System.Xml.v8.n5(var8, var2.k5().o5)) {
                  var4 = var1.n5(var9, false, false, true);
               } else if (com.aspose.slides.ms.System.Xml.v8.n5(var8, var2.k5().l5)) {
                  var5 = var1.n5(var9, false, false, false);
               } else if (!var1.n3()) {
                  throw XsltException.create("'{0}' is an invalid attribute for the '{1}' element.", var8, var3);
               }
            }
         } while (var2.k7());

         var2.c8();
      }

      this.n5(var1, var4 != -1, "match");
      this.n5(var1, var5 != -1, "use");
      this.n5(var1, var6 != null, "name");
      var1.n5(var6, var4, var5);
   }

   protected final void s7(z1 var1) {
      com.aspose.slides.internal.x7n.s7 var2 = new com.aspose.slides.internal.x7n.s7();
      com.aspose.slides.internal.x7i.l6 var3 = new com.aspose.slides.internal.x7i.l6(var2, '#', '0', ';');
      k6 var4 = null;
      z7 var5 = var1.u3();
      if (var5.m1()) {
         do {
            if (var5.z1().length() == 0) {
               String var6 = var5.e2();
               String var7 = var5.t4();
               if (com.aspose.slides.ms.System.Xml.v8.n5(var6, var5.k5().j4)) {
                  var4 = var1.s7(var7);
               } else if (com.aspose.slides.ms.System.Xml.v8.n5(var6, var5.k5().m1)) {
                  var2.a6(var7);
               } else if (com.aspose.slides.ms.System.Xml.v8.n5(var6, var5.k5().o0)) {
                  var2.u9(var7);
               } else if (com.aspose.slides.ms.System.Xml.v8.n5(var6, var5.k5().p3)) {
                  var2.t2(var7);
               } else if (com.aspose.slides.ms.System.Xml.v8.n5(var6, var5.k5().v3)) {
                  var2.u3(var7);
               } else if (com.aspose.slides.ms.System.Xml.v8.n5(var6, var5.k5().j3)) {
                  var2.l6(var7);
               } else if (com.aspose.slides.ms.System.Xml.v8.n5(var6, var5.k5().r1)) {
                  var2.h0(var7);
               } else if (com.aspose.slides.ms.System.Xml.v8.n5(var6, var5.k5().k8)) {
                  var2.c8(var7);
               } else if (com.aspose.slides.ms.System.Xml.v8.n5(var6, var5.k5().z8)) {
                  if (this.n5(var7.length() == 1, var1)) {
                     var3.l6 = var7.charAt(0);
                  }
               } else if (com.aspose.slides.ms.System.Xml.v8.n5(var6, var5.k5().n9)) {
                  if (this.n5(var7.length() == 1, var1)) {
                     var3.k5 = var7.charAt(0);
                  }
               } else if (com.aspose.slides.ms.System.Xml.v8.n5(var6, var5.k5().r8) && this.n5(var7.length() == 1, var1)) {
                  var3.u3 = var7.charAt(0);
               }
            }
         } while (var5.k7());

         var5.c8();
      }

      var2.k5(com.aspose.slides.ms.System.d1.n5(new String[]{var2.z1(), var2.d5()}));
      if (var4 == null) {
         var4 = new k6();
      }

      var1.n5(var4, var3);
      this.a6(var1);
   }

   public final boolean n5(boolean var1, z1 var2) {
      if (!var1) {
         if (!var2.n3()) {
            throw XsltException.create("'{1}' is an invalid value for the '{0}' attribute.", var2.u3().e2(), var2.u3().t4());
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   protected final void l6(z1 var1, boolean var2) {
      String var3 = var1.t2(var1.u3().k5().y1);
      String[] var4 = f4.c4(var3);

      for (int var5 = 0; var5 < var4.length; var5++) {
         double var6 = this.n5(var4[var5]);
         var1.c8().n5(var1, var4[var5], var6, var2);
      }

      this.a6(var1);
   }

   private double n5(String var1) {
      if ("*".equals(var1)) {
         return -0.5;
      } else {
         int var2 = var1.length() - 2;
         if (0 > var2 || var1.charAt(var2) != ':' || var1.charAt(var2 + 1) != '*') {
            String var3 = null;
            String var4 = null;
            String[] var5 = new String[]{var3};
            String[] var6 = new String[]{var4};
            f0.n5(var1, var5, var6);
            var3 = var5[0];
            var4 = var6[0];
            return 0.0;
         } else if (!f0.l6(com.aspose.slides.ms.System.d1.l6(var1, 0, var2))) {
            throw XsltException.create("'{1}' is an invalid value for the '{0}' attribute.", "elements", var1);
         } else {
            return -0.25;
         }
      }
   }

   protected final void x8(z1 var1) {
      if (var1.u9()) {
         z7 var2 = var1.u3();
         boolean var3 = false;

         while (true) {
            switch (var2.n3()) {
               case 1:
                  String var4 = var2.e2();
                  String var5 = var2.t9();
                  if (com.aspose.slides.ms.System.Xml.v8.n5(var5, var2.k5().y6)) {
                     if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().h2)) {
                        if (var3) {
                           throw XsltException.create("'Xsl:import' instructions must precede all other element children of an 'Xsl:stylesheet' element.");
                        }

                        r8 var6 = var1.y4(var1.t2(var1.u3().k5().v4));
                        String var7 = var6.toString();
                        if (var1.n3(var7)) {
                           throw XsltException.create("Stylesheet '{0}' cannot directly or indirectly include or import itself.", var7);
                        }

                        var1.c8().l6().addItem(var6);
                        this.a6(var1);
                     } else if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().f0)) {
                        var3 = true;
                        this.t9(var1);
                     } else {
                        var3 = true;
                        var1.t4();
                        if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().a8)) {
                           this.l6(var1, false);
                        } else if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().b5)) {
                           this.l6(var1, true);
                        } else if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().c3)) {
                           this.z3(var1);
                        } else if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().x9)) {
                           this.t2(var1);
                        } else if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().z3)) {
                           this.s7(var1);
                        } else if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().f5)) {
                           this.c8(var1);
                        } else if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().h0)) {
                           var1.n5(var1.y2());
                        } else if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().w9)) {
                           d1 var8 = var1.k5(0);
                           if (var8 != null) {
                              this.n5(var8);
                           }
                        } else if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().a7)) {
                           d1 var9 = var1.k5(1);
                           if (var9 != null) {
                              this.n5(var9);
                           }
                        } else if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().a1)) {
                           var1.n5(var1.u6());
                        } else if (!var1.n3()) {
                           throw var1.x9();
                        }

                        var1.q0();
                     }
                  } else if (var5.length() == 0) {
                     throw XsltException.create("Top-level element '{0}' may not have a null namespace URI.", var2.y4());
                  }
               case 5:
               case 6:
               case 7:
               case 8:
                  if (!var1.a6()) {
                     var1.h0();
                     return;
                  }
                  break;
               case 2:
               case 3:
               case 4:
               default:
                  throw XsltException.create("The contents of '{0}' are invalid.", "stylesheet");
            }
         }
      }
   }

   protected final void n3(z1 var1) {
      do {
         this.y4(var1);
      } while (var1.a6());
   }

   protected final void y4(z1 var1) {
      z7 var2 = var1.u3();
      if (var2.n3() == 1) {
         String var3 = var2.t9();
         if (com.aspose.slides.ms.System.Xml.v8.n5(var3, var2.k5().y6)) {
            var1.t4();
            this.z1(var1);
            var1.q0();
         } else {
            var1.z1();
            var1.e2();
            if (var1.k5(var3)) {
               this.n5(var1.e5());
            } else {
               this.t4(var1);
            }

            var1.q0();
         }
      } else {
         this.t4(var1);
      }
   }

   private void z1(z1 var1) {
      z7 var2 = var1.u3();
      n5 var3 = null;
      String var4 = var2.e2();
      if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().k5)) {
         var3 = var1.w1();
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().u3)) {
         var3 = var1.r4();
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().u9)) {
         var3 = var1.c4();
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().c8)) {
         var3 = var1.y1();
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().y4)) {
         var3 = var1.a0();
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().e2)) {
         var3 = var1.d2();
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().t9)) {
         var3 = var1.d5();
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().z1)) {
         var3 = var1.s3();
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().y2)) {
         var3 = var1.p8();
      } else {
         if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().s3)) {
            return;
         }

         if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().p8)) {
            var3 = var1.f2();
         } else if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().t1)) {
            var3 = var1.l6(0);
         } else if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().s0)) {
            var3 = var1.i1();
         } else if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().d1)) {
            var3 = var1.b3();
         } else if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().w5)) {
            var3 = var1.o0();
         } else if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().q3)) {
            var3 = var1.a5();
         } else if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().j6)) {
            var3 = var1.v0();
         } else if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().w9)) {
            var3 = var1.k5(2);
         } else {
            if (!var1.n3()) {
               throw var1.x9();
            }

            var3 = var1.e5();
         }
      }

      this.n5(var3);
   }

   private void t4(z1 var1) {
      z7 var2 = var1.u3();
      switch (var2.n3()) {
         case 1:
            this.n5(var1.a3());
            this.q0(var1);
            if (var1.u9()) {
               this.n3(var1);
               var1.h0();
            }

            this.n5(new c4(1));
         case 2:
         case 3:
         case 6:
         case 7:
         case 8:
         default:
            break;
         case 4:
         case 5:
            this.n5(var1.p3());
      }
   }

   private void q0(z1 var1) {
      z7 var2 = var1.u3();
      if (var2.u3().l6("use-attribute-sets", var2.k5().y6)) {
         this.n5(var1.h2());
         var2.u3().q0();
      }

      var1.t9();
      if (var2.m3()) {
         do {
            String var3 = var2.t4();
            if (!"http://www.w3.org/1999/XSL/Transform".equals(var3) && !var1.u3(var3) && !var1.k5(var3) && !var1.a6(var3)) {
               this.n5(new b3(var2));
            }
         } while (var2.z8());

         var2.c8();
      }

      if (var2.m1()) {
         do {
            if (!com.aspose.slides.ms.System.Xml.v8.n5(var2.t9(), var2.k5().y6)) {
               this.n5(var1.a3());
               this.n5(var1.t4(var2.t4()));
               this.n5(new c4(2));
            }
         } while (var2.k7());

         var2.c8();
      }
   }

   private void z3(z1 var1) {
      var1.t2().n5().l6(var1);
   }

   public final void n5(n5 var1) {
      if (this.l6 == null) {
         this.l6 = new ArrayList();
      }

      this.l6.addItem(var1);
      this.k5 = null;
   }

   private void n5() {
      if (this.k5 == null) {
         m1 var1 = new m1();
         this.n5(var1);
         this.k5 = var1;
      }
   }

   protected final void n5(y2 var1) {
      this.n5();
      this.k5.n5(var1);
   }

   protected final void n5(ArrayList var1) {
      this.n5();
      this.k5.n5(var1);
   }

   @Override
   public void n5(p3 var1, l6 var2) {
      switch (var2.k5()) {
         case 0:
            if (this.l6 != null && this.l6.size() > 0) {
               var1.n5(var2);
               var2.n5(1);
            } else {
               var2.s7();
            }
            break;
         case 1:
            var2.s7();
            break;
         default:
            com.aspose.slides.internal.f8y.n5.n5("Invalid Container action execution state");
      }
   }

   public final n5 n5(int var1) {
      return this.l6 != null && var1 < this.l6.size() ? (n5)this.l6.get_Item(var1) : null;
   }

   public final void l6(k6 var1) {
      if (this.l6 != null) {
         IEnumerator var2 = this.l6.iterator();

         try {
            while (var2.hasNext()) {
               t9 var3 = (t9)var2.next();
               s4 var4 = com.aspose.slides.internal.v6g.k5.n5(var3, s4.class);
               if (var4 != null && k6.n5(var4.k5(), var1)) {
                  throw XsltException.create(
                     "Value of parameter '{0}' cannot be specified more than once within a single 'Xsl:call-template' or 'Xsl:apply-templates' element.",
                     var1.toString()
                  );
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               ((IDisposable)var2).dispose();
            }
         }
      }
   }

   @Override
   public void n5(z1 var1) {
      if (this.l6 != null) {
         int var2 = this.l6.size();

         for (int var3 = 0; var3 < this.l6.size(); var3++) {
            ((n5)this.l6.get_Item(var3)).n5(var1);
         }
      }
   }
}
