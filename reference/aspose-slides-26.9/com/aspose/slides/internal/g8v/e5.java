package com.aspose.slides.internal.g8v;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

@com.aspose.slides.ms.System.j3
public class e5 extends q0 {
   private i1 n5;
   private int l6;

   public e5(i1 var1, int var2) {
      if (var1 == null) {
         throw new ArgumentNullException("address");
      }

      this.n5(var1);
      this.n5(var2);
   }

   public e5(long var1, int var3) {
      this.n5(new i1(var1));
      this.n5(var3);
   }

   public i1 u3() {
      return this.n5;
   }

   public void n5(i1 var1) {
      this.n5 = var1;
   }

   @Override
   public int n5() {
      return this.n5.a6();
   }

   public int a6() {
      return this.l6;
   }

   public void n5(int var1) {
      if (var1 >= 0 && var1 <= 65535) {
         this.l6 = var1;
      } else {
         throw new ArgumentOutOfRangeException("Invalid port");
      }
   }

   @Override
   public q0 n5(w2 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("socketAddress");
      }

      if (var1.n5() != this.n5()) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "The IPEndPoint was created using ",
               com.aspose.slides.ms.System.d5.getName(com.aspose.slides.internal.p6w.n5.class, this.n5()),
               " AddressFamily but SocketAddress contains ",
               com.aspose.slides.ms.System.d5.getName(com.aspose.slides.internal.p6w.n5.class, var1.n5()),
               " instead, please use the same type."
            })
         );
      }

      int var2 = var1.l6();
      int var3 = var1.n5();
      q0 var4 = null;
      switch (var3) {
         case 2:
            if (var2 < 8) {
               return null;
            }

            int var12 = (com.aspose.slides.internal.v6g.k5.u3(var1.n5(2), 6) << 8) + com.aspose.slides.internal.v6g.k5.u3(var1.n5(3), 6);
            long var6 = (com.aspose.slides.internal.v6g.k5.u9(var1.n5(7), 6) << 24)
               + (com.aspose.slides.internal.v6g.k5.u9(var1.n5(6), 6) << 16)
               + (com.aspose.slides.internal.v6g.k5.u9(var1.n5(5), 6) << 8)
               + com.aspose.slides.internal.v6g.k5.u9(var1.n5(4), 6);
            var4 = new e5(var6, var12);
            break;
         case 23:
            if (var2 < 28) {
               return null;
            }

            int var5 = (com.aspose.slides.internal.v6g.k5.u3(var1.n5(2), 6) << 8) + com.aspose.slides.internal.v6g.k5.u3(var1.n5(3), 6);
            int var8 = com.aspose.slides.internal.v6g.k5.u3(var1.n5(24), 6)
               + (com.aspose.slides.internal.v6g.k5.u3(var1.n5(25), 6) << 8)
               + (com.aspose.slides.internal.v6g.k5.u3(var1.n5(26), 6) << 16)
               + (com.aspose.slides.internal.v6g.k5.u3(var1.n5(27), 6) << 24);
            int[] var9 = new int[8];

            for (int var10 = 0; var10 < 8; var10++) {
               var9[var10] = com.aspose.slides.internal.v6g.k5.k5(
                  (com.aspose.slides.internal.v6g.k5.u3(var1.n5(8 + var10 * 2), 6) << 8) + com.aspose.slides.internal.v6g.k5.u3(var1.n5(8 + var10 * 2 + 1), 6),
                  9
               );
            }

            var4 = new e5(new i1(var9, com.aspose.slides.internal.v6g.k5.u9(var8, 9)), var5);
            break;
         default:
            return null;
      }

      return var4;
   }

   @Override
   public w2 l6() {
      w2 var1 = null;
      switch (this.n5.a6()) {
         case 2:
            var1 = new w2(2, 16);
            var1.n5(2, com.aspose.slides.internal.v6g.k5.n5((Object)(this.l6 >> 8 & 0xFF), 9));
            var1.n5(3, com.aspose.slides.internal.v6g.k5.n5((Object)(this.l6 & 0xFF), 9));
            long var2 = this.n5.n5();
            var1.n5(4, com.aspose.slides.internal.v6g.k5.n5((Object)(var2 & com.aspose.slides.internal.v6g.k5.u9(255, 9)), 11));
            var1.n5(5, com.aspose.slides.internal.v6g.k5.n5((Object)(var2 >> 8 & com.aspose.slides.internal.v6g.k5.u9(255, 9)), 11));
            var1.n5(6, com.aspose.slides.internal.v6g.k5.n5((Object)(var2 >> 16 & com.aspose.slides.internal.v6g.k5.u9(255, 9)), 11));
            var1.n5(7, com.aspose.slides.internal.v6g.k5.n5((Object)(var2 >> 24 & com.aspose.slides.internal.v6g.k5.u9(255, 9)), 11));
            break;
         case 23:
            var1 = new w2(23, 28);
            var1.n5(2, com.aspose.slides.internal.v6g.k5.n5((Object)(this.l6 >> 8 & 0xFF), 9));
            var1.n5(3, com.aspose.slides.internal.v6g.k5.n5((Object)(this.l6 & 0xFF), 9));
            byte[] var4 = this.n5.u3();

            for (int var5 = 0; var5 < 16; var5++) {
               var1.n5(8 + var5, var4[var5]);
            }

            var1.n5(24, com.aspose.slides.internal.v6g.k5.n5((Object)(this.n5.k5() & com.aspose.slides.internal.v6g.k5.u9(255, 9)), 11));
            var1.n5(25, com.aspose.slides.internal.v6g.k5.n5((Object)(this.n5.k5() >> 8 & com.aspose.slides.internal.v6g.k5.u9(255, 9)), 11));
            var1.n5(26, com.aspose.slides.internal.v6g.k5.n5((Object)(this.n5.k5() >> 16 & com.aspose.slides.internal.v6g.k5.u9(255, 9)), 11));
            var1.n5(27, com.aspose.slides.internal.v6g.k5.n5((Object)(this.n5.k5() >> 24 & com.aspose.slides.internal.v6g.k5.u9(255, 9)), 11));
      }

      return var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(new String[]{this.n5.toString(), ":", com.aspose.slides.ms.System.a3.l6(this.l6)});
   }

   @Override
   public boolean equals(Object comparand) {
      e5 var2 = com.aspose.slides.internal.v6g.k5.n5(comparand, e5.class);
      return var2 != null && var2.l6 == this.l6 && var2.n5.equals(this.n5);
   }

   @Override
   public int hashCode() {
      return this.n5.hashCode() + this.l6;
   }
}
