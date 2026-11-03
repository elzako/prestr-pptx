package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;
import java.util.Arrays;

class z3h {
   private final com.aspose.slides.internal.z0k.t4 n5;
   private int l6;
   private final g7e k5;
   private final Object u3;

   public z3h(com.aspose.slides.internal.z0k.t4 var1, int var2, Object var3) {
      if (var1 == null) {
         throw new ArgumentNullException("stream", "Stream is null.");
      }

      if (var1.getLength() == 0L) {
         throw new ArgumentException("The stream is empty.", "stream");
      }

      this.n5 = var1;
      this.l6 = var2;
      this.u3 = var3;
      this.k5 = new g7e(this);
   }

   public final PresentationText n5() {
      byte[] var1 = this.n5(this.n5);
      com.aspose.slides.internal.e5a.d2 var2 = com.aspose.slides.internal.e5a.d2.n5(var1);

      try {
         if (com.aspose.slides.internal.n8e.v4.n5(var2.w1().toArray(new String[0]), new z3h$1(this)) == -1) {
            throw new NotImplementedException();
         } else {
            return this.n5(var2, var1, this.l6);
         }
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   final boolean l6() {
      Object var1 = null;
      String[] var2 = new String[]{(String)var1};
      String[] var3 = null;
      String[][] var4 = new String[][]{var3};
      byte[] var5 = null;
      byte[][] var6 = new byte[][]{var5};
      int[] var7 = Presentation.n5((s4e)this.u3, var6);
      var5 = var6[0];
      var4[0] = com.aspose.slides.internal.n8e.w1.u3();
      if (Arrays.equals(var7, i7t.l6) && var5 != null && var5.length > 0) {
         var4[0] = com.aspose.slides.ms.System.d1.n5(Presentation.n5(var5), new String[]{"\r\n", "\n", "\r", "\n\r"}, 0);
      }

      int[] var8 = com.aspose.slides.internal.n8e.z7.n5;
      if (com.aspose.slides.internal.n8e.f2.l6() == com.aspose.slides.internal.n8e.z7.l6) {
         try {
            var8 = com.aspose.slides.internal.n8e.f2.l6();
         } catch (IllegalStateException var10) {
            var8 = com.aspose.slides.internal.n8e.z7.n5;
            com.aspose.slides.internal.n8e.v4.n5(var10);
         }
      }

      var3 = var4[0];
      var2[0] = com.aspose.slides.ms.System.d1.n5(" ", var3);
      return (
            !Arrays.equals(com.aspose.slides.internal.n8e.w1.n5(), com.aspose.slides.internal.n8e.r4.l6)
               || com.aspose.slides.internal.n8e.j5.n5() == null
               || !(com.aspose.slides.internal.n8e.j5.n5() instanceof com.aspose.slides.internal.n8e.w1)
         )
         && !Arrays.equals(var7, i7t.k5)
         && !Arrays.equals(var8, com.aspose.slides.internal.n8e.z7.l6)
         && !Arrays.equals(var7, i7t.l6);
   }

   private PresentationText n5(com.aspose.slides.internal.e5a.d2 var1, byte[] var2, int var3) {
      d3u var4 = this.l6(var1, var2, var3);
      return var4.n5(var3);
   }

   private d3u l6(com.aspose.slides.internal.e5a.d2 var1, byte[] var2, int var3) {
      if (var3 == 1) {
         d3t.n5();
      }

      List var4 = null;
      List[] var5 = new List[]{var4};
      this.n5(var1, var5);
      var4 = var5[0];
      k8w var6 = new k8w(var1, 0, var4.size());

      try {
         return this.n5(var6, var4, var3);
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }
   }

   private d3u n5(k8w var1, List<w2z> var2, int var3) {
      int var4 = this.n5(var2);
      d3u var5 = new d3u(this, var4);
      this.n5(var1, var2);
      this.n5(var2, var5.n5());
      List var6 = this.n5(var5.n5(), var2);
      this.n5(var6, var3, var5);
      return var5;
   }

   private int n5(List<w2z> var1) {
      int var2 = 0;
      List$Enumerator var3 = var1.iterator();

      try {
         while (var3.hasNext()) {
            w2z var4 = (w2z)var3.next();
            if (var4.u3() == 1) {
               var2++;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }

   private List<w2z> n5(h5p var1, List<w2z> var2) {
      List var3 = new List(var2.size());
      List var4 = new List();
      Dictionary$Enumerator var5 = var1.k5().iterator();

      try {
         while (var5.hasNext()) {
            KeyValuePair var6 = (KeyValuePair)var5.next();
            if (!var4.containsItem(((c3j)var6.getValue()).n5())) {
               var4.addItem(((c3j)var6.getValue()).n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      List$Enumerator var16 = var2.iterator();

      try {
         while (var16.hasNext()) {
            w2z var7 = (w2z)var16.next();
            if (q7o.n5(var7.n5())) {
               int var8 = q7o.l6(var7.n5());
               if (var4.containsItem(var8)) {
                  var3.addItem(var7);
               }
            } else {
               var3.addItem(var7);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var16, IDisposable.class)) {
            var16.dispose();
         }
      }

      return var3;
   }

   private void n5(List<w2z> var1, int var2, d3u var3) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         w2z var5 = (w2z)var1.get_Item(var4);
         this.n5(var5, var3, var2);
      }
   }

   private void n5(k8w var1, List<w2z> var2) {
      for (int var3 = 0; var3 < var2.size(); var3++) {
         w2z var4 = (w2z)var2.get_Item(var3);
         this.n5(var1, var4, var1.n5(var3));
      }
   }

   private void n5(k8w var1, w2z var2, com.aspose.slides.internal.z0k.e2 var3) {
      var2.n5(this.n5(var1.n5(), var2.n5(), var3, var1.l6()));
   }

   private void n5(w2z var1, d3u var2, int var3) {
      if (!var1.l6()) {
         this.n5(var1.u3(), var2, var3, new b9q(var1.k5(), var2.n5(), var1.a6()));
      }
   }

   private void n5(List<w2z> var1, h5p var2) {
      for (int var3 = 0; var3 < var1.size(); var3++) {
         w2z var4 = (w2z)var1.get_Item(var3);
         if (var4.l6()) {
            this.n5(new b9q(var4.k5(), var2, var4.a6()));
         }
      }
   }

   private void n5(b9q var1) {
      int var2 = 0;
      int[] var3 = new int[]{0};
      boolean var4 = s5l.n5(var1.k5(), var3);
      var2 = var3[0];
      if (var4) {
         var1.l6().n5().set_Item(var1.n5(), new c3j(var2, (byte)0));
      }

      int var5 = 0;
      int[] var6 = new int[]{0};
      boolean var7 = s5l.l6(var1.k5(), var6);
      var5 = var6[0];
      if (var7) {
         var1.l6().k5().set_Item(var1.n5(), new c3j(var5, (byte)2));
      }

      int var8 = 0;
      int[] var9 = new int[]{0};
      boolean var10 = s5l.k5(var1.k5(), var9);
      var8 = var9[0];
      if (var10) {
         var1.l6().a6().set_Item(var1.n5(), new c3j(var8, (byte)3));
      }

      int var11 = 0;
      int[] var12 = new int[]{0};
      boolean var13 = s5l.u3(var1.k5(), var12);
      var11 = var12[0];
      if (var13) {
         var1.l6().h0().set_Item(var1.n5(), new c3j(var11, (byte)4));
      }

      int var14 = 0;
      int[] var15 = new int[]{0};
      boolean var16 = s5l.a6(var1.k5(), var15);
      var14 = var15[0];
      if (var16) {
         var1.l6().t2().set_Item(var1.n5(), new c3j(var14, (byte)5));
      }
   }

   private void n5(com.aspose.slides.internal.e5a.d2 var1, List<w2z>[] var2) {
      var2[0] = new List();

      for (int var3 = 0; var3 < var1.c4(); var3++) {
         com.aspose.slides.internal.e5a.y2 var4 = var1.k5(var3);
         if (!com.aspose.slides.ms.System.d1.l6(var4.u3(), "[trash]")
            && !com.aspose.slides.ms.System.d1.l6(var4.u3(), "customXml")
            && !com.aspose.slides.ms.System.d1.l6(var4.u3(), "ppt/handoutMasters")
            && !com.aspose.slides.ms.System.d1.l6(var4.u3(), "ppt/theme")
            && !com.aspose.slides.ms.System.d1.l6(var4.u3(), "ppt/notesMasters")
            && !com.aspose.slides.ms.System.d1.l6(var4.u3(), "ppt/media")
            && !com.aspose.slides.ms.System.d1.l6(var4.u3(), "_rels")
            && !com.aspose.slides.ms.System.d1.l6(var4.u3(), "ppt/_rels")
            && !com.aspose.slides.ms.System.d1.l6(var4.u3(), "ppt/presentation.xml")
            && !com.aspose.slides.ms.System.d1.l6(var4.u3(), "ppt/tableStyles.xml")
            && !com.aspose.slides.ms.System.d1.l6(var4.u3(), "ppt/viewProps.xml")
            && !com.aspose.slides.ms.System.d1.l6(var4.u3(), "[Content_Types].xml ")
            && !com.aspose.slides.ms.System.d1.l6(var4.u3(), "ppt/embeddings")
            && !com.aspose.slides.ms.System.d1.l6(var4.u3(), "docProps/app.xml")
            && !com.aspose.slides.ms.System.d1.l6(var4.u3(), "docProps/core.xml")
            && !com.aspose.slides.ms.System.d1.l6(var4.u3(), "ppt/charts")) {
            int var5 = 0;
            byte var6 = 0;
            boolean var7 = false;
            int[] var8 = new int[]{0};
            boolean[] var9 = new boolean[]{false};
            boolean var10 = q7o.n5(var4.u3(), var8, var9);
            var5 = var8[0];
            var7 = var9[0];
            if (var10) {
               var2[0].addItem(new w2z(var4.u3(), var5, var7));
            } else {
               var8[0] = var5;
               byte[] var11 = new byte[]{0};
               boolean var12 = q7o.n5(var4.u3(), var8, var11);
               var5 = var8[0];
               var6 = var11[0];
               if (var12) {
                  var2[0].addItem(new w2z(var4.u3(), var5, var6));
               }
            }
         }
      }
   }

   private void n5(byte var1, d3u var2, int var3, b9q var4) {
      if (this.l6()) {
         this.n5(var1, var2, var4);
      } else {
         this.l6(var1, var2, var3, var4);
      }
   }

   private void l6(byte var1, d3u var2, int var3, b9q var4) {
      this.k5.n5(var1, var4.k5(), var2, var4, var3 == 1);
   }

   private void n5(byte var1, d3u var2, b9q var3) {
      com.aspose.slides.internal.l7h.a5 var4 = this.k5.n5(var1, var3.k5());
      if (var4 != null) {
         this.k5.n5(var1, new h2d(var4), var2, var3);
      }
   }

   private String n5(com.aspose.slides.internal.e5a.d2 var1, String var2, com.aspose.slides.internal.z0k.e2 var3, List<com.aspose.slides.internal.z0k.m3> var4) {
      com.aspose.slides.internal.z0k.m3 var5 = this.n5(var1, var3, var2);
      var4.addItem(var5);
      return var5.c8();
   }

   private com.aspose.slides.internal.z0k.m3 n5(com.aspose.slides.internal.e5a.d2 var1, com.aspose.slides.internal.z0k.t4 var2, String var3) {
      var1.l6(var3).n5(var2);
      var2.seek(0L, 0);
      return new com.aspose.slides.internal.z0k.m3(var2);
   }

   private byte[] n5(com.aspose.slides.internal.z0k.t4 var1) {
      byte[] var2 = new byte[16384];
      com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2();

      try {
         int var4;
         while ((var4 = var1.read(var2, 0, var2.length)) > 0) {
            var3.write(var2, 0, var4);
         }

         return var3.toArray();
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }
}
