package com.aspose.slides.internal.k0r;

import com.aspose.slides.ILoadOptions;
import com.aspose.slides.IWarningCallback;
import com.aspose.slides.IWarningInfo;
import com.aspose.slides.InvalidPasswordException;
import com.aspose.slides.PptCorruptFileException;
import com.aspose.slides.PptException;
import com.aspose.slides.PptReadException;
import com.aspose.slides.PptUnsupportedFormatException;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

public final class e3 {
   private List<byte[]> n5;
   private byte[] l6;
   private byte[] k5;
   private h8 u3;
   private y1 a6;
   private w7 u9;
   private boolean h0;

   public final byte[] n5() {
      return this.l6;
   }

   public final void n5(byte[] var1) {
      this.l6 = var1;
   }

   public final byte[] l6() {
      return this.k5;
   }

   public final void l6(byte[] var1) {
      this.k5 = var1;
   }

   public final h8 k5() {
      return this.u3;
   }

   public final y1 u3() {
      return this.a6;
   }

   public final w7 a6() {
      return this.u9;
   }

   public final List<byte[]> u9() {
      return this.n5;
   }

   public final void n5(List<byte[]> var1) {
      this.n5 = var1;
   }

   public static boolean n5(com.aspose.slides.internal.x1.x8 var0) {
      y2 var1 = y2.n5(var0);
      byte[] var2 = ((com.aspose.slides.internal.x1.u9)var0.n5().u3("PowerPoint Document")).n5();
      com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2(var2);
      w7 var4 = new w7();
      c4i var5 = (c4i)n5(var3, var1.l6() & 4294967295L, var4);
      j2 var6 = (j2)n5(var3, var5.k5(), var4);
      List var7 = var6.l6();
      List$Enumerator var8 = var7.iterator();

      try {
         while (var8.hasNext()) {
            w6 var9 = (w6)var8.next();
            int var10 = com.aspose.slides.internal.n8e.y2.l6(var2, (int)((var9.l6() & 4294967295L) + 2L)) & 65535;
            if (var10 == 12052) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
            var8.dispose();
         }
      }

      return false;
   }

   public final void l6(com.aspose.slides.internal.x1.x8 var1) {
      com.aspose.slides.internal.x1.t2 var2 = var1.n5();
      this.c8();
      this.u3(var1);
      this.a6(var1);
      this.u9(var1);
      this.h0(var1);
      if (this.u9() != null && this.u9().size() > 0) {
         com.aspose.slides.internal.x1.t2 var3 = new com.aspose.slides.internal.x1.t2("_xmlsignatures");
         var2.a6(var3);
         List$Enumerator var4 = this.u9().iterator();

         try {
            while (var4.hasNext()) {
               byte[] var5 = (byte[])var4.next();
               com.aspose.slides.internal.x1.u9 var6 = new com.aspose.slides.internal.x1.u9();
               var6.n5(var5);
               var3.a6(var6);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }
   }

   private void c8() {
      long var1 = this.a6().a6();
      this.a6().t9().l6(0L);
      this.a6().t9().n5(this.a6().u3());
      this.a6().t9().u3((var1 & 4294967295L) + 2L & 4294967295L);
      this.u3().l6().n5(this.a6().l6() & 4294967295L);
   }

   private void u3(com.aspose.slides.internal.x1.x8 var1) {
      if (this.u3.e2().size() > 0) {
         byte[] var2 = new byte[this.u3.n5()];
         com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2(var2);
         com.aspose.slides.internal.z0k.l6 var4 = new com.aspose.slides.internal.z0k.l6(var3);

         for (int var5 = 0; var5 < this.u3.e2().size(); var5++) {
            this.u3.l6(var5).l6(var4);
         }

         com.aspose.slides.internal.x1.u9 var6 = new com.aspose.slides.internal.x1.u9("Pictures");
         var6.n5(var2);
         var1.n5().a6(var6);
      }
   }

   private void a6(com.aspose.slides.internal.x1.x8 var1) {
      byte[] var2 = new byte[this.u9.n5()];
      com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2(var2);
      com.aspose.slides.internal.z0k.l6 var4 = new com.aspose.slides.internal.z0k.l6(var3);
      this.u9.n5(var4);
      int var5 = (int)var4.n5().getPosition();

      for (int var6 = var5; var6 < this.u9.n5(); var6++) {
         var2[var6] = 0;
      }

      com.aspose.slides.internal.x1.u9 var7 = new com.aspose.slides.internal.x1.u9("PowerPoint Document");
      var7.n5(var2);
      var1.n5().a6(var7);
   }

   private void u9(com.aspose.slides.internal.x1.x8 var1) {
      if (this.l6 != null) {
         com.aspose.slides.internal.x1.u9 var2 = new com.aspose.slides.internal.x1.u9("\u0005SummaryInformation");
         var2.n5(this.l6);
         var1.n5().a6(var2);
      }

      if (this.k5 != null) {
         com.aspose.slides.internal.x1.u9 var3 = new com.aspose.slides.internal.x1.u9("\u0005DocumentSummaryInformation");
         var3.n5(this.k5);
         var1.n5().a6(var3);
      }
   }

   private void h0(com.aspose.slides.internal.x1.x8 var1) {
      int var2 = this.u3().l6().n5() + 8 + this.u3().l6().k5().length() * 2;
      byte[] var3 = new byte[var2];
      com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2(var3);
      com.aspose.slides.internal.z0k.l6 var5 = new com.aspose.slides.internal.z0k.l6(var4);
      this.u3().l6().l6(var5);
      com.aspose.slides.internal.l7h.t1 var6 = new com.aspose.slides.internal.l7h.t1();
      var5.n5(var6.l6(com.aspose.slides.ms.System.d1.c8(this.u3().l6().k5())));
      com.aspose.slides.internal.x1.u9 var7 = new com.aspose.slides.internal.x1.u9("Current User");
      var7.n5(var3);
      var1.n5().a6(var7);
   }

   public e3() {
      this.u9 = new w7();
      this.u9.l6(true);
      this.u3 = new h8();
      this.a6 = new y1();
      this.h0 = false;
   }

   public e3(com.aspose.slides.internal.x1.x8 var1, ILoadOptions var2) {
      com.aspose.slides.internal.x1.t2 var3 = var1.n5();
      boolean[] var4 = new boolean[]{this.h0};
      n5(var1, var2, var4);
      this.h0 = var4[0];
      com.aspose.slides.internal.x1.u9 var5 = (com.aspose.slides.internal.x1.u9)var3.u3("\u0005SummaryInformation");
      if (var5 != null) {
         this.l6 = var5.n5();
      }

      com.aspose.slides.internal.x1.u9 var6 = (com.aspose.slides.internal.x1.u9)var3.u3("\u0005DocumentSummaryInformation");
      if (var6 != null) {
         this.k5 = var6.n5();
      }

      if (!this.h0()) {
         this.u3 = new h8(var1);
         com.aspose.slides.internal.x1.t2 var7 = com.aspose.slides.internal.v6g.k5.n5(var3.u3("_xmlsignatures"), com.aspose.slides.internal.x1.t2.class);
         if (var7 != null) {
            List var8 = null;
            List$Enumerator var9 = var7.n5().iterator();

            try {
               while (var9.hasNext()) {
                  com.aspose.slides.internal.x1.c8 var10 = (com.aspose.slides.internal.x1.c8)var9.next();
                  if (com.aspose.slides.internal.v6g.k5.l6(var10, com.aspose.slides.internal.x1.u9.class)) {
                     byte[] var11 = com.aspose.slides.internal.v6g.k5.n5(var10, com.aspose.slides.internal.x1.u9.class).n5();
                     if (var8 == null) {
                        var8 = new List();
                     }

                     var8.addItem(var11);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                  var9.dispose();
               }
            }

            this.n5(var8);
         }

         if (var7 != null || var3.u3("_signatures") != null) {
            if (var2 != null && var2.getWarningCallback() != null) {
               n5(var2.getWarningCallback(), new com.aspose.slides.internal.n8e.a3());
            }

            com.aspose.slides.internal.x1.c8 var15 = var7;
            if (var15 != null) {
               var3.u9(var15);
            }

            var15 = var3.u3("_signatures");
            if (var15 != null) {
               var3.u9(var15);
            }
         }

         this.c8(var1);
         this.t2();
      }
   }

   public e3(com.aspose.slides.internal.x1.x8 var1) {
      this(var1, null);
   }

   private static void n5(com.aspose.slides.internal.x1.x8 var0, ILoadOptions var1, boolean[] var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean[] var5 = new boolean[]{false};
      boolean[] var6 = new boolean[]{false};
      n5(var0, var5, var6, var2);
      var3 = var5[0];
      var4 = var6[0];
      if (var3) {
         if (var4) {
            throw new PptUnsupportedFormatException("Dual Microsoft PowerPoint 97-2002 and 95 presentation format is not supported.");
         } else {
            throw new PptUnsupportedFormatException("Microsoft PowerPoint 95 presentation format is not supported.");
         }
      } else {
         if (var2[0] && var1 != null && !var1.getOnlyLoadDocumentProperties()) {
            throw new InvalidPasswordException("The password could not be null or empty");
         }
      }
   }

   public static boolean k5(com.aspose.slides.internal.x1.x8 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("fileSystem");
      }

      List$Enumerator var1 = var0.n5().n5().iterator();

      try {
         while (var1.hasNext()) {
            com.aspose.slides.internal.x1.c8 var2 = (com.aspose.slides.internal.x1.c8)var1.next();
            if ("EncryptedSummary".equals(var2.x8())) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return false;
   }

   public static boolean n5(com.aspose.slides.internal.x1.x8 var0, com.aspose.slides.internal.x1.u9 var1) {
      if (var1 == null) {
         return false;
      }

      boolean var2 = false;
      boolean[] var3 = new boolean[]{false};
      n5(var0, null, var3);
      var2 = var3[0];
      com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2(var1.n5());

      try {
         y2 var5 = y2.n5(var0);
         c4i var6 = (c4i)n5(var4, var5.l6() & 4294967295L, null);
         return (var6.u9() & 4294967295L) != 0L;
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }

   public static void n5(com.aspose.slides.internal.x1.x8 var0, boolean[] var1, boolean[] var2, boolean[] var3) {
      var1[0] = false;
      var2[0] = false;
      var3[0] = k5(var0);
      List$Enumerator var4 = var0.n5().n5().iterator();

      try {
         while (var4.hasNext()) {
            com.aspose.slides.internal.x1.c8 var5 = (com.aspose.slides.internal.x1.c8)var4.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.x1.u9.class) && "PersistentStorage Directory".equals(var5.x8())) {
               var1[0] = true;
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.x1.t2.class) && "PP97_DUALSTORAGE".equals(var5.x8())) {
               var2[0] = true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   public static e6r n5(com.aspose.slides.internal.z0k.e2 var0, long var1, e6r var3) {
      com.aspose.slides.internal.z0k.n5 var4 = new com.aspose.slides.internal.z0k.n5(var0);
      var4.x8().setPosition(var1);
      return p5k.n5(var4, var3);
   }

   private e6r n5(com.aspose.slides.internal.z0k.t4 var1, long var2, boolean var4, e6r var5) {
      var1.setPosition(var2);
      short var6 = com.aspose.slides.internal.n8e.y2.n5(var1);
      short var7 = com.aspose.slides.internal.n8e.y2.n5(var1);
      var1.setPosition(var1.getPosition() - 4L);
      boolean var8 = var7 == 1000 || var7 == 1006 || var7 == 1016;
      return var8 && !var4 ? null : p5k.n5(new com.aspose.slides.internal.z0k.n5(var1), null, var5);
   }

   private void c8(com.aspose.slides.internal.x1.x8 var1) {
      y2 var2 = y2.n5(var1);
      this.a6 = new y1(var2);
      this.u9 = new w7();
      List var3 = this.u9.e2();

      try {
         com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2(
            ((com.aspose.slides.internal.x1.u9)var1.n5().u3("PowerPoint Document")).n5()
         );
         c4i var5 = (c4i)n5(var4, var2.l6() & 4294967295L, this.u9);
         j2 var6 = (j2)n5(var4, var5.k5(), this.u9);
         SortedList var7 = new SortedList();
         SortedList var8 = new SortedList();
         List var9 = var6.l6();
         List$Enumerator var10 = var9.iterator();

         try {
            while (var10.hasNext()) {
               w6 var11 = (w6)var10.next();
               if (var11.l6() != 4294967295L) {
                  e6r var12 = n5(var4, var11.l6() & 4294967295L, this.u9);
                  if (com.aspose.slides.internal.v6g.k5.l6(var12, m4.class)) {
                     ((m4)var12).n5(var11.n5());
                     var11.n5((m4)var12);
                  }

                  if (var7.containsKey(var11.n5())) {
                     int var13 = ((e6r)var7.get_Item(var11.n5())).r4();
                     if (var13 != var12.r4()) {
                        var8.addItem(var11.n5(), var12);
                        continue;
                     }

                     var7.removeItemByKey(var11.n5());
                  }

                  var7.addItem(var11.n5(), var12);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
               var10.dispose();
            }
         }

         t1 var97 = (t1)var7.get_Item(var5.u3());
         Dictionary var98 = new Dictionary();
         var98.set_Item(var5.u3(), 0L);
         List$Enumerator var99 = var97.e2().iterator();

         try {
            while (var99.hasNext()) {
               e6r var14 = (e6r)var99.next();
               if (com.aspose.slides.internal.v6g.k5.l6(var14, j2p.class)) {
                  j2p var15 = com.aspose.slides.internal.v6g.k5.n5(var14, j2p.class);
                  List var16 = var15.l6().u9();
                  if (var16 != null) {
                     List$Enumerator var17 = var16.iterator();

                     try {
                        while (var17.hasNext()) {
                           w1n var18 = (w1n)var17.next();
                           var98.set_Item(var18.l6(), 0L);
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var17, IDisposable.class)) {
                           var17.dispose();
                        }
                     }
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var99, IDisposable.class)) {
               var99.dispose();
            }
         }

         c4i var100 = var5;

         while ((var100.l6() & 4294967295L) > 0L) {
            c4i var101 = (c4i)n5(var4, var100.l6() & 4294967295L, this.u9);
            j2 var103 = (j2)n5(var4, var101.k5(), this.u9);
            List$Enumerator var106 = var103.l6().iterator();

            try {
               while (var106.hasNext()) {
                  w6 var109 = (w6)var106.next();
                  if (var6.n5(var109.n5()) == null) {
                     e6r var19 = this.n5(var4, var109.l6() & 4294967295L, var98.containsKey(var109.n5()), this.u9);
                     if (var19 != null && !com.aspose.slides.internal.v6g.k5.l6(var19, u0b.class)) {
                        w6 var20 = new w6(var109.n5(), var109.l6());
                        var9.addItem(var20);
                        var20.n5((m4)var19);
                        ((m4)var19).n5(var109.n5());
                        var7.addItem(var109.n5(), var19);
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var106, IDisposable.class)) {
                  var106.dispose();
               }
            }

            if (var100.l6() == var101.l6()) {
               throw new PptCorruptFileException();
            }

            var100 = var101;
         }

         IGenericEnumerator var102 = var7.iterator();

         try {
            while (var102.hasNext()) {
               KeyValuePair var104 = (KeyValuePair)var102.next();
               if (!com.aspose.slides.internal.v6g.k5.l6(var104.getValue(), t1.class)
                  && !com.aspose.slides.internal.v6g.k5.l6(var104.getValue(), u6p.class)
                  && !com.aspose.slides.internal.v6g.k5.l6(var104.getValue(), k2.class)) {
                  var98.set_Item(var104.getKey(), 0L);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var102, IDisposable.class)) {
               var102.dispose();
            }
         }

         IGenericEnumerator var105 = var7.iterator();

         try {
            while (var105.hasNext()) {
               KeyValuePair var107 = (KeyValuePair)var105.next();
               if (var98.containsKey(var107.getKey())) {
                  var3.addItem(var107.getValue());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var105, IDisposable.class)) {
               var105.dispose();
            }
         }

         IGenericEnumerator var108 = var8.iterator();

         try {
            while (var108.hasNext()) {
               KeyValuePair var110 = (KeyValuePair)var108.next();
               if (var98.containsKey(var110.getKey())) {
                  var3.addItem(var110.getValue());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var108, IDisposable.class)) {
               var108.dispose();
            }
         }

         var3.addItem(var6);
         var3.addItem(var5);
      } catch (PptException var95) {
         throw var95;
      } catch (RuntimeException var96) {
         throw new PptReadException("Couldn't read \"PowerPoint Document\" record.", var96);
      }
   }

   private void t2() {
      t1 var1 = this.u9.h0();
      if (var1 != null) {
         List$Enumerator var2 = this.u9.e2().iterator();

         try {
            while (var2.hasNext()) {
               e6r var3 = (e6r)var2.next();
               o8 var4 = com.aspose.slides.internal.v6g.k5.n5(var3, o8.class);
               if (var4 != null) {
                  List var5 = var1.l6(var4.c8());
                  w1n var6 = ((r5w)var5.get_Item(0)).z3();
                  var4.l6(var6.u3());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }
   }

   public final boolean h0() {
      return this.h0;
   }

   private static void n5(IWarningCallback var0, IWarningInfo var1) {
      boolean var2 = false;
      if (var0 != null) {
         try {
            var2 = var0.warning(var1) == 1;
         } catch (RuntimeException var4) {
            com.aspose.slides.internal.n8e.v4.n5(var4);
         }
      }

      if (var2) {
         throw new com.aspose.slides.internal.n8e.n5(var1);
      }
   }
}
