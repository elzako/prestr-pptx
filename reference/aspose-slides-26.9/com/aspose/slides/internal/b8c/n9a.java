package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.ms.System.IDisposable;

public final class n9a extends c8 {
   private int t2 = -1;
   private com.aspose.slides.ms.System.Xml.a0 s7;
   private Hashtable x8;
   private com.aspose.slides.ms.System.Xml.s2 n3;
   private boolean y4 = false;
   private Hashtable e2;
   private s9 t9;
   private n7 z1 = null;
   private int t4;
   private static final v5 q0 = v5.u9(0);
   private static final v5 z3 = v5.h0(10);
   private static final v5 m1 = q0.n5((j9e)null);
   private String k7;
   private String m3;
   private String z8;
   private String j5;
   private String w1;
   private String r4;
   private String c4;
   private String y2;

   public n9a(c8 var1) {
      super(var1);
      this.t9();
   }

   public n9a(com.aspose.slides.ms.System.Xml.s8 var1, v2 var2, com.aspose.slides.ms.System.Xml.v0 var3) {
      super(var1, var2, var3);
      this.t9();
   }

   private void t9() {
      this.n3 = this.l6.b3();
      if (this.n3 == null) {
         this.n3 = new com.aspose.slides.ms.System.Xml.s2(this.u9());
         this.y4 = true;
      }

      this.s7 = new com.aspose.slides.ms.System.Xml.a0(10);
      this.a6 = new com.aspose.slides.internal.l7h.a5();
      this.x8 = new Hashtable();
      this.n5 = new x0();
      this.c8 = false;
      this.t4 = 3;
      this.n5(com.aspose.slides.ms.System.Xml.k6.n5);
      this.k7 = this.u9().n5("http://www.w3.org/2000/xmlns/");
      this.m3 = this.u9().n5("http://www.w3.org/2001/XMLSchema");
      this.z8 = this.u9().n5("http://www.w3.org/2001/XMLSchema-instance");
      this.j5 = this.u9().n5("type");
      this.w1 = this.u9().n5("nil");
      this.r4 = this.u9().n5("schemaLocation");
      this.c4 = this.u9().n5("noNamespaceSchemaLocation");
      this.y2 = this.u9().n5("Schema");
   }

   @Override
   public void l6() {
      if (this.z1()) {
         this.t4();
      } else {
         switch (this.l6.s7()) {
            case 1:
               this.q0();
               if (this.l6.m1()) {
                  this.m1();
               }
            case 2:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
               break;
            case 3:
            case 4:
            case 14:
               this.y4();
               break;
            case 13:
               this.e2();
               break;
            case 15:
               this.m1();
         }
      }
   }

   @Override
   public void k5() {
      this.w1();
   }

   private boolean z1() {
      return this.z1 != null;
   }

   private void t4() {
      if (!this.z1.u3()) {
         this.z1.n5();
         a9 var1 = this.z1.l6();
         String var2 = null;
         if (var1 != null && var1.w1() == 0) {
            try {
               x0 var3 = new x0();
               var3.n5(3);
               var2 = var1.a6() == null ? com.aspose.slides.ms.System.d1.n5 : var1.a6();
               if (!this.n3().n3().containsKey(var2) && this.a6().n5(var2, var3, var1, true) != null) {
                  this.n3().n5(var3, this.x8());
               }
            } catch (XmlSchemaException var4) {
               this.n5("Cannot load the Schema for the namespace '{0}' - {1}", new String[]{this.s7().l6(), var4.getMessage()}, 0);
            }
         }

         this.z1 = null;
      }
   }

   private void q0() {
      this.k5.l6(this.l6.n3(), this.l6.y4());
      Object var1 = this.z3();
      if (this.l6(this.k5.l6(), this.k5.n5()) && this.l6.t4() > 0) {
         this.z1 = new n7(3, this.u9(), this.h0(), this.x8());
         this.z1.l6(this.l6, null);
         this.t4();
      } else {
         this.n5(var1);
      }
   }

   private Object z3() {
      Object var1 = null;
      int var2 = 0;
      if (this.u3.k5) {
         if (this.u3.n5) {
            this.n5("Element '{0}' must have no character or element children.", this.k5.toString());
            return null;
         }

         int[] var3 = new int[]{0};
         var1 = this.u3.c8.z1().n5(this.k5, this.u3, var3);
         var2 = var3[0];
         if (var1 == null) {
            byte var4 = 1;
            this.u3.u9 = var4;
            this.t4 = var4;
            if (var2 == -2) {
               this.n5("Element '{0}' cannot appear more than once if content model type is \"all\".", this.k5.toString());
            }

            v7u.n5(this.k5, this.u3, this.x8(), this.l6, this.l6.q0(), this.c8().ah_(), this.c8().ai_(), null);
         }
      }

      return var1;
   }

   private void n5(Object var1) {
      com.aspose.slides.ms.System.Xml.k6 var2 = null;
      String var3 = null;
      t6 var4 = this.l6(var1);
      this.n5(this.k5);
      if (this.y4) {
         this.n3.k5();
      }

      com.aspose.slides.ms.System.Xml.k6[] var5 = new com.aspose.slides.ms.System.Xml.k6[]{var2};
      String[] var6 = new String[]{var3};
      this.n5(var5, var6);
      var2 = var5[0];
      var3 = var6[0];
      if (this.t4 != 1) {
         if (var4 == null || !var2.k5() || var3 != null) {
            var4 = this.n5(var4, var2, var3);
         }

         if (var4 == null) {
            if (this.z8() && this.t4 == 3) {
               this.n5("The '{0}' element is not declared.", v7u.n5(this.u3.s7, this.u3.x8));
            } else {
               this.n5("Could not find Schema information for the element '{0}'.", v7u.n5(this.u3.s7, this.u3.x8), 1);
            }
         }
      }

      this.u3.c8 = var4;
      this.r4();
      this.k7();
      if (this.u3.c8 != null) {
         this.m3();
         this.u3.k5 = this.t4 != 1;
         this.u3.c8.z1().n5(this.u3);
      }
   }

   private void n5(com.aspose.slides.ms.System.Xml.k6[] var1, String[] var2) {
      String[] var3 = null;
      String var4 = null;
      var1[0] = com.aspose.slides.ms.System.Xml.k6.n5;
      var2[0] = null;
      if (this.l6.t4() == 0) {
         this.u3(com.aspose.slides.ms.System.d1.n5, null);
         IGenericEnumerator var5 = this.n3.n5(1).getValues().iterator();

         try {
            while (var5.hasNext()) {
               String var6 = (String)var5.next();
               this.u3(var6, null);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }
      }

      if (this.l6.k5()) {
         do {
            String var10 = this.l6.y4();
            String var12 = this.l6.n3();
            if (com.aspose.slides.ms.System.Xml.v8.n5(var10, this.k7)) {
               this.u3(this.l6.z1(), null);
               if (this.y4) {
                  this.n3.n5(this.l6.e2().length() == 0 ? com.aspose.slides.ms.System.d1.n5 : this.l6.n3(), this.l6.z1());
               }
            } else if (com.aspose.slides.ms.System.Xml.v8.n5(var10, this.z8)) {
               if (com.aspose.slides.ms.System.Xml.v8.n5(var12, this.r4)) {
                  var3 = com.aspose.slides.internal.v6g.k5.k5(m1.n5(this.l6.z1(), this.u9(), this.n3), String[].class);
               } else if (com.aspose.slides.ms.System.Xml.v8.n5(var12, this.c4)) {
                  var4 = this.l6.z1();
               } else if (com.aspose.slides.ms.System.Xml.v8.n5(var12, this.j5)) {
                  var1[0] = (com.aspose.slides.ms.System.Xml.k6)z3.n5(this.l6.z1(), this.u9(), this.n3);
               } else if (com.aspose.slides.ms.System.Xml.v8.n5(var12, this.w1)) {
                  var2[0] = this.l6.z1();
               }
            }
         } while (this.l6.u3());

         this.l6.a6();
      }

      if (var4 != null) {
         this.u3(com.aspose.slides.ms.System.d1.n5, var4);
      }

      if (var3 != null) {
         for (int var11 = 0; var11 < var3.length - 1; var11 += 2) {
            this.u3(var3[var11], var3[var11 + 1]);
         }
      }
   }

   private void m1() {
      if (this.y4) {
         this.n3.u3();
      }

      if (this.u3.c8 != null) {
         if (!this.u3.n5) {
            if (this.u3.k5 && !this.u3.c8.z1().l6(this.u3)) {
               v7u.n5(this.u3, this.x8(), this.l6, this.l6.q0(), this.c8().ah_(), this.c8().ai_(), null);
            }

            if (this.c8 && !this.u3.n5) {
               String var1 = !this.h0 ? this.u9 : this.a6.toString();
               if (var1.length() != 0 || this.u3.c8.s3() == null) {
                  this.n5(var1, (h9)null);
                  this.c8 = false;
               }
            }
         }

         if (this.c4()) {
            this.a0();
         }
      }

      this.j5();
   }

   private t6 l6(Object var1) {
      t6 var2 = null;
      if (var1 != null) {
         v1 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, v1.class);
         if (var3 != null) {
            var2 = var3.a0();
         } else {
            f7 var4 = (f7)var1;
            this.t4 = var4.c8();
         }
      }

      return var2;
   }

   private t6 n5(t6 var1, com.aspose.slides.ms.System.Xml.k6 var2, String var3) {
      if (var1 == null) {
         var1 = this.n5.l6(this.k5);
      }

      if (var1 != null) {
         if (var2.k5()) {
            if (var1.s7()) {
               this.n5("The element '{0}' is abstract or its type is abstract.", v7u.n5(this.u3.s7, this.u3.x8));
               var1 = null;
            }
         } else if (var3 != null && com.aspose.slides.ms.System.d1.a6(var3, "true")) {
            this.l6("There can be no type value when attribute is 'xsi:nil' and has value 'true'.");
         } else {
            t6 var4 = null;
            t6[] var5 = new t6[]{var4};
            boolean var6 = !this.n5.y4().tryGetValue(var2, var5) && com.aspose.slides.ms.System.d1.a6(var2.n5(), this.m3);
            var4 = var5[0];
            if (var6) {
               u1s var7 = com.aspose.slides.internal.b8c.t4.n5(new com.aspose.slides.ms.System.Xml.k6(var2.l6(), this.m3));
               if (var7 != null) {
                  var4 = var7.u6();
               }
            }

            if (var4 == null) {
               this.n5("This is an invalid xsi:type '{0}'.", var2.toString());
               var1 = null;
            } else if (!j9e.n5(var4.y1(), var1.y1(), var1.n3())) {
               this.n5(
                  "The xsi:type attribute value '{0}' is not valid for the element '{1}', either because it is not a type validly derived from the type in the Schema, or because it has xsi:type derivation blocked.",
                  new String[]{var2.toString(), v7u.n5(this.u3.s7, this.u3.x8)}
               );
               var1 = null;
            } else {
               var1 = var4;
            }
         }

         if (var1 != null && var1.x8()) {
            if (var3 != null) {
               this.u3.n5 = com.aspose.slides.ms.System.Xml.f4.t2(var3);
               if (this.u3.n5 && var1.s3() != null) {
                  this.l6("There must be no fixed value when an attribute is 'xsi:nil' and has a value of 'true'.");
               }
            }
         } else if (var3 != null) {
            this.l6("If the 'nillable' attribute is false in the Schema, the 'xsi:nil' attribute must not be present in the instance.");
         }
      }

      return var1;
   }

   private void k7() {
      if (this.u3.c8 != null) {
         if (this.u3.c8.s7()) {
            this.n5("The element '{0}' is abstract or its type is abstract.", v7u.n5(this.u3.s7, this.u3.x8));
         }

         this.l6.n5(this.u3.c8.y1());
         if (this.l6.m1() && !this.u3.n5 && this.u3.c8.s3() != null) {
            this.l6.l6(this.k5(this.u3.c8.s3()));
            this.u3.n5 = true;
         } else {
            this.l6.l6((Object)null);
         }

         if (this.u3.c8.t9() || this.c4()) {
            this.x8.clear();
         }
      }

      if (this.l6.k5()) {
         do {
            if (this.l6.y4() != this.k7 && this.l6.y4() != this.z8) {
               try {
                  this.l6.n5((Object)null);
                  com.aspose.slides.ms.System.Xml.k6 var1 = new com.aspose.slides.ms.System.Xml.k6(this.l6.n3(), this.l6.y4());
                  boolean var2 = this.t4 == 1;
                  boolean[] var3 = new boolean[]{var2};
                  h9 var4 = this.n5.n5(this.u3.c8, var1, var3);
                  var2 = var3[0];
                  if (var4 == null) {
                     if (!var2) {
                        if (this.u3.c8 == null && this.t4 == 3 && var1.n5().length() != 0 && this.n5.u3(var1.n5())) {
                           this.n5("The '{0}' attribute is not declared.", var1.toString());
                        } else {
                           this.n5("Could not find Schema information for the attribute '{0}'.", var1.toString(), 1);
                        }
                     }
                  } else {
                     if (this.u3.c8 != null && (this.u3.c8.t9() || this.t2 != -1)) {
                        this.x8.addItem(var4.z8(), var4);
                     }

                     this.l6.n5(var4.y1());
                     if (var4.a0() != null) {
                        this.n5(this.l6.z1(), var4);
                     }

                     if (this.c4()) {
                        this.n5(this.l6.n3(), this.l6.y4(), this.l6.f0(), this.l6.z1(), var4);
                     }
                  }
               } catch (XmlSchemaException var5) {
                  var5.setSource(this.l6.q0(), this.c8().ah_(), this.c8().ai_());
                  this.n5(var5);
               }
            }
         } while (this.l6.u3());

         this.l6.a6();
      }
   }

   private void m3() {
      if (this.u3.c8.e2()) {
         for (int var1 = 0; var1 < this.u3.c8.m1().size(); var1++) {
            h9 var2 = (h9)this.u3.c8.m1().get_Item(var1);
            this.l6.n5(var2);
            if (this.c4() && !this.x8.contains(var2.z8())) {
               this.n5(var2.z8().l6(), var2.z8().n5(), this.k5(var2.s3()), var2.d5(), var2);
            }
         }
      }

      if (this.u3.c8.t9()) {
         try {
            this.u3.c8.n5(this.x8, this.l6.v0());
         } catch (XmlSchemaException var3) {
            var3.setSource(this.l6.q0(), this.c8().ah_(), this.c8().ai_());
            this.n5(var3);
         }
      }

      if (this.u3.c8.a0() != null) {
         this.c8 = true;
         this.h0 = false;
         this.u9 = com.aspose.slides.ms.System.d1.n5;
         this.a6.n5(0);
      }
   }

   private void k5(String var1, String var2) {
      com.aspose.slides.ms.System.Xml.p5 var3 = null;
      x0 var4 = null;

      try {
         com.aspose.slides.ms.System.r8 var5 = this.t2().n5(this.s7(), var2);
         com.aspose.slides.internal.z0k.t4 var6 = (com.aspose.slides.internal.z0k.t4)this.t2().n5(var5, null, null);
         var3 = new com.aspose.slides.ms.System.Xml.p5(var5.toString(), var6, this.u9());
         n7 var7 = new n7(3, this.u9(), this.h0(), this.x8());
         var7.n5(this.t2());
         int var8 = var7.n5(var3, var1);
         var4 = new x0();
         var4.n5(var8);
         if (var8 == 3) {
            if (this.a6().k5() == null) {
               this.a6().n5(this.x8());
            }

            this.a6().n5(var1, var4, var7.l6(), true);
         }

         this.n3().n5(var4, this.x8());

         while (var3.u9()) {
         }
      } catch (XmlSchemaException var13) {
         var4 = null;
         this.n5("Cannot load the Schema for the namespace '{0}' - {1}", new String[]{var1, var13.getMessage()}, 0);
      } catch (RuntimeException var14) {
         var4 = null;
         this.n5("Cannot load the Schema for the namespace '{0}' - {1}", new String[]{var1, var14.getMessage()}, 1);
      } finally {
         if (var3 != null) {
            var3.w1();
         }
      }
   }

   private void u3(String var1, String var2) {
      if (this.t2() != null) {
         if (!this.n3().n3().containsKey(var1) || this.n3.l6(var1) == null) {
            x0 var3 = null;
            if (this.a6() != null) {
               var3 = this.a6().l6(var1);
            }

            if (var3 != null) {
               if (var3.x8() != 3) {
                  throw new XmlException("Unsupported combination of validation types.", com.aspose.slides.ms.System.d1.n5, this.c8().ah_(), this.c8().ai_());
               }

               this.n3().n5(var3, this.x8());
            } else {
               if (var2 != null) {
                  this.k5(var1, var2);
               }
            }
         }
      }
   }

   private boolean z8() {
      return this.n5.x8() != 0;
   }

   @Override
   public boolean n5() {
      return this.u3.c8 != null ? this.u3.c8.z1().k5() : false;
   }

   private void n5(int var1, String var2) {
      switch (var1) {
         case 1:
            if (this.n5(var2) != null) {
               this.n5("'{0}' is already used as an ID.", var2);
            } else {
               this.n5(var2, this.u3.s7);
            }
            break;
         case 2:
            Object var3 = this.n5(var2);
            if (var3 == null) {
               this.t9 = new s9(this.t9, var2, this.c8().ah_(), this.c8().ai_());
            }
         case 3:
         default:
            break;
         case 4:
            n5(this.n5, var2, this, this.x8(), this.l6.q0(), this.c8().ah_(), this.c8().ai_());
      }
   }

   private void n5(String var1, h9 var2) {
      try {
         this.l6.l6((Object)null);
         boolean var3 = var2 != null;
         v5 var4 = var3 ? var2.a0() : this.u3.c8.a0();
         if (var4 == null) {
            return;
         }

         Object var5 = var4.n5(var1, this.u9(), this.n3, true);
         int var6 = var4.t2();
         if (var6 == 4 || var6 == 1 || var6 == 2) {
            if (var4.x8() == 1) {
               String[] var7 = com.aspose.slides.internal.v6g.k5.k5(var5, String[].class);

               for (int var8 = 0; var8 < var7.length; var8++) {
                  this.n5(var4.t2(), var7[var8]);
               }
            } else {
               this.n5(var4.t2(), (String)var5);
            }
         }

         h1 var10 = var3 ? var2 : this.u3.c8;
         if (!var10.k5(var5)) {
            if (var3) {
               this.n5("The value of the '{0}' attribute does not equal its fixed value.", var2.z8().toString());
            } else {
               this.n5("The value of the '{0}' element does not equal its fixed value.", v7u.n5(this.u3.s7, this.u3.x8));
            }
         }

         if (var4.x8() == 2) {
            var5 = this.k5(var5);
         }

         this.l6.l6(var5);
      } catch (XmlSchemaException var9) {
         if (var2 != null) {
            this.n5("The '{0}' attribute has an invalid value according to its data type.", var2.z8().toString());
         } else {
            this.n5("The '{0}' element has an invalid value according to its data type.", v7u.n5(this.u3.s7, this.u3.x8));
         }
      }
   }

   public final void n5(String var1, Object var2) {
      if (this.e2 == null) {
         this.e2 = new Hashtable();
      }

      this.e2.addItem(var1, var2);
   }

   @Override
   public Object n5(String var1) {
      return this.e2 == null ? null : this.e2.get_Item(var1);
   }

   public final boolean l6(String var1, String var2) {
      return com.aspose.slides.ms.System.Xml.v8.n5(var2, this.m3) && com.aspose.slides.ms.System.Xml.v8.n5(var1, this.y2);
   }

   private void n5(com.aspose.slides.ms.System.Xml.k6 var1) {
      this.u3 = (x5)this.s7.n5();
      if (this.u3 == null) {
         this.u3 = new x5();
         this.s7.n5(this.u3);
      }

      this.u3.s7 = var1.l6();
      this.u3.x8 = var1.n5();
      this.u3.e2 = false;
      this.u3.n5 = false;
      this.u3.u9 = this.t4;
      this.u3.k5 = false;
      this.u3.n3 = null;
   }

   private void j5() {
      if (this.s7.u3() > 1) {
         this.s7.l6();
         if (this.t2 == this.s7.u3()) {
            this.t2 = -1;
         }

         this.u3 = (x5)this.s7.k5();
         this.t4 = this.u3.u9;
      }
   }

   private void w1() {
      s9 var1 = this.t9;

      while (var1 != null) {
         if (this.n5(var1.n5) == null) {
            this.n5(new XmlSchemaException("Reference to undeclared ID is '{0}'.", var1.n5, this.l6.q0(), var1.l6, var1.k5));
         }

         s9 var2 = var1.u3;
         var1.u3 = null;
         var1 = var2;
      }

      this.t9 = null;
   }

   private void r4() {
      if (this.u3.c8 != null) {
         if (this.u3.c8.q0() != null) {
            this.y2();
         }

         if (this.c4()) {
            this.y1();
         }
      }
   }

   private boolean c4() {
      return this.t2 != -1;
   }

   private void y2() {
      this.u3.n3 = new t9[this.u3.c8.q0().length];
      int var1 = 0;

      for (int var2 = 0; var2 < this.u3.c8.q0().length; var2++) {
         this.u3.n3[var1++] = new t9(this.u3.c8.q0()[var2]);
      }

      for (int var7 = 0; var7 < this.u3.n3.length; var7++) {
         if (this.u3.n3[var7].n5.n5() == 2) {
            boolean var3 = false;

            for (int var4 = this.s7.u3() - 1; var4 >= (this.t2 >= 0 ? this.t2 : this.s7.u3() - 1); var4--) {
               if (((x5)this.s7.n5(var4)).n3 != null) {
                  t9[] var5 = ((x5)this.s7.n5(var4)).n3;

                  for (int var6 = 0; var6 < var5.length; var6++) {
                     if (com.aspose.slides.ms.System.Xml.k6.n5(var5[var6].n5.n5, this.u3.n3[var7].n5.l6)) {
                        var3 = true;
                        if (var5[var6].a6 == null) {
                           var5[var6].a6 = new Hashtable();
                        }

                        this.u3.n3[var7].u3 = var5[var6].a6;
                        break;
                     }
                  }

                  if (var3) {
                     break;
                  }
               }
            }

            if (!var3) {
               this.n5("The Keyref '{0}' cannot find the referred key or unique in scope.", v7u.n5(this.u3.s7, this.u3.x8));
            }
         }
      }

      if (this.t2 == -1) {
         this.t2 = this.s7.u3() - 1;
      }
   }

   private void y1() {
      for (int var1 = this.t2; var1 < this.s7.u3(); var1++) {
         if (((x5)this.s7.n5(var1)).n3 != null) {
            t9[] var2 = ((x5)this.s7.n5(var1)).n3;

            for (int var3 = 0; var3 < var2.length; var3++) {
               if (var2[var3].l6.n5(this.l6.n3(), this.l6.y4())) {
                  com.aspose.slides.internal.f8y.n5.u3("Selector Match!");
                  com.aspose.slides.internal.f8y.n5.u3(com.aspose.slides.ms.System.d1.n5(new String[]{"Name: ", this.l6.n3(), "\t|\tURI: ", this.l6.y4(), "\n"}));
                  var2[var3].l6.n5(this.c8().ah_(), this.c8().ai_());
               }

               for (int var4 = 0; var4 < var2[var3].k5.size(); var4++) {
                  a1 var5 = (a1)var2[var3].k5.get_Item(var4);
                  if (var5.n5(this.l6.n3(), this.l6.y4())) {
                     com.aspose.slides.internal.f8y.n5.u3("Element Field Match!");
                     if (this.u3.c8 != null) {
                        if (this.u3.c8.a0() == null) {
                           this.n5("The field '{0}' is expecting an element or attribute with simple type or simple content.", this.l6.n3());
                        } else {
                           var5.n5 = true;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void n5(String var1, String var2, Object var3, String var4, h9 var5) {
      for (int var6 = this.t2; var6 < this.s7.u3(); var6++) {
         if (((x5)this.s7.n5(var6)).n3 != null) {
            t9[] var7 = ((x5)this.s7.n5(var6)).n3;

            for (int var8 = 0; var8 < var7.length; var8++) {
               for (int var9 = 0; var9 < var7[var8].k5.size(); var9++) {
                  a1 var10 = (a1)var7[var8].k5.get_Item(var9);
                  if (var10.k5(var1, var2)) {
                     com.aspose.slides.internal.f8y.n5.u3("Attribute Field Match!");
                     com.aspose.slides.internal.f8y.n5.u3("Attribute Field Filling Value!");
                     com.aspose.slides.internal.f8y.n5.u3(com.aspose.slides.ms.System.d1.n5(new Object[]{"Name: ", var1, "\t|\tURI: ", var2, "\t|\tValue: ", var3, "\n"}));
                     if (var10.l6.n5(var10.k5()) != null) {
                        this.n5("The field '{0}' is expecting at the most one value.", var1);
                     } else if (var5 != null && var5.a0() != null) {
                        var10.l6.n5(var10.k5(), new p9(var3, var4, var5.a0()));
                     }
                  }
               }
            }
         }
      }
   }

   private Object k5(Object var1) {
      e4j var2 = com.aspose.slides.internal.v6g.k5.n5(var1, e4j.class);
      if (var2 != null) {
         var1 = var2.l6();
      }

      return var1;
   }

   private void a0() {
      for (int var1 = this.s7.u3() - 1; var1 >= this.t2; var1--) {
         if (((x5)this.s7.n5(var1)).n3 != null) {
            t9[] var2 = ((x5)this.s7.n5(var1)).n3;

            for (int var3 = 0; var3 < var2.length; var3++) {
               for (int var4 = 0; var4 < var2[var3].k5.size(); var4++) {
                  a1 var5 = (a1)var2[var3].k5.get_Item(var4);
                  if (var5.n5) {
                     com.aspose.slides.internal.f8y.n5.u3("Element Field Filling Value!");
                     com.aspose.slides.internal.f8y.n5.u3(
                        com.aspose.slides.ms.System.d1.n5(new Object[]{"Name: ", this.l6.n3(), "\t|\tURI: ", this.l6.y4(), "\t|\tValue: ", this.l6.f0(), "\n"})
                     );
                     var5.n5 = false;
                     if (var5.l6.n5(var5.k5()) != null) {
                        this.n5("The field '{0}' is expecting at the most one value.", this.l6.n3());
                     } else {
                        String var6 = !this.h0 ? this.u9 : this.a6.toString();
                        if (this.l6.f0() != null && var6.length() != 0) {
                           var5.l6.n5(var5.k5(), new p9(this.l6.f0(), var6, this.u3.c8.a0()));
                        }
                     }
                  }

                  var5.l6(this.l6.n3(), this.l6.y4());
               }

               if (var2[var3].l6.l6(this.l6.n3(), this.l6.y4())) {
                  h5 var13 = var2[var3].l6.u3();
                  switch (var2[var3].n5.n5()) {
                     case 0:
                        if (var13.k5()) {
                           if (var2[var3].u3.contains(var13)) {
                              this.n5(
                                 new XmlSchemaException(
                                    "There is a duplicate key sequence '{0}' for the '{1}' key or unique identity constraint.",
                                    new String[]{var13.toString(), var2[var3].n5.n5.toString()},
                                    this.l6.q0(),
                                    var13.n5(),
                                    var13.l6()
                                 )
                              );
                           } else {
                              var2[var3].u3.addItem(var13, var13);
                           }
                        }
                        break;
                     case 1:
                        if (!var13.k5()) {
                           this.n5(
                              new XmlSchemaException(
                                 "The identity constraint '{0}' validation has failed. Either a key is missing or the existing key has an empty node.",
                                 var2[var3].n5.n5.toString(),
                                 this.l6.q0(),
                                 var13.n5(),
                                 var13.l6()
                              )
                           );
                        } else if (var2[var3].u3.contains(var13)) {
                           this.n5(
                              new XmlSchemaException(
                                 "There is a duplicate key sequence '{0}' for the '{1}' key or unique identity constraint.",
                                 new String[]{var13.toString(), var2[var3].n5.n5.toString()},
                                 this.l6.q0(),
                                 var13.n5(),
                                 var13.l6()
                              )
                           );
                        } else {
                           var2[var3].u3.addItem(var13, var13);
                        }
                        break;
                     case 2:
                        if (var2[var3].u3 != null && var13.k5() && !var2[var3].u3.contains(var13)) {
                           var2[var3].u3.addItem(var13, var13);
                        }
                  }
               }
            }
         }
      }

      t9[] var10 = ((x5)this.s7.n5(this.s7.u3() - 1)).n3;
      if (var10 != null) {
         for (int var11 = 0; var11 < var10.length; var11++) {
            if (var10[var11].n5.n5() != 2 && var10[var11].a6 != null) {
               IEnumerator var12 = var10[var11].a6.getKeys().iterator();

               try {
                  while (var12.hasNext()) {
                     h5 var14 = (h5)var12.next();
                     if (!var10[var11].u3.contains(var14)) {
                        this.n5(
                           new XmlSchemaException(
                              "The key sequence '{0}' in '{1}' Keyref fails to refer to some key.",
                              new String[]{var14.toString(), var10[var11].n5.n5.toString()},
                              this.l6.q0(),
                              var14.n5(),
                              var14.l6()
                           )
                        );
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
                     ((IDisposable)var12).dispose();
                  }
               }
            }
         }
      }
   }
}
