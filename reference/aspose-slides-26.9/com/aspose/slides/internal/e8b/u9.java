package com.aspose.slides.internal.e8b;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class u9 {
   private final com.aspose.slides.internal.g7e.u3 n5;
   private h0 l6;

   public u9(com.aspose.slides.internal.g7e.u3 var1) {
      this.n5 = var1;
   }

   public final void n5(int var1, double[] var2) {
      if (this.l6 == null) {
         this.l6 = new h0(64, this.n5.u9());
      }

      this.l6.n5(var1, var2);
   }

   public final k5 n5(int var1, int var2) {
      if (this.l6 == null) {
         return null;
      }

      try {
         this.l6.n5(var1);
         this.l6.l6(var2);
         return this.n5();
      } catch (RuntimeException var4) {
         throw new com.aspose.slides.internal.z3b.c8(d1.n5(new String[]{"Error gathering image statistics : ", var4.getMessage()}));
      }
   }

   public final k5 n5() {
      if (this.l6 == null) {
         return null;
      }

      try {
         k5 var1 = new k5(this.n5.u9());

         for (int var2 = 0; var2 < this.n5.u9(); var2++) {
            c8 var3 = this.l6.k5(var2);
            u3 var4 = this.n5(var2, this.l6);
            n5 var5 = this.l6(var2, this.l6);
            int[][] var6 = var3.n5(this.n5.u3(), this.n5.k5(), this.n5.h0());
            int[] var7 = this.n5(var4, var5, var6);
            if (var7 == null) {
               throw new com.aspose.slides.internal.z3b.l6(d1.n5("RD optimized quantization table for {0} is not ready", new Object[]{var7}));
            }

            var1.n5(var3.n5(), var7, var4.n5(var7), var5.n5(var7));
         }

         return var1;
      } catch (RuntimeException var8) {
         throw new com.aspose.slides.internal.z3b.c8(d1.n5(new String[]{"Error building quantization tables : ", var8.getMessage()}));
      }
   }

   public final u3 n5(int var1, h0 var2) {
      try {
         u3 var3 = new u3(var2.k5(), this.n5.k5(), this.n5.n5());
         c8 var4 = var2.k5(var1);
         int[][] var5 = var4.n5(this.n5.u3(), this.n5.k5(), this.n5.h0());

         for (int var6 = 0; var6 < var2.k5(); var6++) {
            t2 var7 = var4.n5(var6);

            for (int var8 = var5[0][var6]; var8 <= var5[1][var6]; var8++) {
               Dictionary var9 = var7.n5(var8);
               double var10 = 0.0;
               int var12 = 0;
               Dictionary$Enumerator var13 = var9.iterator();

               try {
                  while (var13.hasNext()) {
                     KeyValuePair var14 = (KeyValuePair)var13.next();
                     int var15 = (Integer)var14.getValue();
                     if (var15 > 0) {
                        var10 += var3.n5(var15, var2.n5());
                        var12 += var15;
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
                     var13.dispose();
                  }
               }

               if (var12 != var2.n5()) {
                  throw new com.aspose.slides.internal.z3b.l6(
                     d1.n5("Rates calculation error : number of {0} does not equal to the number of {1}",new Object[]{ var12, var2.n5()})
                  );
               }

               var3.n5(var6, var8, var10);
            }
         }

         return var3;
      } catch (RuntimeException var20) {
         throw new com.aspose.slides.internal.z3b.c8(d1.n5(new String[]{"Error building rates matrix : ", var20.getMessage()}));
      }
   }

   public final n5 l6(int var1, h0 var2) {
      try {
         n5 var3 = new n5(var2.k5(), this.n5.k5());
         c8 var4 = var2.k5(var1);
         int[][] var5 = var4.n5(this.n5.u3(), this.n5.k5(), this.n5.h0());

         for (int var6 = 0; var6 < var2.k5(); var6++) {
            t2 var7 = var4.n5(var6);
            List var8 = var7.l6(0.25);
            if (var8 == null || var7 == null || var7.n5() == null || var8.size() != var7.n5().size()) {
               throw new com.aspose.slides.internal.z3b.l6("Counters for original values and buckets are not the same");
            }

            for (int var9 = var5[0][var6]; var9 <= var5[1][var6]; var9++) {
               double var10 = 0.0;
               int var12 = 0;
               Dictionary$Enumerator var13 = var7.n5().iterator();

               try {
                  while (var13.hasNext()) {
                     KeyValuePair var14 = (KeyValuePair)var13.next();
                     var10 += var3.n5((Double)var8.get_Item(var12), (Integer)var14.getKey(), (Integer)var14.getValue(), var9);
                     var12++;
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
                     var13.dispose();
                  }
               }

               var3.n5(var6, var9, var10, var2.l6());
            }
         }

         return var3;
      } catch (RuntimeException var19) {
         throw new com.aspose.slides.internal.z3b.c8(d1.n5(new String[]{"Error building distortions matrix : ", var19.getMessage()}));
      }
   }

   public final int[] n5(u3 var1, n5 var2, int[][] var3) {
      try {
         a6 var4 = new a6(var1.l6(), this.n5.a6(), this.n5);
         int var5 = var4.n5(var1, var2, var3);
         return var4.n5(var5, var1);
      } catch (RuntimeException var6) {
         throw new com.aspose.slides.internal.z3b.c8(d1.n5(new String[]{"RD optimizer error : ", var6.getMessage()}));
      }
   }
}
