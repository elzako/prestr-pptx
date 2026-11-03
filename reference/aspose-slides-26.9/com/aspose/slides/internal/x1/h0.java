package com.aspose.slides.internal.x1;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.l7h.t1;
import com.aspose.slides.internal.n8e.y2;
import com.aspose.slides.ms.System.d1;

class h0 {
   private t2 n5 = null;
   private s7 l6 = null;

   public final void n5(s7 var1) {
      this.l6 = var1;
      l6 var2 = var1.n5();
      e2 var3 = var1.l6();
      u9 var4 = new u9(var2.u3() & 4294967295L, var3, var1);
      this.n5 = (t2)this.n5(this.l6(0, var4), var4);
      Object var6 = null;
      Object var5 = null;
   }

   private c8 n5(byte[] var1, u9 var2) {
      t2 var3 = this.n5(var1);
      List var4 = this.n5(this.u9(var1), var2);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         byte[] var6 = com.aspose.slides.internal.v6g.k5.k5(var4.get_Item(var5), byte[].class);
         byte var7 = this.k5(var6);
         if (var7 == 1 || var7 == 5) {
            var3.a6(this.n5(var6, var2));
         } else if ((var7 & 255) != 0) {
            var3.a6(this.l6(var6));
         }
      }

      return var3;
   }

   private t2 n5(byte[] var1) {
      t2 var2 = new t2();
      var2.n5(this.s7(var1));
      var2.n5(this.c8(var1));
      var2.u3(this.t2(var1));
      var2.l6(this.h0(var1));
      return var2;
   }

   private u9 l6(byte[] var1) {
      l6 var2 = this.l6.n5();
      u9 var3 = new u9(this.t2(var1));
      var3.n5(this.c8(var1));
      var3.n5(this.s7(var1));
      var3.u3(this.t2(var1));
      var3.l6(this.h0(var1));
      return var3;
   }

   private c8 n5(List<c8> var1) {
      if (var1.isEmpty()) {
         return null;
      }

      for (int var2 = 0; var2 < var1.size(); var2++) {
         c8 var3 = (c8)var1.get_Item(var2);
         var3.n5((c8)null);
         var3.l6((c8)null);
         var3.k5(null);
      }

      c8 var4 = (c8)var1.get_Item(0);

      for (int var5 = 1; var5 < var1.size(); var5++) {
         this.n5(var4, (c8)var1.get_Item(var5));
      }

      return var4;
   }

   public final List<c8> n5() {
      return this.l6(this.n5);
   }

   public final u9 l6() {
      this.n5.n5((short)5);
      List var1 = this.l6(this.n5);

      for (int var2 = 0; var2 < var1.size(); var2++) {
         c8 var3 = (c8)var1.get_Item(var2);
         var3.k5(var2);
      }

      u9 var4 = new u9();

      for (int var5 = 0; var5 < var1.size(); var5++) {
         var4.n5(this.n5((c8)var1.get_Item(var5)));
      }

      return var4;
   }

   private byte[] n5(c8 var1) {
      byte[] var2 = new byte[128];
      String var3 = var1.x8().length() > 31 ? d1.l6(var1.x8(), 0, 31) : var1.x8();
      t1 var4 = new t1();
      byte[] var5 = var4.u3(var3);
      System.arraycopy(var5, 0, var2, 0, var5.length);
      var2[64] = (byte)(var5.length + 2);
      var2[65] = 0;
      var2[66] = (byte)var1.s7();
      if (var1.c8() != null) {
         var2[68] = (byte)(var1.c8().a6() & 0xFF);
         var2[69] = (byte)(var1.c8().a6() >> 8 & 0xFF);
         var2[70] = (byte)(var1.c8().a6() >> 16 & 0xFF);
         var2[71] = (byte)(var1.c8().a6() >> 24 & 0xFF);
      } else {
         var2[68] = -1;
         var2[69] = -1;
         var2[70] = -1;
         var2[71] = -1;
      }

      if (var1.t2() != null) {
         var2[72] = (byte)(var1.t2().a6() & 0xFF);
         var2[73] = (byte)(var1.t2().a6() >> 8 & 0xFF);
         var2[74] = (byte)(var1.t2().a6() >> 16 & 0xFF);
         var2[75] = (byte)(var1.t2().a6() >> 24 & 0xFF);
      } else {
         var2[72] = -1;
         var2[73] = -1;
         var2[74] = -1;
         var2[75] = -1;
      }

      if (var1.h0() != null) {
         var2[76] = (byte)(var1.h0().a6() & 0xFF);
         var2[77] = (byte)(var1.h0().a6() >> 8 & 0xFF);
         var2[78] = (byte)(var1.h0().a6() >> 16 & 0xFF);
         var2[79] = (byte)(var1.h0().a6() >> 24 & 0xFF);
      } else {
         var2[76] = -1;
         var2[77] = -1;
         var2[78] = -1;
         var2[79] = -1;
      }

      byte[] var6 = var1.u9();
      if (var6 != null) {
         System.arraycopy(var6, 0, var2, 80, 16);
      }

      var2[116] = (byte)(var1.u3() & 4294967295L & 255L & 4294967295L);
      var2[117] = (byte)((var1.u3() & 4294967295L) >> 8 & 4294967295L & 255L & 4294967295L);
      var2[118] = (byte)((var1.u3() & 4294967295L) >> 16 & 4294967295L & 255L & 4294967295L);
      var2[119] = (byte)((var1.u3() & 4294967295L) >> 24 & 4294967295L & 255L & 4294967295L);
      var2[120] = (byte)(var1.n3() & 0xFF);
      var2[121] = (byte)(var1.n3() >> 8 & 0xFF);
      var2[122] = (byte)(var1.n3() >> 16 & 0xFF);
      var2[123] = (byte)(var1.n3() >> 24 & 0xFF);
      return var2;
   }

   private List<c8> l6(t2 var1) {
      List var2 = new List();
      List var3 = var1.n5();
      c8 var4 = this.n5(var3);
      var1.n5(var4);
      var2.addItem(var1);

      for (int var5 = 0; var5 < var3.size(); var5++) {
         c8 var6 = (c8)var3.get_Item(var5);
         if (com.aspose.slides.internal.v6g.k5.l6(var6, t2.class)) {
            var2.addRange(this.l6((t2)var6));
         } else {
            var2.addItem(var6);
         }
      }

      return var2;
   }

   private List<byte[]> n5(int var1, u9 var2) {
      List var3 = new List(1);
      if (var1 <= 0) {
         return var3;
      }

      byte[] var4 = this.l6(var1, var2);
      byte var5 = this.k5(var4);
      if (var5 == 0) {
         var3.addItem(var4);
         return var3;
      }

      var3.addItem(var4);
      int var6 = this.u3(var4);
      int var7 = this.a6(var4);
      if (var6 > -1) {
         var3.addRange(this.n5(var6, var2));
      }

      if (var7 > -1) {
         var3.addRange(this.n5(var7, var2));
      }

      return var3;
   }

   public final long l6(s7 var1) {
      l6 var2 = var1.n5();
      e2 var3 = var1.l6();
      var2 = var1.n5();
      u9 var4 = new u9(var2.u3() & 4294967295L, var3, var1);
      t2 var5 = this.n5(this.l6(0, var4));
      return var5.u3();
   }

   private void n5(c8 var1, c8 var2) {
      if (var1.u3(var2) > 0) {
         if (var1.c8() != null) {
            this.n5(var1.c8(), var2);
         } else {
            var1.l6(var2);
         }
      } else if (var1.t2() != null) {
         this.n5(var1.t2(), var2);
      } else {
         var1.k5(var2);
      }
   }

   private byte k5(byte[] var1) {
      return var1[66];
   }

   private int u3(byte[] var1) {
      return y2.k5(var1, 68);
   }

   private int a6(byte[] var1) {
      return y2.k5(var1, 72);
   }

   private int u9(byte[] var1) {
      return y2.k5(var1, 76);
   }

   private byte[] h0(byte[] var1) {
      byte[] var2 = new byte[16];
      System.arraycopy(var1, 80, var2, 0, 16);
      return var2;
   }

   private long c8(byte[] var1) {
      return y2.u3(var1, 116) & 4294967295L;
   }

   private int t2(byte[] var1) {
      return y2.k5(var1, 120);
   }

   private String s7(byte[] var1) {
      int var2 = var1[64] & 255;
      t1 var3 = new t1();
      return var3.l6(var1, 0, var2 - 2);
   }

   public final t2 k5() {
      return this.n5;
   }

   public final void n5(t2 var1) {
      this.n5 = var1;
   }

   private byte[] l6(int var1, u9 var2) {
      byte[] var3 = new byte[128];
      System.arraycopy(var2.n5(), var1 * 128, var3, 0, 128);
      return var3;
   }
}
