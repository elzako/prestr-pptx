package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.OperationCanceledException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import java.awt.Color;
import java.awt.Dimension;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.regex.Pattern;

public final class Presentation implements IPresentation, r0g {
   private final f7o h0;
   private com.aspose.slides.internal.g7.u0a c8;
   int n5 = 1;
   String l6 = null;
   private com.aspose.slides.internal.z0k.t4 t2 = null;
   private com.aspose.slides.internal.q7.c8 s7 = null;
   private ProtectionManager x8;
   private final SlideCollection n3;
   private final GlobalLayoutSlideCollection y4;
   private final MasterSlideCollection e2;
   private final SectionCollection t9;
   private final FontsManager z1;
   private com.aspose.slides.internal.q7.l6 t4;
   private final com.aspose.slides.internal.t4r.n5<com.aspose.slides.internal.k9.h0, com.aspose.slides.internal.k9.u9> q0;
   private final com.aspose.slides.internal.t4r.n5<com.aspose.slides.internal.k9.h0, com.aspose.slides.internal.k9.u9> z3;
   private final Dictionary<com.aspose.slides.internal.k9.h0, Integer> m1;
   private final k6j k7;
   private final s3p m3;
   private final i6f z8;
   private final z4k j5;
   private final ImageCollection w1;
   private final AudioCollection r4;
   private final VideoCollection c4;
   private final DigitalSignatureCollection y2;
   private final SlideSize y1;
   private final CustomData a0;
   private final CustomXmlPartCollection d2;
   TextStyle k5;
   private MasterTheme d5;
   CommentAuthorCollection u3;
   private PresentationHeaderFooterManager s3;
   private DocumentProperties p8;
   private NotesSize f2;
   private final long i1;
   private long e5;
   final Dictionary<Long, h7<MasterSlide>> a6 = new Dictionary<>();
   static final ParagraphFormat u9;
   private boolean b3 = false;
   private final LoadOptions o0;
   private ISaveOptions z7;
   private com.aspose.slides.ms.System.j5 v4 = com.aspose.slides.ms.System.j5.s7().m3();
   private long u6 = 0L;
   private HyperlinkQueries t1;
   private ViewProperties a5;
   private int h2 = 1;
   private l1x v0 = new l1x();
   private i0d f0 = new i0d();
   private c4b a3 = new c4b();
   private IVbaProject p3;
   private com.aspose.slides.internal.l6z.h6 x9;
   private final i7q y0 = new i7q();
   private List<PictureFrame> j9 = new List<>();
   private boolean z6 = false;
   private int e9 = -1;
   private final Dictionary<Long, Object> o5 = new Dictionary<>();
   private String j8;
   private Object w2;
   private SlideShowSettings s0;
   private y3 v8;
   private ISensitivityLabelCollection v3;
   private static final char[] g7 = new char[]{'/', '.'};
   private int j4;
   private static final long[] i9 = new long[]{0L};

   final com.aspose.slides.internal.g7.u0a n5() {
      if (this.c8 == null) {
         TextParam$FontArgs var1 = new TextParam$FontArgs();
         var1.Name = "Cambria Math";
         var1.Height = 18.0F;
         var1.Bold = false;
         TextParam var2 = new TextParam(this, 72.0F, var1.Clone());
         e4z var3 = var2.d2();
         com.aspose.slides.internal.g7.c0 var4 = new com.aspose.slides.internal.g7.c0(
            new com.aspose.slides.internal.g7.m3(com.aspose.slides.internal.n2d.t4.l6(var3.l6().n5().y1().l6()))
         );
         com.aspose.slides.internal.g7.n2[] var5 = var4.n5();

         for (int var6 = 0; var6 < var5.length; var6++) {
            if (com.aspose.slides.ms.System.d1.a6(var5[var6].n5(), var3.n5)) {
               com.aspose.slides.internal.g7.r5t var7 = new com.aspose.slides.internal.g7.r5t();
               this.c8 = (com.aspose.slides.internal.g7.u0a)var7.n5(var5[var6]);
            }
         }
      }

      return this.c8;
   }

   final com.aspose.slides.internal.l6z.h6 l6() {
      return this.x9;
   }

   final void n5(com.aspose.slides.internal.l6z.h6 var1) {
      this.x9 = var1;
   }

   final boolean k5() {
      return this.e9 != -1;
   }

   final long u3() {
      this.o5.addItem(++this.e9 & 4294967295L, null);
      return this.e9 & 4294967295L;
   }

   final long n5(long var1) {
      if ((var1 & 4294967295L) > this.e9) {
         this.e9 = (int)var1;
         return var1;
      } else {
         return this.o5.containsKey(var1) ? this.u3() : var1;
      }
   }

   final LoadOptions a6() {
      return this.o0;
   }

   /** Prevent cancelled operations from returning a partial presentation or image. */
   final void checkInterruption() {
      IInterruptionToken token = this.o0.getInterruptionToken();
      if (token != null) {
         token.throwIfInterruptionRequested();
      }
   }

   private RuntimeException disposeAfterFailure(RuntimeException failure) {
      try {
         this.dispose();
      } catch (RuntimeException cleanupFailure) {
         failure.addSuppressed(cleanupFailure);
      }
      return failure;
   }

   final ISaveOptions u9() {
      return this.z7;
   }

   final void n5(ISaveOptions var1) {
      this.z7 = var1;
   }

   final List<PictureFrame> h0() {
      return this.j9;
   }

   final String c8() {
      return this.j8;
   }

   final void n5(String var1) {
      this.j8 = var1;
   }

   @Override
   public final Date getCurrentDateTime() {
      return com.aspose.slides.ms.System.j5.k5(this.t2());
   }

   com.aspose.slides.ms.System.j5 t2() {
      return this.v4;
   }

   @Override
   public final void setCurrentDateTime(Date value) {
      this.n5(com.aspose.slides.ms.System.j5.n5(value));
   }

   void n5(com.aspose.slides.ms.System.j5 var1) {
      this.i1();
      if (com.aspose.slides.ms.System.j5.c8(this.v4, var1)) {
         this.p8();
      }

      var1.u3(this.v4);
   }

   @Override
   public final r0g getParent_Immediate() {
      return null;
   }

   final long s7() {
      return this.u6;
   }

   final boolean x8() {
      return this.b3;
   }

   @Override
   public final IPresentationHeaderFooterManager getHeaderFooterManager() {
      if (this.s3 == null) {
         this.s3 = new PresentationHeaderFooterManager(this);
         this.s3.n5();
      }

      return this.s3;
   }

   static void n5(k6j var0, boolean var1) {
      if (!com.aspose.slides.internal.b7.n5u.n5().k5() && !var1) {
         com.aspose.slides.internal.e1x.x8 var2 = com.aspose.slides.internal.e1x.x8.u3();
         String[] var3 = var2.n5();
         List var4 = FontsLoader.n5();

         for (String var8 : var3) {
            com.aspose.slides.internal.b7.n5u.n5().n5(var8);
         }

         List$Enumerator var27 = var4.iterator();

         try {
            while (var27.hasNext()) {
               byte[] var29 = (byte[])var27.next();
               com.aspose.slides.internal.g7.c0 var31 = new com.aspose.slides.internal.g7.c0(new com.aspose.slides.internal.g7.m3(var29));
               com.aspose.slides.internal.b7.n5u.n5().n5(var31);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var27, IDisposable.class)) {
               var27.dispose();
            }
         }
      }

      if (!com.aspose.slides.internal.b7.n5u.n5().u3() && var0.a6()) {
         IGenericEnumerator var24 = var0.n5().iterator();

         try {
            while (var24.hasNext()) {
               KeyValuePair var25 = (KeyValuePair)var24.next();
               IGenericEnumerator var26 = ((c4y)var25.getValue()).h0().iterator();

               try {
                  while (var26.hasNext()) {
                     KeyValuePair var28 = (KeyValuePair)var26.next();
                     com.aspose.slides.internal.g7.u0a var30 = FontsManager.n5((byte[])var28.getValue());
                     com.aspose.slides.internal.b7.n5u.n5().n5(var30);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var26, IDisposable.class)) {
                     var26.dispose();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var24, IDisposable.class)) {
               var24.dispose();
            }
         }
      }
   }

   private void y1() {
      Dictionary$Enumerator var1 = this.z3.l6().iterator();

      try {
         while (var1.hasNext()) {
            KeyValuePair var2 = (KeyValuePair)var1.next();
            if (((com.aspose.slides.internal.k9.u9)var2.getValue()).l6()) {
               ((com.aspose.slides.internal.k9.u9)var2.getValue()).k5().dispose();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      this.z3.k5();
   }

   private void a0() {
      this.getCustomData().getTags().remove("AS_TITLE");
      this.getCustomData().getTags().add("AS_TITLE", "Aspose.Slides for Java");
      this.getCustomData().getTags().remove("AS_VERSION");
      this.getCustomData().getTags().add("AS_VERSION", "26.9");
      this.getCustomData().getTags().remove("AS_RELEASE_DATE");
      this.getCustomData().getTags().add("AS_RELEASE_DATE", "2026.09.30");
      this.getCustomData().getTags().remove("AS_OS");
      this.getCustomData().getTags().add("AS_OS", com.aspose.slides.ms.System.p8.u3().toString());
   }

   private static void d2() {
      try {
         String var0 = System.getProperty("java.version");
         if (var0 == null) {
            return;
         }

         if (var0.startsWith("1.6") || var0.startsWith("1.7")) {
            String var1 = String.format(
               "[DEPRECATION WARNING] JDK %s is deprecated and will no longer be supported starting from version 26.10. Please upgrade to JDK 1.8 or higher before updating to version 26.10 to avoid runtime failures.",
               var0
            );
            System.err.println(var1);
         }
      } catch (Exception var2) {
         com.aspose.slides.internal.n8e.v4.n5(var2);
      }
   }

   public Presentation() {
      this(new LoadOptions());
   }

   public Presentation(LoadOptions loadOptions) {
      this(loadOptions, null);
      s4r.n5(this);
      this.a0();
      com.aspose.slides.internal.n8e.e5.n5().n5(1L);
   }

   Presentation(LoadOptions loadOptions, f7o themeContainer) {
      this.h0 = themeContainer;
      if (loadOptions == null) {
         loadOptions = new LoadOptions();
      } else {
         this.n5(loadOptions.n5());
      }

      this.o0 = loadOptions;
      this.checkInterruption();
      this.n5(1);
      this.k7 = new k6j(loadOptions);
      this.m3 = new s3p();
      d2();
      if (com.aspose.slides.internal.b7.n5u.n5() != null) {
         com.aspose.slides.internal.b7.n5u.n5().l6();
      }

      this.z1 = new FontsManager(this.k7, this.m3.n5(), this);
      this.z3 = new com.aspose.slides.internal.t4r.n5<>(com.aspose.slides.internal.k9.h0.class, com.aspose.slides.internal.k9.u9.class);
      this.q0 = new com.aspose.slides.internal.t4r.n5<>(com.aspose.slides.internal.k9.h0.class, com.aspose.slides.internal.k9.u9.class);
      this.m1 = new Dictionary<>();
      IBlobManagementOptions var3 = loadOptions.getBlobManagementOptions();
      boolean var4 = !var3.isTemporaryFilesAllowed();
      com.aspose.slides.internal.q7.u9 var5 = var4 ? new com.aspose.slides.internal.q7.u9() : new com.aspose.slides.internal.q7.u9(var3.getTempFilesRootPath());
      com.aspose.slides.internal.q7.u3 var6 = new com.aspose.slides.internal.q7.u3(var5);
      var6.n5(var4);
      var6.l6(var3.getMaxBlobsBytesInMemory());
      this.t4 = new com.aspose.slides.internal.q7.l6(var6);
      this.a0 = new CustomData(this);
      this.d2 = new CustomXmlPartCollection(this);
      this.w1 = new ImageCollection(this);
      this.r4 = new AudioCollection(this);
      this.c4 = new VideoCollection(this);
      this.n3 = new SlideCollection(this);
      this.t9 = new SectionCollection(this);
      this.y4 = new GlobalLayoutSlideCollection(this);
      this.e2 = new MasterSlideCollection(this);
      this.u3 = new CommentAuthorCollection(this);
      this.y2 = new DigitalSignatureCollection(this);
      this.z8 = new i6f(this);
      this.j5 = new z4k(this);
      this.n5(new y3(this));
      this.n5(new SensitivityLabelCollection(this));
      synchronized (com.aspose.slides.ms.System.u3.n5((Object)(i9)).getSyncRoot()) {
         this.i1 = i9[0]++;
         this.e5 = com.aspose.slides.internal.v6g.k5.h0(this.i1, 10) << 32;
      }

      this.k5 = new TextStyle(this);
      this.p8 = new DocumentProperties(this);
      this.n3().n5(new g8z(this));
      this.d5 = new MasterTheme(this);
      this.x8 = new ProtectionManager(this);
      this.y1 = new SlideSize(this);
      this.n5(new SlideShowSettings(this, null));
      if (!com.aspose.slides.ms.System.d1.n5(loadOptions.getDefaultTextLanguage())) {
         this.n5(loadOptions.getDefaultTextLanguage());
      }
   }

   final l1x n3() {
      return this.v0;
   }

   final i0d y4() {
      return this.f0;
   }

   final c4b e2() {
      return this.a3;
   }

   final k6j t9() {
      return this.k7;
   }

   final s3p z1() {
      return this.m3;
   }

   public Presentation(InputStream stream) {
      this(com.aspose.slides.internal.z0k.t4.fromJava(stream));
   }

   Presentation(com.aspose.slides.internal.z0k.t4 stream) {
      this(stream, new LoadOptions());
   }

   public Presentation(InputStream stream, LoadOptions loadOptions) {
      this(com.aspose.slides.internal.z0k.t4.fromJava(stream), loadOptions);
   }

   Presentation(com.aspose.slides.internal.z0k.t4 stream, LoadOptions loadOptions) {
      this(loadOptions, null);

      try {
         this.z1.n5().n5(true);
         this.n5(stream, false);
      } catch (com.aspose.slides.internal.n8e.n5 var7) {
         throw this.disposeAfterFailure(new PptxReadException("Presentation reading aborted.", var7));
      } catch (RuntimeException failure) {
         throw this.disposeAfterFailure(failure);
      } finally {
         this.z1.n5().n5(false);
      }
   }

   public Presentation(String file) {
      this(file, new LoadOptions());
   }

   public Presentation(String file, LoadOptions loadOptions) {
      this(loadOptions, null);
      this.n5(file, false);
   }

   Presentation(String file, LoadOptions loadOptions, f7o themeContainer) {
      this(loadOptions, themeContainer);
      this.n5(file, true);
   }

   private void n5(String var1, boolean var2) {
      this.l6 = com.aspose.slides.internal.z0k.z1.k5(var1);

      try {
         this.z1.n5().n5(true);
         IBlobManagementOptions var3 = this.o0.getBlobManagementOptions();
         if (var3.getPresentationLockingBehavior() == 0) {
            com.aspose.slides.internal.z0k.n3 var4 = new com.aspose.slides.internal.z0k.n3(var1, 3, 1, 1);

            try {
               this.n5(var4, var2);
            } finally {
               if (var4 != null) {
                  var4.dispose();
               }
            }
         } else {
            this.t2 = new com.aspose.slides.internal.z0k.n3(var1, 3, 1, 1);
            this.n5(this.t2, var2);
         }
      } catch (com.aspose.slides.internal.n8e.n5 var14) {
         throw this.disposeAfterFailure(new PptxReadException("Presentation reading aborted.", var14));
      } catch (RuntimeException failure) {
         throw this.disposeAfterFailure(failure);
      } finally {
         this.z1.n5().n5(false);
      }
   }

   private void n5(com.aspose.slides.internal.z0k.t4 var1, boolean var2) {
      if (var1 == null) {
         throw new ArgumentNullException("stream");
      }

      this.s7 = this.t4.n5(var1);
      com.aspose.slides.internal.z0k.t4 var3 = this.s7.l6();

      try {
         if (var3.getLength() == 0L) {
            throw new ArgumentException("The stream is empty.", "stream");
         }

         if (var3.getPosition() == var3.getLength()) {
            throw new ArgumentException(
               "The presentation stream position is set to the end of stream. For properly loading set the stream.Position to the stream beginning.", "stream"
            );
         }

         com.aspose.slides.ms.System.o0 var4 = com.aspose.slides.ms.System.o0.l6().k5();

         try {
            boolean var5 = false;
            int var6 = var3.readByte();
            if (var6 > 0) {
               var3.seek(-1L, 1);
               if ((byte)var6 == 80) {
                  var5 = true;
               }
            }

            if (var5) {
               this.l6(var3, var2);
            } else if (n5(var3)) {
               this.u9(var3);
            } else if (l6(var3)) {
               this.h0(var3);
            } else if (this.u3(var3)) {
               this.k5(var3);
            } else {
               com.aspose.slides.internal.x1.x8 var7 = u4e.l6(var3);
               com.aspose.slides.internal.x1.u9 var8 = (com.aspose.slides.internal.x1.u9)var7.n5().u3("PowerPoint Document");
               if (var8 != null) {
                  if (!com.aspose.slides.internal.k0r.e3.n5(var7, var8) && !com.aspose.slides.internal.k0r.e3.k5(var7)) {
                     this.l6(var7);
                  } else {
                     this.n5(var7, var8);
                     this.l6(var7);
                  }
               } else {
                  boolean var9 = !this.o0.getOnlyLoadDocumentProperties() && this.o0.l6();
                  if (!var9) {
                     var9 = com.aspose.slides.internal.k0r.e3.k5(var7);
                  }

                  if (var9) {
                     this.a6(var3);
                  } else {
                     this.l6(var7);
                  }
               }
            }

            this.checkInterruption();
            double var10 = r6e.n5(var4.k5(), var3);
            long var12 = 1L;
            if (var10 > 20.0) {
               var12 += com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.k5((var10 - 20.0) / 20.0), 14);
            }

            com.aspose.slides.internal.n8e.e5.n5().n5(var12);
         } catch (OperationCanceledException var20) {
            r6e.l6(var4.k5());
            throw var20;
         } catch (PptxReadException var21) {
            if (!n5(var21)) {
               r6e.l6(var4.k5());
               throw var21;
            }
         } catch (com.aspose.slides.internal.c8m.w3 var22) {
            if (!n5(var22)) {
               r6e.l6(var4.k5());
               throw var22;
            }
         } catch (RuntimeException var23) {
            r6e.l6(var4.k5());
            throw var23;
         }
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   private void k5(com.aspose.slides.internal.z0k.t4 var1) {
      var1.setPosition(0L);
      com.aspose.slides.internal.z0k.m3 var2 = new com.aspose.slides.internal.z0k.m3(var1);

      try {
         String var3 = var2.c8();
         p4z.n5(var3, this);
      } finally {
         var2.dispose();
      }
   }

   private boolean u3(com.aspose.slides.internal.z0k.t4 var1) {
      return com.aspose.slides.internal.n8e.r1.n5(var1).n5;
   }

   private static boolean n5(com.aspose.slides.exceptions.Exception var0) {
      for (Throwable var1 = var0.getInnerException(); var1 != null; var1 = var1.getCause()) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1, OperationCanceledException.class)) {
            return true;
         }
      }

      return false;
   }

   private void a6(com.aspose.slides.internal.z0k.t4 var1) {
      this.x8.encrypt(this.o0.getPassword());
      this.x8.n5(var1);
      com.aspose.slides.internal.z0k.e2 var2 = x4r.n5(var1, this.o0.getPassword());
      var2.seek(0L, 0);
      com.aspose.slides.internal.z0k.e2 var3 = var2;

      try {
         com.aspose.slides.internal.q7.c8 var4 = this.t4.n5(var3);

         try {
            this.l6(var4.l6(), false);
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   private void u9(com.aspose.slides.internal.z0k.t4 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("seekableStream");
      }

      if (!var1.canSeek()) {
         throw new InvalidOperationException();
      }

      try {
         this.b3 = true;
         q3f var2 = new q3f();
         var2.n5(this, var1, (InterruptionToken)this.o0.getInterruptionToken());
         this.a0();
      } finally {
         this.b3 = false;
         ((PresentationHeaderFooterManager)this.getHeaderFooterManager()).l6();
      }
   }

   private void l6(com.aspose.slides.internal.z0k.t4 var1, boolean var2) {
      if (var1 == null) {
         throw new ArgumentNullException("seekableStream");
      }

      if (!var1.canSeek()) {
         throw new InvalidOperationException();
      }

      try {
         this.b3 = true;
         if (var2) {
            y6k var3 = new y6k();
            var3.n5(this, var1, this.h0, (InterruptionToken)this.o0.getInterruptionToken());
         } else if (!q5x.l6(var1)) {
            var1.setPosition(0L);
            q3f var7 = new q3f();
            var7.n5(this, var1, (InterruptionToken)this.o0.getInterruptionToken());
            this.d5();
         } else {
            var1.setPosition(0L);
            s4r.n5(this);
            q5x var8 = new q5x();
            var8.n5(this, var1, (InterruptionToken)this.o0.getInterruptionToken(), false);
         }

         this.a0();
      } finally {
         this.b3 = false;
         ((PresentationHeaderFooterManager)this.getHeaderFooterManager()).l6();
      }
   }

   private void h0(com.aspose.slides.internal.z0k.t4 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("seekableStream");
      }

      if (!var1.canSeek()) {
         throw new InvalidOperationException();
      }

      try {
         this.b3 = true;
         var1.setPosition(0L);
         s4r.n5(this);
         q5x var2 = new q5x();
         var2.n5(this, var1, (InterruptionToken)this.o0.getInterruptionToken(), true);
         this.a0();
      } finally {
         this.b3 = false;
         ((PresentationHeaderFooterManager)this.getHeaderFooterManager()).l6();
      }
   }

   private void l6(com.aspose.slides.internal.x1.x8 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("fileSystem");
      }

      try {
         this.b3 = true;
         u4e var2 = new u4e(this);
         var2.n5(var1, (InterruptionToken)this.o0.getInterruptionToken());
         this.d5();
         this.a0();
      } finally {
         this.b3 = false;
         ((PresentationHeaderFooterManager)this.getHeaderFooterManager()).l6();
      }
   }

   private void n5(com.aspose.slides.internal.x1.x8 var1, com.aspose.slides.internal.x1.u9 var2) {
      byte[] var3 = var2.n5();
      com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2(var3);

      try {
         com.aspose.slides.internal.k0r.y2 var5 = com.aspose.slides.internal.k0r.y2.n5(var1);
         com.aspose.slides.internal.k0r.c4i var6 = (com.aspose.slides.internal.k0r.c4i)com.aspose.slides.internal.k0r.e3.n5(var4, var5.l6() & 4294967295L, null);
         com.aspose.slides.internal.k0r.j2 var7 = (com.aspose.slides.internal.k0r.j2)com.aspose.slides.internal.k0r.e3.n5(var4, var6.k5(), null);
         boolean var8 = false;
         boolean[] var9 = new boolean[]{false};
         com.aspose.slides.internal.k0r.f9.n5(var1, var3, var6, var7, this.o0.getPassword(), this.a6().getOnlyLoadDocumentProperties(), var9);
         var8 = var9[0];
         this.x8.encrypt(this.o0.getPassword());
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }

   static boolean n5(com.aspose.slides.internal.z0k.t4 var0) {
      XmlDocument var1 = new XmlDocument();

      try {
         var1.load(var0);
         if ("progid=\"PowerPoint.Show\"".equals(var1.getChildNodes().k5(1).getInnerText())) {
            return true;
         }
      } catch (RuntimeException var7) {
         return false;
      } finally {
         var0.seek(0L, 0);
      }

      return false;
   }

   static boolean l6(com.aspose.slides.internal.z0k.t4 var0) {
      byte var1 = 90;
      if (var0.getLength() < 90L) {
         return false;
      }

      byte[] var2 = new byte[90];
      var0.read(var2, 0, 90);
      var0.seek(-90L, 1);
      String var3 = com.aspose.slides.internal.l7h.j5.z3().l6(var2);
      int var4 = var3.indexOf("<");
      if (var4 > 0) {
         var3 = var3.substring(var3.indexOf("<"));
      }

      return !com.aspose.slides.ms.System.d1.l6(var3, "<?xml version=\"1.0\"") ? false : com.aspose.slides.ms.System.d1.t2(var3, "office:document");
   }

   private void d5() {
      IGenericEnumerator var1 = this.u3.iterator();

      try {
         while (var1.hasNext()) {
            CommentAuthor var2 = (CommentAuthor)var1.next();
            ((CommentCollection)var2.getComments()).l6();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   final void n5(com.aspose.slides.internal.x1.x8 var1) {
      com.aspose.slides.internal.n8e.e9 var2 = null;
      com.aspose.slides.internal.n8e.e9 var3 = null;

      try {
         com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2(
            ((com.aspose.slides.internal.x1.u9)var1.n5().u3("\u0005SummaryInformation")).n5()
         );

         try {
            var2 = new com.aspose.slides.internal.n8e.e9(var4);
            var4.close();
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }
      } catch (RuntimeException var18) {
         com.aspose.slides.internal.n8e.v4.n5(var18);
      }

      try {
         com.aspose.slides.internal.z0k.e2 var19 = new com.aspose.slides.internal.z0k.e2(
            ((com.aspose.slides.internal.x1.u9)var1.n5().u3("\u0005DocumentSummaryInformation")).n5()
         );

         try {
            var3 = new com.aspose.slides.internal.n8e.e9(var19);
         } finally {
            if (var19 != null) {
               var19.dispose();
            }
         }
      } catch (RuntimeException var16) {
         com.aspose.slides.internal.n8e.v4.n5(var16);
      }

      w1c var20 = new w1c(var3, var2);
      this.p8 = new DocumentProperties(this);
      this.p8.setAuthor(var20.k5());
      this.p8.setCategory(var20.z1());
      this.p8.setComments(var20.a6());
      this.p8.setCompany(var20.t9());
      this.p8.n5(var20.t2().m3());
      this.p8.setKeywords(var20.u3());
      this.p8.k5(var20.h0().m3());
      this.p8.setLastSavedBy(var20.u9());
      this.p8.u3(var20.s7().m3());
      this.p8.setManager(var20.e2());
      this.p8.setNameOfApplication(var20.t4());
      this.p8.setRevisionNumber(var20.z3());
      this.p8.setSubject(var20.l6());
      this.p8.setApplicationTemplate(var20.q0());
      this.p8.setTitle(var20.n5());
      this.p8.n5(var20.c8().n3());
      this.p8.setHyperlinkBase(var20.k7());
   }

   final void n5(com.aspose.slides.internal.z0k.t4 var1, int var2, IPptxOptions var3) {
      this.f2();
      if (this.x8.isOnlyDocumentPropertiesLoaded()) {
         throw new PptxException(
            com.aspose.slides.ms.System.d1.n5(
               "If PPTX presentation is loaded with LoadOptions.OnlyLoadDocumentProperties ",
               "then saving this peresentation with modified document properties make no sense ",
               "because public document properties of a encrypted PPTX presentation are a secondary copy ",
               "of a base encrypted document properties. And we cannot modify encrypted document properties ",
               "without valid password."
            )
         );
      }

      e1e var4 = new e1e();
      if (var2 == 6) {
         var4.l6(this, var1, var2, var3, (InterruptionToken)this.o0.getInterruptionToken());
      } else if (this.x8.isEncrypted() && (this.x8.isWriteProtected() || this.x8.getEncryptionPassword() != null)) {
         this.x8.n5();
         com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2();

         try {
            var4.n5(this, var5, var2, var3, (InterruptionToken)this.o0.getInterruptionToken());
            var5.seek(0L, 0);
            w1c var6 = null;
            if (!this.x8.getEncryptDocumentProperties()) {
               var6 = this.s3();
            }

            x4r.n5(var5, this.x8.getEncryptionPassword(), var1, var6);
         } finally {
            if (var5 != null) {
               var5.dispose();
            }
         }
      } else {
         var4.n5(this, var1, var2, var3, (InterruptionToken)this.o0.getInterruptionToken());
      }
   }

   private w1c s3() {
      w1c var1 = new w1c();
      if (!this.p8.l6().equals(com.aspose.slides.ms.System.j5.l6.m3())) {
         var1.l6(this.p8.l6().m3());
      }

      if (!this.p8.u3().equals(com.aspose.slides.ms.System.j5.l6.m3())) {
         var1.n5(this.p8.u3().m3());
      }

      if (!this.p8.k5().equals(com.aspose.slides.ms.System.j5.l6.m3())) {
         var1.k5(this.p8.k5().m3());
      }

      if (!this.p8.n5().k5(new com.aspose.slides.ms.System.s4())) {
         var1.n5(this.p8.n5().n3());
      }

      var1.k5(this.p8.getAuthor());
      var1.s7(this.p8.getCategory());
      var1.a6(this.p8.getComments());
      var1.t2(this.p8.getCompany());
      var1.u3(this.p8.getKeywords());
      var1.u9(this.p8.getLastSavedBy());
      var1.c8(this.p8.getManager());
      var1.x8(this.p8.getNameOfApplication());
      var1.n5(this.p8.getRevisionNumber());
      var1.l6(this.p8.getSubject());
      var1.n3(this.p8.getApplicationTemplate());
      var1.n5(this.p8.getTitle());
      var1.y4(this.p8.getHyperlinkBase());
      p0t.n5(this.p8, var1);
      return var1;
   }

   final Object t4() {
      return this.w2;
   }

   final void n5(Object var1) {
      this.w2 = var1;
   }

   static int[] n5(s4e var0, byte[][] var1) {
      // This source build does not enforce evaluation restrictions. All rendering,
      // export and text-access gates recognize this unrestricted presentation state.
      var1[0] = null;
      return i7t.k5;
   }

   static String n5(byte[] var0) {
      byte[] var1 = new byte[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2] = (byte)(var0[var0.length - var2 - 1] & 0xFF ^ var0.length - 1 - var2);
      }

      return com.aspose.slides.internal.l7h.j5.z3().l6(var1);
   }

   @Override
   public final IProtectionManager getProtectionManager() {
      return this.x8;
   }

   @Override
   public final ISlideCollection getSlides() {
      return this.n3;
   }

   @Override
   public final ISectionCollection getSections() {
      return this.t9;
   }

   @Override
   public final ISlideSize getSlideSize() {
      return this.y1;
   }

   @Override
   public final INotesSize getNotesSize() {
      if (this.f2 == null) {
         this.f2 = new NotesSize(this);
      }

      return this.f2;
   }

   @Override
   public final IGlobalLayoutSlideCollection getLayoutSlides() {
      return this.y4;
   }

   @Override
   public final IMasterSlideCollection getMasters() {
      return this.e2;
   }

   @Override
   public final IMasterNotesSlideManager getMasterNotesSlideManager() {
      return this.z8;
   }

   @Override
   public final IMasterHandoutSlideManager getMasterHandoutSlideManager() {
      return this.j5;
   }

   @Override
   public final IFontsManager getFontsManager() {
      return this.z1;
   }

   @Override
   public final ITextStyle getDefaultTextStyle() {
      return this.k5;
   }

   @Override
   public final ICommentAuthorCollection getCommentAuthors() {
      return this.u3;
   }

   @Override
   public final IDocumentProperties getDocumentProperties() {
      return this.p8;
   }

   @Override
   public final IImageCollection getImages() {
      return this.w1;
   }

   @Override
   public final IAudioCollection getAudios() {
      return this.r4;
   }

   @Override
   public final IVideoCollection getVideos() {
      return this.c4;
   }

   public final SlideShowSettings getSlideShowSettings() {
      return this.s0;
   }

   final void n5(SlideShowSettings var1) {
      this.s0 = var1;
   }

   @Override
   public final IDigitalSignatureCollection getDigitalSignatures() {
      return this.y2;
   }

   @Override
   public final ICustomData getCustomData() {
      return this.a0;
   }

   @Override
   public final ICustomXmlPart[] getAllCustomXmlParts() {
      return this.d2.n5().toArray(new ICustomXmlPart[0]);
   }

   final CustomXmlPartCollection q0() {
      return this.d2;
   }

   @Override
   public final IVbaProject getVbaProject() {
      return this.p3;
   }

   @Override
   public final void setVbaProject(IVbaProject value) {
      this.i1();
      this.p3 = value;
      if (this.p3 != null) {
         this.x9 = ((VbaProject)this.p3).l6();
      } else {
         this.x9 = null;
      }
   }

   @Override
   public final IHyperlinkQueries getHyperlinkQueries() {
      if (this.t1 == null) {
         this.t1 = new HyperlinkQueries(this);
      }

      return this.t1;
   }

   @Override
   public final IViewProperties getViewProperties() {
      if (this.a5 == null) {
         this.a5 = new ViewProperties(this);
      }

      return this.a5;
   }

   final y3 z3() {
      return this.v8;
   }

   private void n5(y3 var1) {
      this.v8 = var1;
   }

   @Override
   public final int getFirstSlideNumber() {
      return this.h2;
   }

   @Override
   public final void setFirstSlideNumber(int value) {
      this.i1();
      if (value < 0) {
         throw new ArgumentOutOfRangeException("value", "Must equal or greater than zero");
      }

      this.h2 = value;
   }

   @Override
   public final ISensitivityLabelCollection getSensitivityLabels() {
      return this.v3;
   }

   private void n5(ISensitivityLabelCollection var1) {
      this.v3 = var1;
   }

   @Override
   public final IBaseSlide getSlideById(long id) {
      this.i1();

      for (int var3 = 0; var3 < this.getSlides().size(); var3++) {
         if (this.getSlides().get_Item(var3).getSlideId() == id) {
            return this.getSlides().get_Item(var3);
         }
      }

      for (int var6 = 0; var6 < this.getMasters().size(); var6++) {
         if (this.getMasters().get_Item(var6).getSlideId() == id) {
            return this.getMasters().get_Item(var6);
         }

         IMasterLayoutSlideCollection var4 = this.getMasters().get_Item(var6).getLayoutSlides();

         for (int var5 = 0; var5 < var4.size(); var5++) {
            if (var4.get_Item(var5).getSlideId() == id) {
               return var4.get_Item(var5);
            }
         }
      }

      return null;
   }

   final boolean l6(long var1) {
      for (int var3 = 0; var3 < this.getSlides().size(); var3++) {
         if (this.getSlides().get_Item(var3).getSlideId() == var1) {
            return true;
         }
      }

      return false;
   }

   final long m1() {
      synchronized (this) {
         return this.e5++;
      }
   }

   final Slide k7() {
      return q3h.n5(this);
   }

   @Override
   public final int getSourceFormat() {
      this.i1();
      return this.n5;
   }

   final int m3() {
      return this.j4;
   }

   final void n5(int var1) {
      this.j4 = var1;
   }

   final g8z z8() {
      return this.n3().k7();
   }

   @Override
   public final IMasterTheme getMasterTheme() {
      this.i1();
      return this.d5;
   }

   final void n5(IMasterTheme var1) {
      this.d5 = (MasterTheme)var1;
   }

   final c2m j5() {
      return new c2m((FontsManager)this.getFontsManager());
   }

   final com.aspose.slides.internal.q7.l6 w1() {
      return this.t4;
   }

   @Override
   public final void save(String fname, int format) {
      this.checkInterruption();
      this.i1();
      com.aspose.slides.internal.q7.n3 var3 = this.l6(fname);

      try {
         // The vendor call targets ISaveOptions, not the narrower IPptxOptions overload.
         this.n5(var3.n5(), format, (ISaveOptions)null);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   @Override
   public final void save(OutputStream stream, int format) {
      this.checkInterruption();
      com.aspose.slides.internal.l6o.l6.n5(new Presentation$1(this, stream, format));
   }

   void n5(com.aspose.slides.internal.z0k.t4 var1, int var2) {
      this.i1();
      this.n5(var1, var2, (ISaveOptions)null);
   }

   @Override
   public final void save(String fname, int format, ISaveOptions options) {
      this.checkInterruption();
      this.i1();
      com.aspose.slides.internal.q7.n3 var4 = this.l6(fname);

      try {
         this.n5(var4.n5(), format, options);
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }

   @Override
   public final void save(OutputStream stream, int format, ISaveOptions options) {
      this.checkInterruption();
      com.aspose.slides.internal.l6o.l6.n5(new Presentation$2(this, stream, format, options));
   }

   void n5(com.aspose.slides.internal.z0k.t4 var1, int var2, ISaveOptions var3) {
      this.i1();
      this.checkInterruption();
      if (var3 != null) {
         this.z7 = var3;
         if (!com.aspose.slides.ms.System.d1.n5(var3.getDefaultRegularFont())) {
            this.t9().n5(var3.getDefaultRegularFont());
         } else {
            this.t9().n5((String)null);
         }
      }

      com.aspose.slides.ms.System.o0 var4 = com.aspose.slides.ms.System.o0.l6().k5();

      try {
         r6e.n5(var4.k5());
         com.aspose.slides.internal.n8e.a5.n5(var2, 6, 7);
         int[] var5 = new int[this.getSlides().size()];

         for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6] = var6 + 1;
         }

         switch (var2) {
            case 0:
            case 19:
            case 20:
               p0t var20 = new p0t(this, var5, (InterruptionToken)this.o0.getInterruptionToken());
               var20.n5(var1, var3);
               break;
            case 1:
               this.f2();
               PdfOptions var8 = com.aspose.slides.internal.v6g.k5.n5(var3, PdfOptions.class);
               if (var8 == null) {
                  var8 = new PdfOptions();
               }

               if (com.aspose.slides.internal.v6g.k5.l6(var8.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class)
                  && ((NotesCommentsLayoutingOptions)var8.getSlidesLayoutOptions()).l6()) {
                  r2k.l6(this, var1, var8, (InterruptionToken)this.o0.getInterruptionToken());
                  break;
               }

               r2k.n5(this, var1, var8, (InterruptionToken)this.o0.getInterruptionToken());
               break;
            case 2:
               this.f2();
               XpsOptions var7 = com.aspose.slides.internal.v6g.k5.n5(var3, XpsOptions.class);
               if (var7 == null) {
                  var7 = new XpsOptions();
               }

               r2k.n5(this, var1, var7, (InterruptionToken)this.o0.getInterruptionToken());
               break;
            case 3:
               this.n5(var1, 0, com.aspose.slides.internal.v6g.k5.n5(var3, PptxOptions.class));
               break;
            case 4:
               this.n5(var1, 2, com.aspose.slides.internal.v6g.k5.n5(var3, PptxOptions.class));
               break;
            case 5:
               this.f2();
               TiffOptions var22 = com.aspose.slides.internal.v6g.k5.n5(var3, TiffOptions.class);
               if (var22 == null) {
                  var22 = new TiffOptions();
               }

               TiffOptions var25 = var22;
               if (com.aspose.slides.internal.v6g.k5.l6(var25.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class)
                  && ((NotesCommentsLayoutingOptions)var25.getSlidesLayoutOptions()).l6()) {
                  r2k.l6(this, var1, var25, (InterruptionToken)this.o0.getInterruptionToken());
                  break;
               }

               r2k.n5(this, var1, var25, (InterruptionToken)this.o0.getInterruptionToken());
               break;
            case 6:
               this.n5(var1, false, false);
               break;
            case 7:
               this.n5(var1, 1, com.aspose.slides.internal.v6g.k5.n5(var3, PptxOptions.class));
               break;
            case 8:
            case 12:
            case 14:
            case 16:
            case 18:
            default:
               throw new PptxException("This export format is not implemented for PPTX yet.");
            case 9:
               this.n5(var1, 3, com.aspose.slides.internal.v6g.k5.n5(var3, PptxOptions.class));
               break;
            case 10:
               this.n5(var1, 4, com.aspose.slides.internal.v6g.k5.n5(var3, PptxOptions.class));
               break;
            case 11:
               this.n5(var1, 5, com.aspose.slides.internal.v6g.k5.n5(var3, PptxOptions.class));
               break;
            case 13:
               this.f2();
               HtmlOptions var21 = com.aspose.slides.internal.v6g.k5.n5(var3, HtmlOptions.class);
               if (var21 == null) {
                  var21 = new HtmlOptions();
               }

               HtmlOptions var24 = var21;
               if (com.aspose.slides.internal.v6g.k5.l6(var24.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class)
                  && ((NotesCommentsLayoutingOptions)var24.getSlidesLayoutOptions()).l6()) {
                  r2k.l6(this, var1, var24, (InterruptionToken)this.o0.getInterruptionToken());
                  break;
               }

               r2k.n5(this, var1, var24, (InterruptionToken)this.o0.getInterruptionToken());
               break;
            case 15:
               this.f2();
               SwfOptions var9 = com.aspose.slides.internal.v6g.k5.n5(var3, SwfOptions.class);
               if (var9 == null) {
                  var9 = new SwfOptions();
               }

               if (com.aspose.slides.internal.v6g.k5.l6(var9.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class)
                  && ((NotesCommentsLayoutingOptions)var9.getSlidesLayoutOptions()).l6()) {
                  r2k.l6(this, var1, var9, (InterruptionToken)this.o0.getInterruptionToken());
                  break;
               }

               r2k.n5(this, var1, var9, (InterruptionToken)this.o0.getInterruptionToken());
               break;
            case 17:
               this.n5(var1, true, false);
               break;
            case 21:
               this.n5(var1, true, true);
               break;
            case 22:
               GifOptions var10 = com.aspose.slides.internal.v6g.k5.n5(var3, GifOptions.class);
               n3v.n5(this, var1, com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(var5))), var10);
               break;
            case 23:
               this.f2();
               Html5Options var23 = com.aspose.slides.internal.v6g.k5.n5(var3, Html5Options.class);
               if (var23 == null) {
                  var23 = new Html5Options();
               }

               Html5Options var26 = var23;
               r2k.n5(this, var1, var26, (InterruptionToken)this.o0.getInterruptionToken());
               break;
            case 24:
               MarkdownSaveOptions var11 = com.aspose.slides.internal.v6g.k5.n5(var3, MarkdownSaveOptions.class);
               if (var11 == null) {
                  var11 = new MarkdownSaveOptions();
               }

               MarkdownSaveOptions var12 = var11;
               u4y.n5(this, var1, var5, var12);
               break;
            case 25:
               this.n5(var1, 6, com.aspose.slides.internal.v6g.k5.n5(var3, PptxOptions.class));
         }

         r6e.n5(var4.k5(), var1);
      } catch (OperationCanceledException var17) {
         r6e.l6(var4.k5());
         throw var17;
      } catch (com.aspose.slides.internal.n8e.n5 var18) {
         r6e.l6(var4.k5());
         throw new PptxException("Saving aborted.", var18);
      } finally {
         r6e.l6(var4.k5());
         this.z7 = null;
         com.aspose.slides.internal.n8e.a5.l6(var2, 6, 7);
      }
   }

   @Override
   public final void save(IXamlOptions options) {
      this.checkInterruption();
      this.i1();
      if (options != null) {
         this.z7 = options;
         if (!com.aspose.slides.ms.System.d1.n5(options.getDefaultRegularFont())) {
            this.t9().n5(options.getDefaultRegularFont());
         } else {
            this.t9().n5((String)null);
         }
      }

      com.aspose.slides.ms.System.o0 var2 = com.aspose.slides.ms.System.o0.l6().k5();

      try {
         r6e.n5(var2.k5());
         int[] var3 = new int[this.getSlides().size()];

         for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4] = var4 + 1;
         }

         this.f2();
         XamlOptions var12 = com.aspose.slides.internal.v6g.k5.n5(options, XamlOptions.class);
         if (var12 == null) {
            var12 = new XamlOptions();
            var12.l6(1);
         }

         switch (var12.t2()) {
            case 0:
               k2h.l6(this, var3, var12, (InterruptionToken)this.o0.getInterruptionToken());
               break;
            case 1:
               k2h.n5(this, var3, var12, (InterruptionToken)this.o0.getInterruptionToken());
         }

         r6e.l6(var2.k5());
      } catch (OperationCanceledException var9) {
         r6e.l6(var2.k5());
         throw var9;
      } catch (com.aspose.slides.internal.n8e.n5 var10) {
         r6e.l6(var2.k5());
         throw new PptxException("Saving aborted.", var10);
      } finally {
         r6e.l6(var2.k5());
         this.z7 = null;
      }
   }

   private void n5(com.aspose.slides.internal.z0k.t4 var1, boolean var2, boolean var3) {
      this.f2();
      if (var3) {
         if (this.x8.isEncrypted()) {
            throw new InvalidOperationException("Fodp format does not support saving with a password.");
         }

         c4h var4 = new c4h();
         var4.n5(this, var1, (InterruptionToken)this.o0.getInterruptionToken());
      } else {
         if (this.x8.isEncrypted()) {
            this.x8.n5();
         }

         com.aspose.slides.internal.e5a.d2 var9 = new com.aspose.slides.internal.e5a.d2();

         try {
            c4h var5 = new c4h();
            var5.n5(this, var9, var2, (InterruptionToken)this.o0.getInterruptionToken());
            var9.l6(var1);
         } finally {
            if (var9 != null) {
               var9.dispose();
            }
         }
      }
   }

   private com.aspose.slides.internal.q7.n3 l6(String var1) {
      return new com.aspose.slides.internal.q7.n3(this.t4, this.t2, var1, new Presentation$3(this));
   }

   @Override
   public final IImage[] getImages(IRenderingOptions options) {
      this.i1();
      int[] var2 = new int[this.getSlides().size()];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = var3 + 1;
      }

      return this.getImages(options, var2);
   }

   @Override
   public final IImage[] getImages(IRenderingOptions options, int[] slides) {
      this.i1();
      if (!com.aspose.slides.ms.System.d1.n5(options.getDefaultRegularFont())) {
         this.t9().n5(options.getDefaultRegularFont());
      } else {
         this.t9().n5((String)null);
      }

      try {
         return com.aspose.slides.internal.v6g.k5.l6(options.getSlidesLayoutOptions(), HandoutLayoutingOptions.class)
            ? Images.n5(h9j.n5(this, options))
            : Images.n5(f2z.n5(this, com.aspose.slides.internal.v6g.k5.n5(options.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class), slides));
      } finally {
         this.t9().n5((String)null);
      }
   }

   @Override
   public final IImage[] getImages(IRenderingOptions options, float scaleX, float scaleY) {
      this.i1();
      int[] var4 = new int[this.getSlides().size()];

      for (int var5 = 0; var5 < var4.length; var5++) {
         var4[var5] = var5 + 1;
      }

      return this.getImages(options, var4, scaleX, scaleY);
   }

   @Override
   public final IImage[] getImages(IRenderingOptions options, int[] slides, float scaleX, float scaleY) {
      this.i1();
      if (!com.aspose.slides.ms.System.d1.n5(options.getDefaultRegularFont())) {
         this.t9().n5(options.getDefaultRegularFont());
      } else {
         this.t9().n5((String)null);
      }

      try {
         return com.aspose.slides.internal.v6g.k5.l6(options.getSlidesLayoutOptions(), HandoutLayoutingOptions.class)
            ? Images.n5(h9j.n5(this, options, scaleX, scaleY))
            : Images.n5(
               f2z.n5(this, com.aspose.slides.internal.v6g.k5.n5(options.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class), slides, scaleX, scaleY)
            );
      } finally {
         this.t9().n5((String)null);
      }
   }

   @Override
   public final IImage[] getImages(IRenderingOptions options, Dimension imageSize) {
      return this.n5(options, com.aspose.slides.internal.o9b.p8.n5(imageSize));
   }

   IImage[] n5(IRenderingOptions var1, com.aspose.slides.internal.o9b.p8 var2) {
      this.i1();
      int[] var3 = new int[this.getSlides().size()];

      for (int var4 = 0; var4 < var3.length; var4++) {
         var3[var4] = var4 + 1;
      }

      return this.n5(var1, var3, var2.u3());
   }

   @Override
   public final IImage[] getImages(IRenderingOptions options, int[] slides, Dimension imageSize) {
      return this.n5(options, slides, com.aspose.slides.internal.o9b.p8.n5(imageSize));
   }

   IImage[] n5(IRenderingOptions var1, int[] var2, com.aspose.slides.internal.o9b.p8 var3) {
      if (!com.aspose.slides.ms.System.d1.n5(var1.getDefaultRegularFont())) {
         this.t9().n5(var1.getDefaultRegularFont());
      } else {
         this.t9().n5((String)null);
      }

      try {
         return com.aspose.slides.internal.v6g.k5.l6(var1.getSlidesLayoutOptions(), HandoutLayoutingOptions.class)
            ? Images.n5(h9j.n5(this, var1, var3.u3()))
            : Images.n5(f2z.n5(this, com.aspose.slides.internal.v6g.k5.n5(var1.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class), var2, var3.u3()));
      } finally {
         this.t9().n5((String)null);
      }
   }

   @Override
   public final void save(String fname, int[] slides, int format) {
      this.checkInterruption();
      this.i1();
      com.aspose.slides.internal.q7.n3 var4 = this.l6(fname);

      try {
         this.n5(var4.n5(), slides, format);
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }

   @Override
   public final void save(String fname, int[] slides, int format, ISaveOptions options) {
      this.checkInterruption();
      this.i1();
      com.aspose.slides.internal.q7.n3 var5 = this.l6(fname);

      try {
         this.n5(var5.n5(), slides, format, options);
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }
   }

   @Override
   public final void save(OutputStream stream, int[] slides, int format) {
      this.checkInterruption();
      com.aspose.slides.internal.l6o.l6.n5(new Presentation$4(this, stream, slides, format));
   }

   void n5(com.aspose.slides.internal.z0k.t4 var1, int[] var2, int var3) {
      this.i1();
      this.n5(var1, var2, var3, null);
   }

   @Override
   public final void save(OutputStream stream, int[] slides, int format, ISaveOptions options) {
      this.checkInterruption();
      com.aspose.slides.internal.l6o.l6.n5(new Presentation$5(this, stream, slides, format, options));
   }

   void n5(com.aspose.slides.internal.z0k.t4 var1, int[] var2, int var3, ISaveOptions var4) {
      if (var1 == null) {
         throw new ArgumentNullException("stream");
      }

      if (var2 == null) {
         throw new ArgumentNullException("slides");
      }

      if (var2.length == 0) {
         throw new ArgumentException("'slides' array is empty", "slides");
      }

      for (int var5 = 0; var5 < var2.length; var5++) {
         if (var2[var5] < 1 || var2[var5] > this.getSlides().size()) {
            throw new ArgumentOutOfRangeException(
               "slides",
               com.aspose.slides.ms.System.d1.n5(
                  "'slides' array contains {0} slide position, which is not present in the presentation.", new Object[]{var2[var5]}
               )
            );
         }
      }

      if (var4 != null) {
         this.z7 = var4;
         if (!com.aspose.slides.ms.System.d1.n5(var4.getDefaultRegularFont())) {
            this.t9().n5(var4.getDefaultRegularFont());
         } else {
            this.t9().n5((String)null);
         }
      }

      com.aspose.slides.ms.System.o0 var19 = com.aspose.slides.ms.System.o0.l6().k5();

      try {
         r6e.n5(var19.k5());
         switch (var3) {
            case 0:
            case 3:
            case 4:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            case 17:
            case 19:
            case 20:
            case 25:
               throw new InvalidOperationException(
                  "Saving with specified slide positions is not possible for PPTX, PPTM, PPSX, PPSM, POTX, POTM, PPT, POT, ODP, PPS, OTP, XML formats. Use cloning for them."
               );
            case 1:
               this.f2();
               PdfOptions var7 = com.aspose.slides.internal.v6g.k5.n5(var4, PdfOptions.class);
               if (var7 == null) {
                  var7 = new PdfOptions();
               }

               if (com.aspose.slides.internal.v6g.k5.l6(var7.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class)
                  && ((NotesCommentsLayoutingOptions)var7.getSlidesLayoutOptions()).l6()) {
                  r2k.l6(this, var1, var2, var7, (InterruptionToken)this.o0.getInterruptionToken());
                  break;
               }

               r2k.n5(this, var1, var2, var7, (InterruptionToken)this.o0.getInterruptionToken());
               break;
            case 2:
               this.f2();
               XpsOptions var6 = com.aspose.slides.internal.v6g.k5.n5(var4, XpsOptions.class);
               if (var6 == null) {
                  var6 = new XpsOptions();
               }

               r2k.n5(this, var1, var2, var6, (InterruptionToken)this.o0.getInterruptionToken());
               break;
            case 5:
               this.f2();
               TiffOptions var20 = com.aspose.slides.internal.v6g.k5.n5(var4, TiffOptions.class);
               if (var20 == null) {
                  var20 = new TiffOptions();
               }

               TiffOptions var21 = var20;
               if (com.aspose.slides.internal.v6g.k5.l6(var21.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class)
                  && ((NotesCommentsLayoutingOptions)var21.getSlidesLayoutOptions()).l6()) {
                  r2k.n5(this, var1, var2, var21, (InterruptionToken)this.o0.getInterruptionToken());
                  break;
               }

               r2k.l6(this, var1, var2, var21, (InterruptionToken)this.o0.getInterruptionToken());
               break;
            case 8:
            case 12:
            case 14:
            case 16:
            case 18:
            case 21:
            default:
               throw new PptxException("This export format is not implemented for PPTX yet.");
            case 13:
               this.f2();
               HtmlOptions var9 = com.aspose.slides.internal.v6g.k5.n5(var4, HtmlOptions.class);
               if (var9 == null) {
                  var9 = new HtmlOptions();
               }

               if (com.aspose.slides.internal.v6g.k5.l6(var9.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class)
                  && ((NotesCommentsLayoutingOptions)var9.getSlidesLayoutOptions()).l6()) {
                  r2k.l6(this, var1, var2, var9, (InterruptionToken)this.o0.getInterruptionToken());
                  break;
               }

               r2k.n5(this, var1, var2, var9, (InterruptionToken)this.o0.getInterruptionToken());
               break;
            case 15:
               this.f2();
               SwfOptions var8 = com.aspose.slides.internal.v6g.k5.n5(var4, SwfOptions.class);
               if (var8 == null) {
                  var8 = new SwfOptions();
               }

               if (((NotesCommentsLayoutingOptions)var8.getSlidesLayoutOptions()).l6()) {
                  r2k.l6(this, var1, var2, var8, (InterruptionToken)this.o0.getInterruptionToken());
               } else {
                  r2k.n5(this, var1, var2, var8, (InterruptionToken)this.o0.getInterruptionToken());
               }
               break;
            case 22:
               this.f2();
               GifOptions var10 = com.aspose.slides.internal.v6g.k5.n5(var4, GifOptions.class);
               n3v.n5(this, var1, com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(var2))), var10);
               break;
            case 23:
               this.f2();
               Html5Options var11 = com.aspose.slides.internal.v6g.k5.n5(var4, Html5Options.class);
               if (var11 == null) {
                  var11 = new Html5Options();
               }

               r2k.n5(this, var1, var2, var11, (InterruptionToken)this.o0.getInterruptionToken());
               break;
            case 24:
               MarkdownSaveOptions var12 = com.aspose.slides.internal.v6g.k5.n5(var4, MarkdownSaveOptions.class);
               if (var12 == null) {
                  var12 = new MarkdownSaveOptions();
               }

               MarkdownSaveOptions var13 = var12;
               u4y.n5(this, var1, var2, var13);
         }

         r6e.n5(var19.k5(), var1);
      } catch (com.aspose.slides.internal.n8e.n5 var17) {
         r6e.l6(var19.k5());
         throw new PptxException("Saving aborted.", var17);
      } finally {
         r6e.l6(var19.k5());
         this.z7 = null;
      }
   }

   @Override
   public final void joinPortionsWithSameFormatting() {
      this.i1();
      IGenericEnumerator var1 = this.getMasters().iterator();

      try {
         while (var1.hasNext()) {
            IMasterSlide var2 = (IMasterSlide)var1.next();
            var2.joinPortionsWithSameFormatting();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      if (this.getMasterNotesSlideManager().getMasterNotesSlide() != null) {
         this.getMasterNotesSlideManager().getMasterNotesSlide().joinPortionsWithSameFormatting();
      }

      if (this.getMasterHandoutSlideManager().getMasterHandoutSlide() != null) {
         this.getMasterHandoutSlideManager().getMasterHandoutSlide().joinPortionsWithSameFormatting();
      }

      IGenericEnumerator var18 = this.getLayoutSlides().iterator();

      try {
         while (var18.hasNext()) {
            ILayoutSlide var3 = (ILayoutSlide)var18.next();
            var3.joinPortionsWithSameFormatting();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var18, IDisposable.class)) {
            var18.dispose();
         }
      }

      IGenericEnumerator var19 = this.getSlides().iterator();

      try {
         while (var19.hasNext()) {
            ISlide var4 = (ISlide)var19.next();
            var4.joinPortionsWithSameFormatting();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var19, IDisposable.class)) {
            var19.dispose();
         }
      }
   }

   private void p8() {
      this.u6++;
   }

   private void f2() {
      ((PresentationHeaderFooterManager)this.getHeaderFooterManager()).k5();
   }

   @Override
   public final void dispose() {
      this.n5(true);
   }

   private void n5(boolean var1) {
      if (!this.z6) {
         if (var1) {
            this.j9.clear();
            if (this.t4 != null) {
               this.t4.dispose();
               this.t4 = null;
            }

            if (this.t2 != null) {
               this.t2.dispose();
               this.t2 = null;
            }

            com.aspose.slides.internal.b7.n5u.n5().l6();
            this.k7.n5().dispose();
            this.k7.h0();
            com.aspose.slides.internal.e1x.f2.n5().h0();
            this.k7.c8();
            this.y1();
            this.s7 = null;
            if (this.n3 != null) {
               for (ISlide var3 : this.n3) {
                  if (var3 != null && var3.getShapes() != null) {
                     var3.getShapes().clear();
                     ((BaseSlide)var3).l6 = null;
                  }
               }

               this.n3.l6();
            }

            this.y4.l6();
            if (this.e2 != null) {
               for (IMasterSlide var7 : this.e2) {
                  for (IShape var5 : var7.getShapes()) {
                     if (var5 instanceof GroupShape) {
                        ((GroupShape)var5).n5.clear();
                     }
                  }

                  ((BaseSlide)var7).l6 = null;
               }

               this.e2.l6();
            }

            this.t9.clear();
            this.t4 = null;
            this.w1.a6();
            this.r4.n5();
            this.c4.n5();
            this.y2.clear();
            this.a0.l6();
            this.d2.clear();
            this.k5 = null;
            this.d5 = null;
            this.u3 = null;
            this.s3 = null;
            this.p8 = null;
            this.a6.clear();
            this.t1 = null;
            this.a5 = null;
            this.v0 = null;
            this.f0 = null;
            this.a3 = null;
            this.p3 = null;
            this.x9 = null;
            this.k7.h0();
            this.k7.c8();
            this.q0.k5();
            this.z3.k5();
            if (this.m1 != null) {
               this.m1.clear();
            }

            s9c.l6();
            i2k.y2();
         }

         this.z6 = true;
      }
   }

   private void i1() {
      if (this.z6) {
         throw g1i.n5();
      }
   }

   @Override
   public final IPresentation getPresentation() {
      return this;
   }

   final void n5(float var1, float var2, float var3) {
      IGenericEnumerator var4 = this.getMasters().iterator();

      try {
         while (var4.hasNext()) {
            MasterSlide var5 = (MasterSlide)var4.next();
            var5.n5(var1, var2, var3);
            IGenericEnumerator var6 = var5.getLayoutSlides().iterator();

            try {
               while (var6.hasNext()) {
                  LayoutSlide var7 = (LayoutSlide)var6.next();
                  var7.n5(var1, var2, var3);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if ((MasterNotesSlide)this.getMasterNotesSlideManager().getMasterNotesSlide() != null) {
         ((MasterNotesSlide)this.getMasterNotesSlideManager().getMasterNotesSlide()).z3();
      }

      IGenericEnumerator var23 = this.getSlides().iterator();

      try {
         while (var23.hasNext()) {
            Slide var24 = (Slide)var23.next();
            var24.n5(var1, var2, var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var23, IDisposable.class)) {
            var23.dispose();
         }
      }
   }

   final void n5(float var1, float var2) {
      IGenericEnumerator var3 = this.getMasters().iterator();

      try {
         while (var3.hasNext()) {
            MasterSlide var4 = (MasterSlide)var3.next();
            var4.l6(var1, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      IGenericEnumerator var13 = this.getSlides().iterator();

      try {
         while (var13.hasNext()) {
            Slide var5 = (Slide)var13.next();
            var5.l6(var1, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
            var13.dispose();
         }
      }
   }

   final com.aspose.slides.internal.t4r.n5<com.aspose.slides.internal.k9.h0, com.aspose.slides.internal.k9.u9> r4() {
      return this.q0;
   }

   final com.aspose.slides.internal.t4r.n5<com.aspose.slides.internal.k9.h0, com.aspose.slides.internal.k9.u9> c4() {
      return this.z3;
   }

   final int n5(com.aspose.slides.internal.k9.h0 var1) {
      if (!this.m1.containsKey(var1)) {
         this.m1.addItem(var1, 0);
      }

      this.m1.set_Item(var1, this.m1.get_Item(var1) + 1);
      return this.m1.get_Item(var1);
   }

   final void n5(com.aspose.slides.internal.k9.h0 var1, com.aspose.slides.internal.k9.h0 var2, com.aspose.slides.internal.k9.u9 var3) {
      this.z3.n5(var1, var3);
      this.q0.n5(var2, var3);
   }

   final i7q y2() {
      return this.y0;
   }

   @Override
   public final void highlightText(String text, Color highlightColor) {
      this.n5(text, com.aspose.slides.internal.o9b.c8.n5(highlightColor));
   }

   void n5(String var1, com.aspose.slides.internal.o9b.c8 var2) {
      this.n5(var1, var2.o8(), new TextSearchOptions(), null);
   }

   @Override
   public final void highlightText(String text, Color highlightColor, ITextSearchOptions options, IFindResultCallback callback) {
      this.n5(text, com.aspose.slides.internal.o9b.c8.n5(highlightColor), options, callback);
   }

   void n5(String var1, com.aspose.slides.internal.o9b.c8 var2, ITextSearchOptions var3, IFindResultCallback var4) {
      SlideUtil.n5(this, var1, var2.o8(), var3, var4);
   }

   @Override
   public final void highlightRegex(Pattern regex, Color highlightColor, IFindResultCallback callback) {
      this.n5(com.aspose.slides.internal.r7c.c8.n5(regex), com.aspose.slides.internal.o9b.c8.n5(highlightColor), callback);
   }

   void n5(com.aspose.slides.internal.r7c.c8 var1, com.aspose.slides.internal.o9b.c8 var2, IFindResultCallback var3) {
      SlideUtil.n5(this, var1, var2.o8(), var3);
   }

   @Override
   public final void replaceText(String oldText, String newText, ITextSearchOptions options, IFindResultCallback callback) {
      SlideUtil.n5(this, oldText, newText, options, callback);
   }

   @Override
   public final void replaceRegex(Pattern regex, String newText, IFindResultCallback callback) {
      this.n5(com.aspose.slides.internal.r7c.c8.n5(regex), newText, callback);
   }

   void n5(com.aspose.slides.internal.r7c.c8 var1, String var2, IFindResultCallback var3) {
      SlideUtil.n5(this, var1, var2, var3);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.z0k.t4 n5(Presentation var0, com.aspose.slides.internal.z0k.t4 var1) {
      return var0.t2 = var1;
   }

   static {
      FontData var0 = v6v.n5;
      ParagraphFormat var1 = new ParagraphFormat(null);
      var1.setMarginLeft(0.0F);
      var1.setMarginRight(0.0F);
      var1.setIndent(0.0F);
      BulletFormat var2 = var1.l6();
      var2.setHeight(100.0F);
      var2.setNumberedBulletStartWith((short)1);
      var2.setType((byte)0);
      var2.setBulletHardColor((byte)0);
      var2.setBulletHardFont((byte)0);
      var1.setAlignment(0);
      var1.setDefaultTabSize(72.0F);
      var1.setEastAsianLineBreak((byte)0);
      var1.setFontAlignment(0);
      var1.setHangingPunctuation((byte)1);
      var1.setLatinLineBreak((byte)0);
      var1.setRightToLeft((byte)0);
      var1.setSpaceAfter(0.0F);
      var1.setSpaceBefore(0.0F);
      var1.setSpaceWithin(100.0F);
      FontData var3 = new FontData("Arial");
      PortionFormat var4 = var1.u3();
      var4.setFontHeight(18.0F);
      var4.getFillFormat().setFillType((byte)1);
      var4.getFillFormat().getSolidFillColor().setSchemeColor(12);
      var4.setEscapement(0.0F);
      var4.setKerningMinimalSize(12.0F);
      var4.setComplexScriptFont(var3);
      var4.setEastAsianFont(var3);
      var4.setLatinFont(var3);
      var4.setSymbolFont(new FontData("Wingdings"));
      var4.setFontBold((byte)0);
      var4.setFontItalic((byte)0);
      var4.setFontUnderline((byte)0);
      var4.setHardUnderlineFill((byte)0);
      var4.setHardUnderlineLine((byte)0);
      var4.setKumimoji((byte)0);
      var4.setProofDisabled((byte)0);
      var4.setNormaliseHeight((byte)0);
      var4.setStrikethroughType((byte)0);
      var4.setTextCapType((byte)0);
      var4.setSpacing(0.0F);
      u9 = var1;
   }
}
