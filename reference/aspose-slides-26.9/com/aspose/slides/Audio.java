package com.aspose.slides;

import java.io.InputStream;

public class Audio extends DomObject<AudioCollection> implements IAudio {
   private IPresentationComponent n5;
   private long l6;
   private final com.aspose.slides.internal.q7.c8 k5;
   private final k8 u3 = new k8();
   private final y5 a6 = new y5();

   Audio(com.aspose.slides.internal.q7.c8 blobHandler, String contentType, String extension, AudioCollection parentImmediate) {
      super(parentImmediate);
      this.k5 = blobHandler;
      this.c8().n5(contentType);
      this.c8().l6(extension);
   }

   Audio(com.aspose.slides.internal.q7.c8 blobHandler, AudioCollection parentImmediate) {
      super(parentImmediate);
      this.k5 = blobHandler;
   }

   private k8 c8() {
      return this.u3;
   }

   final y5 n5() {
      return this.a6;
   }

   final IPresentationComponent l6() {
      if (this.n5 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.n5};
         d0u.n5(IPresentationComponent.class, this.u9, var1);
         this.n5 = var1[0];
      }

      return this.n5;
   }

   final long k5() {
      if ((this.l6 & 4294967295L) == 0L) {
         this.l6 = com.aspose.slides.internal.h3k.u3.n5(this.u3());
      }

      return this.l6;
   }

   final byte[] u3() {
      return this.k5.n5();
   }

   final IPresentation a6() {
      return this.l6().getPresentation();
   }

   @Override
   public final String getContentType() {
      if (!this.t2()) {
         this.s7();
      }

      return this.c8().n5();
   }

   public final void setContentType(String value) {
      this.c8().n5(value);
   }

   final String u9() {
      if (!this.t2()) {
         this.s7();
      }

      return this.c8().l6();
   }

   final void n5(String var1) {
      this.c8().l6(var1);
   }

   @Override
   public final byte[] getBinaryData() {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();
      com.aspose.slides.internal.z0k.t4 var2 = this.k5.l6();

      try {
         com.aspose.slides.internal.q7.n5.n5(var2, var1, com.aspose.slides.internal.q7.n5.n5);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }

      return var1.toArray();
   }

   @Override
   public final InputStream getStream() {
      return com.aspose.slides.internal.z0k.t4.toJava(this.h0());
   }

   com.aspose.slides.internal.z0k.t4 h0() {
      return this.k5.l6();
   }

   private boolean t2() {
      return !com.aspose.slides.ms.System.d1.n5(this.c8().n5()) && !com.aspose.slides.ms.System.d1.n5(this.c8().l6());
   }

   private void s7() {
      com.aspose.slides.internal.z0k.t4 var1 = this.k5.l6();

      byte[] var2;
      try {
         var2 = new byte[(int)com.aspose.slides.internal.q7.n5.n5];
         var1.read(var2, 0, var2.length);
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }

      com.aspose.slides.internal.n8e.a6 var4 = new com.aspose.slides.internal.n8e.a6(var2);
      String var3;
      String var5;
      if (var4.k5()) {
         var3 = var4.n5();
         var5 = var4.l6();
      } else {
         var3 = "audio/unknown";
         var5 = "audio";
      }

      if (com.aspose.slides.ms.System.d1.n5(this.c8().n5())) {
         this.c8().n5(var3);
      }

      if (com.aspose.slides.ms.System.d1.n5(this.c8().l6())) {
         this.c8().l6(var5);
      }
   }
}
