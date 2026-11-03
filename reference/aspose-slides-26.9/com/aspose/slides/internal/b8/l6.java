package com.aspose.slides.internal.b8;

import com.aspose.slides.internal.j7.e2;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.Xml.p5;

public class l6 {
   private final p5 n5;

   public l6(t4 var1) {
      var1.setPosition(0L);
      this.n5 = e2.n5(var1);
      this.n5.p8();
   }

   public final boolean n5(String var1) {
      return this.n5(var1, 0);
   }

   public final boolean n5(String var1, int var2) {
      this.n5.a6();
      if (this.h0() && d1.a6(this.a6(), var1)) {
         return false;
      }

      while (this.n5.u9()) {
         switch (this.n5.s7()) {
            case 1:
               return true;
            case 2:
            case 4:
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
               if ((var2 & 1) != 0) {
                  return true;
               }
               break;
            case 13:
               if ((var2 & 4) != 0) {
                  return true;
               }
               break;
            case 14:
               if ((var2 & 2) != 0) {
                  return true;
               }
               break;
            case 15:
               if (this.l6(var1)) {
                  return false;
               }
         }
      }

      return false;
   }

   public final void n5() {
      this.n5.a6();
      if (!this.h0()) {
         String var1 = this.a6();

         while (!this.l6(var1)) {
            this.n5.u9();
            if (this.n5.s7() == 1) {
               this.n5.r4();
            }
         }
      }
   }

   public final boolean l6(String var1) {
      return this.n5.s7() == 15 && d1.a6(this.a6(), var1);
   }

   public final String n5(String var1, String var2) {
      String var3 = var2;

      while (this.n5.u3()) {
         if (d1.a6(this.a6(), var1)) {
            var3 = this.n5.z1();
            break;
         }
      }

      this.n5.a6();
      return var3;
   }

   public final boolean l6() {
      while (this.n5.u3()) {
         if (!"xmlns".equals(this.n5.e2())) {
            return true;
         }
      }

      return false;
   }

   public final String k5() {
      return this.n5.c4();
   }

   public final String u3() {
      String var1 = this.n5.e5();

      while (this.n5.s7() == 13 || this.n5.s7() == 3) {
         this.n5.u9();
      }

      return var1;
   }

   public final String a6() {
      return this.n5.n3();
   }

   private boolean h0() {
      return this.n5.m1();
   }

   public final String u9() {
      return this.n5.z1();
   }
}
