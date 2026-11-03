package com.aspose.slides;

import java.io.InputStream;

public class Video implements IVideo, r0g {
   private final r0g n5;
   private final Presentation l6;
   private final p9l k5 = new p9l();
   private long u3;
   private final com.aspose.slides.internal.q7.c8 a6;

   Video(VideoCollection parentImmediate, com.aspose.slides.internal.q7.c8 blobHandler, String contentType, String extension) {
      this.n5 = parentImmediate;
      this.l6 = parentImmediate.l6();
      this.a6 = blobHandler;
      this.h0().n5(contentType);
      this.h0().l6(extension);
   }

   Video(VideoCollection parentImmediate, com.aspose.slides.internal.q7.c8 blobHandler) {
      this.n5 = parentImmediate;
      this.l6 = parentImmediate.l6();
      this.a6 = blobHandler;
   }

   private p9l h0() {
      return this.k5;
   }

   final long n5() {
      if ((this.u3 & 4294967295L) == 0L) {
         this.u3 = com.aspose.slides.internal.h3k.u3.n5(this.l6());
      }

      return this.u3;
   }

   final byte[] l6() {
      return this.a6.n5();
   }

   final IPresentation k5() {
      return this.l6;
   }

   @Override
   public final String getContentType() {
      if (!this.c8()) {
         this.t2();
      }

      return this.h0().n5();
   }

   final String u3() {
      if (!this.c8()) {
         this.t2();
      }

      return this.h0().l6();
   }

   final com.aspose.slides.internal.q7.c8 a6() {
      return this.a6;
   }

   @Override
   public final byte[] getBinaryData() {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();
      com.aspose.slides.internal.z0k.t4 var2 = this.a6.l6();

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
      return com.aspose.slides.internal.z0k.t4.toJava(this.u9());
   }

   com.aspose.slides.internal.z0k.t4 u9() {
      return this.a6.l6();
   }

   private boolean c8() {
      return !com.aspose.slides.ms.System.d1.n5(this.h0().n5()) && !com.aspose.slides.ms.System.d1.n5(this.h0().l6());
   }

   private void t2() {
      com.aspose.slides.internal.z0k.t4 var1 = this.a6.l6();

      com.aspose.slides.internal.n8e.q1 var3;
      try {
         byte[] var2 = new byte[(int)com.aspose.slides.internal.q7.n5.n5];
         var1.read(var2, 0, var2.length);
         var3 = new com.aspose.slides.internal.n8e.q1(var2);
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }

      if (com.aspose.slides.ms.System.d1.n5(this.h0().n5()) && var3.n5()) {
         this.h0().n5(var3.l6());
      } else {
         this.h0().n5("video/unknown");
      }

      if (com.aspose.slides.ms.System.d1.n5(this.h0().l6()) && var3.n5()) {
         this.h0().l6(var3.k5());
      } else {
         this.h0().l6("video");
      }
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.n5;
   }
}
