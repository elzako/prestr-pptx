package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NotSupportedException;
import java.io.OutputStream;

public final class PresentationInfo implements IPresentationInfo {
   private int n5;
   private boolean l6;
   private boolean k5;
   private byte u3;
   private final com.aspose.slides.internal.z0k.t2 a6;
   private com.aspose.slides.internal.z0k.t4 u9;
   private com.aspose.slides.internal.c8m.s7 h0;
   private com.aspose.slides.internal.x1.x8 c8;
   private DocumentProperties t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      ".ppsx", ".potx", ".pptm", ".ppsm", ".potm", ".pps", ".pot"
   );

   @Override
   public final boolean isEncrypted() {
      return this.l6;
   }

   @Override
   public final boolean isPasswordProtected() {
      return this.k5;
   }

   @Override
   public final byte isWriteProtected() {
      return this.u3;
   }

   @Override
   public final int getLoadFormat() {
      return this.n5;
   }

   @Override
   public final boolean checkPassword(String password) {
      if (this.isPasswordProtected() && !com.aspose.slides.ms.System.d1.n5(password)) {
         switch (this.getLoadFormat()) {
            case 1:
            case 2:
            case 12:
               this.h0(this.u9);
               this.c8 = u4e.l6(this.u9);
               return com.aspose.slides.internal.k0r.f9.n5(this.c8, password);
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
               this.h0(this.u9);
               return x4r.l6(this.u9, password);
            case 5:
            case 10:
               throw new NotSupportedException("ODF format is not supported to check passwords.");
            case 11:
            default:
               throw new InvalidOperationException("An unknown presentation format is encountered.");
         }
      } else {
         return false;
      }
   }

   @Override
   public final boolean checkWriteProtection(String password) {
      if (com.aspose.slides.ms.System.d1.n5(password)) {
         return false;
      }

      switch (this.getLoadFormat()) {
         case 1:
         case 2:
         case 12:
            if (this.isPasswordProtected()) {
               throw new InvalidOperationException("A presentation is protected by a password to open.");
            }

            if (this.isEncrypted()) {
               this.h0(this.u9);
               this.c8 = u4e.l6(this.u9);
            }

            return com.aspose.slides.internal.k0r.f9.l6(this.c8, password);
         case 3:
         case 4:
         case 6:
         case 7:
         case 8:
         case 9:
            if (this.isEncrypted() && this.h0 == null) {
               throw new InvalidOperationException("A presentation is protected by a password to open.");
            }

            return q3f.n5((com.aspose.slides.internal.c8m.d9)this.h0, password);
         case 5:
         case 10:
            throw new InvalidOperationException("ODF format does not support write protection.");
         case 11:
         default:
            throw new InvalidOperationException("An unknown presentation format is encountered.");
         case 13:
            throw new InvalidOperationException("FODP format does not support write protection.");
      }
   }

   @Override
   public final IDocumentProperties readDocumentProperties() {
      if (this.getLoadFormat() == 255) {
         throw new NotImplementedException("The document format is unknown");
      }

      if (this.isEncrypted()) {
         throw new NotImplementedException("Can't read properties of encrypted document");
      }

      if (this.t2 == null) {
         switch (this.getLoadFormat()) {
            case 1:
            case 2:
            case 12:
               this.t2 = this.u3();
               break;
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
               this.t2 = this.l6();
               break;
            case 5:
            case 10:
            case 13:
               this.t2 = this.k5();
               break;
            case 11:
            default:
               throw new NotImplementedException();
         }
      }

      return this.t2.cloneT();
   }

   @Override
   public final void updateDocumentProperties(IDocumentProperties documentProperties) {
      if (documentProperties == null) {
         throw new ArgumentNullException("documentProperties");
      }

      if (this.getLoadFormat() == 255) {
         throw new NotImplementedException("The document format is unknown");
      }

      if (this.isEncrypted()) {
         throw new NotImplementedException("Can't update properties of encrypted document");
      }

      this.t2 = (DocumentProperties)((DocumentProperties)documentProperties).cloneT();
   }

   @Override
   public final void writeBindedPresentation(OutputStream stream) {
      com.aspose.slides.internal.l6o.l6.n5(new PresentationInfo$1(this, stream));
   }

   void n5(com.aspose.slides.internal.z0k.t4 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("stream");
      }

      if (!var1.canSeek()) {
         throw new InvalidOperationException("The stream must be seekable to write the presentation");
      }

      if (!var1.canWrite()) {
         throw new InvalidOperationException("The stream must be writable to write the presentation");
      }

      if (this.getLoadFormat() == 255) {
         throw new NotImplementedException("The current document format is unknown");
      }

      if (this.isEncrypted()) {
         throw new NotImplementedException("The current document is encrypted and can't be written");
      }

      com.aspose.slides.ms.System.o0 var2 = com.aspose.slides.ms.System.o0.l6().k5();

      try {
         r6e.n5(var2.k5());
         this.l6(var1);
         r6e.n5(var2.k5(), var1);
      } catch (RuntimeException var4) {
         r6e.l6(var2.k5());
         throw var4;
      }
   }

   @Override
   public final void writeBindedPresentation(String file) {
      com.aspose.slides.internal.z0k.n3 var2 = new com.aspose.slides.internal.z0k.n3(file, 3, 3);

      try {
         this.n5(var2);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   private void l6(com.aspose.slides.internal.z0k.t4 var1) {
      switch (this.getLoadFormat()) {
         case 1:
         case 2:
         case 12:
            this.a6(var1);
            break;
         case 3:
         case 4:
         case 6:
         case 7:
         case 8:
         case 9:
            this.u3(var1);
            break;
         case 5:
         case 10:
         case 13:
            this.u9(var1);
            break;
         case 11:
         default:
            throw new InvalidOperationException();
      }
   }

   PresentationInfo(com.aspose.slides.internal.z0k.t4 stream, com.aspose.slides.internal.z0k.t2 fileInfo) {
      this.a6 = fileInfo;
      this.l6 = false;
      this.k5 = false;
      this.u3 = -1;
      com.aspose.slides.internal.z0k.t4 var3 = com.aspose.slides.internal.n8e.z3.n5(stream);
      com.aspose.slides.ms.System.o0 var4 = com.aspose.slides.ms.System.o0.l6().k5();

      try {
         r6e.n5(var4.k5());
         boolean var5 = false;
         int var6 = var3.readByte();
         if (var6 > 0) {
            var3.seek(-1L, 1);
            if ((byte)var6 == 80) {
               var5 = true;
            }
         }

         if (var5) {
            int var27 = 0;
            int[] var30 = new int[]{0};
            boolean var32 = q5x.n5(stream, var30);
            var27 = var30[0];
            if (var32) {
               this.h0(var3);
               this.l6 = q5x.k5(var3);
               this.n5 = var27;
               if (!this.l6) {
                  this.h0(var3);
                  this.h0 = new com.aspose.slides.internal.c8m.s9(var3, com.aspose.slides.internal.b8.c8.n5);
               }
            } else {
               try {
                  this.h0(var3);
                  this.h0 = new com.aspose.slides.internal.c8m.d9(var3, com.aspose.slides.internal.b8.c8.n5);
                  this.n5 = this.n5();
                  this.u3 = (byte)(q3f.n5((com.aspose.slides.internal.c8m.d9)this.h0) ? 1 : 0);
               } catch (RuntimeException var21) {
                  this.n5 = 255;
               }
            }
         } else if (Presentation.l6(var3)) {
            try {
               this.h0(var3);
               this.h0 = q5x.n5(var3);
               this.n5 = 13;
            } catch (RuntimeException var20) {
               this.n5 = 255;
            }
         } else {
            try {
               this.h0(var3);
               this.c8 = u4e.l6(var3);
               if (u4e.n5(this.c8)) {
                  this.l6 = true;
                  this.k5 = u4e.l6(this.c8);
                  this.n5 = this.k5(stream);
               } else {
                  boolean var7 = false;
                  boolean var8 = false;
                  boolean var9 = false;
                  boolean[] var10 = new boolean[]{false};
                  boolean[] var11 = new boolean[]{false};
                  boolean[] var12 = new boolean[]{false};
                  u4e.n5(stream, var10, var11, var12);
                  var7 = var10[0];
                  var8 = var11[0];
                  var9 = var12[0];
                  if (var7 || var8) {
                     this.n5 = 11;
                  } else if (!var9 && !u4e.n5(stream)) {
                     this.n5 = this.a6();
                     this.u3 = (byte)(com.aspose.slides.internal.k0r.f9.n5(this.c8) ? 1 : 0);
                  } else {
                     this.l6 = true;
                     this.n5 = this.a6();
                     this.k5 = !com.aspose.slides.internal.k0r.f9.n5(this.c8, "/01Hannes Ruescher/01");
                     if (!this.k5) {
                        this.u3 = 1;
                     }
                  }
               }
            } catch (PptReadException var22) {
               this.n5 = 255;
            } catch (PptxReadException var23) {
               this.n5 = 255;
            }
         }

         r6e.n5(var4.k5(), var3);
      } catch (RuntimeException var24) {
         r6e.l6(var4.k5());
         throw var24;
      } finally {
         if (this.isEncrypted()) {
            if (var3 != stream) {
               this.u9 = var3;
            } else {
               this.h0(stream);
               this.u9 = com.aspose.slides.internal.n8e.z3.l6(stream);
            }
         } else if (var3 != stream) {
            var3.dispose();
         }
      }
   }

   private int k5(com.aspose.slides.internal.z0k.t4 var1) {
      com.aspose.slides.internal.z0k.n3 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.z0k.n3.class);
      if (var2 == null) {
         return 3;
      }

      switch (s7.n5(com.aspose.slides.internal.z0k.z1.a6(var2.n5()))) {
         case 0:
            return 4;
         case 1:
            return 6;
         case 2:
            return 7;
         case 3:
            return 8;
         case 4:
            return 9;
         default:
            return 3;
      }
   }

   private int n5() {
      short var1 = 255;
      int var2 = q6s.n5(((com.aspose.slides.internal.c8m.d9)this.h0).w1().y4().n5(), 0);
      switch (var2) {
         case 0:
            var1 = 3;
            break;
         case 1:
            var1 = 7;
            break;
         case 2:
            var1 = 4;
            break;
         case 3:
            var1 = 8;
            break;
         case 4:
            var1 = 6;
            break;
         case 5:
            var1 = 9;
      }

      return var1;
   }

   private DocumentProperties l6() {
      DocumentProperties var1 = new DocumentProperties();
      com.aspose.slides.internal.c8m.d9 var2 = (com.aspose.slides.internal.c8m.d9)this.h0;
      k6y var3 = new k6y();
      q3f.n5(var2, var1, var3);
      q3f.l6(var2, var1, var3);
      return var1;
   }

   private DocumentProperties k5() {
      DocumentProperties var1 = new DocumentProperties();
      com.aspose.slides.internal.c8m.s9 var2 = (com.aspose.slides.internal.c8m.s9)this.h0;
      k6y var3 = new k6y();
      x6e var4 = new x6e(var2.s7(), var3);
      var4.n5(var1);
      return var1;
   }

   private DocumentProperties u3() {
      DocumentProperties var1 = new DocumentProperties();
      w1c var2 = this.u9();
      u4e.n5(var1, var2);
      return var1;
   }

   private int a6() {
      if (this.a6 == null) {
         return 1;
      }

      switch (s7.n5(this.a6.h0())) {
         case 5:
            return 2;
         case 6:
            return 12;
         default:
            return 1;
      }
   }

   private void u3(com.aspose.slides.internal.z0k.t4 var1) {
      com.aspose.slides.internal.c8m.d9 var2 = (com.aspose.slides.internal.c8m.d9)this.h0;
      h6c var3 = new h6c(var2);
      r0w var4 = new r0w(var2.m3(), var3);
      var4.k5(this.t2);
      this.n5(var2.k5(), var2.m3().k5(), var2.m3().a6());
      d1t var5 = new d1t(var2.z8(), var3);
      var5.l6(this.t2, null);
      this.n5(var2.k5(), var2.z8().k5(), var2.z8().a6());
      this.n5(var1, var3);
      var1.setLength(0L);
      var2.k5().l6(var1);
   }

   private void n5(com.aspose.slides.internal.z0k.t4 var1, h6c var2) {
      com.aspose.slides.internal.c8m.d9 var3 = (com.aspose.slides.internal.c8m.d9)var2.v4();
      boolean var4 = var3.k7() != null;
      if (!var4) {
         com.aspose.slides.internal.c8m.j8 var5 = var3.n5("/docProps/custom.xml", null, new com.aspose.slides.internal.c8m.a0());
         var3.c8().l6(var5);
         com.aspose.slides.internal.c8m.j8 var6 = var3.u9("/_rels/.rels");
         var3.k5(var6);
         this.n5(var3.k5(), var6.k5(), var6.a6());
         var3.n3();
         com.aspose.slides.internal.c8m.j8 var7 = var3.u9("/[Content_Types].xml");
         this.n5(var3.k5(), var7.k5(), var7.a6());
      }

      f7v var8 = new f7v(var3.k7(), var2);
      var8.k5(this.t2);
      if (var4) {
         var3.k5().k5(var3.k7().k5());
      }

      var3.k5().n5(var3.k7().k5(), null, var3.k7().a6());
   }

   private void a6(com.aspose.slides.internal.z0k.t4 var1) {
      w1c var2 = this.u9();
      byte[] var3 = null;
      byte[] var4 = null;
      byte[][] var5 = new byte[][]{var3};
      byte[][] var6 = new byte[][]{var4};
      p0t.n5(this.t2, var2, var5, var6);
      var3 = var5[0];
      var4 = var6[0];
      if (this.c8.n5().l6("\u0005SummaryInformation")) {
         this.c8.n5().k5("\u0005SummaryInformation");
      }

      if (this.c8.n5().l6("\u0005DocumentSummaryInformation")) {
         this.c8.n5().k5("\u0005DocumentSummaryInformation");
      }

      if (var3 != null) {
         com.aspose.slides.internal.x1.u9 var7 = new com.aspose.slides.internal.x1.u9("\u0005SummaryInformation");
         var7.n5(var3);
         this.c8.n5().a6(var7);
      }

      if (var4 != null) {
         com.aspose.slides.internal.x1.u9 var10 = new com.aspose.slides.internal.x1.u9("\u0005DocumentSummaryInformation");
         var10.n5(var4);
         this.c8.n5().a6(var10);
      }

      var1.setLength(0L);
      this.c8.l6(var1);
   }

   private void n5(com.aspose.slides.internal.e5a.d2 var1, String var2, byte[] var3) {
      var1.k5(var2);
      var1.n5(var2, null, var3);
   }

   private void u9(com.aspose.slides.internal.z0k.t4 var1) {
      com.aspose.slides.internal.c8m.s9 var2 = (com.aspose.slides.internal.c8m.s9)this.h0;
      k6y var3 = new k6y();
      x6e var4 = new x6e(var2.s7(), var3);
      var4.k5(this.t2);
      this.n5(var2.k5(), var2.s7().k5(), var2.s7().a6());
      var1.setLength(0L);
      var2.k5().l6(var1);
   }

   private w1c u9() {
      com.aspose.slides.internal.x1.u9 var1 = (com.aspose.slides.internal.x1.u9)this.c8.n5().u3("\u0005SummaryInformation");
      com.aspose.slides.internal.x1.u9 var2 = (com.aspose.slides.internal.x1.u9)this.c8.n5().u3("\u0005DocumentSummaryInformation");
      com.aspose.slides.internal.n8e.e9 var3 = null;
      if (var1 != null) {
         com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2(var1.n5());

         try {
            var3 = new com.aspose.slides.internal.n8e.e9(var4);
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }
      }

      com.aspose.slides.internal.n8e.e9 var13 = null;
      if (var1 != null) {
         com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2(var2.n5());

         try {
            var13 = new com.aspose.slides.internal.n8e.e9(var5);
         } finally {
            if (var5 != null) {
               var5.dispose();
            }
         }
      }

      return new w1c(var13, var3);
   }

   private void h0(com.aspose.slides.internal.z0k.t4 var1) {
      var1.seek(0L, 0);
   }
}
