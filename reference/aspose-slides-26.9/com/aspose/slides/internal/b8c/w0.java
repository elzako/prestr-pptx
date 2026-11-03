package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection$Enumerator;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.ms.System.IDisposable;

public final class w0 extends c8 {
   private com.aspose.slides.ms.System.Xml.a0 t2;
   private Hashtable s7;
   private com.aspose.slides.ms.System.Xml.k6 x8 = com.aspose.slides.ms.System.Xml.k6.n5;
   private com.aspose.slides.ms.System.Xml.s2 n3;
   private boolean y4 = false;
   private Hashtable e2;
   private s9 t9;
   private n7 z1 = null;

   public w0(c8 var1) {
      super(var1);
      this.t9();
   }

   public w0(com.aspose.slides.ms.System.Xml.s8 var1, v2 var2, com.aspose.slides.ms.System.Xml.v0 var3) {
      super(var1, var2, var3);
      this.t9();
   }

   private void t9() {
      this.n3 = this.l6.b3();
      if (this.n3 == null) {
         this.n3 = new com.aspose.slides.ms.System.Xml.s2(this.u9());
         this.y4 = true;
      }

      this.t2 = new com.aspose.slides.ms.System.Xml.a0(10);
      this.a6 = new com.aspose.slides.internal.l7h.a5();
      this.x8 = com.aspose.slides.ms.System.Xml.k6.n5;
      this.s7 = new Hashtable();
      this.n5(com.aspose.slides.ms.System.Xml.k6.n5);
      this.n5 = new x0();
      this.c8 = false;
   }

   @Override
   public void l6() {
      if (this.q0()) {
         this.z3();
      } else {
         switch (this.l6.s7()) {
            case 1:
               this.z1();
               if (this.l6.m1()) {
                  this.k7();
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
               this.k7();
         }
      }
   }

   private void z1() {
      this.k5.l6(this.l6.n3(), v5.n5(this.l6.y4(), this.u9(), this.h0()));
      this.t4();
      if (this.h0().k5(this.k5.l6(), this.k5.n5()) && this.l6.t4() > 0) {
         this.z1 = new n7(2, this.u9(), this.h0(), this.x8());
         this.z1.l6(this.l6, null);
         this.z1.u3();
      } else {
         this.m1();
      }
   }

   private void t4() {
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

   private boolean q0() {
      return this.z1 != null;
   }

   private void z3() {
      if (!this.z1.u3()) {
         this.z1.n5();
         x0 var1 = this.z1.k5();
         if (var1 != null && var1.z1() == 0) {
            Dictionary$KeyCollection$Enumerator var2 = var1.n3().getKeys().iterator();

            try {
               while (var2.hasNext()) {
                  String var3 = (String)var2.next();
                  if (!this.n5.k5(var3)) {
                     this.n5.n5(var1, this.x8());
                     this.a6().n5(var3, var1, null, false);
                     break;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
                  var2.dispose();
               }
            }
         }

         this.z1 = null;
      }
   }

   private void m1() {
      this.n5(this.k5);
      if (this.y4) {
         this.n3.u3();
      }

      this.u3.c8 = this.m3();
      if (this.u3.c8 != null) {
         this.z8();
         this.j5();
         this.u3.k5 = true;
         this.u3.c8.z1().n5(this.u3);
      }
   }

   private void k7() {
      if (this.y4) {
         this.n3.u3();
      }

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

      this.r4();
   }

   private t6 m3() {
      if (this.l6.t4() == 0) {
         this.u3(com.aspose.slides.ms.System.d1.n5);
      }

      if (this.l6.k5()) {
         do {
            String var1 = this.l6.y4();
            String var2 = this.l6.n3();
            if (com.aspose.slides.ms.System.Xml.v8.n5(var1, this.h0().a6)) {
               this.u3(this.l6.z1());
               if (this.y4) {
                  this.n3.n5(this.l6.e2().length() == 0 ? com.aspose.slides.ms.System.d1.n5 : this.l6.n3(), this.l6.z1());
               }
            }

            if (com.aspose.slides.ms.System.Xml.v8.n5(var1, this.h0().z3.n5()) && com.aspose.slides.ms.System.Xml.v8.n5(var2, this.h0().z3.l6())) {
               this.l6.n5(v5.l6(this.l6.z1()));
            }
         } while (this.l6.u3());

         this.l6.a6();
      }

      t6 var3 = this.n5.l6(this.k5);
      if (var3 == null && this.n5.n3().containsKey(this.u3.x8)) {
         this.n5("The '{0}' element is not declared.", v7u.n5(this.u3.s7, this.u3.x8));
      }

      return var3;
   }

   private void z8() {
      if (this.u3.c8 != null) {
         if (this.u3.c8.y1() != null) {
            this.l6.n5(this.u3.c8.y1());
         } else {
            this.l6.n5(this.u3.c8.a0());
         }

         if (this.l6.m1() && !this.u3.n5 && this.u3.c8.s3() != null) {
            this.l6.l6(this.u3.c8.s3());
            this.u3.n5 = true;
         }

         if (this.u3.c8.t9()) {
            this.s7.clear();
         }
      }

      if (this.l6.k5()) {
         do {
            if (this.l6.y4() != this.h0().a6) {
               try {
                  this.l6.n5((Object)null);
                  h9 var1 = this.n5.n5(this.u3.c8, this.l6(this.l6.n3(), this.l6.y4()));
                  if (var1 != null) {
                     if (this.u3.c8 != null && this.u3.c8.t9()) {
                        this.s7.addItem(var1.z8(), var1);
                     }

                     this.l6.n5(var1.y1() != null ? var1.y1() : var1.a0());
                     if (var1.a0() != null) {
                        String var2 = this.l6.z1();
                        this.n5(var2, var1);
                     }
                  }
               } catch (XmlSchemaException var3) {
                  var3.setSource(this.l6.q0(), this.c8().ah_(), this.c8().ai_());
                  this.n5(var3);
               }
            }
         } while (this.l6.u3());

         this.l6.a6();
      }
   }

   private void j5() {
      if (this.u3.c8.e2()) {
         for (int var1 = 0; var1 < this.u3.c8.m1().size(); var1++) {
            this.l6.n5((h9)this.u3.c8.m1().get_Item(var1));
         }
      }

      if (this.u3.c8.t9()) {
         try {
            this.u3.c8.n5(this.s7, this.l6.v0());
         } catch (XmlSchemaException var2) {
            var2.setSource(this.l6.q0(), this.c8().ah_(), this.c8().ai_());
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

   private void k5(String var1) {
      if (i8.l6(var1)) {
         String var2 = com.aspose.slides.ms.System.d1.k5(var1, "x-Schema:".length());
         com.aspose.slides.ms.System.Xml.p5 var3 = null;
         x0 var4 = null;

         try {
            com.aspose.slides.ms.System.r8 var5 = this.t2().n5(this.s7(), var2);
            com.aspose.slides.internal.z0k.t4 var6 = (com.aspose.slides.internal.z0k.t4)this.t2().n5(var5, null, null);
            var3 = new com.aspose.slides.ms.System.Xml.p5(var5.toString(), var6, this.u9());
            var3.n5(this.t2());
            n7 var7 = new n7(2, this.u9(), this.h0(), this.x8());
            var7.n5(this.t2());
            var7.n5(var3, var1);

            while (var3.u9()) {
            }

            var4 = var7.k5();
         } catch (XmlSchemaException var12) {
            this.n5("Cannot load the Schema for the namespace '{0}' - {1}", new String[]{var1, var12.getMessage()}, 0);
         } catch (RuntimeException var13) {
            this.n5("Cannot load the Schema for the namespace '{0}' - {1}", new String[]{var1, var13.getMessage()}, 1);
         } finally {
            if (var3 != null) {
               var3.w1();
            }
         }

         if (var4 != null && var4.z1() == 0) {
            this.n5.n5(var4, this.x8());
            this.a6().n5(var1, var4, null, false);
         }
      }
   }

   private void u3(String var1) {
      if (!this.n5.n3().containsKey(var1)) {
         if (this.t2() != null) {
            x0 var2 = null;
            if (this.a6() != null) {
               var2 = this.a6().l6(var1);
            }

            if (var2 != null) {
               if (var2.x8() != 2) {
                  throw new XmlException("Unsupported combination of validation types.", com.aspose.slides.ms.System.d1.n5, this.c8().ah_(), this.c8().ai_());
               }

               this.n5.n5(var2, this.x8());
            } else {
               this.k5(var1);
            }
         }
      }
   }

   private boolean w1() {
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

   @Override
   public void k5() {
      if (this.w1()) {
         this.c4();
      } else {
         this.n5(new XmlSchemaException("No validation occurred.", com.aspose.slides.ms.System.d1.n5), 1);
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

         if (var1.length() == 0) {
            return;
         }

         Object var5 = var4.n5(var1, this.u9(), this.n3);
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
         if (var10.c4() != 4294967295L && var1.length() > var10.c4()) {
            this.n5("The actual length is greater than the MaxLength value.", var1);
         }

         if (var10.y2() != 4294967295L && var1.length() < var10.y2()) {
            this.n5("The actual length is less than the MinLength value.", var1);
         }

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

   public static void n5(
      String var0,
      h9 var1,
      x0 var2,
      com.aspose.slides.ms.System.Xml.s2 var3,
      com.aspose.slides.ms.System.Xml.z9 var4,
      Object var5,
      b4 var6,
      String var7,
      int var8,
      int var9
   ) {
      try {
         v5 var10 = var1.a0();
         if (var10 == null) {
            return;
         }

         if (var10.t2() != 0) {
            var0 = com.aspose.slides.ms.System.d1.l6(var0);
         }

         if (var0.length() == 0) {
            return;
         }

         Object var16 = var10.n5(var0, var4, var3);
         int var12 = var10.t2();
         if (var12 == 4) {
            if (var10.x8() == 1) {
               String[] var17 = com.aspose.slides.internal.v6g.k5.k5(var16, String[].class);

               for (int var14 = 0; var14 < var17.length; var14++) {
                  n5(var2, var17[var14], var5, var6, var7, var8, var9);
               }
            } else {
               n5(var2, (String)var16, var5, var6, var7, var8, var9);
            }
         } else if (var12 == 9 && !var1.l6(var16)) {
            XmlSchemaException var13 = new XmlSchemaException("'{0}' is not in the enumeration list.", var16.toString(), var7, var8, var9);
            if (var6 == null) {
               throw var13;
            }

            var6.n5(var5, new i0(var13));
         }

         var1.n5(var16);
      } catch (RuntimeException var15) {
         XmlSchemaException var11 = new XmlSchemaException(
            "The default value of '{0}' attribute is invalid according to its datatype.", var1.z8().toString(), var7, var8, var9
         );
         if (var6 == null) {
            throw var11;
         }

         var6.n5(var5, new i0(var11));
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

   private void n5(com.aspose.slides.ms.System.Xml.k6 var1) {
      this.u3 = (x5)this.t2.n5();
      if (this.u3 == null) {
         this.u3 = new x5();
         this.t2.n5(this.u3);
      }

      this.u3.s7 = var1.l6();
      this.u3.x8 = var1.n5();
      this.u3.e2 = false;
      this.u3.n5 = false;
      this.u3.k5 = false;
   }

   private void r4() {
      if (this.t2.u3() > 1) {
         this.t2.l6();
         this.u3 = (x5)this.t2.k5();
      }
   }

   private void c4() {
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

   private com.aspose.slides.ms.System.Xml.k6 l6(String var1, String var2) {
      return new com.aspose.slides.ms.System.Xml.k6(var1, v5.n5(var2, this.u9(), this.h0()));
   }
}
