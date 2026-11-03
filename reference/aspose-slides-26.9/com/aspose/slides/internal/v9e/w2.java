package com.aspose.slides.internal.v9e;

import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.internal.v7y.t3;
import com.aspose.slides.ms.System.Xml.f4;
import com.aspose.slides.ms.System.Xml.k6;

public class w2 extends s0 {
   private int u3 = -1;
   private k6 a6;
   private double u9 = Double.NaN;
   private k6 h0;
   private int c8;
   private boolean t2;

   public final int n5() {
      return this.u3;
   }

   public final k6 l6() {
      return this.a6;
   }

   public final double k5() {
      return this.u9;
   }

   public final k6 u3() {
      return this.h0;
   }

   public final int a6() {
      return this.c8;
   }

   public final void l6(int var1) {
      this.c8 = var1;
   }

   @Override
   public void l6(z1 var1) {
      this.u3(var1);
      if (this.u3 == -1) {
         if (this.a6 == null) {
            throw XsltException.create("The 'Xsl:template' instruction must have the 'match' and/or 'name' attribute present.");
         }

         if (this.h0 != null) {
            throw XsltException.create("An 'Xsl:template' element without a 'match' attribute cannot have a 'mode' attribute.");
         }
      }

      var1.l6(this);
      if (var1.u9()) {
         this.t9(var1);
         this.n3(var1);
         var1.h0();
      }

      var1.z8();
      this.z1(var1);
   }

   public void e2(z1 var1) {
      this.u3 = var1.n5("/", false, true, true);
      this.u9 = 0.5;
      this.y4(var1);
   }

   @Override
   public boolean k5(z1 var1) {
      String var2 = var1.u3().e2();
      String var3 = var1.u3().t4();
      if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().o5)) {
         this.u3 = var1.n5(var3, false, true, true);
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().j4)) {
         this.a6 = var1.s7(var3);
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().u8)) {
         this.u9 = f4.n5((Object)var3);
         if (com.aspose.slides.ms.System.d2.k5(this.u9) && !var1.n3()) {
            throw XsltException.create("'{1}' is an invalid value for the '{0}' attribute.", "priority", var3);
         }
      } else {
         if (!com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().g7)) {
            return false;
         }

         if (var1.u3 && "*".equals(var3)) {
            this.h0 = z1.a6;
         } else {
            this.h0 = var1.s7(var3);
         }
      }

      return true;
   }

   private void z1(z1 var1) {
      z7 var2 = var1.u3();
      if (com.aspose.slides.ms.System.d2.k5(this.u9) && this.u3 != -1) {
         j3 var3 = var1.s7().get_Item(this.n5());
         t3 var4 = var3.n5();
         com.aspose.slides.internal.v7y.j9 var5 = var4.l6();

         com.aspose.slides.internal.v7y.v8 var6;
         while ((var6 = com.aspose.slides.internal.v6g.k5.n5(var5, com.aspose.slides.internal.v7y.v8.class)) != null) {
            w2 var7 = this.h0();
            var1.s7().addItem(new j3(new t3(var6.l6, var4.k5(), false), var3.n5));
            var7.u3 = var1.s7().size() - 1;
            var7.u9 = var6.l6.s7();
            var1.n5(var7);
            var5 = var6.n5;
         }

         if (var4.l6() != var5) {
            var1.s7().set_Item(this.n5(), new j3(new t3(var5, var4.k5(), false), var3.n5));
         }

         this.u9 = var5.s7();
      }
   }

   protected final void t9(z1 var1) {
      z7 var2 = var1.u3();

      do {
         switch (var2.n3()) {
            case 1:
               if (!com.aspose.slides.ms.System.Xml.v8.n5(var2.t9(), var2.k5().y6) || !com.aspose.slides.ms.System.Xml.v8.n5(var2.e2(), var2.k5().a7)) {
                  return;
               }

               var1.t4();
               this.n5(var1.k5(3));
               var1.q0();
            case 2:
            case 3:
            default:
               break;
            case 4:
               return;
            case 5:
               this.n5(var1.p3());
         }
      } while (var2.u9());
   }

   private w2 h0() {
      w2 var1 = new w2();
      var1.l6 = this.l6;
      var1.h0 = this.h0;
      var1.n5 = this.n5;
      var1.t2 = true;
      return var1;
   }

   @Override
   public void n5(z1 var1) {
      if (!this.t2) {
         super.n5(var1);
         this.t2 = true;
      }
   }

   @Override
   public void n5(p3 var1, l6 var2) {
      switch (var2.k5()) {
         case 0:
            if (this.n5 > 0) {
               var2.k5(this.n5);
            }

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
}
