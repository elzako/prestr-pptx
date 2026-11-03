package com.aspose.slides.ms.core.System.Drawing.imagecodecs.jpeg;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.b7s.q0;
import com.aspose.slides.internal.d2a.l6;
import com.aspose.slides.internal.e5q.n5;
import com.aspose.slides.internal.n6h.a6;
import com.aspose.slides.internal.r1x.v3;
import com.aspose.slides.internal.t5g.u3;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.d1;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.spi.ImageReaderSpi;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.MemoryCacheImageInputStream;

public class JpegImageReader extends ImageReader {
   private t4 n5;
   private v3 l6 = null;
   private q0 k5;
   private ImageReader u3;

   public JpegImageReader(ImageReaderSpi originatingProvider) {
      super(originatingProvider);
   }

   @Override
   public void setInput(Object input) {
      if (input instanceof t4) {
         this.n5 = (t4)input;
      } else if (input instanceof ImageInputStream) {
         try {
            this.n5 = com.aspose.slides.internal.t5g.u3.u3((ImageInputStream)input);
         } catch (IOException var3) {
            this.n5 = null;
         }
      }

      if (this.n5 == null) {
         throw new IllegalArgumentException("Incorrect input type!");
      }

      this.l6 = new v3(this.n5);
      this.n5();
   }

   @Override
   public void dispose() {
      if (this.l6 != null) {
         a6.n5(this.l6);
      }

      if (this.k5 != null) {
         this.k5.dispose();
      }

      if (this.u3 != null) {
         this.u3.dispose();
         this.u3 = null;
      }
   }

   private void n5() {
      this.n5.seek(0L, 0);
      n5 var1 = new n5();
      this.k5 = (q0)var1.n5(this.l6, null);
      if (this.k5 == null) {
         throw new com.aspose.slides.exceptions.IOException("Unable to read jpeg Image");
      }

      this.k5.e5().k5(100);
      this.u3 = this.n5(this.k5);
   }

   private ImageReader n5(q0 var1) {
      if (var1.u6() != null) {
         return this.u3();
      }

      switch (var1.e5().z1()) {
         case 0:
         case 2:
         case 3:
            return this.u3();
         case 1:
         case 4:
            return this.l6();
         default:
            throw new ArgumentException(d1.n5("Jpeg Compression {0} is not supported", new Object[]{var1.e5().z1()}));
      }
   }

   private ImageReader l6() {
      try {
         return this.k5();
      } catch (IOException var2) {
         return this.u3();
      } catch (NoClassDefFoundError var3) {
         return this.u3();
      } catch (ClassNotFoundException var4) {
         return this.u3();
      } catch (InstantiationException var5) {
         return this.u3();
      } catch (IllegalAccessException var6) {
         return this.u3();
      } catch (NoSuchMethodException var7) {
         return this.u3();
      } catch (InvocationTargetException var8) {
         return this.u3();
      } catch (IllegalAccessError var9) {
         return this.u3();
      }
   }

   private ImageReader k5() throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, IOException {
      Class var1 = Class.forName("com.aspose.slides.ms.core.System.Drawing.imagecodecs.jpeg.oracle.OracleJpegImageReader");
      Object var2 = var1.getConstructor(ImageReaderSpi.class).newInstance(this.originatingProvider);
      ImageReader var3 = (ImageReader)var2;
      this.n5.seek(0L, 0);
      MemoryCacheImageInputStream var4 = new MemoryCacheImageInputStream(this.n5.toInputStream());
      var3.setInput(var4);
      var3.getWidth(0);
      var3.getImageMetadata(0);
      Method var5 = var1.getMethod("isTheSameColorType", int.class);
      Boolean var6 = (Boolean)var5.invoke(var3, this.k5.e5().z1());
      return !var6 ? this.u3() : var3;
   }

   private l6 u3() {
      l6 var1 = new l6(this.originatingProvider);
      this.n5.seek(0L, 0);
      var1.setInput(this.n5);
      return var1;
   }

   @Override
   public int getNumImages(boolean allowSearch) throws IOException {
      return this.u3.getNumImages(allowSearch);
   }

   @Override
   public int getWidth(int imageIndex) throws IOException {
      return this.u3.getWidth(imageIndex);
   }

   @Override
   public int getHeight(int imageIndex) throws IOException {
      return this.u3.getHeight(imageIndex);
   }

   @Override
   public Iterator<ImageTypeSpecifier> getImageTypes(int imageIndex) throws IOException {
      return this.u3.getImageTypes(imageIndex);
   }

   @Override
   public IIOMetadata getStreamMetadata() throws IOException {
      return this.u3.getStreamMetadata();
   }

   @Override
   public IIOMetadata getImageMetadata(int imageIndex) throws IOException {
      return this.u3 instanceof l6 ? this.u3.getImageMetadata(0) : new com.aspose.slides.internal.d2a.n5(this.k5.e5());
   }

   @Override
   public BufferedImage read(int imageIndex, ImageReadParam param) throws IOException {
      try {
         BufferedImage var3 = this.u3.read(imageIndex);
         if (!(this.u3 instanceof l6)) {
            var3 = com.aspose.slides.internal.d2a.u3.n5(var3, this.k5);
         }

         return var3;
      } catch (Exception var4) {
         if (!(this.u3 instanceof l6)) {
            this.u3 = this.u3();
            return this.u3.read(imageIndex);
         } else {
            throw new IOException(var4);
         }
      }
   }
}
