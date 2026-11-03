package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.exceptions.XmlSchemaException;

public final class q1 extends c8 {
   private static q1$n5 t2 = new q1$n5(null);
   private com.aspose.slides.ms.System.Xml.a0 s7;
   private Hashtable x8;
   private com.aspose.slides.ms.System.Xml.k6 n3 = com.aspose.slides.ms.System.Xml.k6.n5;
   private Hashtable y4;
   private s9 e2;
   private boolean t9;

   public q1(com.aspose.slides.ms.System.Xml.s8 var1, com.aspose.slides.ms.System.Xml.v0 var2, boolean var3) {
      super(var1, null, var2);
      this.t9 = var3;
      this.t9();
   }

   private void t9() {
      this.s7 = new com.aspose.slides.ms.System.Xml.a0(10);
      this.a6 = new com.aspose.slides.internal.l7h.a5();
      this.n3 = com.aspose.slides.ms.System.Xml.k6.n5;
      this.x8 = new Hashtable();
      this.n5 = new x0();
      this.c8 = false;
      this.l6(this.n3);
   }

   @Override
   public void l6() {
      if (this.n5.x8() == 1) {
         switch (this.l6.s7()) {
            case 1:
               this.q0();
               if (this.l6.m1()) {
                  this.z8();
               }
            case 2:
            case 6:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
               break;
            case 3:
            case 4:
               this.y4();
               break;
            case 5:
               if (!this.n5(new com.aspose.slides.ms.System.Xml.k6(this.l6.n3(), this.l6.e2()))) {
                  this.y4();
               }
               break;
            case 7:
            case 8:
               this.t4();
               break;
            case 13:
            case 14:
               if (this.z1()) {
                  this.e2();
               }
               break;
            case 15:
               this.z8();
         }
      } else if (this.l6.t4() == 0 && this.l6.s7() == 1) {
         this.n5("No DTD found.", this.n3.toString(), 1);
      }
   }

   private boolean z1() {
      if (this.l6.v0() && this.u3.c8 != null && this.u3.c8.w1() && this.u3.c8.z1().l6() == 2) {
         this.l6("The standalone document declaration must have a value of 'no'.");
         return false;
      } else {
         return true;
      }
   }

   private void t4() {
      if (this.u3.k5 && this.u3.c8.z1() == z1.n5) {
         this.l6("The element cannot contain comment or processing instruction. Content model is empty.");
      }
   }

   private void q0() {
      this.k5.l6(this.l6.n3(), this.l6.e2());
      if (this.l6.t4() == 0 && !this.n5.u9().k5() && !this.n5.u9().equals(this.k5)) {
         this.l6("Root element name must match the DocType name.");
      } else {
         this.z3();
      }

      this.m3();
   }

   private void z3() {
      if (this.u3.k5) {
         int var1 = 0;
         int[] var2 = new int[]{0};
         this.u3.c8.z1().n5(this.k5, this.u3, var2);
         var1 = var2[0];
         if (var1 < 0) {
            v7u.n5(this.k5, this.u3, this.x8(), this.l6, this.l6.q0(), this.c8().ah_(), this.c8().ai_(), null);
         }
      }
   }

   private void m1() {
      if (this.u3.c8 != null) {
         this.u3().n5(this.u3.c8.y1());
         if (this.u3().m1() && this.u3.c8.s3() != null) {
            this.u3().l6(this.u3.c8.s3());
            this.u3.n5 = true;
         }

         if (this.u3.c8.t9()) {
            this.x8.clear();
         }
      }

      if (this.u3().k5()) {
         do {
            try {
               this.l6.n5((Object)null);
               h9 var1 = this.u3.c8.l6(new com.aspose.slides.ms.System.Xml.k6(this.l6.n3(), this.l6.e2()));
               if (var1 != null) {
                  if (this.u3.c8 != null && this.u3.c8.t9()) {
                     this.x8.addItem(var1.z8(), var1);
                  }

                  this.u3().n5(var1.y1());
                  if (var1.a0() != null && !this.l6.l6()) {
                     this.n5(this.u3().z1(), var1);
                  }
               } else {
                  this.n5("The '{0}' attribute is not declared.", this.l6.x8());
               }
            } catch (XmlSchemaException var2) {
               var2.setSource(this.u3().q0(), this.c8().ah_(), this.c8().ai_());
               this.n5(var2);
            }
         } while (this.u3().u3());

         this.u3().a6();
      }
   }

   private void k7() {
      if (this.u3.c8.t9()) {
         try {
            this.u3.c8.n5(this.x8, this.u3().v0());
         } catch (XmlSchemaException var2) {
            var2.setSource(this.u3().q0(), this.c8().ah_(), this.c8().ai_());
            this.n5(var2);
         }
      }

      if (this.u3.c8.a0() != null) {
         this.c8 = true;
         this.h0 = false;
         this.u9 = com.aspose.slides.ms.System.d1.n5;
         this.a6.n5(0);
      }
   }

   private void m3() {
      t6 var1 = this.n5.l6(this.k5);
      this.l6(this.k5);
      if (var1 != null) {
         this.u3.c8 = var1;
         this.m1();
         this.k7();
         this.u3.k5 = true;
         var1.z1().n5(this.u3);
      } else {
         this.n5("The '{0}' element is not declared.", v7u.n5(this.u3.s7, this.u3.x8));
         this.u3.c8 = null;
      }
   }

   @Override
   public void k5() {
      if (this.n5.x8() == 1) {
         do {
            this.z8();
         } while (this.w1());

         this.j5();
      }
   }

   private void z8() {
      if (this.u3.c8 != null) {
         if (this.u3.k5 && !this.u3.c8.z1().l6(this.u3)) {
            v7u.n5(this.u3, this.x8(), this.l6, this.l6.q0(), this.c8().ah_(), this.c8().ai_(), null);
         }

         if (this.c8) {
            String var1 = !this.h0 ? this.u9 : this.a6.toString();
            this.n5(var1, (h9)null);
            this.c8 = false;
            this.a6.n5(0);
            this.u9 = com.aspose.slides.ms.System.d1.n5;
         }
      }

      this.w1();
   }

   @Override
   public boolean n5() {
      return this.u3.c8 != null ? this.u3.c8.z1().k5() : false;
   }

   private void n5(int var1, String var2) {
      switch (var1) {
         case 1:
            if (this.t9) {
               if (this.n5(var2) != null) {
                  this.n5("'{0}' is already used as an ID.", var2);
               } else {
                  this.n5(var2, this.u3.s7);
               }
            }
            break;
         case 2:
            if (this.t9) {
               Object var3 = this.n5(var2);
               if (var3 == null) {
                  this.e2 = new s9(this.e2, var2, this.c8().ah_(), this.c8().ai_());
               }
            }
         case 3:
         default:
            break;
         case 4:
            n5(this.n5, var2, this, this.x8(), this.u3().q0(), this.c8().ah_(), this.c8().ai_());
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

         if (var4.t2() != 0) {
            var1 = com.aspose.slides.ms.System.d1.l6(var1);
         }

         Object var5 = var4.n5(var1, this.u9(), t2);
         this.l6.l6(var5);
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
         if (var10.d2() != null && !var10.l6(var5)) {
            if (var4.t2() == 8) {
               this.n5("'{0}' is not in the notation list.", var5.toString());
            } else {
               this.n5("'{0}' is not in the enumeration list.", var5.toString());
            }
         }

         if (!var10.k5(var5)) {
            if (var3) {
               this.n5("The value of the '{0}' attribute does not equal its fixed value.", var2.z8().toString());
            } else {
               this.n5("The value of the '{0}' element does not equal its fixed value.", v7u.n5(this.u3.s7, this.u3.x8));
            }
         }
      } catch (XmlSchemaException var9) {
         if (var2 != null) {
            this.n5("The '{0}' attribute has an invalid value according to its data type.", var2.z8().toString());
         } else {
            this.n5("The '{0}' element has an invalid value according to its data type.", v7u.n5(this.u3.s7, this.u3.x8));
         }
      }
   }

   public final void n5(String var1, Object var2) {
      if (this.y4 == null) {
         this.y4 = new Hashtable();
      }

      this.y4.addItem(var1, var2);
   }

   @Override
   public Object n5(String var1) {
      return this.y4 == null ? null : this.y4.get_Item(var1);
   }

   private boolean n5(com.aspose.slides.ms.System.Xml.k6 var1) {
      String var2 = var1.l6();
      if (var2.charAt(0) == '#') {
         return false;
      }

      if (v6.n5(var2)) {
         return false;
      }

      v6 var3 = this.n5(var1, false);
      if (var3 == null) {
         throw new XmlException("Reference to undeclared entity '{0}'.", var2);
      }

      if (!var3.q0().k5()) {
         throw new XmlException("Reference to unparsed entity '{0}'.", var2);
      }

      if (this.l6.v0() && var3.t4()) {
         this.l6("The standalone document declaration must have a value of 'no'.");
      }

      return true;
   }

   private v6 n5(com.aspose.slides.ms.System.Xml.k6 var1, boolean var2) {
      v6 var3 = null;
      if (var2) {
         v6[] var4 = new v6[]{var3};
         boolean var5 = this.n5.s7().tryGetValue(var1, var4);
         var3 = var4[0];
         if (var5) {
            return var3;
         }
      } else {
         v6[] var8 = new v6[]{var3};
         boolean var9 = this.n5.t2().tryGetValue(var1, var8);
         var3 = var8[0];
         if (var9) {
            return var3;
         }
      }

      return null;
   }

   private void j5() {
      s9 var1 = this.e2;

      while (var1 != null) {
         if (this.n5(var1.n5) == null) {
            this.n5(new XmlSchemaException("Reference to undeclared ID is '{0}'.", var1.n5, this.l6.q0(), var1.l6, var1.k5));
         }

         s9 var2 = var1.u3;
         var1.u3 = null;
         var1 = var2;
      }

      this.e2 = null;
   }

   private void l6(com.aspose.slides.ms.System.Xml.k6 var1) {
      this.u3 = (x5)this.s7.n5();
      if (this.u3 == null) {
         this.u3 = new x5();
         this.s7.n5(this.u3);
      }

      this.u3.s7 = var1.l6();
      this.u3.x8 = var1.n5();
      this.u3.e2 = false;
      this.u3.n5 = false;
      this.u3.k5 = false;
   }

   private boolean w1() {
      if (this.s7.u3() > 1) {
         this.s7.l6();
         this.u3 = (x5)this.s7.k5();
         return true;
      } else {
         return false;
      }
   }

   public static void n5(h9 var0, com.aspose.slides.ms.System.Xml.u6 var1) {
      try {
         String var2 = var0.z1();
         v5 var6 = var0.a0();
         if (var6 == null) {
            return;
         }

         if (var6.t2() != 0) {
            var2 = com.aspose.slides.ms.System.d1.l6(var2);
         }

         var0.n5(var6.n5(var2, var1.n5(), var1.l6()));
      } catch (RuntimeException var5) {
         com.aspose.slides.ms.System.Xml.v0 var3 = ((com.aspose.slides.ms.System.Xml.a5)var1).t4();
         if (var3 != null) {
            XmlSchemaException var4 = new XmlSchemaException("The default value of '{0}' attribute is invalid according to its datatype.", var0.z8().toString());
            var3.n5(var4, 0);
         }
      }
   }

   public static void n5(h9 var0, x0 var1, com.aspose.slides.ms.System.Xml.v0 var2, String var3) {
      try {
         if (var3 == null) {
            var3 = com.aspose.slides.ms.System.d1.n5;
         }

         v5 var4 = var0.a0();
         if (var4 == null) {
            return;
         }

         Object var10 = var0.s3();
         int var6 = var4.t2();
         if (var6 == 4) {
            if (var4.x8() == 1) {
               String[] var7 = com.aspose.slides.internal.v6g.k5.k5(var10, String[].class);

               for (int var8 = 0; var8 < var7.length; var8++) {
                  n5(var1, var7[var8], var2, var3, var0.t9(), var0.e2());
               }
            } else {
               n5(var1, (String)var10, var2, var3, var0.t9(), var0.e2());
            }
         } else if (var6 == 9 && !var0.l6(var10) && var2 != null) {
            XmlSchemaException var11 = new XmlSchemaException("'{0}' is not in the enumeration list.", var10.toString(), var3, var0.t9(), var0.e2());
            var2.n5(var11, 0);
         }
      } catch (RuntimeException var9) {
         if (var2 != null) {
            XmlSchemaException var5 = new XmlSchemaException("The default value of '{0}' attribute is invalid according to its datatype.", var0.z8().toString());
            var2.n5(var5, 0);
         }
      }
   }
}
