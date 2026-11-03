package com.aspose.slides.internal.r1x;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class w2 extends v3 {
   private List<w2$l6> l6 = new List<>();
   private List<v3> k5 = new List<>();
   private int u3 = 0;

   public w2(v3 var1, boolean var2) {
      super(var1.k5());
      if (var2) {
         this.k5.addItem(var1);
      }

      w2$l6 var3 = new w2$l6(0, (int)var1.u3(), new w2$n5(var1, 0, (int)var1.u3()));
      this.l6.addItem(var3);
   }

   @Override
   public final Object n5() {
      this.s7();
      w2$l6 var1 = null;
      w2$l6[] var2 = new w2$l6[]{var1};
      int var3 = this.n5((int)this.l6(), var2);
      var1 = var2[0];
      if (var3 != -1 && var1 != null) {
         return var1.n5().n5().n5();
      } else {
         throw new com.aspose.slides.internal.z3b.k5(d1.n5("Failed to get range for specified position={0}", new Object[]{this.l6()}));
      }
   }

   private int t4() {
      return this.l6.size();
   }

   @Override
   public long l6() {
      return this.t4() == 1 ? super.l6() : this.u3;
   }

   @Override
   public void n5(long var1) {
      if (this.t4() == 1) {
         super.n5(var1);
      } else {
         this.u3 = (int)var1;
      }
   }

   @Override
   public com.aspose.slides.internal.z0k.t4 k5() {
      return super.k5();
   }

   @Override
   public long u3() {
      return this.t4() == 1 ? super.u3() : this.l6.get_Item(this.t4() - 1).k5();
   }

   @Override
   public boolean u9() {
      if (this.t4() == 1) {
         return super.u9();
      }

      List$Enumerator var1 = this.l6.iterator();

      try {
         while (var1.hasNext()) {
            w2$l6 var2 = (w2$l6)var1.next();
            if (!var2.n5().n5().u9()) {
               return false;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return true;
   }

   public final void n5(int var1, v3 var2, boolean var3) {
      w2$l6 var4 = null;
      w2$l6[] var5 = new w2$l6[]{var4};
      int var6 = this.n5(var1, var5);
      var4 = var5[0];
      if (var6 != -1 && var4 != null) {
         if (var3) {
            this.k5.addItem(var2);
         }

         int var7 = var1 - var4.l6();
         int var8 = var4.k5() - var1;
         int var9 = (int)var2.u3();
         var4.l6(var4.l6() + var7);
         var4.n5().n5(var4.n5().l6() + var7);
         w2$l6 var10 = new w2$l6(var1, var1 + (int)var2.u3(), new w2$n5(var2, 0, (int)var2.u3()));
         w2$l6 var11 = new w2$l6(var10.k5(), var10.k5() + var8, new w2$n5(var4.n5().n5(), var4.k5(), var4.k5() + var8));
         List var12 = new List();
         var12.addItem(var10);
         var12.addItem(var11);

         for (int var13 = var6 + 1; var13 < this.l6.size(); var13++) {
            this.l6.get_Item(var13).n5(this.l6.get_Item(var13).l6() + var9);
            this.l6.get_Item(var13).l6(this.l6.get_Item(var13).k5() + var9);
         }

         this.l6.insertRange(var6 + 1, var12);
      } else {
         throw new com.aspose.slides.internal.z3b.k5(d1.n5("Can't insert stream into specified position {0} because of  it's out of range", new Object[]{var1}));
      }
   }

   private int n5(int var1, w2$l6[] var2) {
      var2[0] = null;
      int var3 = -1;

      for (int var4 = 0; var4 < this.l6.size(); var4++) {
         w2$l6 var5 = this.l6.get_Item(var4);
         if (var1 >= var5.l6() && var1 <= var5.k5()) {
            var2[0] = var5;
            var3 = var4;
            break;
         }
      }

      return var3;
   }

   @Override
   public void n5(byte[] var1) {
      if (this.t4() == 1) {
         super.n5(var1);
      } else {
         this.l6(var1, 0, var1.length);
      }
   }

   @Override
   public void n5(byte var1) {
      if (this.t4() == 1) {
         super.n5(var1);
      } else {
         this.s7();
         byte[] var2 = new byte[]{var1};
         this.n5(var2);
      }
   }

   @Override
   public int l6(byte[] var1) {
      return this.t4() == 1 ? super.l6(var1) : this.n5(var1, 0, var1.length);
   }

   @Override
   public byte[] h0() {
      if (this.t4() == 1) {
         return super.h0();
      }

      this.s7();
      return this.n5(0L, this.u3());
   }

   @Override
   public byte[] n5(long var1, long var3) {
      if (this.t4() == 1) {
         return super.n5(var1, var3);
      }

      this.s7();
      if (var1 >= this.u3() || var1 < 0L) {
         throw new ArgumentOutOfRangeException("position", "The starting position is out of stream bounds.");
      }

      if (var3 > this.u3()) {
         throw new ArgumentOutOfRangeException("bytesCount", "The stream does not contain so many bytes.");
      }

      if (var3 + var1 > this.u3() && var3 > 0L) {
         throw new ArgumentException("Reading so many bytes will cause passing the stream end.");
      }

      if (this.u9()) {
         this.n5(var1);
      } else if (this.l6() != var1) {
         throw new com.aspose.slides.internal.z3b.k5("Cannot seek to the desired position. The stream does not support seeking.");
      }

      byte[] var5 = new byte[(int)var3];
      this.l6(var5);
      return var5;
   }

   @Override
   public int n5(byte[] var1, int var2, int var3) {
      if (this.t4() == 1) {
         return super.n5(var1, var2, var3);
      }

      w2$l6 var4 = null;
      int var5 = (int)this.l6();
      int var6 = var5 + var3;
      w2$l6[] var7 = new w2$l6[]{var4};
      int var8 = this.n5(var5, var7);
      var4 = var7[0];
      var7[0] = var4;
      int var9 = this.n5(var6, var7);
      var4 = var7[0];
      int var10 = var5 - this.l6.get_Item(var8).l6();
      int var11 = this.l6.get_Item(var8).n5().l6() + var10;
      int var12 = var6 - var5;
      int var13 = 0;

      for (int var14 = var8; var14 <= var9; var14++) {
         var4 = this.l6.get_Item(var14);
         v3 var15 = var4.n5().n5();
         var11 = var14 == var8 ? var11 : var4.n5().l6();
         var5 = var14 == var8 ? var5 : var4.l6();
         var15.n5(var11);
         int var16 = q1.l6(var4.k5() - var5, var12);
         int var17 = var15.n5(var1, var2 + var13, var16);
         var13 += var17;
         var12 -= var17;
      }

      this.n5(this.l6() + var13);
      return var13;
   }

   @Override
   public int x8() {
      if (this.t4() == 1) {
         return super.x8();
      }

      this.s7();
      byte[] var1 = new byte[1];
      this.l6(var1);
      return var1[0] & 0xFF;
   }

   @Override
   public long n5(long var1, int var3) {
      if (this.t4() == 1) {
         return super.n5(var1, var3);
      }

      this.s7();
      switch (var3) {
         case 0:
            this.n5(var1);
            break;
         case 1:
            this.n5(this.l6() + var1);
            break;
         case 2:
            this.n5(this.u3() + var1);
      }

      return this.l6();
   }

   @Override
   public void n3() {
      if (this.t4() == 1) {
         super.n3();
      } else {
         this.n5(0L, 0);
      }
   }

   @Override
   public void l6(byte[] var1, int var2, int var3) {
      if (this.t4() == 1) {
         super.l6(var1, var2, var3);
      } else {
         w2$l6 var4 = null;
         int var5 = (int)this.l6();
         int var6 = var5 + var3;
         w2$l6[] var7 = new w2$l6[]{var4};
         int var8 = this.n5(var5, var7);
         var4 = var7[0];
         var7[0] = var4;
         int var9 = this.n5(var6, var7);
         var4 = var7[0];
         int var10 = var5 - this.l6.get_Item(var8).l6();
         int var11 = this.l6.get_Item(var8).n5().l6() + var10;
         int var12 = var6 - var5;
         int var13 = 0;

         for (int var14 = var8; var14 <= var9; var14++) {
            var4 = this.l6.get_Item(var14);
            v3 var15 = var4.n5().n5();
            var11 = var14 == var8 ? var11 : var4.n5().l6();
            var5 = var14 == var8 ? var5 : var4.l6();
            var15.n5(var11);
            int var16 = q1.l6(var4.k5() - var5, var12);
            var15.l6(var1, var2 + var13, var16);
            var13 += var16;
            var12 -= var16;
         }

         this.n5(this.l6() + var13);
      }
   }

   @Override
   protected void a6() {
      try {
         this.y4();
      } finally {
         super.a6();
      }
   }

   @Override
   protected void y4() {
      this.z1();

      try {
         if (this.k5 != null) {
            List$Enumerator var1 = this.k5.iterator();

            try {
               while (var1.hasNext()) {
                  v3 var2 = (v3)var1.next();
                  if (!var2.c8()) {
                     var2.dispose();
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
                  var1.dispose();
               }
            }
         }

         this.k5 = null;
      } finally {
         this.t9();
      }
   }
}
