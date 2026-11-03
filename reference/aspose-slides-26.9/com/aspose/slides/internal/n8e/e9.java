package com.aspose.slides.internal.n8e;

import com.aspose.slides.PptReadException;

public class e9 {
   private int k5 = 65534;
   private int u3;
   private long a6;
   private com.aspose.slides.ms.System.o0 u9 = new com.aspose.slides.ms.System.o0();
   private long h0;
   private com.aspose.slides.ms.System.o0 c8 = new com.aspose.slides.ms.System.o0();
   private com.aspose.slides.ms.System.o0 t2 = new com.aspose.slides.ms.System.o0();
   private z6 s7;
   private z6 x8;
   public static final com.aspose.slides.ms.System.o0 n5 = new com.aspose.slides.ms.System.o0("F29F85E0-4FF9-1068-AB91-08002B27B3D9");
   public static final com.aspose.slides.ms.System.o0 l6 = new com.aspose.slides.ms.System.o0("D5CDD502-2E9C-101B-9397-08002B2CF9AE");

   public e9(com.aspose.slides.internal.z0k.t4 var1) {
      com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(var1);
      this.k5 = var2.r4();
      this.u3 = var2.r4();
      this.a6 = var2.c4();
      this.u9 = new com.aspose.slides.ms.System.o0(var2.c8(16));
      this.h0 = var2.c4();
      if (com.aspose.slides.internal.v6g.k5.a6(this.h0, 10) == 0L) {
         this.h0 = 1L;
         this.s7 = new z6();
      } else {
         this.c8 = new com.aspose.slides.ms.System.o0(var2.c8(16));
         long var3 = var2.c4();
         long var5 = 0L;
         if (com.aspose.slides.internal.v6g.k5.a6(this.h0, 10) == 1L) {
            this.t2 = new com.aspose.slides.ms.System.o0(var2.c8(16));
            var2.c4();
            this.s7 = new z6(var1, var3, 0);
         } else {
            if (com.aspose.slides.internal.v6g.k5.a6(this.h0, 10) == 2L) {
               this.t2 = new com.aspose.slides.ms.System.o0(var2.c8(16));
               var5 = var2.c4();
            }

            this.s7 = new z6(var1, var3, 0);
            if (com.aspose.slides.internal.v6g.k5.a6(this.h0, 10) == 2L) {
               try {
                  this.x8 = new z6(var1, var5, 1);
               } catch (PptReadException var8) {
                  v4.n5(var8);
                  this.x8 = null;
                  this.h0 = 1L;
               }
            }
         }
      }
   }

   public final byte[] n5() {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();
      com.aspose.slides.internal.z0k.l6 var2 = new com.aspose.slides.internal.z0k.l6(var1);
      var2.n5(this.k5);
      var2.n5(this.u3);
      var2.n5(this.a6);
      var2.n5(this.u9.n5());
      var2.n5(this.h0);
      var2.n5(this.c8.n5());
      long var3 = com.aspose.slides.internal.v6g.k5.a6(
         com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(var1.getPosition(), 11), 10) + 4L, 10
      );
      if (com.aspose.slides.internal.v6g.k5.a6(this.h0, 10) == 2L) {
         var3 = com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(var3, 10) + 20L, 10);
      }

      var2.n5(var3);
      byte[] var5 = this.s7.a6();
      if (com.aspose.slides.internal.v6g.k5.a6(this.h0, 10) == 2L) {
         var2.n5(this.t2.n5());
         var3 = com.aspose.slides.internal.v6g.k5.a6(
            com.aspose.slides.internal.v6g.k5.a6(var3, 10) + com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(var5.length, 9), 10), 10
         );
         var2.n5(var3);
      }

      var2.n5(var5);
      if (com.aspose.slides.internal.v6g.k5.a6(this.h0, 10) == 2L) {
         var2.n5(this.x8.a6());
      }

      var2.l6();
      return var1.toArray();
   }

   public static byte[] n5(com.aspose.slides.ms.System.o0 var0) {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();
      com.aspose.slides.internal.z0k.l6 var2 = new com.aspose.slides.internal.z0k.l6(var1);
      var2.n5(com.aspose.slides.internal.v6g.k5.k5(65534, 9));
      var2.n5(com.aspose.slides.internal.v6g.k5.k5(0, 9));
      var2.n5(com.aspose.slides.internal.v6g.k5.a6(131334, 9));
      var2.n5(com.aspose.slides.ms.System.o0.n5.n5());
      var2.n5(com.aspose.slides.internal.v6g.k5.a6(1, 9));
      var2.n5(var0.n5());
      var2.n5(com.aspose.slides.internal.v6g.k5.a6(var1.getPosition() + 4L, 11));
      z6 var3 = new z6();
      var3.n5().removeAt(2);
      var3.n5().removeAt(0);
      byte[] var4 = var3.a6();
      var2.n5(var4);
      var2.l6();
      return var1.toArray();
   }

   public final z6 l6() {
      if (this.x8 != null) {
         return this.x8;
      }

      this.h0 = 2L;
      this.t2 = new com.aspose.slides.ms.System.o0("{d5cdd505-2e9c-101b-9397-08002b2cf9ae}");
      this.x8 = new z6();
      return this.x8;
   }

   public final long k5() {
      return this.h0;
   }

   public final z6 u3() {
      return this.s7;
   }

   public final z6 a6() {
      return this.x8;
   }
}
