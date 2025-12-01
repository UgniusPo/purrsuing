import pygame

#Set up pygame
pygame.init()
screen =  pygame.display.set_mode((1280, 720))
clock = pygame.time.Clock()
running = True
dt = 0

#sets player position
player_pos = pygame.Vector2(screen.get_width() / 2, screen.get_height() / 2)

while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

        screen.fill("purple")

        player_image = pygame.image.load("tempChar.png") #temp for player sprite

        #create sprites
        player = pygame.sprite.Sprite()
        player.image = player_image
        player.rect = player.image.get_rect()
        player.mask = pygame.mask.from_surface(player.image)
        
        pygame.draw.rect(screen, (0,0,255), [100,100,400,100], 30) #temp for buildings

        keys = pygame.key.get_pressed()
        if keys[pygame.K_w]:
            player_pos.y -= 10
        if keys[pygame.K_s]:
            player_pos.y += 10
        if keys[pygame.K_a]:
            player_pos.x -= 10
        if keys[pygame.K_d]:
            player_pos.x += 10

        pygame.display.flip()

        #limits FPS to 60
        #dt is delta time in seconds since last frame, used for framerate independent physics
        dt = clock.tick(60)

pygame.quit()