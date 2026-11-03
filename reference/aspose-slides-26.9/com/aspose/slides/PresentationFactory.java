package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.NullReferenceException;
import java.io.InputStream;

public class PresentationFactory implements IPresentationFactory {
   private static final PresentationFactory n5 = new PresentationFactory();

   public static PresentationFactory getInstance() {
      return n5;
   }

   @Override
   public final IPresentation createPresentation() {
      return new Presentation();
   }

   @Override
   public final IPresentation createPresentation(ILoadOptions options) {
      return new Presentation(com.aspose.slides.internal.v6g.k5.n5(options, LoadOptions.class));
   }

   @Override
   public final IPresentationInfo getPresentationInfo(String file) {
      com.aspose.slides.internal.z0k.n3 var2 = new com.aspose.slides.internal.z0k.n3(file, 3, 1);

      try {
         return this.n5(var2, new com.aspose.slides.internal.z0k.t2(file));
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   @Override
   public final IPresentationInfo getPresentationInfo(InputStream stream) {
      return this.n5(com.aspose.slides.internal.z0k.t4.fromJava(stream));
   }

   IPresentationInfo n5(com.aspose.slides.internal.z0k.t4 var1) {
      com.aspose.slides.internal.z0k.t2 var2 = null;
      com.aspose.slides.internal.z0k.t2[] var3 = new com.aspose.slides.internal.z0k.t2[]{var2};
      boolean var4 = this.n5(var1, var3);
      var2 = var3[0];
      return var4 ? this.n5(var1, var2) : this.n5(var1, (com.aspose.slides.internal.z0k.t2)null);
   }

   private IPresentationInfo n5(com.aspose.slides.internal.z0k.t4 var1, com.aspose.slides.internal.z0k.t2 var2) {
      return new PresentationInfo(var1, var2);
   }

   @Override
   public final IPresentation readPresentation(byte[] data) {
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2(data, false);

      try {
         return new Presentation(var2);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   @Override
   public final IPresentation readPresentation(byte[] data, ILoadOptions options) {
      com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2(data, false);

      try {
         return new Presentation(var3, com.aspose.slides.internal.v6g.k5.n5(options, LoadOptions.class));
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   @Override
   public final IPresentation readPresentation(InputStream stream) {
      return this.l6(com.aspose.slides.internal.z0k.t4.fromJava(stream));
   }

   IPresentation l6(com.aspose.slides.internal.z0k.t4 var1) {
      return new Presentation(var1);
   }

   @Override
   public final IPresentation readPresentation(InputStream stream, ILoadOptions options) {
      return this.n5(com.aspose.slides.internal.z0k.t4.fromJava(stream), options);
   }

   IPresentation n5(com.aspose.slides.internal.z0k.t4 var1, ILoadOptions var2) {
      return new Presentation(var1, com.aspose.slides.internal.v6g.k5.n5(var2, LoadOptions.class));
   }

   @Override
   public final IPresentation readPresentation(String file) {
      return new Presentation(file);
   }

   @Override
   public final IPresentation readPresentation(String file, ILoadOptions options) {
      return new Presentation(file, com.aspose.slides.internal.v6g.k5.n5(options, LoadOptions.class));
   }

   @Override
   public final IPresentationText getPresentationText(String file, int mode) {
      com.aspose.slides.internal.z0k.n3 var3 = new com.aspose.slides.internal.z0k.n3(file, 3, 1, 1);

      try {
         return this.n5(var3, mode);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   @Override
   public final IPresentationText getPresentationText(InputStream stream, int mode) {
      return this.n5(com.aspose.slides.internal.z0k.t4.fromJava(stream), mode);
   }

   IPresentationText n5(com.aspose.slides.internal.z0k.t4 var1, int var2) {
      return this.n5(var1, var2, null);
   }

   @Override
   public final IPresentationText getPresentationText(InputStream stream, int mode, ILoadOptions options) {
      return this.n5(com.aspose.slides.internal.z0k.t4.fromJava(stream), mode, options);
   }

   IPresentationText n5(com.aspose.slides.internal.z0k.t4 var1, int var2, ILoadOptions var3) {
      if (var1 == null) {
         throw new NullReferenceException("Stream is null");
      }

      if (var1.getLength() == 0L) {
         throw new ArgumentException("The stream is empty.", "stream");
      }

      try {
         com.aspose.slides.ms.System.a3.n5("1");
      } catch (ArgumentException var19) {
         throw new IllegalArgumentException(var19.getMessage());
      }

      PresentationText var4 = null;
      com.aspose.slides.ms.System.o0 var5 = com.aspose.slides.ms.System.o0.l6().k5();

      try {
         r6e.n5(var5.k5());
         com.aspose.slides.internal.n8e.a5.n5(16, 5, 7);
         com.aspose.slides.internal.z0k.t4 var6 = com.aspose.slides.internal.n8e.z3.n5(var1);
         boolean var7 = false;
         int var8 = var6.readByte();
         if (var8 > 0) {
            var6.seek(-1L, 1);
            if ((byte)var8 == 80) {
               var7 = true;
            }
         }

         boolean var9 = var7;
         s4e var10 = null;
         if (var3 != null) {
            var10 = ((LoadOptions)var3).n5();
         }

         if (var9) {
            z3h var11 = new z3h(var1, var2, var10);
            var4 = var11.n5();
         } else {
            com.aspose.slides.internal.x1.x8 var30 = u4e.l6(var1);
            f3z var12 = new f3z(var30, var10);
            var4 = new PresentationText(var12.n5(var2));
         }

         r6e.n5(var5.k5(), var6);
      } catch (com.aspose.slides.internal.n8e.n5 var21) {
         r6e.l6(var5.k5());
         throw new PptxReadException("Presentation reading aborted.", var21);
      } catch (RuntimeException var22) {
         r6e.l6(var5.k5());
         throw var22;
      } finally {
         com.aspose.slides.internal.n8e.a5.l6(16, 5, 7);
      }

      try {
         r6e.n5(var5.k5());
         com.aspose.slides.internal.l7h.a5 var25 = new com.aspose.slides.internal.l7h.a5();

         for (ISlideText var29 : var4.getSlidesText()) {
            var25.n5(var29.getMasterText());
            var25.n5(var29.getLayoutText());
            var25.n5(var29.getText());
            var25.n5(var29.getNotesText());
            var25.n5(var29.getCommentsText());
         }

         r6e.n5(var5.k5(), var25.toString());
         return var4;
      } catch (RuntimeException var20) {
         r6e.l6(var5.k5());
         throw var20;
      }
   }

   private boolean n5(com.aspose.slides.internal.z0k.t4 var1, com.aspose.slides.internal.z0k.t2[] var2) {
      var2[0] = null;

      try {
         com.aspose.slides.internal.z0k.n3 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.z0k.n3.class);
         if (var3 != null) {
            var2[0] = new com.aspose.slides.internal.z0k.t2(var3.n5());
            return true;
         }
      } catch (RuntimeException var4) {
      }

      return false;
   }
}
