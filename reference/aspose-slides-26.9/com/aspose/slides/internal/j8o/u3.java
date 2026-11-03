package com.aspose.slides.internal.j8o;

import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.b7s.n3;
import com.aspose.slides.internal.b7s.p3;
import com.aspose.slides.internal.b7s.t9;
import com.aspose.slides.ms.System.IDisposable;

public class u3 extends l6 {
   private final com.aspose.slides.internal.b7s.u3[] u3;
   private l6$n5 a6 = new l6$n5();

   public u3(t9 var1) {
      super(var1);
      this.u3 = new com.aspose.slides.internal.b7s.u3[10];
      this.a6 = new l6$n5();
   }

   @Override
   public int n5(short[][] var1) {
      throw new NotSupportedException();
   }

   @Override
   public void l6() {
      for (int var1 = 0; var1 < this.k5.u9().u9(); var1++) {
         int var2 = this.n5().u9().k5()[var1];
         n3 var3 = this.k5.u3().l6()[var2];
         Dictionary$ValueCollection$Enumerator var4 = this.k5.n5().getValues().iterator();

         try {
            while (var4.hasNext()) {
               com.aspose.slides.internal.b7s.u3 var5 = (com.aspose.slides.internal.b7s.u3)var4.next();
               if (var5.n5() == var3.l6()) {
                  this.u3[var3.l6() & 0xFF] = var5;
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }

      this.a6 = new l6$n5();
   }

   public final boolean n5(short[] var1) {
      n3 var2 = this.k5.u3().l6()[0];
      return this.n5(var1, this.u3[var2.l6() & 0xFF]);
   }

   public final boolean l6(short[] var1) {
      p3 var2 = this.k5.u9();

      for (int var3 = 0; var3 < var2.u9(); var3++) {
         int var4 = var2.k5()[var3];
         n3 var5 = this.k5.u3().l6()[var4];
         short var6 = 0;
         short[] var7 = new short[]{0};
         boolean var8 = !this.n5(var7, this.u3[var5.l6() & 0xFF]);
         var6 = var7[0];
         if (var8) {
            return false;
         }

         var1[var3] = var6;
      }

      return true;
   }

   private boolean n5(short[] var1, com.aspose.slides.internal.b7s.u3 var2) {
      int var3 = 0;
      int[] var4 = new int[]{0};
      l6$n5[] var5 = new l6$n5[]{this.a6};
      boolean var6 = !this.n5(var2, var4, var5);
      var3 = var4[0];
      var5[0].n5(this.a6);
      if (var6) {
         return false;
      }

      if (var3 != 0) {
         var5[0] = this.a6;
         boolean var7 = !this.l6(var3, var5);
         var5[0].n5(this.a6);
         if (var7) {
            return false;
         }

         var5[0] = this.a6;
         int var8 = n5(var3, var5);
         var5[0].n5(this.a6);
         var3 = com.aspose.slides.internal.j8o.l6.n5(var8, var3);
      }

      var1[0] = (short)var3;
      return true;
   }
}
