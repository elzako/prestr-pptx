package com.aspose.slides;

class u1 {
   private byte[] n5;
   private int l6;
   private int k5;
   private int u3;
   private int a6;
   private com.aspose.slides.internal.z0k.t4 u9;
   private boolean h0;

   public u1(com.aspose.slides.internal.z0k.t4 var1, boolean var2) {
      this.u9 = var1;
      this.h0 = var2;
      if (this.u9.canSeek()) {
         this.u3 = (int)this.u9.getLength();
         this.k5 = com.aspose.slides.ms.System.q1.l6(this.u3, 65536);
         this.l6 = Integer.MAX_VALUE;
      } else {
         this.u3 = this.k5 = this.l6 = 0;
      }

      this.n5 = new byte[this.k5 > 0 ? this.k5 : 1024];
      if (this.u3 > 0) {
         this.n5(0);
      } else {
         this.a6 = 0;
      }

      if (this.k5 == this.u3 && this.u9.canSeek()) {
         this.n5();
      }
   }

   protected u1(u1 var1) {
      this.n5 = var1.n5;
      this.l6 = var1.l6;
      this.k5 = var1.k5;
      this.u3 = var1.u3;
      this.a6 = var1.a6;
      this.u9 = var1.u9;
      var1.u9 = null;
      this.h0 = var1.h0;
   }

   protected final void n5() {
      if (!this.h0 && this.u9 != null) {
         this.u9.close();
         this.u9 = null;
      }
   }

   public int l6() {
      if (this.a6 < this.k5) {
         return this.n5[this.a6++] & 0xFF;
      } else if (this.u3() < this.u3) {
         this.n5(this.u3());
         return this.n5[this.a6++] & 0xFF;
      } else {
         return this.u9 != null && !this.u9.canSeek() && this.a6() > 0 ? this.n5[this.a6++] & 0xFF : 65536;
      }
   }

   public final int k5() {
      int var1 = this.u3();
      int var2 = this.l6();
      this.n5(var1);
      return var2;
   }

   public final int u3() {
      return this.a6 + this.l6;
   }

   public final void n5(int var1) {
      if (var1 >= this.u3 && this.u9 != null && !this.u9.canSeek()) {
         while (var1 >= this.u3 && this.a6() > 0) {
         }
      }

      if (var1 >= 0 && var1 <= this.u3) {
         if (var1 >= this.l6 && var1 < this.l6 + this.k5) {
            this.a6 = var1 - this.l6;
         } else if (this.u9 != null) {
            this.u9.seek(var1, 0);
            this.k5 = this.u9.read(this.n5, 0, this.n5.length);
            this.l6 = var1;
            this.a6 = 0;
         } else {
            this.a6 = this.u3 - this.l6;
         }
      } else {
         throw new i4k(com.aspose.slides.ms.System.d1.n5(new String[]{"buffer out of bounds access, position: ", com.aspose.slides.ms.System.a3.l6(var1)}));
      }
   }

   private int a6() {
      int var1 = this.n5.length - this.k5;
      if (var1 == 0) {
         byte[] var2 = new byte[this.k5 * 2];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), com.aspose.slides.ms.System.u3.n5((Object)(var2)), this.k5);
         this.n5 = var2;
         var1 = this.k5;
      }

      int var3 = this.u9.read(this.n5, this.k5, var1);
      if (var3 > 0) {
         this.u3 = this.k5 += var3;
         return var3;
      } else {
         return 0;
      }
   }
}
