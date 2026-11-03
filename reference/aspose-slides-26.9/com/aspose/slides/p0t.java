package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

class p0t {
   private final g6o l6;
   private boolean k5 = false;
   static final com.aspose.slides.internal.n8e.z6 n5 = u9();

   public p0t(Presentation var1, int[] var2, InterruptionToken var3) {
      this.l6 = new g6o(new com.aspose.slides.internal.k0r.e3(), var1, var2, var3);
   }

   public final void n5(com.aspose.slides.internal.z0k.t4 var1, ISaveOptions var2) {
      this.l6(var2);
      this.h0();
      com.aspose.slides.internal.x1.x8 var3 = new com.aspose.slides.internal.x1.x8();
      com.aspose.slides.ms.System.o0 var4 = this.n5(var2).k5();
      var3.n5().l6(var4.n5());
      this.l6.l6().l6(var3);
      if (this.l6.n5().getProtectionManager().isEncrypted() && this.l6.n5().getProtectionManager().getEncryptionPassword() != null) {
         com.aspose.slides.internal.k0r.f9.n5(var3, this.l6.y2(), this.l6.l6().a6().x8(), this.l6.n5().getProtectionManager().getEncryptionPassword());
      }

      var3.l6(var1);
   }

   private com.aspose.slides.ms.System.o0 n5(ISaveOptions var1) {
      com.aspose.slides.ms.System.o0 var2 = new com.aspose.slides.ms.System.o0("{64818d11-4f9b-11cf-86ea-00aa00b929e8}");
      IPptOptions var3 = com.aspose.slides.internal.v6g.k5.n5(var1, IPptOptions.class);
      return var3 == null ? var2 : ((PptOptions)var3).n5();
   }

   private void l6() {
      IDocumentProperties var1 = this.l6.n5().getDocumentProperties();
      ((DocumentProperties)var1).u3(com.aspose.slides.ms.System.j5.t2().m3());
      w1c var2 = new w1c(this.k5(), this.a6());
      byte[] var3 = null;
      byte[] var4 = null;
      ((DocumentProperties)var1).u3(com.aspose.slides.ms.System.j5.t2().m3());
      byte[][] var5 = new byte[][]{var3};
      byte[][] var6 = new byte[][]{var4};
      n5(var1, var2, var5, var6);
      var3 = var5[0];
      var4 = var6[0];
      if (var3 != null) {
         this.l6.l6().n5(var3);
      }

      if (var4 != null) {
         this.l6.l6().l6(var4);
      }
   }

   static void n5(IDocumentProperties var0, w1c var1, byte[][] var2, byte[][] var3) {
      var2[0] = null;
      var3[0] = null;
      var1.k5(var0.getAuthor());
      var1.h0(var0.getPresentationFormat());
      var1.s7(var0.getCategory());
      var1.a6(var0.getComments());
      var1.t2(var0.getCompany());
      var1.l6(((DocumentProperties)var0).l6().m3());
      var1.u3(var0.getKeywords());
      var1.n5(((DocumentProperties)var0).u3().m3());
      var1.u9(var0.getLastSavedBy());
      var1.k5(((DocumentProperties)var0).k5().m3());
      var1.c8(var0.getManager());
      var1.x8(var0.getNameOfApplication());
      var1.n5(var0.getRevisionNumber());
      var1.l6(var0.getSubject());
      var1.n3(var0.getApplicationTemplate());
      var1.n5(var0.getTitle());
      var1.n5(((DocumentProperties)var0).n5().n3());
      var1.y4(var0.getHyperlinkBase());
      n5(var0, var1);
      if (var1.y2() != null) {
         var2[0] = var1.y2().n5();
      }

      if (var1.c4() != null) {
         var3[0] = var1.c4().n5();
      }
   }

   static void n5(IDocumentProperties var0, w1c var1) {
      for (int var2 = 0; var2 < var0.getCountOfCustomProperties(); var2++) {
         String var3 = var0.getCustomPropertyName(var2);
         Object var4 = ((DocumentProperties)var0).l6(var3);
         if (com.aspose.slides.internal.v6g.k5.l6(var4, Boolean.class)) {
            var1.n5(var3, com.aspose.slides.internal.v6g.k5.u3(var4, boolean.class));
         } else if (com.aspose.slides.internal.v6g.k5.l6(var4, Integer.class)) {
            var1.n5(var3, com.aspose.slides.internal.v6g.k5.u3(var4, int.class));
         } else if (com.aspose.slides.internal.v6g.k5.l6(var4, com.aspose.slides.ms.System.j5.class)) {
            var1.n5(var3, com.aspose.slides.internal.v6g.k5.u3(var4, com.aspose.slides.ms.System.j5.class).m3());
         } else if (com.aspose.slides.internal.v6g.k5.l6(var4, Float.class)) {
            var1.n5(var3, com.aspose.slides.internal.v6g.k5.u3(var4, float.class));
         } else if (com.aspose.slides.internal.v6g.k5.l6(var4, Double.class)) {
            var1.n5(var3, com.aspose.slides.internal.v6g.k5.u3(var4, double.class));
         } else {
            var1.n5(var3, var4.toString());
         }
      }
   }

   private com.aspose.slides.internal.n8e.e9 k5() {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();
      com.aspose.slides.internal.z0k.l6 var2 = new com.aspose.slides.internal.z0k.l6(var1);
      b8k var3 = new b8k(this.l6.n5());
      var2.n5(65534);
      var2.n5(0);
      var2.n5(131334L);
      var2.n5(com.aspose.slides.ms.System.o0.n5.n5());
      var2.n5(1L);
      var2.n5(new com.aspose.slides.ms.System.o0("{d5cdd502-2e9c-101b-9397-08002b2cf9ae}").n5());
      var2.n5(var1.getPosition() + 4L & 4294967295L);
      com.aspose.slides.internal.n8e.z6 var4 = new com.aspose.slides.internal.n8e.z6();
      var4.n5().removeItemByKey(0L);
      var4.n5().removeItemByKey(2L);
      var4.n5().set_Item(1L, new com.aspose.slides.internal.n8e.y5((short)1251));
      var4.n5().set_Item(3L, new com.aspose.slides.internal.n8e.y5("On-screen Show (4:3)", false));
      var4.n5().set_Item(4L, new com.aspose.slides.internal.n8e.y5(this.l6.l6().a6().n5()));
      var4.n5().set_Item(6L, new com.aspose.slides.internal.n8e.y5(var3.u3()));
      var4.n5().set_Item(7L, new com.aspose.slides.internal.n8e.y5(var3.l6()));
      var4.n5().set_Item(8L, new com.aspose.slides.internal.n8e.y5(var3.k5()));
      var4.n5().set_Item(9L, new com.aspose.slides.internal.n8e.y5(var3.n5()));
      var4.n5().set_Item(10L, new com.aspose.slides.internal.n8e.y5(var3.a6()));
      var4.n5().set_Item(15L, new com.aspose.slides.internal.n8e.y5("Aspose", false));
      var4.n5().set_Item(19L, new com.aspose.slides.internal.n8e.y5(false));
      var4.n5().set_Item(23L, new com.aspose.slides.internal.n8e.y5(727464));
      IDocumentProperties var5 = this.l6.n5().getDocumentProperties();
      var4.n5().set_Item(11L, new com.aspose.slides.internal.n8e.y5(var5.getScaleCrop()));
      var4.n5().set_Item(22L, new com.aspose.slides.internal.n8e.y5(var5.getHyperlinksChanged()));
      var4.n5().set_Item(16L, new com.aspose.slides.internal.n8e.y5(var5.getLinksUpToDate()));
      var4.n5().set_Item(13L, new com.aspose.slides.internal.n8e.y5(this.n5(var3)));
      var4.n5().set_Item(12L, new com.aspose.slides.internal.n8e.y5(this.l6(var3)));
      if (this.k7() && (this.l6.n5().n3().j5() != null || this.l6.n5().y4().k5() != null)) {
         if (this.l6.n5().n3().j5() != null && this.l6.n5().y4().k5() != null) {
            throw new InvalidOperationException();
         }

         if (this.l6.n5().n3().j5() != null) {
            var4.n5().set_Item(24L, new com.aspose.slides.internal.n8e.y5(65, this.u3()));
         } else if (this.l6.n5().y4().k5() != null) {
            var4.n5().set_Item(24L, new com.aspose.slides.internal.n8e.y5(this.l6.n5().y4().k5()));
         }
      }

      byte[] var6 = var4.a6();
      var2.n5(var6);
      var1.setPosition(0L);
      com.aspose.slides.internal.n8e.e9 var7 = new com.aspose.slides.internal.n8e.e9(var1);
      var2.l6();
      return var7;
   }

   private byte[] n5(b8k var1) {
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();

      try {
         com.aspose.slides.internal.z0k.l6 var3 = new com.aspose.slides.internal.z0k.l6(var2);
         var3.n5(4126L);
         List var4 = new List(var1.u9().size() + 1 + var1.h0().size());
         var4.addRange(var1.u9());
         var4.addItem(this.l6.n5().getMasterTheme().getName());
         var4.addRange(var1.h0());
         var3.l6(var4.size());
         List$Enumerator var5 = var4.iterator();

         try {
            while (var5.hasNext()) {
               String var6 = (String)var5.next();
               var3.n5(var6.length() + 1 & 4294967295L);
               var3.n5(com.aspose.slides.internal.l7h.j5.e2().u3(var6));
               var3.n5((byte)0);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }

         return var2.toArray();
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   private byte[] l6(b8k var1) {
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();

      try {
         com.aspose.slides.internal.z0k.l6 var3 = new com.aspose.slides.internal.z0k.l6(var2);
         var3.n5(4108L);
         var3.n5(6L);
         this.n5(var3, "Fonts Used", var1.u9().size());
         this.n5(var3, "Theme", 1);
         this.n5(var3, "Slide Titles", var1.h0().size());
         return var2.toArray();
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   private void n5(com.aspose.slides.internal.z0k.l6 var1, String var2, int var3) {
      var1.n5(30L);
      var1.n5(var2.length() + 1 & 4294967295L);
      var1.n5(com.aspose.slides.internal.l7h.j5.e2().u3(var2));
      var1.n5((byte)0);
      var1.n5(3L);
      var1.l6(var3);
   }

   private byte[] u3() {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();

      try {
         com.aspose.slides.internal.z0k.l6 var2 = new com.aspose.slides.internal.z0k.l6(var1);

         try {
            int var3 = this.l6.n5().n3().j5().length + 8;
            int var4 = this.l6.n5().n3().j5().length;
            byte var5 = 8;
            var2.n5(com.aspose.slides.ms.System.x8.l6(var3));
            var2.n5(com.aspose.slides.ms.System.x8.l6(var4));
            var2.n5(com.aspose.slides.ms.System.x8.l6(var5));
            var2.n5(this.l6.n5().n3().j5());
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }

         return var1.toArray();
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   private com.aspose.slides.internal.n8e.e9 a6() {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();
      com.aspose.slides.internal.z0k.l6 var2 = new com.aspose.slides.internal.z0k.l6(var1);
      var2.n5(65534);
      var2.n5(0);
      var2.n5(131334L);
      var2.n5(com.aspose.slides.ms.System.o0.n5.n5());
      var2.n5(1L);
      var2.n5(new com.aspose.slides.ms.System.o0("{f29f85e0-4ff9-1068-ab91-08002b27b3d9}").n5());
      var2.n5(var1.getPosition() + 4L & 4294967295L);
      byte[] var3 = n5.a6();
      var2.n5(var3);
      var1.setPosition(0L);
      com.aspose.slides.internal.n8e.e9 var4 = new com.aspose.slides.internal.n8e.e9(var1);
      var2.l6();
      String var5 = null;
      String[] var6 = new String[]{var5};
      ((com.aspose.slides.internal.n8e.y5)n5.n5().get_Item(18L)).n5(var6, 1251);
      var5 = var6[0];
      this.l6.n5(com.aspose.slides.internal.l7h.j5.z3().u3(var5));
      if (com.aspose.slides.ms.System.j5.s7().n3() % 2L == 0L) {
         this.l6.n5(new byte[]{0, 10, -6, 1, 7, 18, -1, 0, -38, 1, 3, -1, -1, 23, 0, 35, 0, 0, -1, 67, 120, 0, 83, -102, 116, 23});
      }

      return var4;
   }

   private static com.aspose.slides.internal.n8e.z6 u9() {
      com.aspose.slides.internal.n8e.z6 var0 = new com.aspose.slides.internal.n8e.z6();
      var0.n5().removeItemByKey(0L);
      var0.n5().set_Item(1L, new com.aspose.slides.internal.n8e.y5((short)1251));
      var0.n5().set_Item(2L, new com.aspose.slides.internal.n8e.y5("Slide 1", false));
      var0.n5().set_Item(4L, new com.aspose.slides.internal.n8e.y5("Aspose.Slides", false));
      var0.n5().set_Item(8L, new com.aspose.slides.internal.n8e.y5("Aspose.Slides", false));
      var0.n5().set_Item(9L, new com.aspose.slides.internal.n8e.y5("1", false));
      var0.n5().set_Item(10L, new com.aspose.slides.internal.n8e.y5(com.aspose.slides.ms.System.j5.s7().m3()));
      var0.n5().set_Item(12L, new com.aspose.slides.internal.n8e.y5(com.aspose.slides.ms.System.j5.s7().m3()));
      var0.n5().set_Item(13L, new com.aspose.slides.internal.n8e.y5(com.aspose.slides.ms.System.j5.s7().m3()));
      var0.n5().set_Item(15L, new com.aspose.slides.internal.n8e.y5(0));
      var0.n5().set_Item(18L, new com.aspose.slides.internal.n8e.y5("Aspose.Slides Library", false));
      return var0;
   }

   private void h0() {
      Presentation var1 = this.l6.n5();
      this.c8();
      this.y4();
      this.t4();
      this.q0();
      this.m1();
      this.m3();
      this.t9();
      this.z1();
      this.z8();
      this.z3();
      this.n3();
      this.n5();
      this.l6();
      IDigitalSignatureCollection var2 = var1.getDigitalSignatures();
      boolean var3 = false;
      if (var2.size() > 0) {
         IGenericEnumerator var4 = var2.iterator();

         try {
            while (var4.hasNext()) {
               DigitalSignature var5 = (DigitalSignature)var4.next();
               if (var5.getCertificate() != null && var5.n5().t4() != null) {
                  var3 = true;
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }

      if (var3) {
         List var24 = new List(var2.size());
         IGenericEnumerator var25 = var2.iterator();

         try {
            while (var25.hasNext()) {
               DigitalSignature var6 = (DigitalSignature)var25.next();
               if (var6.getCertificate() != null && var6.n5().t4() != null) {
                  com.aspose.slides.internal.z0k.e2 var7 = new com.aspose.slides.internal.z0k.e2();

                  try {
                     com.aspose.slides.internal.n8e.u4 var8 = new com.aspose.slides.internal.n8e.u4(var7, com.aspose.slides.internal.l7h.j5.z3(), 0);
                     var8.l6(4);
                     var8.l6(true);
                     o6x.n5(var8, var6, null);
                     var8.n5();
                     var8.u9();
                     var8.a6();
                     byte[] var9 = var7.toArray();
                     var24.addItem(var9);
                  } finally {
                     if (var7 != null) {
                        var7.dispose();
                     }
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var25, IDisposable.class)) {
               var25.dispose();
            }
         }

         this.l6.l6().n5(var24);
      }

      this.s7();
      this.t2();
   }

   private void c8() {
      v6v var1 = this.l6.n5().z1().n5();
      var1.c8();
   }

   private void t2() {
      com.aspose.slides.internal.k0r.w7 var1 = this.l6.l6().a6();
      if (this.l6.n5().getProtectionManager().isEncrypted() && this.l6.n5().getProtectionManager().getEncryptionPassword() != null) {
         ((ProtectionManager)this.l6.n5().getProtectionManager()).n5();
         this.l6.n5(new com.aspose.slides.internal.k0r.c4(this.l6.n5().getProtectionManager().getEncryptionPassword()));
         this.l6.y2().l6().k5.n5().l6(false);
         this.l6.y2().n5((var1.u9() & 4294967295L) + 1L & 4294967295L);
         var1.t9().a6(this.l6.y2().c8());
         int var2 = var1.e2().size();
         var1.e2().insertItem(var2 - 2, this.l6.y2());
      } else {
         this.l6.l6().a6().t9().a6(0L);
      }
   }

   private void s7() {
      this.x8();
   }

   private void x8() {
      List var1 = this.l6.l6().a6().c8();
      List$Enumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.k0r.k2 var3 = (com.aspose.slides.internal.k0r.k2)var2.next();

            for (com.aspose.slides.internal.k0r.o6t var7 : var3.x8()) {
               f8b.n5(var7);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private void n3() {
      com.aspose.slides.internal.k0r.e0 var1 = this.l6.l6().a6().h0().t2().u3();
      if (var1 == null || var1.e2().size() < 1) {
         this.l6.n5().z1().n5().n5(0, new FontData("Arial"));
      }

      com.aspose.slides.internal.k0r.j2 var2 = new com.aspose.slides.internal.k0r.j2();
      this.l6.l6().a6().e2().addItem(var2);
      com.aspose.slides.internal.k0r.c4i var3 = new com.aspose.slides.internal.k0r.c4i();
      this.l6.l6().a6().e2().addItem(var3);
      var3.k5(1L);
      var3.a6(0L);
      var3.n5(0L);
      var3.l6(s1f.x8(this.l6.n5().getViewProperties().getLastView()));
      if (this.l6.n5().getSlides().size() > 0) {
         com.aspose.slides.internal.k0r.j2p var4 = this.l6.l6().a6().h0().z3();
         List var5 = var4.l6().u9();
         if (var5 != null) {
            var3.n5(((com.aspose.slides.internal.k0r.w1n)var5.get_Item(0)).u3());
         }
      }

      this.l6.l6().a6().a6();
      com.aspose.slides.internal.k0r.c4i var6 = this.l6.l6().a6().t9();
      var6.l6(0L);
      com.aspose.slides.internal.k0r.y2 var7 = new com.aspose.slides.internal.k0r.y2();
      var7.n5("Aspose.Slides");
      this.l6.l6().u3().n5(var7);
   }

   private void y4() {
      Presentation var1 = this.l6.n5();
      com.aspose.slides.internal.k0r.t1 var2 = this.l6.l6().a6().h0();
      this.n5(var2.a6(), var1);
      com.aspose.slides.internal.k0r.a5 var3 = var2.t2();
      com.aspose.slides.internal.k0r.n2z var4 = new com.aspose.slides.internal.k0r.n2z();
      var3.e2().addItem(var4);
      f8b.n5(var1.getDefaultTextStyle().getDefaultParagraphFormat().getDefaultPortionFormat(), var4.l6(), this.l6);
      var4.l6().u9((byte)0);
      var4.l6().h0(new com.aspose.slides.ms.System.o5<>());
      com.aspose.slides.internal.k0r.g2x var5 = new com.aspose.slides.internal.k0r.g2x();
      var3.e2().addItem(var5);
      var5.k5();
      com.aspose.slides.internal.k0r.r7n var6 = new com.aspose.slides.internal.k0r.r7n();
      var3.e2().addItem(var6);
      this.n5(var1.getDefaultTextStyle().getDefaultParagraphFormat(), var6.l6());
      com.aspose.slides.internal.k0r.o6t[] var7 = new com.aspose.slides.internal.k0r.o6t[9];
      this.l6.n5(var7);

      for (int var8 = 0; var8 < 9; var8++) {
         if (var8 != 3) {
            var7[var8] = new com.aspose.slides.internal.k0r.o6t();
            var7[var8].n5(var8, true);
         }
      }

      com.aspose.slides.internal.k0r.o6t var13 = f8b.n5(var1.getDefaultTextStyle(), this.l6);
      if (var13 == null) {
         var13 = var7[4];
      } else {
         var7[4] = var13;
      }

      var3.e2().addItem(var13);
      var13.w1().n5((short)4);
      n5(var13, this.l6.n5().getMasterTheme(), this.l6);
      com.aspose.slides.internal.k0r.y7 var9 = var2.x8().l6();
      com.aspose.slides.internal.k0r.r3 var10 = new com.aspose.slides.internal.k0r.r3();
      var10.n5(0, 0);
      var9.e2().addItem(var10);
      com.aspose.slides.internal.k0r.o9 var11 = new com.aspose.slides.internal.k0r.o9(134217732L, 134217729L, 134217730L, 268435703L);
      var11.w1().n5((short)4);
      var9.e2().addItem(var11);
      com.aspose.slides.internal.k0r.e5 var12 = new com.aspose.slides.internal.k0r.e5();
      var12.l6();
      var12.w1().n5((byte)15);
      var12.w1().n5((short)0);
      var2.n5(var12);
      this.e2();
   }

   private void e2() {
      IViewProperties var1 = this.l6.n5().getViewProperties();
      com.aspose.slides.internal.k0r.e5 var2 = this.l6.l6().a6().h0().z1();
      com.aspose.slides.internal.k0r.o1 var3 = var2.a6();
      z6b.n5(((ViewProperties)var1).getNormalViewProperties(), var3.u3());
      com.aspose.slides.internal.k0r.h3r var4 = var2.c8();
      o9n.n5(var1.getSlideViewProperties(), var4, this.l6);
      com.aspose.slides.internal.k0r.h3r var5 = var2.t2();
      o9n.n5(var1.getNotesViewProperties(), var5, this.l6);
      int var6 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.internal.n2d.t2.n3(var1.getGridSpacing()) * 1024.0F, 13);
      if (var6 < 23224 || var6 > 1179648) {
         var6 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.internal.n2d.t2.n3(6.0) * 1024.0F, 13);
      }

      com.aspose.slides.internal.k0r.p2 var7 = var2.u3().u3();
      var7.u9().n5(var6);
      var7.u9().l6(var6);
   }

   private void n5(com.aspose.slides.internal.k0r.u6 var1, Presentation var2) {
      s1f.n5((SlideSize)var2.getSlideSize(), var1);
      s1f.n5((NotesSize)var2.getNotesSize(), var1);
      var1.u3(var2.y4().n5());
      l1x var3 = var2.n3();
      var1.k5(var3.s7());
      var1.n5(var2.getFirstSlideNumber() & 65535);
      var1.l6(!var3.t2());
   }

   private void t9() {
      com.aspose.slides.internal.k0r.t1 var1 = this.l6.l6().a6().h0();
      com.aspose.slides.internal.k0r.i8 var2 = var1.t4();
      com.aspose.slides.internal.k0r.x5 var3 = var2.l6();
      var3.u3(this.l6.e5());
      if (var3.u9()) {
         var2.k5(this.l6.b3());
      }

      var3.n5(this.l6.p8());
      if (var3.k5()) {
         var3.a6(this.l6.f2());
         if (var3.h0()) {
            var2.n5(this.l6.i1());
         }
      }

      var3.l6(this.l6.o0());
      List$Enumerator var4 = this.l6.t1().iterator();

      try {
         while (var4.hasNext()) {
            y2q var5 = (y2q)var4.next();
            com.aspose.slides.internal.k0r.o8 var6 = (com.aspose.slides.internal.k0r.o8)var5.u3();
            if (var6.z8().h0() != 2) {
               com.aspose.slides.internal.k0r.i8 var7 = var6.t4();
               if (com.aspose.slides.ms.System.o5.n5(var5.y2(), new com.aspose.slides.ms.System.o5<>(false)) || var7.equals(var2)) {
                  var6.e2().removeItem(var7);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   private void z1() {
      MasterNotesSlide var1 = (MasterNotesSlide)this.l6.n5().getMasterNotesSlideManager().getMasterNotesSlide();
      if (var1 != null) {
         com.aspose.slides.internal.k0r.t1 var2 = this.l6.l6().a6().h0();
         com.aspose.slides.internal.k0r.i8 var3 = var2.q0();
         com.aspose.slides.internal.k0r.x5 var4 = var3.l6();
         if (var1.t4().c8() != null) {
            var4.n5(var1.t4().c8().u3());
            var4.k5(var1.t4().c8().l6());
            var4.u3(var1.t4().c8().k5());
            var4.l6(var1.t4().c8().n5());
            AutoShape var5 = com.aspose.slides.internal.v6g.k5.n5(var1.n5((byte)4), AutoShape.class);
            if (var4.k5()
               && var5 != null
               && (
                  var5.getTextFrame().getParagraphs().getCount() == 0
                     || var5.getTextFrame().getParagraphs().get_Item(0).getPortions().getCount() == 0
                     || var5.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getField() == null
               )) {
               var4.a6(true);
               var3.n5(var5.getTextFrame().getText());
            }

            AutoShape var6 = com.aspose.slides.internal.v6g.k5.n5(var1.n5((byte)7), AutoShape.class);
            if (var4.a6() && var6 != null) {
               var3.l6(var6.getTextFrame().getText());
            }

            AutoShape var7 = com.aspose.slides.internal.v6g.k5.n5(var1.n5((byte)6), AutoShape.class);
            if (var4.u9() && var7 != null) {
               var3.k5(var7.getTextFrame().getText());
            }
         }
      }
   }

   final void n5() {
      com.aspose.slides.internal.k0r.e0 var1 = new com.aspose.slides.internal.k0r.e0();
      this.l6.l6().a6().h0().t2().n5(var1);
      k6j var2 = this.l6.n5().t9();
      IGenericList var3 = this.l6.n5().z1().n5().u3();
      List var4 = new List();
      IGenericEnumerator var5 = var3.iterator();

      try {
         while (var5.hasNext()) {
            IFontData var6 = (IFontData)var5.next();
            c4y var7 = var2.l6(var6.getFontName());
            if (var7 != null) {
               this.l6.l6().a6().h0().a6().n5(true);
               this.n5(var7.getFontName(), var7.l6(), (byte)var7.u9(), var7.t2(), var1);
               this.n5(var7, var1);
               var4.addItem(var7.getFontName());
            } else {
               FontData var8 = (FontData)var6;
               this.n5(var8.getFontName(), var8.n5(), var8.l6(), false, var1);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      this.n5(var4, var1);
   }

   private void n5(List<String> var1, com.aspose.slides.internal.k0r.e0 var2) {
      k6j var3 = this.l6.n5().t9();
      if (var3.a6()) {
         IGenericEnumerator var4 = var3.n5().iterator();

         try {
            while (var4.hasNext()) {
               KeyValuePair var5 = (KeyValuePair)var4.next();
               c4y var6 = (c4y)var5.getValue();
               if (!var1.containsItem(var6.getFontName())) {
                  this.n5(var6.getFontName(), var6.l6(), (byte)var6.u9(), var6.t2(), var2);
                  this.n5((c4y)var5.getValue(), var2);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }
   }

   final void n5(String var1, byte var2, byte var3, boolean var4, com.aspose.slides.internal.k0r.e0 var5) {
      com.aspose.slides.internal.k0r.z0 var6 = new com.aspose.slides.internal.k0r.z0();
      var6.w1().n5((short)(var5.l6() + 1));
      var5.e2().addItem(var6);
      var6.n5(var1);
      var6.n5(var2);
      var6.l6((byte)(var4 ? 1 : 0));
      var6.k5((byte)4);
      var6.u3(var3);
   }

   final void n5(c4y var1, com.aspose.slides.internal.k0r.e0 var2) {
      if (var1.h0().size() == 0) {
         throw new InvalidOperationException("EmbeddedFont.Styles length must be greater than zero");
      }

      IGenericDictionary var4;
      if (var1.t2()) {
         IGenericDictionary var3 = ((FontsManager)this.l6.n5().getFontsManager()).n5(var1, this.l6.n5);
         var4 = new Dictionary();
         IGenericEnumerator var5 = var3.iterator();

         try {
            while (var5.hasNext()) {
               KeyValuePair var6 = (KeyValuePair)var5.next();

               try {
                  FontData var7 = null;
                  FontData[] var8 = new FontData[]{var7};
                  var4.addItem(var6.getKey(), FontsManager.n5((byte[])var6.getValue(), var8));
                  var7 = var8[0];
               } catch (RuntimeException var27) {
                  if (var1.c8().size() > 0) {
                     var4 = var1.c8();
                     break;
                  }

                  var4.addItem(var6.getKey(), var6.getValue());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }
      } else {
         IGenericDictionary var29 = var1.c8();
         if (var29.size() == 0) {
            var4 = new Dictionary(var1.h0().size());
            IGenericDictionary var31 = var1.h0();
            IGenericEnumerator var33 = var31.iterator();

            try {
               while (var33.hasNext()) {
                  KeyValuePair var36 = (KeyValuePair)var33.next();
                  FontData var37 = null;
                  FontData[] var9 = new FontData[]{var37};
                  byte[] var10 = FontsManager.n5((byte[])var36.getValue(), var9);
                  var37 = var9[0];
                  var4.addItem(var36.getKey(), var10);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var33, IDisposable.class)) {
                  var33.dispose();
               }
            }
         } else {
            var4 = var29;
         }
      }

      IGenericEnumerator var30 = var4.iterator();

      try {
         while (var30.hasNext()) {
            KeyValuePair var32 = (KeyValuePair)var30.next();
            com.aspose.slides.internal.k0r.i2 var34 = new com.aspose.slides.internal.k0r.i2();
            var34.n5((byte[])var32.getValue());
            var34.w1().n5((short)0);
            var2.e2().addItem(var34);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var30, IDisposable.class)) {
            var30.dispose();
         }
      }
   }

   private void t4() {
      for (int var1 = 0; var1 < this.l6.n5().getMasters().size(); var1++) {
         new y2q((MasterSlide)this.l6.n5().getMasters().get_Item(var1), this.l6);
      }

      if (this.l6.n5().getMasterNotesSlideManager().getMasterNotesSlide() != null) {
         y2q var7 = new y2q((MasterNotesSlide)this.l6.n5().getMasterNotesSlideManager().getMasterNotesSlide(), this.l6);
         com.aspose.slides.internal.k0r.r4 var2 = var7.u3();
      }

      IMasterHandoutSlide var8 = this.l6.n5().getMasterHandoutSlideManager().getMasterHandoutSlide();
      if (var8 != null) {
         y2q var9 = new y2q((MasterHandoutSlide)var8, this.l6);
         com.aspose.slides.internal.k0r.r4 var3 = var9.u3();
      }

      List$Enumerator var10 = this.l6.u6().iterator();

      try {
         while (var10.hasNext()) {
            y2q var11 = (y2q)var10.next();
            y3o.l6(var11);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
            var10.dispose();
         }
      }

      for (int var12 = 0; var12 < this.l6.n5().getSlides().size(); var12++) {
         new y2q((Slide)this.l6.n5().getSlides().get_Item(var12), this.l6);
      }
   }

   private void q0() {
      List$Enumerator var1 = this.l6.u6().iterator();

      try {
         while (var1.hasNext()) {
            y2q var2 = (y2q)var1.next();
            x2u.n5(var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      List$Enumerator var27 = this.l6.u6().iterator();

      try {
         while (var27.hasNext()) {
            y2q var3 = (y2q)var27.next();
            y3o.n5(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var27, IDisposable.class)) {
            var27.dispose();
         }
      }

      List$Enumerator var28 = this.l6.t1().iterator();

      try {
         while (var28.hasNext()) {
            y2q var4 = (y2q)var28.next();
            e7j.n5(var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var28, IDisposable.class)) {
            var28.dispose();
         }
      }

      p1l.n5(this.l6.z7());
      s6z.n5(this.l6.v4());
      List$Enumerator var29 = this.l6.a5().iterator();

      try {
         while (var29.hasNext()) {
            y2q var5 = (y2q)var29.next();
            n8q.n5(var5);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var29, IDisposable.class)) {
            var29.dispose();
         }
      }
   }

   private void z3() {
      if (this.l6.n5().getImages().size() > 0) {
         long var1 = 0L;
         List var3 = new List();
         IGenericEnumerator var4 = this.l6.t2().iterator();

         try {
            while (var4.hasNext()) {
               KeyValuePair var5 = (KeyValuePair)var4.next();
               com.aspose.slides.internal.k0r.c6 var6 = ((y8g)var5.getValue()).n5(var1);
               var1 = (var1 & 4294967295L) + (var6.u3() & 4294967295L) & 4294967295L;
               var3.addItem(var6);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         if (this.l6.s7().size() > 0) {
            com.aspose.slides.internal.k0r.c8 var16 = this.l6.l6().a6().h0().z1().u3().l6().u3();
            IGenericEnumerator var18 = this.l6.s7().iterator();

            try {
               while (var18.hasNext()) {
                  KeyValuePair var7 = (KeyValuePair)var18.next();
                  com.aspose.slides.internal.k0r.t2 var8 = new com.aspose.slides.internal.k0r.t2();
                  ((y8g)var7.getValue()).n5(var8);
                  var16.e2().addItem(var8);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var18, IDisposable.class)) {
                  var18.dispose();
               }
            }
         }

         if (this.l6.l6().k5().e2().size() > 0) {
            com.aspose.slides.internal.k0r.o6 var17 = this.l6.l6().a6().h0().x8().l6().u3();

            for (int var19 = 0; var19 < var3.size(); var19++) {
               var17.e2().addItem((com.aspose.slides.internal.k0r.e6r)var3.get_Item(var19));
            }

            var17.w1().n5((short)var17.e2().size());
         }
      }
   }

   private void m1() {
      if (this.l6.n5().getVbaProject() != null) {
         com.aspose.slides.internal.k0r.e5 var1 = this.l6.l6().a6().h0().z1();
         com.aspose.slides.internal.k0r.e2o var2 = var1.x8();
         com.aspose.slides.internal.k0r.h9 var3 = new com.aspose.slides.internal.k0r.h9();
         if (this.k7()) {
            var3.n5(this.l6.n5().n3().m3());
         } else {
            var3.n5(this.l6.n5().l6() == null ? null : this.l6.n5().l6().n5());
         }

         var2.u3().n5(this.l6.l6().a6().n5(var3));
         var2.u3().n5(true);
      }
   }

   private boolean k7() {
      return this.l6.n5().n3().z8() == null ? false : this.l6.n5().n3().z8().n5((VbaProject)this.l6.n5().getVbaProject());
   }

   private void m3() {
      if (this.l6.n5().getCustomData() != null) {
         com.aspose.slides.internal.k0r.e5 var1 = this.l6.l6().a6().h0().z1();
         u5b.l6(this.l6.n5().getCustomData(), var1.u3());
      }

      if (this.l6.n5().y4().l6().n5()) {
         com.aspose.slides.internal.k0r.e5 var3 = this.l6.l6().a6().h0().z1();
         com.aspose.slides.internal.k0r.p2[] var2 = new com.aspose.slides.internal.k0r.p2[]{var3.u3().u3()};
         this.l6.n5().y4().l6().n5(new p0t$1(this, var2));
      }
   }

   private void z8() {
      Dictionary$Enumerator var1 = this.l6.m3().iterator();

      try {
         while (var1.hasNext()) {
            KeyValuePair var2 = (KeyValuePair)var1.next();
            long var3 = this.l6.z1().get_Item((BaseSlide)var2.getValue()).n3().u3();
            ((com.aspose.slides.internal.k0r.d6)var2.getKey())
               .e2()
               .addItem(
                  new com.aspose.slides.internal.k0r.z1(
                     com.aspose.slides.ms.System.d1.n5(new String[]{"Slide ", com.aspose.slides.ms.System.l4.l6(((var3 & 4294967295L) - 256L & 4294967295L) + 1L)}), (short)0
                  )
               );
            ((com.aspose.slides.internal.k0r.d6)var2.getKey())
               .e2()
               .addItem(
                  new com.aspose.slides.internal.k0r.z1(
                     com.aspose.slides.ms.System.d1.n5(new String[]{
                        com.aspose.slides.ms.System.l4.n5(var3, com.aspose.slides.internal.x7n.l6.k5()),
                        ",",
                        com.aspose.slides.ms.System.l4.l6(((var3 & 4294967295L) - 256L & 4294967295L) + 1L),
                        ",Slide ",
                        com.aspose.slides.ms.System.l4.l6(((var3 & 4294967295L) - 256L & 4294967295L) + 1L)
                     }),
                     (short)3
                  )
               );
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   private void n5(IParagraphFormat var1, com.aspose.slides.internal.k0r.x4a var2) {
      var2.n5(new com.aspose.slides.internal.k0r.k4s(false, true, false));
      IPortionFormat var3 = ((ParagraphFormat)var1).getPresentation().getDefaultTextStyle().getDefaultParagraphFormat().getDefaultPortionFormat();
      if (!com.aspose.slides.ms.System.d1.n5(var3.getLanguageId())) {
         var2.n5(f8b.n5(var3.getLanguageId()).k5());
      } else {
         var2.n5(new com.aspose.slides.ms.System.o5<>(1049));
      }

      if (!com.aspose.slides.ms.System.d1.n5(var3.getAlternativeLanguageId())) {
         var2.l6(f8b.n5(var3.getAlternativeLanguageId()).k5());
      } else {
         var2.l6(new com.aspose.slides.ms.System.o5<>(0));
      }
   }

   private void l6(ISaveOptions var1) {
      this.k5 = true;
      this.l6.n5(var1);
      String var2 = null;
      String[] var3 = new String[]{var2};
      ((com.aspose.slides.internal.n8e.y5)n5.n5().get_Item(18L)).n5(var3, 1251);
      var2 = var3[0];
      this.l6.n5(com.aspose.slides.internal.l7h.j5.z3().u3(var2));
      if (com.aspose.slides.ms.System.j5.s7().n3() % 2L == 0L) {
         this.l6.n5(new byte[]{0, 10, -6, 1, 7, 18, -1, 0, -38, 1, 3, -1, -1, 23, 0, 35, 0, 0, -1, 67, 120, 0, 83, -102, 116, 23});
      }
   }

   private static void n5(com.aspose.slides.internal.k0r.o6t var0, IMasterTheme var1, g6o var2) {
      v6v var3 = var2.n5().z1().n5();
      if (!var0.u3().get_Item(0).l6().t2().l6()
         && var1.getFontScheme().getMajor().getLatinFont() != null
         && !com.aspose.slides.ms.System.d1.n5(var1.getFontScheme().getMajor().getLatinFont().getFontName())) {
         var0.u3().get_Item(0).l6().l6(new com.aspose.slides.ms.System.o5<>(var3.n5(0, var1.getFontScheme().getMajor().getLatinFont())));
      }

      if (!var0.u3().get_Item(0).l6().s7().l6()
         && var1.getFontScheme().getMajor().getEastAsianFont() != null
         && !com.aspose.slides.ms.System.d1.n5(var1.getFontScheme().getMajor().getEastAsianFont().getFontName())) {
         var0.u3().get_Item(0).l6().k5(new com.aspose.slides.ms.System.o5<>(var3.n5(1, var1.getFontScheme().getMajor().getEastAsianFont())));
      }
   }
}
