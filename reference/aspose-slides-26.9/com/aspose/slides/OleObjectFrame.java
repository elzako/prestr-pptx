package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.DOMResourcesUtils;
import com.aspose.slides.ms.System.IDisposable;

public class OleObjectFrame extends GraphicalObject implements IOleObjectFrame {
   private String h0 = "";
   private String e2 = "";
   String n5 = "";
   private String t9 = "";
   private String z1;
   private String t4;
   private OleEmbeddedDataInfo q0;
   PictureFillFormat l6;
   PictureFillFormat k5;
   long u3;
   String a6;
   private boolean z3;
   private boolean m1;
   boolean u9 = true;
   private byte[] k7;
   private String m3;
   private com.aspose.slides.internal.o9b.f2 z8 = new com.aspose.slides.internal.o9b.f2();
   private boolean j5;

   final com.aspose.slides.internal.o9b.f2 n5() {
      return this.z8.a6();
   }

   final void n5(com.aspose.slides.internal.o9b.f2 var1) {
      this.z8 = var1.a6();
   }

   OleObjectFrame(r0g parentImmediate) {
      super(parentImmediate, new b4g(), new j1r());
      this.l6 = new PictureFillFormat(this);
      this.l6.setPictureFillMode(1);
      this.q0 = new OleEmbeddedDataInfo();
      this.t2 = new LineFormat(this);
      this.n5(new d9f(this));
   }

   final boolean k5() {
      return (this.u3 & 4294967295L) != (((PPImage)this.l6.getPicture().getImage()).u9() & 4294967295L);
   }

   final boolean u9() {
      return this.j5;
   }

   final void n5(boolean var1) {
      this.j5 = var1;
   }

   final b4g x8() {
      return (b4g)super.t4();
   }

   final j1r y4() {
      return (j1r)super.m1();
   }

   @Override
   public final IPictureFillFormat getSubstitutePictureFormat() {
      return this.l6;
   }

   @Override
   public final String getSubstitutePictureTitle() {
      return this.a6;
   }

   @Override
   public final void setSubstitutePictureTitle(String value) {
      this.a6 = value;
      this.n5(true);
   }

   @Override
   public final String getObjectName() {
      return this.h0;
   }

   @Override
   public final void setObjectName(String value) {
      this.h0 = value;
   }

   @Override
   public final String getObjectProgId() {
      return this.e2;
   }

   @Override
   public final void setObjectProgId(String value) {
      this.e2 = value;
   }

   final byte[] e2() {
      return this.k7;
   }

   final void n5(byte[] var1) {
      this.k7 = null;
      if (var1 != null) {
         this.l6(false);
         this.k7 = new byte[var1.length];
         com.aspose.slides.ms.System.u3.n5((Object)(var1)).copyTo(com.aspose.slides.ms.System.u3.n5((Object)(this.k7)), 0);
      }
   }

   @Override
   public final String getLinkFileName() {
      return this.isObjectLink() ? this.t9 : "";
   }

   @Override
   public final String getLinkPathLong() {
      if (!this.isObjectLink()) {
         return "";
      } else if (!com.aspose.slides.ms.System.d1.n5(this.n5)) {
         return this.n5;
      } else {
         return !com.aspose.slides.ms.System.d1.n5(this.j5()) ? this.j5() : "";
      }
   }

   @Override
   public final void setLinkPathLong(String value) {
      if (!com.aspose.slides.ms.System.d1.n5(value)) {
         this.l6(true);
         this.n5 = value;
         this.u9 = true;

         try {
            this.t9 = com.aspose.slides.internal.z0k.z1.n5(this.n5);
            this.q0.n5(com.aspose.slides.ms.System.d1.k5(com.aspose.slides.internal.z0k.z1.a6(this.n5), 1));
         } catch (RuntimeException var3) {
            com.aspose.slides.internal.n8e.v4.n5(var3);
            this.t9 = null;
         }
      } else {
         this.n5 = this.t9 = "";
         this.q0.n5("");
      }

      this.m3 = "";
      this.y4().k5("");
      this.y4().l6("");
      this.y4().n5(com.aspose.slides.ms.System.o0.n5.k5());
   }

   @Override
   public final String getLinkPathRelative() {
      return !this.m3() ? "" : this.y4().h0();
   }

   @Override
   public final String getEmbeddedFileLabel() {
      return this.t4;
   }

   final void n5(String var1) {
      this.t4 = var1;
   }

   @Override
   public final String getEmbeddedFileName() {
      return this.z1;
   }

   final void l6(String var1) {
      this.z1 = var1;
   }

   @Override
   public final IOleEmbeddedDataInfo getEmbeddedData() {
      return this.q0;
   }

   final void n5(IOleEmbeddedDataInfo var1) {
      this.q0 = (OleEmbeddedDataInfo)var1;
   }

   final OleEmbeddedDataInfo z1() {
      return this.q0;
   }

   @Override
   public final void setEmbeddedData(IOleEmbeddedDataInfo embeddedData) {
      if (embeddedData == null) {
         throw new ArgumentNullException("embeddedData");
      }

      this.q0 = (OleEmbeddedDataInfo)embeddedData;
      this.l6(false);
      this.l6("");
      if (embeddedData.getEmbeddedFileData() != null) {
         this.z6();
      }
   }

   private void z6() {
      String var1 = com.aspose.slides.ms.System.d1.a6(this.q0.getEmbeddedFileExtension());
      String var2 = com.aspose.slides.ms.System.d1.t2(var1, ".") ? var1 : com.aspose.slides.ms.System.d1.n5(new String[]{".", var1});
      String var3 = var1;
      if (!e6f.n5().containsKey(var1)) {
         var3 = com.aspose.slides.ms.System.d1.n5;
         IGenericEnumerator var4 = e6f.n5().getKeys().iterator();

         try {
            while (var4.hasNext()) {
               String var5 = (String)var4.next();
               e5i var6 = e6f.n5().get_Item(var5);
               if (com.aspose.slides.ms.System.d1.a6(var6.n5(), var2)) {
                  var3 = var5;
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         if (com.aspose.slides.ms.System.d1.n5(var3)) {
            var3 = var2;
            e6f.n5().addItem(var1, new e5i(var2, new com.aspose.slides.internal.c8m.y9(), "0", "package"));
         }
      }

      this.n5(e6f.n5(var3, this.q0, ((Presentation)this.getPresentation()).w1()));
   }

   @Override
   public final boolean isObjectIcon() {
      return this.z3;
   }

   @Override
   public final void setObjectIcon(boolean value) {
      this.z3 = value;
   }

   @Override
   public final boolean isObjectLink() {
      return this.m3();
   }

   final boolean m3() {
      return this.m1;
   }

   final void l6(boolean var1) {
      this.m1 = var1;
   }

   final PictureFillFormat z8() {
      if (this.k5 == null) {
         this.k5 = new PictureFillFormat(this);
         this.k5.n5(this.l6);
      }

      if (this.k5() || this.u9()) {
         byte[] var1 = com.aspose.slides.internal.n8e.k7.n5(
            ((PPImage)this.l6.getPicture().getImage()).getBinaryData(),
            this.getSubstitutePictureTitle(),
            this.k5(),
            DOMResourcesUtils.getResourceStream("OleIconTemplate.wmf"),
            this.e9()
         );
         Presentation var2 = this.k5.getPresentation();
         PPImage var3 = new PPImage(var2, var1);
         this.k5.getPicture().setImage(var3);
         this.u3 = ((PPImage)this.l6.getPicture().getImage()).u9();
         this.n5(false);
      }

      return this.k5;
   }

   @Override
   public final boolean getUpdateAutomatic() {
      return this.u9;
   }

   @Override
   public final void setUpdateAutomatic(boolean value) {
      this.u9 = value;
   }

   final String j5() {
      return this.m3;
   }

   final void k5(String var1) {
      this.m3 = var1;
   }

   private int e9() {
      short var1 = 1252;
      if (!this.u9()) {
         return var1;
      }

      for (int var2 = 0; var2 < this.a6.length(); var2++) {
         char var3 = this.a6.charAt(var2);
         if (var3 >= 128 && !com.aspose.slides.internal.n2d.u9.c4(var3)) {
            switch (com.aspose.slides.internal.n2d.u9.u3((int)var3)) {
               case 0:
                  if (com.aspose.slides.internal.n2d.u9.y2(var3)) {
                     return 1251;
                  }

                  if (com.aspose.slides.internal.n2d.u9.y1(var3)) {
                     return 1254;
                  }
                  break;
               case 1:
                  if (com.aspose.slides.internal.n2d.u9.a0(var3)) {
                     return 949;
                  }

                  return 936;
               case 2:
                  byte var4 = com.aspose.slides.internal.n2d.u9.x8(var3);
                  if (var4 == 4) {
                     return 1256;
                  }

                  if (com.aspose.slides.internal.n2d.u9.d2(var3)) {
                     return 1255;
                  }
                  break;
               default:
                  return var1;
            }
         }
      }

      return var1;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   j1r m1() {
      return this.y4();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   b4g t4() {
      return this.x8();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   j1r k7() {
      return this.y4();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   b4g h0() {
      return this.x8();
   }

}
