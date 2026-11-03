package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class e3m extends f1s {
   private int l6;
   private int k5;
   private int u3;
   private int a6;
   private List<Byte> u9 = new List<>();
   private int h0;

   public e3m(long var1) {
      super(var1);
   }

   public final int l6() {
      return this.l6;
   }

   public final byte n5(int var1) {
      if (var1 < this.l6 || var1 > this.k5) {
         return 0;
      } else {
         return this.u9.size() == 0 ? 0 : this.u9.get_Item(var1 - this.l6());
      }
   }

   @Override
   public void n5(f3c var1) {
      var1.n5(this.n5 & 4294967295L);
      this.l6 = var1.n3() & 65535;
      this.k5 = var1.n3() & 65535;
      int var2 = var1.n3() & 65535;
      if (this.k5 >= this.l6) {
         if (var2 == 32768) {
            this.u3 = this.l6;
            this.a6 = this.k5;
            this.l6 = this.k5 = 0;
         } else if (var2 >= 1 && var2 <= 3) {
            this.h0 = var2;
            int var3 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.a6(2.0, var2), 14);
            int var4 = this.k5 - this.l6 + 1;
            int var5 = 16 / var3;

            while (this.u9.size() < var4) {
               int var6 = var1.n3();
               if (var4 > this.u9.size() + var5) {
                  for (int var10 = 0; var10 < var5; var10++) {
                     int var11 = var10 * var3;
                     this.u9.addItem(j3b.n5(var6, var11, var3));
                  }
               } else {
                  int var7 = var4 - this.u9.size();

                  for (int var8 = 0; var8 < var7; var8++) {
                     int var9 = var8 * var3;
                     this.u9.addItem(j3b.n5(var6, var9, var3));
                  }
               }
            }
         } else {
            throw new r7c(com.aspose.slides.ms.System.d1.n5("incorrect DeltaFormat = {0} for device table", new Object[]{var2}));
         }
      }
   }
}
