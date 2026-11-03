package com.aspose.slides.internal.z0k;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.e5;
import com.aspose.slides.ms.System.j3;

@j3
public abstract class y1 implements IDisposable {
   public static y1 a6 = new y1$n5();

   protected y1() {
   }

   public void u3() {
      this.n5(true);
   }

   @Override
   public void dispose() {
      this.n5(true);
   }

   protected void n5(boolean var1) {
      if (var1) {
         e5.n5(this);
      }
   }

   public int a6() {
      return -1;
   }

   public int u9() {
      return -1;
   }

   public int n5(char[] var1, int var2, int var3) {
      int var4;
      for (var4 = 0; var4 < var3; var4++) {
         int var5;
         if ((var5 = this.u9()) == -1) {
            return var4;
         }

         var1[var2 + var4] = (char)var5;
      }

      return var4;
   }

   public String h0() {
      a5 var1 = new a5();

      int var2;
      while ((var2 = this.u9()) != -1 && var2 != 10) {
         if (var2 == 13) {
            if (this.a6() == 10) {
               this.u9();
            }
            break;
         }

         var1.n5((char)var2);
      }

      return var2 == -1 && var1.l6() == 0 ? null : var1.toString();
   }

   public String c8() {
      a5 var1 = new a5();

      int var2;
      while ((var2 = this.u9()) != -1) {
         var1.n5((char)var2);
      }

      return var1.toString();
   }
}
