package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;

public class h9 {
   private long n5;
   private long l6;
   private r7 k5 = new r7();
   private int u3;
   private i8 a6;
   private int u9;
   private boolean h0;
   private int c8;
   private int t2;
   private long s7;
   private int x8;
   private String n3;
   private long y4;
   private long e2;
   private String t9;
   private String z1;
   private String t4;
   private long q0;
   private String z3;
   private String m1;
   private long[] k7;
   private long[] m3;
   private long[] z8;

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final long n5() {
      return this.l6;
   }

   public final void l6(long var1) {
      this.l6 = var1;
   }

   public final r7 l6() {
      return this.k5;
   }

   public final void n5(r7 var1) {
      var1.n5(this.k5);
   }

   public final int k5() {
      return this.u3;
   }

   public final void n5(int var1) {
      this.u3 = var1;
   }

   public final i8 u3() {
      return this.a6;
   }

   public final void n5(i8 var1) {
      this.a6 = var1;
   }

   public final int a6() {
      return this.u9;
   }

   public final void l6(int var1) {
      this.u9 = var1;
   }

   public final void n5(boolean var1) {
      this.h0 = var1;
   }

   public final void k5(int var1) {
      this.c8 = var1;
   }

   public final void u3(int var1) {
      this.t2 = var1;
   }

   public final void n5(long[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if (var1.length != 4) {
         throw new ArgumentException("Length of array must be 4");
      }

      this.k7 = var1;
   }

   public final void l6(long[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if (var1.length != 2) {
         throw new ArgumentException("Length of array must be 2");
      }

      this.z8 = var1;
   }

   public final void k5(long var1) {
      this.q0 = var1;
   }

   public final void k5(long[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if (var1.length != 4) {
         throw new ArgumentException("Length of array must be 4");
      }

      this.m3 = var1;
   }

   public final String u9() {
      return this.z3;
   }

   public final void n5(String var1) {
      this.z3 = var1;
   }

   public final void l6(String var1) {
      this.m1 = var1;
   }

   public final void k5(String var1) {
      this.z1 = var1;
   }

   public final void u3(String var1) {
      this.t4 = var1;
   }

   public final void a6(String var1) {
      this.t9 = var1;
   }

   public final long h0() {
      return this.e2;
   }

   public final void u3(long var1) {
      this.e2 = var1;
   }

   public final void a6(long var1) {
      this.y4 = var1;
   }

   public final void u9(String var1) {
      this.n3 = var1;
   }

   public final void a6(int var1) {
      this.x8 = var1;
   }

   public final long c8() {
      return this.s7;
   }

   public final void u9(long var1) {
      this.s7 = var1;
   }

   public h9(com.aspose.slides.internal.z0k.n5 var1) {
      if (var1 != null) {
         this.n5(var1);
      }
   }

   public h9() {
      this(null);
   }

   public static boolean n5(byte[] var0) {
      if (var0 != null && var0.length >= 36) {
         com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2(var0);

         try {
            com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(var1);

            try {
               var2.c4();
               var2.c4();
               var2.c4();
               var2.c4();
               var2.c8(10);
               var2.z1();
               var2.z1();
               var2.c4();
               var2.r4();
               return var2.r4() == 20556;
            } finally {
               if (var2 != null) {
                  var2.dispose();
               }
            }
         } finally {
            if (var1 != null) {
               var1.dispose();
            }
         }
      } else {
         return false;
      }
   }

   public final void n5(com.aspose.slides.internal.z0k.n5 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("reader");
      }

      this.n5(var1.c4());
      this.l6(var1.c4());
      this.n5(r7.n5(var1.c4()).k5());
      this.n5((int)var1.c4());
      this.n5(new i8(var1.c8(10)));
      this.l6(var1.z1() & 255);
      this.n5((var1.z1() & 255) == 1);
      this.k5((int)var1.c4());
      this.u3(var1.r4() & 65535);
      if ((var1.r4() & 65535) != 20556) {
         throw new InvalidOperationException("Magic number for EOT file is incorrect. Maybe file is corrupted");
      }

      this.n5(n5(var1, 4));
      this.l6(n5(var1, 2));
      this.k5(var1.c4());
      this.k5(n5(var1, 4));
      if ((var1.r4() & 65535) != 0) {
         throw new InvalidOperationException("Padding1 is not zero. Maybe file is corrupted");
      }

      this.n5(this.l6(var1));
      if ((var1.r4() & 65535) != 0) {
         throw new InvalidOperationException("Padding2 is not zero. Maybe file is corrupted");
      }

      this.l6(this.l6(var1));
      if ((var1.r4() & 65535) != 0) {
         throw new InvalidOperationException("Padding3 is not zero. Maybe file is corrupted");
      }

      this.k5(this.l6(var1));
      if ((var1.r4() & 65535) != 0) {
         throw new InvalidOperationException("Padding4 is not zero. Maybe file is corrupted");
      }

      this.u3(this.l6(var1));
      if ((this.l6().n5() & 65535) == 2) {
         if ((var1.r4() & 65535) != 0) {
            throw new InvalidOperationException("Padding5 is not zero. Maybe file is corrupted");
         }

         int var2 = var1.r4();
         byte[] var3 = var1.c8(var2 & 65535);
         this.a6(k5(var3));
         if ((this.l6().l6() & 65535) == 2) {
            this.u3(var1.c4());
            if ((this.h0() & 4294967295L) != (l6(var3) & 4294967295L)) {
               throw new InvalidOperationException("RootString checksum is incorrect. Maybe file is corrupted");
            }

            this.a6(var1.c4());
            if ((var1.r4() & 65535) != 0) {
               throw new InvalidOperationException("Padding6 is not zero. Maybe file is corrupted");
            }

            this.u9(this.l6(var1));
            this.a6((int)var1.c4());
            this.u9(var1.c4());
         }
      }
   }

   private static long l6(byte[] var0) {
      long var1 = 1346851650L;
      long var3 = 0L;

      for (int var5 = 0; var5 < var0.length; var5++) {
         var3 = (var3 & 4294967295L) + (var0[var5] & 0xFF) & 4294967295L;
      }

      return (var3 ^ 1346851650L) & 4294967295L;
   }

   private static String k5(byte[] var0) {
      String var1 = com.aspose.slides.internal.l7h.j5.z1().l6(var0);
      if (var1.length() > 0 && var1.charAt(var1.length() - 1) == 0) {
         var1 = com.aspose.slides.ms.System.d1.l6(var1, 0, var1.length() - 1);
      }

      return var1;
   }

   private String l6(com.aspose.slides.internal.z0k.n5 var1) {
      int var2 = var1.r4();
      byte[] var3 = var1.c8(var2 & 65535);
      return k5(var3);
   }

   private static long[] n5(com.aspose.slides.internal.z0k.n5 var0, int var1) {
      long[] var2 = new long[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = var0.c4();
      }

      return var2;
   }
}
