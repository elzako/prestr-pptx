package com.aspose.slides.internal.n8e;

import com.aspose.slides.PptReadException;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.ms.System.IDisposable;

public class z6 {
   private final SortedList<Long, j9> n5 = new SortedList<>();
   private int l6 = 1252;
   private s7 k5;
   private q0 u3;

   public final SortedList<Long, j9> n5() {
      return this.n5;
   }

   public final s7 l6() {
      return this.k5;
   }

   public final long k5() {
      return (this.n5.getKeys().get_Item(this.n5.size() - 1) & 4294967295L) + 1L & 4294967295L;
   }

   public z6() {
      this.k5 = new s7();
      this.n5.set_Item(0L, this.k5);
      this.l6 = 1200;
      this.n5.set_Item(1L, new y5((short)this.l6));
      this.k5.n5().set_Item(2L, "_PID_HLINKS");
      this.u3 = new q0();
      this.n5.set_Item(2L, this.u3);
   }

   public final void u3() {
      this.k5 = new s7();
      this.n5.set_Item(0L, this.k5);
   }

   z6(com.aspose.slides.internal.z0k.t4 var1, long var2, int var4) {
      var1.seek(var2 & 4294967295L, 0);
      com.aspose.slides.internal.z0k.n5 var5 = new com.aspose.slides.internal.z0k.n5(var1);
      long var6 = var5.c4();
      long var8 = var5.c4();
      if ((var6 & 4294967295L & 65535L & 4294967295L) == 0L && (var6 & 4294901760L & 4294967295L) != 0L) {
         throw new PptReadException("Property set stored in BigEndian format (Size)");
      }

      if ((var8 & 4294967295L & 65535L & 4294967295L) == 0L && (var8 & 4294901760L & 4294967295L) != 0L) {
         throw new PptReadException("Property set stored in BigEndian format (Number)");
      }

      if ((var6 & 4294967295L) > var1.getLength()) {
         throw new PptReadException("Property set is not valid");
      }

      SortedList var10 = new SortedList();
      SortedList var11 = new SortedList();

      for (int var12 = 0; var12 < (var8 & 4294967295L); var12++) {
         long var13 = var5.c4();
         long var15 = var5.c4();
         var10.set_Item(var15, var13);
      }

      for (int var49 = 0; var49 < var10.size(); var49++) {
         long var51 = (Long)var10.getKeys().get_Item(var49);
         long var52 = (Long)var10.get_Item(var51);
         long var17;
         if (var49 + 1 < var10.size()) {
            var17 = ((Long)var10.getKeys().get_Item(var49 + 1) & 4294967295L) - (var51 & 4294967295L) & 4294967295L;
         } else {
            var17 = (var6 & 4294967295L) - (var51 & 4294967295L) & 4294967295L;
         }

         var11.set_Item(var52, var17);
      }

      IGenericEnumerator var50 = var10.iterator();

      try {
         while (var50.hasNext()) {
            KeyValuePair var19 = (KeyValuePair)var50.next();
            long var20 = (Long)var19.getKey();
            long var22 = (Long)var19.getValue();
            long var24 = (Long)var11.get_Item(var22);
            var1.seek((var2 & 4294967295L) + (var20 & 4294967295L) & 4294967295L, 0);
            byte[] var26 = var5.c8((int)var24);
            if ((var22 & 4294967295L) != 0L) {
               this.n5.set_Item(var22, new y5(var26));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var50, IDisposable.class)) {
            var50.dispose();
         }
      }

      this.l6 = this.u9();
      byte var54 = 12;
      IGenericEnumerator var28 = var10.iterator();

      try {
         while (var28.hasNext()) {
            KeyValuePair var29 = (KeyValuePair)var28.next();
            long var55 = (Long)var29.getValue();
            if ((var55 & 4294967295L) == 0L) {
               long var56 = (Long)var29.getKey();
               long var30 = (Long)var11.get_Item(var55);
               var1.seek((var2 & 4294967295L) + (var56 & 4294967295L) & 4294967295L, 0);
               byte[] var32 = var5.c8((int)var30);
               if ((var30 & 4294967295L) >= var54) {
                  this.k5 = new s7(var32, this.l6);
                  this.n5.set_Item(var55, this.k5);
               } else {
                  this.n5.set_Item(var55, new s7());
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var28, IDisposable.class)) {
            var28.dispose();
         }
      }

      if (var4 == 1 && this.k5 != null) {
         IGenericEnumerator var58 = this.k5.n5().iterator();

         try {
            while (var58.hasNext()) {
               KeyValuePair var34 = (KeyValuePair)var58.next();
               if ("_PID_HLINKS".equals(var34.getValue())) {
                  long var53 = (Long)var34.getKey();
                  y5 var35 = (y5)this.n5.get_Item(var53);
                  q0 var57 = new q0(var35);
                  this.n5.set_Item(var53, var57);
                  if (this.u3 != null) {
                     this.u3.n5().addRange(var57.n5());
                  } else {
                     this.u3 = var57;
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var58, IDisposable.class)) {
               var58.dispose();
            }
         }
      }
   }

   private int u9() {
      j9 var1 = null;
      j9[] var2 = new j9[]{var1};
      this.n5.tryGetValue(1L, var2);
      var1 = var2[0];
      if (var1 != null && com.aspose.slides.internal.v6g.k5.l6(var1, y5.class)) {
         y5 var3 = (y5)var1;
         short var4 = 0;
         short[] var5 = new short[]{0};
         boolean var6 = var3.n5(var5);
         var4 = var5[0];
         if (var6) {
            return var4 & 65535;
         }
      }

      return 1252;
   }

   public final byte[] a6() {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();
      com.aspose.slides.internal.z0k.l6 var2 = new com.aspose.slides.internal.z0k.l6(var1);
      var2.n5(0L);
      var2.n5(0L);
      int var3 = this.n5.size();
      byte[] var4 = new byte[var3 * 8];
      var2.n5(var4);
      int[] var5 = new int[var3];
      int var6 = 0;
      IGenericEnumerator var7 = this.n5.iterator();

      try {
         while (var7.hasNext()) {
            KeyValuePair var8 = (KeyValuePair)var7.next();
            byte[] var9 = ((j9)var8.getValue()).l6();
            var2.n5(var9);
            var5[var6++] = var9.length;
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      var1.seek(0L, 0);
      var2.n5(var1.getLength() & 4294967295L);
      var2.n5(var3 & 4294967295L);
      int var21 = 8 + var3 * 8;
      var6 = 0;
      IGenericEnumerator var22 = this.n5.iterator();

      try {
         while (var22.hasNext()) {
            KeyValuePair var10 = (KeyValuePair)var22.next();
            long var11 = (Long)var10.getKey();
            var2.n5(var11);
            var2.n5(var21 & 4294967295L);
            var21 += var5[var6++];
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var22, IDisposable.class)) {
            var22.dispose();
         }
      }

      var2.l6();
      return var1.toArray();
   }

   public final boolean n5(long var1, int[] var3) {
      j9 var4 = this.l6(var1);
      if (var4 != null && com.aspose.slides.internal.v6g.k5.l6(var4, y5.class)) {
         return ((y5)var4).n5(var3);
      }

      var3[0] = 0;
      return false;
   }

   public final boolean n5(long var1, boolean[] var3) {
      j9 var4 = this.l6(var1);
      if (var4 != null && com.aspose.slides.internal.v6g.k5.l6(var4, y5.class)) {
         return ((y5)var4).n5(var3);
      }

      var3[0] = false;
      return false;
   }

   public final boolean n5(long var1, float[] var3) {
      j9 var4 = this.l6(var1);
      if (var4 != null && com.aspose.slides.internal.v6g.k5.l6(var4, y5.class)) {
         return ((y5)var4).n5(var3);
      }

      var3[0] = 0.0F;
      return false;
   }

   public final boolean n5(long var1, double[] var3) {
      j9 var4 = this.l6(var1);
      if (var4 != null && com.aspose.slides.internal.v6g.k5.l6(var4, y5.class)) {
         return ((y5)var4).n5(var3);
      }

      var3[0] = 0.0;
      return false;
   }

   public final boolean n5(long var1, long[] var3) {
      j9 var4 = this.l6(var1);
      if (var4 != null && com.aspose.slides.internal.v6g.k5.l6(var4, y5.class)) {
         return ((y5)var4).n5(var3);
      }

      var3[0] = 0L;
      return false;
   }

   public final boolean n5(long var1, String[] var3) {
      j9 var4 = this.l6(var1);
      if (var4 != null && com.aspose.slides.internal.v6g.k5.l6(var4, y5.class)) {
         return ((y5)var4).n5(var3, this.l6 & 65535);
      }

      var3[0] = com.aspose.slides.ms.System.d1.n5;
      return false;
   }

   public final boolean n5(long var1, byte[][] var3) {
      j9 var4 = this.l6(var1);
      if (var4 != null && com.aspose.slides.internal.v6g.k5.l6(var4, y5.class)) {
         return ((y5)var4).n5(var3);
      }

      var3[0] = null;
      return false;
   }

   public final boolean n5(long var1, h0[] var3) {
      j9 var4 = this.l6(var1);
      if (var4 != null && com.aspose.slides.internal.v6g.k5.l6(var4, y5.class)) {
         return ((y5)var4).n5(var3);
      }

      var3[0] = null;
      return false;
   }

   public final boolean n5(long var1, com.aspose.slides.ms.System.j5[] var3) {
      j9 var4 = this.l6(var1);
      if (var4 != null && com.aspose.slides.internal.v6g.k5.l6(var4, y5.class)) {
         return ((y5)var4).n5(var3);
      }

      com.aspose.slides.ms.System.j5.l6.u3(var3[0]);
      return false;
   }

   public final boolean n5(String var1, int[] var2) {
      long var3 = 0L;
      long[] var5 = new long[]{0L};
      boolean var6 = this.n5(var1, var5);
      var3 = var5[0];
      if (var6) {
         return this.n5(var3, var2);
      }

      var2[0] = 0;
      return false;
   }

   public final boolean n5(String var1, boolean[] var2) {
      long var3 = 0L;
      long[] var5 = new long[]{0L};
      boolean var6 = this.n5(var1, var5);
      var3 = var5[0];
      if (var6) {
         return this.n5(var3, var2);
      }

      var2[0] = false;
      return false;
   }

   public final boolean n5(String var1, float[] var2) {
      long var3 = 0L;
      long[] var5 = new long[]{0L};
      boolean var6 = this.n5(var1, var5);
      var3 = var5[0];
      if (var6) {
         return this.n5(var3, var2);
      }

      var2[0] = 0.0F;
      return false;
   }

   public final boolean n5(String var1, double[] var2) {
      long var3 = 0L;
      long[] var5 = new long[]{0L};
      boolean var6 = this.n5(var1, var5);
      var3 = var5[0];
      if (var6) {
         return this.n5(var3, var2);
      }

      var2[0] = 0.0;
      return false;
   }

   public final boolean n5(String var1, com.aspose.slides.ms.System.j5[] var2) {
      long var3 = 0L;
      long[] var5 = new long[]{0L};
      boolean var6 = this.n5(var1, var5);
      var3 = var5[0];
      if (var6) {
         return this.n5(var3, var2);
      }

      com.aspose.slides.ms.System.j5.s7().u3(var2[0]);
      return false;
   }

   public final boolean n5(String var1, String[] var2) {
      long var3 = 0L;
      long[] var5 = new long[]{0L};
      boolean var6 = this.n5(var1, var5);
      var3 = var5[0];
      if (var6) {
         return this.n5(var3, var2);
      }

      var2[0] = com.aspose.slides.ms.System.d1.n5;
      return false;
   }

   public final boolean n5(long var1) {
      j9 var3 = this.l6(var1);
      return var3 != null && com.aspose.slides.internal.v6g.k5.l6(var3, y5.class) ? ((y5)var3).n5() : false;
   }

   public final j9 l6(long var1) {
      j9 var3 = null;
      j9[] var4 = new j9[]{var3};
      boolean var5 = this.n5.tryGetValue(var1, var4);
      var3 = var4[0];
      return var5 ? var3 : null;
   }

   public final boolean n5(String var1, long[] var2) {
      if (this.k5 != null && this.k5.n5().containsValue(var1)) {
         int var3 = this.k5.n5().indexOfValue(var1);
         var2[0] = this.k5.n5().getKeys().get_Item(var3);
         return true;
      } else {
         var2[0] = 0L;
         return false;
      }
   }

   public final void n5(String var1, j9 var2) {
      if (this.k5 == null) {
         this.u3();
      }

      if (this.k5.n5().containsValue(var1)) {
         int var3 = this.k5.n5().indexOfValue(var1);
         this.n5.set_Item(this.k5.n5().getKeys().get_Item(var3), var2);
      } else {
         long var4 = 2L;

         while (this.n5.containsKey(var4)) {
            var4++;
         }

         this.k5.n5().addItem(var4, var1);
         this.n5.addItem(var4, var2);
      }
   }

   public final void n5(String var1) {
      if (this.k5 != null && this.k5.n5().containsValue(var1)) {
         int var2 = this.k5.n5().indexOfValue(var1);
         long var3 = this.k5.n5().getKeys().get_Item(var2);
         this.k5.n5().removeItemByKey(var3);
         this.n5.removeItemByKey(var3);
      }
   }
}
