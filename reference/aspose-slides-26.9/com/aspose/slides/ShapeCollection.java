package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;
import java.io.InputStream;

public final class ShapeCollection extends DomObject<GroupShape> implements IShapeCollection {
   final List<IShape> n5 = new List<>();
   private static final Dictionary<Integer, Integer> l6 = GeometryShape.n5(1, 2, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104);

   ShapeCollection(GroupShape parentImmediate) {
      super(parentImmediate);
   }

   @Override
   public final int size() {
      return this.n5.size();
   }

   @Override
   public final IShape get_Item(int index) {
      return this.n5.get_Item(index);
   }

   final void n5(Shape var1) {
      this.n5.addItem(var1);
   }

   final void n5(int var1, Shape var2) {
      this.n5.insertItem(var1, var2);
   }

   final Shape n5() {
      Shape var1 = new Shape(this);
      this.n5(var1);
      z6a.n5(var1);
      return var1;
   }

   final Chart n5(int var1, boolean var2) {
      Chart var3 = new Chart(this, var1);
      if (var2) {
         e4w var4 = new e4w();
         var4.n5(var3, var1);
      } else if (ChartTypeCharacterizer.u3(var1)) {
         var3.t9().n5(0);
         var3.t9().l6(0);
      }

      var3.setName("ChartObject");
      return var3;
   }

   final Chart n5(int var1) {
      return this.n5(var1, 0);
   }

   final Chart n5(int var1, int var2) {
      Chart var3 = new Chart(this, var1);
      var3.l6(var2);
      this.n5(var3);
      z6a.n5(var3);
      return var3;
   }

   @Override
   public final IChart addChart(int type, float x, float y, float width, float height) {
      return this.addChart(type, x, y, width, height, true);
   }

   @Override
   public final IChart addChart(int type, float x, float y, float width, float height, boolean initWithSample) {
      Chart var7 = this.n5(type, initWithSample);
      this.n5(-1, var7, x, y, width, height);
      return var7;
   }

   final Ink l6() {
      Ink var1 = new Ink(this);
      this.n5(var1);
      z6a.n5(var1);
      return var1;
   }

   final InkActions k5() {
      InkActions var1 = new InkActions(this);
      this.n5(var1);
      z6a.n5(var1);
      return var1;
   }

   final SmartArt u3() {
      SmartArt var1 = new SmartArt(this);
      this.n5(var1);
      z6a.n5(var1);
      return var1;
   }

   @Override
   public final ISmartArt addSmartArt(float x, float y, float width, float height, int layoutType) {
      SmartArt var6 = this.l6(layoutType);
      this.n5(-1, var6, x, y, width, height);
      var6.n5().u3();
      return var6;
   }

   final SmartArt l6(int var1) {
      if (var1 == 134) {
         throw new ArgumentException("Can't create SmartArt with Custom layout type", "layoutType");
      }

      SmartArt var2 = new SmartArt(this, this.m1().getPresentation(), var1);
      var2.setName("New Diagram");
      return var2;
   }

   @Override
   public final IChart insertChart(int type, float x, float y, float width, float height, int index) {
      return this.insertChart(type, x, y, width, height, index, true);
   }

   @Override
   public final IChart insertChart(int type, float x, float y, float width, float height, int index, boolean initWithSample) {
      if (index < 0) {
         throw new ArgumentOutOfRangeException("index must be zero-based.");
      }

      Chart var8 = this.n5(type, initWithSample);
      this.n5(index, var8, x, y, width, height);
      return var8;
   }

   final OleObjectFrame n5(float var1, float var2, IOleEmbeddedDataInfo var3) {
      String var4 = com.aspose.slides.ms.System.d1.a6(var3.getEmbeddedFileExtension());
      String var5 = com.aspose.slides.ms.System.d1.n5(new String[]{".", var4});
      String var6 = var4;
      if (!e6f.n5().containsKey(var4)) {
         var6 = com.aspose.slides.ms.System.d1.n5;
         IGenericEnumerator var7 = e6f.n5().getKeys().iterator();

         try {
            while (var7.hasNext()) {
               String var8 = (String)var7.next();
               e5i var9 = e6f.n5().get_Item(var8);
               if (com.aspose.slides.ms.System.d1.a6(var9.n5(), var5)) {
                  var6 = var8;
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
               var7.dispose();
            }
         }

         if (com.aspose.slides.ms.System.d1.n5(var6)) {
            var6 = var4;
            e6f.n5().addItem(var4, new e5i(var5, new com.aspose.slides.internal.c8m.y9(), "0", "package"));
         }
      }

      OleObjectFrame var13 = this.n5(var1, var2, var6);
      var13.setEmbeddedData(var3);
      return var13;
   }

   final OleObjectFrame n5(float var1, float var2, String var3, String var4) {
      OleObjectFrame var5 = this.n5(var1, var2, var3);
      var5.setLinkPathLong(var4);
      return var5;
   }

   final OleObjectFrame n5(float var1, float var2, String var3) {
      OleObjectFrame var4 = new OleObjectFrame(this);
      var4.setName("OleObject");
      var4.getGraphicalObjectLock().setAspectRatioLocked(true);
      var4.setObjectProgId(var3);
      Presentation var5 = (Presentation)this.getParentGroup().getPresentation();
      ImageCollection var6 = (ImageCollection)var5.getImages();
      com.aspose.slides.internal.o9b.f2[] var7 = new com.aspose.slides.internal.o9b.f2[]{n5(var1, var2)};
      PPImage var8 = var6.u3().find(new ShapeCollection$1(this, var7));
      if (var8 == null) {
         com.aspose.slides.internal.o9b.f2 var9 = com.aspose.slides.internal.n8e.k7.n5(96, new com.aspose.slides.internal.o9b.f2(var1, var2)).a6();
         com.aspose.slides.internal.o9b.l6 var10 = new com.aspose.slides.internal.o9b.l6(
            var6.k5().n5(), com.aspose.slides.internal.v6g.k5.u3(var9.l6(), 13), com.aspose.slides.internal.v6g.k5.u3(var9.k5(), 13)
         );

         try {
            com.aspose.slides.internal.z0k.e2 var11 = new com.aspose.slides.internal.z0k.e2();

            try {
               var10.n5(var11, com.aspose.slides.internal.j9e.x8.s7());
               var8 = new PPImage(var5, var11.toArray());
            } finally {
               if (var11 != null) {
                  var11.dispose();
               }
            }
         } finally {
            if (var10 != null) {
               var10.dispose();
            }
         }

         var6.u3().addItem(var8);
      }

      var4.getSubstitutePictureFormat().getPicture().setImage(var8);
      return var4;
   }

   private static com.aspose.slides.internal.o9b.f2 n5(float var0, float var1) {
      return com.aspose.slides.internal.n8e.k7.n5(96, new com.aspose.slides.internal.o9b.f2(var0, var1));
   }

   final OleObjectFrame a6() {
      OleObjectFrame var1 = new OleObjectFrame(this);
      var1.getGraphicalObjectLock().setAspectRatioLocked(true);
      this.n5(var1);
      z6a.n5(var1);
      return var1;
   }

   final ZoomFrame u9() {
      ZoomFrame var1 = new ZoomFrame(this);
      var1.getGraphicalObjectLock().setAspectRatioLocked(true);
      this.n5(var1);
      z6a.n5(var1);
      return var1;
   }

   final SectionZoomFrame h0() {
      SectionZoomFrame var1 = new SectionZoomFrame(this);
      var1.getGraphicalObjectLock().setAspectRatioLocked(true);
      this.n5(var1);
      z6a.n5(var1);
      return var1;
   }

   final SummaryZoomFrame c8() {
      SummaryZoomFrame var1 = new SummaryZoomFrame(this);
      var1.getGraphicalObjectLock().setAspectRatioLocked(true);
      this.n5(var1);
      z6a.n5(var1);
      return var1;
   }

   @Override
   public final IZoomFrame addZoomFrame(float x, float y, float width, float height, ISlide slide) {
      return this.insertZoomFrame(-1, x, y, width, height, slide);
   }

   @Override
   public final IZoomFrame addZoomFrame(float x, float y, float width, float height, ISlide slide, IPPImage image) {
      return this.insertZoomFrame(-1, x, y, width, height, slide, image);
   }

   @Override
   public final IZoomFrame insertZoomFrame(int index, float x, float y, float width, float height, ISlide slide) {
      if (slide.getPresentation() != this.u9.getPresentation()) {
         throw new ArgumentException("Referenced slide does not belong to the current presentation.");
      }

      ZoomFrame var7 = new ZoomFrame(this);
      var7.getGraphicalObjectLock().setAspectRatioLocked(true);
      var7.setTargetSlide(slide);
      this.n5(index, var7, x, y, width, height);
      return var7;
   }

   @Override
   public final IZoomFrame insertZoomFrame(int index, float x, float y, float width, float height, ISlide slide, IPPImage image) {
      if (slide.getPresentation() != this.u9.getPresentation()) {
         throw new ArgumentException("Referenced slide does not belong to the current presentation.");
      }

      ZoomFrame var8 = new ZoomFrame(this);
      var8.getGraphicalObjectLock().setAspectRatioLocked(true);
      var8.l6(slide);
      var8.l6(((Slide)slide).getSlideId());
      var8.n5(((Slide)slide).n5());
      var8.setZoomImage(image);
      this.n5(index, var8, x, y, width, height);
      return var8;
   }

   @Override
   public final ISectionZoomFrame addSectionZoomFrame(float x, float y, float width, float height, ISection section) {
      return this.insertSectionZoomFrame(-1, x, y, width, height, section);
   }

   @Override
   public final ISectionZoomFrame addSectionZoomFrame(float x, float y, float width, float height, ISection section, IPPImage image) {
      return this.insertSectionZoomFrame(-1, x, y, width, height, section, image);
   }

   @Override
   public final ISectionZoomFrame insertSectionZoomFrame(int index, float x, float y, float width, float height, ISection section) {
      if (section != null && section.getStartedFromSlide() != null && section.getStartedFromSlide().getPresentation() == this.u9.getPresentation()) {
         SectionZoomFrame var7 = new SectionZoomFrame(this);
         var7.getGraphicalObjectLock().setAspectRatioLocked(true);
         var7.setTargetSection(section);
         this.n5(index, var7, x, y, width, height);
         return var7;
      } else {
         throw new ArgumentException("Referenced slide of section does not belong to the current presentation.");
      }
   }

   @Override
   public final ISectionZoomFrame insertSectionZoomFrame(int index, float x, float y, float width, float height, ISection section, IPPImage image) {
      if (section != null && section.getStartedFromSlide() != null && section.getStartedFromSlide().getPresentation() == this.u9.getPresentation()) {
         SectionZoomFrame var8 = new SectionZoomFrame(this);
         var8.getGraphicalObjectLock().setAspectRatioLocked(true);
         var8.n5(section);
         var8.l6(section.getStartedFromSlide());
         var8.setZoomImage(image);
         this.n5(index, var8, x, y, width, height);
         return var8;
      } else {
         throw new ArgumentException("Referenced slide of section does not belong to the current presentation.");
      }
   }

   @Override
   public final ISummaryZoomFrame addSummaryZoomFrame(float x, float y, float width, float height) {
      return this.insertSummaryZoomFrame(-1, x, y, width, height);
   }

   @Override
   public final ISummaryZoomFrame insertSummaryZoomFrame(int index, float x, float y, float width, float height) {
      SectionCollection var6 = (SectionCollection)this.getParentGroup().getPresentation().getSections();
      if (var6.size() < 1) {
         throw new PptxEditException("There are no sections in the presentation, or the target slide does not belong to any section.");
      }

      SummaryZoomFrame var7 = new SummaryZoomFrame(this);
      var7.getGraphicalObjectLock().setAspectRatioLocked(true);
      this.n5(index, var7, x, y, width, height);
      ISlide var8 = (ISlide)this.getParentGroup().getSlide();
      ISection var9 = var6.n5(var8);
      if (var9 == null) {
         throw new PptxEditException("There are no sections in the presentation, or the target slide does not belong to any section.");
      }

      ISummaryZoomSectionCollection var10 = var7.getSummaryZoomCollection();

      for (int var11 = 0; var11 < this.getParentGroup().getPresentation().getSections().size(); var11++) {
         if (var9 != this.getParentGroup().getPresentation().getSections().get_Item(var11)) {
            var10.addSummaryZoomSection(var6.get_Item(var11));
         }
      }

      return var7;
   }

   @Override
   public final IOleObjectFrame addOleObjectFrame(float x, float y, float width, float height, IOleEmbeddedDataInfo dataInfo) {
      OleObjectFrame var6 = this.n5(width, height, dataInfo);
      this.n5(-1, var6, x, y, width, height);
      return var6;
   }

   @Override
   public final IOleObjectFrame addOleObjectFrame(float x, float y, float width, float height, String className, String path) {
      OleObjectFrame var7 = this.n5(width, height, className, path);
      this.n5(-1, var7, x, y, width, height);
      return var7;
   }

   @Override
   public final IOleObjectFrame insertOleObjectFrame(int index, float x, float y, float width, float height, IOleEmbeddedDataInfo dataInfo) {
      if (index < 0) {
         throw new ArgumentOutOfRangeException("index must be zero-based.");
      }

      OleObjectFrame var7 = this.n5(width, height, dataInfo);
      this.n5(index, var7, x, y, width, height);
      return var7;
   }

   @Override
   public final IOleObjectFrame insertOleObjectFrame(int index, float x, float y, float width, float height, String className, String path) {
      if (index < 0) {
         throw new ArgumentOutOfRangeException("index must be zero-based.");
      }

      OleObjectFrame var8 = this.n5(width, height, className, path);
      this.n5(index, var8, x, y, width, height);
      return var8;
   }

   final VideoFrame n5(String var1) {
      VideoFrame var2 = new VideoFrame(this);
      var2.setShapeType(5);
      var2.getPictureFormat().setPictureFillMode(1);
      var2.setName("New picture");
      var2.setHyperlinkClick(Hyperlink.getMedia());
      var2.setLinkPathLong(var1);
      var2.n5().u9(r8.n5(var2.n5()));
      return var2;
   }

   final VideoFrame t2() {
      VideoFrame var1 = new VideoFrame(this);
      var1.setShapeType(5);
      var1.getPictureFormat().setPictureFillMode(1);
      var1.setHyperlinkClick(Hyperlink.getMedia());
      this.n5(var1);
      z6a.n5(var1);
      return var1;
   }

   @Override
   public final IVideoFrame addVideoFrame(float x, float y, float width, float height, String fname) {
      VideoFrame var6 = this.n5(fname);
      this.n5(-1, var6, x, y, width, height);
      return var6;
   }

   final VideoFrame n5(IVideo var1) {
      VideoFrame var2 = new VideoFrame(this);
      var2.setShapeType(5);
      var2.getPictureFormat().setPictureFillMode(1);
      var2.setName("New video");
      var2.setHyperlinkClick(Hyperlink.getMedia());
      var2.setEmbeddedVideo(var1);
      var2.n5().u9(r8.n5(var2.n5()));
      return var2;
   }

   final VideoFrame l6(IVideo var1) {
      VideoFrame var2 = new VideoFrame(this);
      var2.setShapeType(5);
      var2.getPictureFormat().setPictureFillMode(1);
      var2.setHyperlinkClick(Hyperlink.getMedia());
      var2.setEmbeddedVideo(var1);
      this.n5(var2);
      z6a.n5(var2);
      return var2;
   }

   @Override
   public final IVideoFrame addVideoFrame(float x, float y, float width, float height, IVideo video) {
      VideoFrame var6 = this.n5(video);
      this.n5(-1, var6, x, y, width, height);
      return var6;
   }

   @Override
   public final IVideoFrame insertVideoFrame(int index, float x, float y, float width, float height, String fname) {
      if (index < 0) {
         throw new ArgumentOutOfRangeException("index must be zero-based.");
      }

      VideoFrame var7 = this.n5(fname);
      this.n5(index, var7, x, y, width, height);
      return var7;
   }

   final PictureFrame n5(int var1, IPPImage var2, int var3, int var4) {
      if (!PictureFrame.h0.containsKey(var1)) {
         throw new PptxEditException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "Incorrect ShapeType value for PictureFrame specified: ", com.aspose.slides.ms.System.s3.n5(ShapeType.class, var1)
            })
         );
      }

      PictureFrame var5 = new PictureFrame(this);
      var5.setShapeType(var1);
      var5.getPictureFormat().setPictureFillMode(1);
      var5.setName("New picture");
      var5.setFrame(new ShapeFrame(0.0F, 0.0F, var3, var4, (byte)0, (byte)0, 0.0F));
      var5.n5(var2);
      return var5;
   }

   final AudioFrame s7() {
      AudioFrame var1 = this.u3(2);
      this.n5(var1);
      z6a.n5(var1);
      return var1;
   }

   @Override
   public final IAudioFrame addAudioFrameCD(float x, float y, float width, float height) {
      AudioFrame var5 = this.n5(2, "New Audio");
      this.n5(-1, var5, x, y, width, height);
      return var5;
   }

   @Override
   public final IAudioFrame insertAudioFrameCD(int index, float x, float y, float width, float height) {
      if (index < 0) {
         throw new ArgumentOutOfRangeException("index must be zero-based.");
      }

      AudioFrame var6 = this.n5(2, "New Audio");
      this.n5(index, var6, x, y, width, height);
      return var6;
   }

   final AudioFrame l6(String var1) {
      AudioFrame var2 = this.n5(0, "New Audio");
      var2.setLinkPathLong(var1);
      return var2;
   }

   final AudioFrame k5(String var1) {
      AudioFrame var2 = this.u3(0);
      var2.setLinkPathLong(var1);
      this.n5(var2);
      z6a.n5(var2);
      return var2;
   }

   @Override
   public final IAudioFrame addAudioFrameLinked(float x, float y, float width, float height, String fname) {
      AudioFrame var6 = this.l6(fname);
      this.n5(-1, var6, x, y, width, height);
      return var6;
   }

   @Override
   public final IAudioFrame insertAudioFrameLinked(int index, float x, float y, float width, float height, String fname) {
      if (index < 0) {
         throw new ArgumentOutOfRangeException("index must be zero-based.");
      }

      AudioFrame var7 = this.l6(fname);
      this.n5(index, var7, x, y, width, height);
      return var7;
   }

   final AudioFrame n5(com.aspose.slides.internal.z0k.t4 var1) {
      AudioFrame var2 = this.n5(1, "New Audio");
      var2.n5(var1);
      var2.n5().u9(r8.n5(var2.n5()));
      return var2;
   }

   @Override
   public final IAudioFrame addAudioFrameEmbedded(float x, float y, float width, float height, InputStream audio_stream) {
      return this.n5(x, y, width, height, com.aspose.slides.internal.z0k.t4.fromJava(audio_stream));
   }

   IAudioFrame n5(float var1, float var2, float var3, float var4, com.aspose.slides.internal.z0k.t4 var5) {
      AudioFrame var6 = this.n5(var5);
      this.n5(-1, var6, var1, var2, var3, var4);
      return var6;
   }

   @Override
   public final IAudioFrame insertAudioFrameEmbedded(int index, float x, float y, float width, float height, InputStream audio_stream) {
      return this.n5(index, x, y, width, height, com.aspose.slides.internal.z0k.t4.fromJava(audio_stream));
   }

   IAudioFrame n5(int var1, float var2, float var3, float var4, float var5, com.aspose.slides.internal.z0k.t4 var6) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("index must be zero-based.");
      }

      AudioFrame var7 = this.n5(var6);
      this.n5(var1, var7, var2, var3, var4, var5);
      return var7;
   }

   final AudioFrame n5(IAudio var1) {
      AudioFrame var2 = this.n5(1, "New Audio");
      var2.setEmbeddedAudio(var1);
      var2.n5().u9(r8.n5(var2.n5()));
      return var2;
   }

   final AudioFrame l6(IAudio var1) {
      AudioFrame var2 = this.u3(1);
      var2.setEmbeddedAudio(var1);
      this.n5(var2);
      z6a.n5(var2);
      return var2;
   }

   @Override
   public final IAudioFrame addAudioFrameEmbedded(float x, float y, float width, float height, IAudio audio) {
      AudioFrame var6 = this.n5(audio);
      this.n5(-1, var6, x, y, width, height);
      return var6;
   }

   @Override
   public final IAudioFrame insertAudioFrameEmbedded(int index, float x, float y, float width, float height, IAudio audio) {
      if (index < 0) {
         throw new ArgumentOutOfRangeException("index must be zero-based.");
      }

      AudioFrame var7 = this.n5(audio);
      this.n5(index, var7, x, y, width, height);
      return var7;
   }

   private AudioFrame n5(int var1, String var2) {
      AudioFrame var3 = this.u3(var1);
      var3.setName(var2);
      return var3;
   }

   private AudioFrame u3(int var1) {
      AudioFrame var2 = new AudioFrame(this);
      var2.n5().n5(var1);
      var2.setShapeType(5);
      var2.getPictureFormat().setPictureFillMode(1);
      var2.getPictureFrameLock().setRotationLocked(true);
      var2.getPictureFrameLock().setAspectRatioLocked(true);
      var2.u3();
      return var2;
   }

   final LegacyDiagram x8() {
      LegacyDiagram var1 = new LegacyDiagram(this);
      this.n5(var1);
      z6a.n5(var1);
      return var1;
   }

   @Override
   public final int indexOf(IShape shape) {
      return this.n5.indexOf(shape);
   }

   @Override
   public final IShape[] toArray() {
      return this.n5.toArray(new IShape[0]);
   }

   @Override
   public final IShape[] toArray(int startIndex, int count) {
      if (startIndex < 0) {
         throw new ArgumentOutOfRangeException("startIndex");
      }

      if (count >= 0 && startIndex + count <= this.size()) {
         Shape[] var3 = new Shape[count];

         for (int var4 = 0; var4 < count; var4++) {
            var3[var4] = (Shape)this.n5.get_Item(var4 + startIndex);
         }

         return var3;
      } else {
         throw new ArgumentOutOfRangeException("count");
      }
   }

   @Override
   public final void reorder(int index, IShape shape) {
      if (index >= 0 && index < this.size()) {
         if (((Shape)shape).x9() != this) {
            throw new PptxEditException("Trying to move a shape from other collection.");
         }

         int var3 = this.n5.indexOf(shape);
         if (var3 < 0) {
            throw new PptxEditException("Trying to move removed shapes.");
         }

         if (index != var3) {
            synchronized (this.n5.getSyncRoot()) {
               if (index < var3) {
                  for (int var5 = var3; var5 > index; var5--) {
                     this.n5.set_Item(var5, this.n5.get_Item(var5 - 1));
                  }
               } else {
                  for (int var8 = var3; var8 < index; var8++) {
                     this.n5.set_Item(var8, this.n5.get_Item(var8 + 1));
                  }
               }

               this.n5.set_Item(index, shape);
            }
         }
      } else {
         throw new PptxEditException("Index must lay within [0..Count-1] range.");
      }
   }

   @Override
   public final void reorder(int index, IShape... shapes) {
      if (index < 0 || index > this.size() - shapes.length) {
         throw new PptxEditException("Index must lay within [0..Count - slides.Length] range.");
      }

      if (shapes.length != 0) {
         Dictionary var3 = new Dictionary(shapes.length);

         for (int var4 = 0; var4 < shapes.length; var4++) {
            if (((Shape)shapes[var4]).x9() != this) {
               throw new PptxEditException("Trying to move a shape from other presentation.");
            }

            if (var3.containsKey(shapes[var4])) {
               throw new PptxEditException(
                  com.aspose.slides.ms.System.d1.n5(new String[]{"Trying to move the same shape twice. Shape index: ", com.aspose.slides.ms.System.a3.l6(var4)})
               );
            }

            var3.set_Item(shapes[var4], shapes[var4]);
         }

         int var16 = this.n5.size();
         int var5 = 0;
         int[] var6 = new int[shapes.length];

         for (int var7 = 0; var7 < var16; var7++) {
            if (var3.containsKey(this.n5.get_Item(var7))) {
               var6[var5++] = var7;
            }
         }

         if (var5 < shapes.length) {
            throw new PptxEditException("Trying to move removed slide.");
         }

         synchronized (this.n5.getSyncRoot()) {
            for (int var8 = 0; var8 < var6.length - 1; var8++) {
               int var9 = var6[var8] - var8;
               int var10 = var6[var8 + 1] - var8 - 2;
               if (var10 >= index) {
                  var10 = index - 1;
               }

               for (int var11 = var9; var11 <= var10; var11++) {
                  this.n5.set_Item(var11, shapes[var11 + var8 + 1]);
               }

               if (var10 == index - 1) {
                  break;
               }
            }

            int var17 = index + shapes.length - 1;
            int var18 = 0;

            for (int var20 = var6.length - 1; var18 < var6.length - 1; var20--) {
               int var21 = var6[var20] + var18;
               int var12 = var6[var20 - 1] + var18 + 2;
               if (var12 <= var17) {
                  var12 = var17 + 1;
               }

               for (int var13 = var21; var13 >= var12; var13--) {
                  this.n5.set_Item(var13, shapes[var13 - var18 - 1]);
               }

               if (var12 == var17 + 1) {
                  break;
               }

               var18++;
            }

            for (int var19 = 0; var19 < shapes.length; var19++) {
               this.n5.set_Item(index + var19, shapes[var19]);
            }
         }
      }
   }

   final AutoShape n3() {
      AutoShape var1 = new AutoShape(this);
      var1.setName("New shape");
      var1.getAutoShapeLock().setGroupingLocked(true);
      this.n5(var1);
      return var1;
   }

   final AutoShape l6(int var1, boolean var2) {
      AutoShape var3 = new AutoShape(this);
      if (var2) {
         var3.setName("New shape");
         var3.z1();
         var3.getShapeStyle().getLineColor().setSchemeColor(4);
         var3.getShapeStyle().getFillColor().setSchemeColor(4);
         var3.getShapeStyle().getEffectColor().setSchemeColor(4);
         var3.getShapeStyle().setEffectStyleIndex(0L);
         var3.getShapeStyle().setFontCollectionIndex((byte)1);
         if (l6.containsKey(var1)) {
            var3.getShapeStyle().setLineStyleIndex(1);
            var3.getShapeStyle().setFillStyleIndex((short)0);
            var3.getShapeStyle().getFontColor().setSchemeColor(1);
         } else {
            var3.getShapeStyle().getLineColor().getColorTransform().add(1, 0.5F);
            var3.getShapeStyle().setLineStyleIndex(2);
            var3.getShapeStyle().setFillStyleIndex((short)1);
            var3.getShapeStyle().getFontColor().setSchemeColor(14);
         }

         var3.addTextFrame("");
         ((TextFrame)var3.getTextFrame()).n5.l6((byte)0);
         var3.getTextFrame().getTextFrameFormat().setAnchoringType((byte)1);
         var3.getTextFrame().getParagraphs().get_Item(0).getParagraphFormat().setAlignment(1);
         var3.setRawFrame(new ShapeFrame(0.0F, 0.0F, 100.0F, 100.0F, (byte)0, (byte)0, 0.0F));
      }

      var3.setShapeType(var1);
      return var3;
   }

   final Connector k5(int var1, boolean var2) {
      if (!Connector.n5.containsKey(var1)) {
         throw new PptxEditException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"Incorrect ShapeType value for Connector specified: ", com.aspose.slides.ms.System.s3.n5(ShapeType.class, var1)})
         );
      }

      Connector var3 = new Connector(this);
      if (var2) {
         var3.setName("New connector");
         var3.z1();
         var3.getShapeStyle().getLineColor().setSchemeColor(4);
         var3.getShapeStyle().getFillColor().setSchemeColor(4);
         var3.getShapeStyle().getEffectColor().setSchemeColor(4);
         var3.getShapeStyle().setEffectStyleIndex(0L);
         var3.getShapeStyle().setFontCollectionIndex((byte)1);
         var3.getShapeStyle().setLineStyleIndex(1);
         var3.getShapeStyle().setFillStyleIndex((short)0);
         var3.getShapeStyle().getFontColor().setSchemeColor(1);
         var3.setRawFrame(new ShapeFrame(0.0F, 0.0F, 100.0F, 100.0F, (byte)0, (byte)0, 0.0F));
      }

      var3.setShapeType(var1);
      return var3;
   }

   final Table n5(double[] var1, double[] var2, double[] var3, double[] var4) {
      Table var5 = this.l6(var1, var2, var3, var4);
      var5.setName("New Table");
      var5.setFirstRow(true);
      var5.setHorizontalBanding(true);
      return var5;
   }

   private Table l6(double[] var1, double[] var2, double[] var3, double[] var4) {
      if (var1 == null) {
         throw new ArgumentNullException("columnWidths");
      }

      if (var2 == null) {
         throw new ArgumentNullException("rowHeights");
      }

      if (var1.length != 0 && var2.length != 0) {
         var3[0] = 0.0;
         var4[0] = 0.0;

         for (int var5 = 0; var5 < var1.length; var5++) {
            if (var1[var5] > 0.0) {
               var3[0] += var1[var5];
            } else {
               var3[0] += 2.0;
            }
         }

         for (int var9 = 0; var9 < var2.length; var9++) {
            if (var2[var9] > 0.0) {
               var4[0] += var2[var9];
            } else {
               var4[0] += 2.0;
            }
         }

         Table var10 = new Table(this);
         var10.getGraphicalObjectLock().setGroupingLocked(true);
         ColumnCollection var6 = (ColumnCollection)var10.getColumns();
         RowCollection var7 = (RowCollection)var10.getRows();
         var6.n5(480.0);
         var6.n5(480.0);
         var7.n5(29.2);
         var7.n5(29.2);
         Cell var8 = var10.n5(0, 0);
         var8.getTextFrame().setText("");
         var10.n5(var1, var2);
         com.aspose.slides.ms.System.o0 var11 = ((Presentation)this.m1().getPresentation()).z8().n5().l6().k5();
         if (com.aspose.slides.ms.System.o0.l6(var11, com.aspose.slides.ms.System.o0.n5)) {
            var10.n5(((Presentation)this.m1().getPresentation()).z8().n5(var11.k5()));
         }

         return var10;
      } else {
         throw new PptxEditException("Table must contain at least one row and one column.");
      }
   }

   final AutoShape y4() {
      AutoShape var1 = new AutoShape(this);
      this.n5(var1);
      z6a.n5(var1);
      return var1;
   }

   @Override
   public final IAutoShape addAutoShape(int shapeType, float x, float y, float width, float height) {
      return this.addAutoShape(shapeType, x, y, width, height, true);
   }

   @Override
   public final IAutoShape addAutoShape(int shapeType, float x, float y, float width, float height, boolean createFromTemplate) {
      AutoShape var7 = this.l6(shapeType, createFromTemplate);
      this.n5(-1, var7, x, y, width, height);
      return var7;
   }

   @Override
   public final IAutoShape addMathShape(float x, float y, float width, float height) {
      AutoShape var5 = this.k5(5);
      this.n5(-1, var5, x, y, width, height);
      return var5;
   }

   private void n5(int var1, Shape var2, float var3, float var4, float var5, float var6) {
      if (com.aspose.slides.ms.System.n1.k5(var3)) {
         throw new ArgumentException("Value of x parameter must be defined (not a float.NaN).");
      }

      if (com.aspose.slides.ms.System.n1.k5(var4)) {
         throw new ArgumentException("Value of y parameter must be defined (not a float.NaN).");
      }

      if (com.aspose.slides.ms.System.n1.k5(var5)) {
         throw new ArgumentException("Value of width parameter must be defined (not a float.NaN).");
      }

      if (com.aspose.slides.ms.System.n1.k5(var6)) {
         throw new ArgumentException("Value of height parameter must be defined (not a float.NaN).");
      }

      if (var1 == -1) {
         this.n5(var2);
      } else {
         this.n5(var1, var2);
      }

      var2.u6();
      var2.setFrame(new ShapeFrame(var3, var4, var5, var6, (byte)0, (byte)0, 0.0F));
      var2.a0();
   }

   @Override
   public final IAutoShape insertAutoShape(int index, int shapeType, float x, float y, float width, float height) {
      return this.insertAutoShape(index, shapeType, x, y, width, height, true);
   }

   @Override
   public final IAutoShape insertAutoShape(int index, int shapeType, float x, float y, float width, float height, boolean createFromTemplate) {
      if (index < 0) {
         throw new ArgumentOutOfRangeException("index must be zero-based.");
      }

      AutoShape var8 = this.l6(shapeType, createFromTemplate);
      this.n5(index, var8, x, y, width, height);
      return var8;
   }

   final GroupShape e2() {
      GroupShape var1 = new GroupShape(this);
      this.n5(var1);
      z6a.n5(var1);
      return var1;
   }

   @Override
   public final IGroupShape addGroupShape() {
      GroupShape var1 = this.t9();
      this.n5(-1, var1, 0.0F, 0.0F, 100.0F, 100.0F);
      return var1;
   }

   @Override
   public final IGroupShape addGroupShape(ISvgImage svgImage, float x, float y, float width, float height) {
      com.aspose.slides.internal.o9b.y1 var6 = new com.aspose.slides.internal.o9b.y1(x, y, width, height);
      IGroupShape var7 = this.addGroupShape();
      if (svgImage != null) {
         h7g var8 = new h7g();
         var8.n5(var7, svgImage.getSvgContent(), var6.y4());
      }

      return var7;
   }

   @Override
   public final IGroupShape insertGroupShape(int index) {
      if (index < 0) {
         throw new ArgumentOutOfRangeException("index must be zero-based.");
      }

      GroupShape var2 = this.t9();
      this.n5(index, var2, 0.0F, 0.0F, 100.0F, 100.0F);
      return var2;
   }

   final GroupShape t9() {
      return new GroupShape(this);
   }

   final GraphicalObject z1() {
      GraphicalObject var1 = GraphicalObject.n5(this);
      this.n5(var1);
      z6a.n5(var1);
      return var1;
   }

   final Connector t4() {
      Connector var1 = new Connector(this);
      this.n5(var1);
      z6a.n5(var1);
      return var1;
   }

   @Override
   public final IConnector addConnector(int shapeType, float x, float y, float width, float height) {
      return this.addConnector(shapeType, x, y, width, height, true);
   }

   @Override
   public final IConnector addConnector(int shapeType, float x, float y, float width, float height, boolean createFromTemplate) {
      Connector var7 = this.k5(shapeType, createFromTemplate);
      this.n5(-1, var7, x, y, width, height);
      return var7;
   }

   @Override
   public final IConnector insertConnector(int index, int shapeType, float x, float y, float width, float height) {
      return this.insertConnector(index, shapeType, x, y, width, height, true);
   }

   @Override
   public final IConnector insertConnector(int index, int shapeType, float x, float y, float width, float height, boolean createFromTemplate) {
      if (index < 0) {
         throw new ArgumentOutOfRangeException("index must be zero-based.");
      }

      Connector var8 = this.k5(shapeType, createFromTemplate);
      this.n5(index, var8, x, y, width, height);
      return var8;
   }

   final PictureFrame q0() {
      PictureFrame var1 = new PictureFrame(this);
      this.n5(var1);
      z6a.n5(var1);
      return var1;
   }

   @Override
   public final IPictureFrame addPictureFrame(int shapeType, float x, float y, float width, float height, IPPImage image) {
      PictureFrame var7 = this.n5(shapeType, image, com.aspose.slides.internal.v6g.k5.u3(width, 13), com.aspose.slides.internal.v6g.k5.u3(height, 13));
      this.n5(-1, var7, x, y, width, height);
      return var7;
   }

   @Override
   public final IPictureFrame insertPictureFrame(int index, int shapeType, float x, float y, float width, float height, IPPImage image) {
      if (index < 0) {
         throw new ArgumentOutOfRangeException("index must be zero-based.");
      }

      PictureFrame var8 = this.n5(shapeType, image, com.aspose.slides.internal.v6g.k5.u3(width, 13), com.aspose.slides.internal.v6g.k5.u3(height, 13));
      this.n5(index, var8, x, y, width, height);
      return var8;
   }

   final Table z3() {
      Table var1 = new Table(this);
      this.n5(var1);
      z6a.n5(var1);
      return var1;
   }

   final Table n5(double[] var1, double[] var2) {
      double var3 = 0.0;
      double var5 = 0.0;
      double[] var7 = new double[]{0.0};
      double[] var8 = new double[]{0.0};
      Table var9 = this.l6(var1, var2, var7, var8);
      var3 = var7[0];
      var5 = var8[0];
      this.n5(var9);
      z6a.n5(var9);
      var9.setFrame(new ShapeFrame(0.0, 0.0, var3, var5, (byte)0, (byte)0, 0.0F));
      return var9;
   }

   @Override
   public final ITable addTable(float x, float y, double[] columnWidths, double[] rowHeights) {
      double var5 = 0.0;
      double var7 = 0.0;
      double[] var9 = new double[]{0.0};
      double[] var10 = new double[]{0.0};
      Table var11 = this.n5(columnWidths, rowHeights, var9, var10);
      var5 = var9[0];
      var7 = var10[0];
      this.n5(-1, var11, x, y, (float)var5, (float)var7);
      return var11;
   }

   @Override
   public final ITable insertTable(int index, float x, float y, double[] columnWidths, double[] rowHeights) {
      if (index < 0) {
         throw new ArgumentOutOfRangeException("index must be zero-based.");
      }

      double var6 = 0.0;
      double var8 = 0.0;
      double[] var10 = new double[]{0.0};
      double[] var11 = new double[]{0.0};
      Table var12 = this.n5(columnWidths, rowHeights, var10, var11);
      var6 = var10[0];
      var8 = var11[0];
      this.n5(index, var12, x, y, (float)var6, (float)var8);
      return var12;
   }

   @Override
   public final void removeAt(int index) {
      Shape var2 = (Shape)this.get_Item(index);
      if (this.m1().getSlide() != null && this.m1().getSlide().getTimeline() != null) {
         IGenericEnumerator var3 = this.m1().getSlide().getTimeline().getInteractiveSequences().iterator();

         try {
            while (var3.hasNext()) {
               Sequence var4 = (Sequence)var3.next();
               var4.removeByShape(var2);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         if (this.m1().getSlide().getTimeline().getMainSequence().getCount() > 0) {
            this.m1().getSlide().getTimeline().getMainSequence().removeByShape(var2);
         }
      }

      var2.S_();
      this.n5.removeAt(index);
   }

   @Override
   public final void remove(IShape shape) {
      int var2 = this.n5.indexOf(shape);
      if (var2 >= 0) {
         this.removeAt(var2);
      }
   }

   @Override
   public final void clear() {
      int var1 = this.size();

      for (int var2 = var1 - 1; var2 >= 0; var2--) {
         this.removeAt(var2);
      }
   }

   @Override
   public final IGenericEnumerator<IShape> iterator() {
      return this.n5.iterator();
   }

   @Override
   public final IGenericEnumerator<IShape> iteratorJava() {
      return this.n5.iteratorJava();
   }

   @Override
   public final IGroupShape getParentGroup() {
      return this.u9;
   }

   final GroupShape m1() {
      return this.u9;
   }

   @Override
   public final IShape addClone(IShape sourceShape, float x, float y, float width, float height) {
      if (com.aspose.slides.ms.System.n1.k5(x)) {
         throw new ArgumentException("Value of x parameter must be defined (not a float.NaN).");
      }

      if (com.aspose.slides.ms.System.n1.k5(y)) {
         throw new ArgumentException("Value of y parameter must be defined (not a float.NaN).");
      }

      if (com.aspose.slides.ms.System.n1.k5(width)) {
         throw new ArgumentException("Value of width parameter must be defined (not a float.NaN).");
      }

      if (com.aspose.slides.ms.System.n1.k5(height)) {
         throw new ArgumentException("Value of height parameter must be defined (not a float.NaN).");
      }

      IShapeFrame var6 = sourceShape.getFrame();
      ShapeFrame var7 = new ShapeFrame(x, y, width, height, var6.getFlipH(), var6.getFlipV(), var6.getRotation());
      Shape var8 = (Shape)n0r.n5(this, sourceShape, var7);
      var8.u6();
      return var8;
   }

   @Override
   public final IShape addClone(IShape sourceShape, float x, float y) {
      if (com.aspose.slides.ms.System.n1.k5(x)) {
         throw new ArgumentException("Value of x parameter must be defined (not a float.NaN).");
      }

      if (com.aspose.slides.ms.System.n1.k5(y)) {
         throw new ArgumentException("Value of y parameter must be defined (not a float.NaN).");
      }

      IShapeFrame var4 = sourceShape.getFrame();
      ShapeFrame var5 = new ShapeFrame(x, y, var4.getWidth(), var4.getHeight(), var4.getFlipH(), var4.getFlipV(), var4.getRotation());
      Shape var6 = (Shape)n0r.n5(this, sourceShape, var5);
      var6.u6();
      return var6;
   }

   @Override
   public final IShape addClone(IShape sourceShape) {
      Shape var2 = (Shape)n0r.n5(this, sourceShape, null);
      var2.u6();
      if (var2.getLineFormat() != null) {
         var2.a0();
      }

      return var2;
   }

   @Override
   public final IShape insertClone(int index, IShape sourceShape, float x, float y, float width, float height) {
      if (index < 0) {
         throw new ArgumentOutOfRangeException("index must be zero-based.");
      }

      IShape var7 = this.addClone(sourceShape, x, y, width, height);
      this.n5.removeItem(var7);
      this.n5.insertItem(index, var7);
      return var7;
   }

   @Override
   public final IShape insertClone(int index, IShape sourceShape, float x, float y) {
      if (index < 0) {
         throw new ArgumentOutOfRangeException("index must be zero-based.");
      }

      IShape var5 = this.addClone(sourceShape, x, y);
      this.n5.removeItem(var5);
      this.n5.insertItem(index, var5);
      return var5;
   }

   @Override
   public final IShape insertClone(int index, IShape sourceShape) {
      if (index < 0) {
         throw new ArgumentOutOfRangeException("index must be zero-based.");
      }

      IShape var3 = this.addClone(sourceShape);
      this.n5.removeItem(var3);
      this.n5.insertItem(index, var3);
      return var3;
   }

   final AutoShape k5(int var1) {
      AutoShape var2 = new AutoShape(this);
      var2.setName("New math shape");
      var2.addTextFrame("");
      ((TextFrameFormat)var2.l6().getTextFrameFormat()).n5(c0u.n5.l6());
      MathPortion var3 = new MathPortion();
      ((MathParagraph)var3.getMathParagraph()).n5(true);
      var2.getTextFrame().getParagraphs().get_Item(0).getPortions().clear();
      var2.getTextFrame().getParagraphs().get_Item(0).getPortions().add(var3);
      var2.setShapeType(var1);
      return var2;
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      this.n5.copyTo(array, index);
   }

   @Override
   public final boolean isSynchronized() {
      return false;
   }

   @Override
   public final Object getSyncRoot() {
      return this;
   }
}
